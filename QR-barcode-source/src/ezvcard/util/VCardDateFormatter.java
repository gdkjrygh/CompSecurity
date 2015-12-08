// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package ezvcard.util:
//            ISOFormat

public class VCardDateFormatter
{

    private VCardDateFormatter()
    {
    }

    public static String format(Date date, ISOFormat isoformat)
    {
        return format(date, isoformat, TimeZone.getDefault());
    }

    public static String format(Date date, ISOFormat isoformat, TimeZone timezone)
    {
        static class _cls1
        {

            static final int $SwitchMap$ezvcard$util$ISOFormat[];

            static 
            {
                $SwitchMap$ezvcard$util$ISOFormat = new int[ISOFormat.values().length];
                try
                {
                    $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.UTC_TIME_BASIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.UTC_TIME_EXTENDED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.TIME_EXTENDED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.HCARD_TIME_TAG.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.ezvcard.util.ISOFormat[isoformat.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 78
    //                   2 78;
           goto _L1 _L2 _L2
_L1:
        DateFormat dateformat = isoformat.getFormatDateFormat();
        dateformat.setTimeZone(timezone);
        date = dateformat.format(date);
        switch (_cls1..SwitchMap.ezvcard.util.ISOFormat[isoformat.ordinal()])
        {
        default:
            return date;

        case 3: // '\003'
            return date.replaceAll("([-\\+]\\d{2})(\\d{2})$", "$1:$2");
        }
_L2:
        timezone = TimeZone.getTimeZone("UTC");
          goto _L1
    }

    public static Date parse(String s)
    {
        Object obj;
        Object obj1 = null;
        ISOFormat aisoformat[] = ISOFormat.values();
        int j = aisoformat.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                obj = obj1;
                if (i < j)
                {
                    obj = aisoformat[i];
                    if (!((ISOFormat) (obj)).matches(s))
                    {
                        break label1;
                    }
                }
                if (obj == null)
                {
                    throw new IllegalArgumentException("Date string is not in a valid ISO-8601 format.");
                }
                break label0;
            }
            i++;
        } while (true);
        _cls1..SwitchMap.ezvcard.util.ISOFormat[((ISOFormat) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 96
    //                   1 121
    //                   2 121
    //                   3 109
    //                   4 109;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_121;
_L4:
        obj = ((ISOFormat) (obj)).getParseDateFormat();
        try
        {
            s = ((DateFormat) (obj)).parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
_L3:
        s = s.replaceAll("([-\\+]\\d{2}):(\\d{2})$", "$1$2");
          goto _L4
        s = s.replace("Z", "+0000");
          goto _L4
    }

    public static TimeZone parseTimeZoneId(String s)
    {
        TimeZone timezone = TimeZone.getTimeZone(s);
        s = timezone;
        if ("GMT".equals(timezone.getID()))
        {
            s = null;
        }
        return s;
    }
}

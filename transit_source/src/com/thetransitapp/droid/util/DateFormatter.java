// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.util.Log;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter
    implements Serializable
{
    public static final class DateFormatterType extends Enum
    {

        public static final DateFormatterType DELAY;
        private static final DateFormatterType ENUM$VALUES[];
        public static final DateFormatterType EPOCH;
        public static final DateFormatterType EPOCH_MILLISEC;
        public static final DateFormatterType MINUTES_AGO;
        public static final DateFormatterType MINUTE_DELAY;
        public static final DateFormatterType OTHER;
        public static final DateFormatterType SECONDS_AGO;

        public static DateFormatterType valueOf(String s)
        {
            return (DateFormatterType)Enum.valueOf(com/thetransitapp/droid/util/DateFormatter$DateFormatterType, s);
        }

        public static DateFormatterType[] values()
        {
            DateFormatterType adateformattertype[] = ENUM$VALUES;
            int i = adateformattertype.length;
            DateFormatterType adateformattertype1[] = new DateFormatterType[i];
            System.arraycopy(adateformattertype, 0, adateformattertype1, 0, i);
            return adateformattertype1;
        }

        static 
        {
            DELAY = new DateFormatterType("DELAY", 0);
            MINUTE_DELAY = new DateFormatterType("MINUTE_DELAY", 1);
            SECONDS_AGO = new DateFormatterType("SECONDS_AGO", 2);
            MINUTES_AGO = new DateFormatterType("MINUTES_AGO", 3);
            EPOCH = new DateFormatterType("EPOCH", 4);
            EPOCH_MILLISEC = new DateFormatterType("EPOCH_MILLISEC", 5);
            OTHER = new DateFormatterType("OTHER", 6);
            ENUM$VALUES = (new DateFormatterType[] {
                DELAY, MINUTE_DELAY, SECONDS_AGO, MINUTES_AGO, EPOCH, EPOCH_MILLISEC, OTHER
            });
        }

        private DateFormatterType(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType[];
    private static final long serialVersionUID = 1L;
    private String dateFormat;
    private DateFormatterType type;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[DateFormatterType.values().length];
        try
        {
            ai[DateFormatterType.DELAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[DateFormatterType.EPOCH.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[DateFormatterType.EPOCH_MILLISEC.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[DateFormatterType.MINUTES_AGO.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[DateFormatterType.MINUTE_DELAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[DateFormatterType.OTHER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[DateFormatterType.SECONDS_AGO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType = ai;
        return ai;
    }

    public DateFormatter(String s)
    {
        if (s.equals("epoch"))
        {
            type = DateFormatterType.EPOCH;
            return;
        }
        if (s.equals("epoch-milli"))
        {
            type = DateFormatterType.EPOCH_MILLISEC;
            return;
        }
        if (s.equals("delay"))
        {
            type = DateFormatterType.DELAY;
            return;
        }
        if (s.equals("minutes-delay"))
        {
            type = DateFormatterType.MINUTE_DELAY;
            return;
        }
        if (s.equals("seconds-ago"))
        {
            type = DateFormatterType.SECONDS_AGO;
            return;
        }
        if (s.equals("minutes-ago"))
        {
            type = DateFormatterType.MINUTES_AGO;
            return;
        } else
        {
            type = DateFormatterType.OTHER;
            dateFormat = s;
            return;
        }
    }

    private double getDoubleValue(String s)
    {
        String s1;
        s1 = s.replaceAll("[^0-9]", "");
        if (s1.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        double d = Double.parseDouble(s1);
        return d;
        NumberFormatException numberformatexception;
        numberformatexception;
        Log.d("DateFormatter", (new StringBuilder("Error parsing double ")).append(s).toString());
        return 0.0D;
    }

    private long getLongValue(String s)
    {
        String s1;
        s1 = s.replaceAll("[^0-9]", "");
        if (s1.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        long l = Long.parseLong(s1);
        return l;
        NumberFormatException numberformatexception;
        numberformatexception;
        Log.d("DateFormatter", (new StringBuilder("Error parsing long ")).append(s).toString());
        return 0L;
    }

    public Date format(String s)
    {
        $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType()[type.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 54
    //                   2 83
    //                   3 120
    //                   4 150
    //                   5 184
    //                   6 209
    //                   7 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return null;
_L2:
        return new Date((new Date()).getTime() + (long)getDoubleValue(s) * 1000L);
_L3:
        return new Date((new Date()).getTime() + (long)(getDoubleValue(s) * 60D + 35D) * 1000L);
_L4:
        return new Date((new Date()).getTime() + (long)(-getDoubleValue(s)) * 1000L);
_L5:
        return new Date((new Date()).getTime() + (long)(-getDoubleValue(s)) * 60L * 1000L);
_L6:
        long l = getLongValue(s);
        if (l != 0L)
        {
            return new Date(l * 1000L);
        }
          goto _L1
_L7:
        long l1 = getLongValue(s);
        if (l1 == 0L) goto _L1; else goto _L9
_L9:
        return new Date(l1);
_L8:
        if (dateFormat == null) goto _L1; else goto _L10
_L10:
        String s1 = s;
        if (!dateFormat.endsWith("'Z'")) goto _L12; else goto _L11
_L11:
        s1 = s;
        if (!s.endsWith("Z"))
        {
            s1 = (new StringBuilder(String.valueOf(s))).append("Z").toString();
        }
_L12:
        s = (new SimpleDateFormat(dateFormat, Locale.US)).parse(s1);
        return s;
        s;
        return null;
    }
}

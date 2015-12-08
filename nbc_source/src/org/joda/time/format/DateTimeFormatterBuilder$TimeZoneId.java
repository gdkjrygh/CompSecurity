// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static final class  extends Enum
    implements InternalParser, InternalPrinter
{

    private static final MAX_LENGTH $VALUES[];
    static final Set ALL_IDS;
    public static final MAX_LENGTH INSTANCE;
    static final int MAX_LENGTH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/joda/time/format/DateTimeFormatterBuilder$TimeZoneId, s);
    }

    public static final [] values()
    {
        return ([])$VALUES.clone();
    }

    public int estimateParsedLength()
    {
        return MAX_LENGTH;
    }

    public int estimatePrintedLength()
    {
        return MAX_LENGTH;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        String s;
        Iterator iterator;
        s = null;
        iterator = ALL_IDS.iterator();
_L2:
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s2 = (String)iterator.next();
        if (!DateTimeFormatterBuilder.csStartsWith(charsequence, i, s2))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_104;
            }
            s1 = s2;
        }
_L3:
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            datetimeparserbucket.setZone(DateTimeZone.forID(s));
            return s.length() + i;
        } else
        {
            return ~i;
        }
        s1 = s;
          goto _L3
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        if (datetimezone != null)
        {
            chronology = datetimezone.getID();
        } else
        {
            chronology = "";
        }
        appendable.append(chronology);
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
        ALL_IDS = DateTimeZone.getAvailableIDs();
        Iterator iterator = ALL_IDS.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = Math.max(i, ((String)iterator.next()).length())) { }
        MAX_LENGTH = i;
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

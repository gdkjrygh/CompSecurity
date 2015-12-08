// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, DurationConverter, InstantConverter, IntervalConverter, 
//            PartialConverter, PeriodConverter

class StringConverter extends AbstractConverter
    implements DurationConverter, InstantConverter, IntervalConverter, PartialConverter, PeriodConverter
{

    static final StringConverter INSTANCE = new StringConverter();

    protected StringConverter()
    {
    }

    public long getDurationMillis(Object obj)
    {
        int i;
        boolean flag1;
        flag1 = true;
        obj = (String)obj;
        i = ((String) (obj)).length();
        if (i < 4 || ((String) (obj)).charAt(0) != 'P' && ((String) (obj)).charAt(0) != 'p' || ((String) (obj)).charAt(1) != 'T' && ((String) (obj)).charAt(1) != 't' || ((String) (obj)).charAt(i - 1) != 'S' && ((String) (obj)).charAt(i - 1) != 's') goto _L2; else goto _L1
_L1:
        String s;
        int k;
        boolean flag;
        s = ((String) (obj)).substring(2, i - 1);
        i = 0;
        flag = false;
        k = -1;
_L4:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.charAt(i) < '0' || s.charAt(i) > '9')
        {
            if (i == 0 && s.charAt(0) == '-')
            {
                flag = true;
            } else
            {
                int l;
                if (flag)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (i > l && s.charAt(i) == '.' && k == -1)
                {
                    k = i;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid format: \"").append(((String) (obj))).append('"').toString());
                }
            }
        }
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid format: \"").append(((String) (obj))).append('"').toString());
_L3:
        int j;
        long l1;
        long l2;
        if (flag)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (k > 0)
        {
            l1 = Long.parseLong(s.substring(j, k));
            s = s.substring(k + 1);
            obj = s;
            if (s.length() != 3)
            {
                obj = (new StringBuilder()).append(s).append("000").toString().substring(0, 3);
            }
            l2 = Integer.parseInt(((String) (obj)));
        } else
        if (flag)
        {
            l1 = Long.parseLong(s.substring(j, s.length()));
            l2 = 0L;
        } else
        {
            l1 = Long.parseLong(s);
            l2 = 0L;
        }
        if (flag)
        {
            return FieldUtils.safeAdd(FieldUtils.safeMultiply(-l1, 1000), -l2);
        }
        return FieldUtils.safeAdd(FieldUtils.safeMultiply(l1, 1000), l2);
          goto _L5
    }

    public long getInstantMillis(Object obj, Chronology chronology)
    {
        obj = (String)obj;
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis(((String) (obj)));
    }

    public int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology, DateTimeFormatter datetimeformatter)
    {
        Chronology chronology1 = chronology;
        if (datetimeformatter.getZone() != null)
        {
            chronology1 = chronology.withZone(datetimeformatter.getZone());
        }
        return chronology1.get(readablepartial, datetimeformatter.withChronology(chronology1).parseMillis((String)obj));
    }

    public Class getSupportedType()
    {
        return java/lang/String;
    }

    public void setInto(ReadWritableInterval readwritableinterval, Object obj, Chronology chronology)
    {
        org.joda.time.Period period;
        String s1;
        DateTimeFormatter datetimeformatter;
        PeriodFormatter periodformatter;
        long l;
        period = null;
        String s = (String)obj;
        int i = s.indexOf('/');
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Format requires a '/' separator: ").append(s).toString());
        }
        obj = s.substring(0, i);
        if (((String) (obj)).length() <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Format invalid: ").append(s).toString());
        }
        s1 = s.substring(i + 1);
        if (s1.length() <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Format invalid: ").append(s).toString());
        }
        datetimeformatter = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
        periodformatter = ISOPeriodFormat.standard();
        l = 0L;
        i = ((String) (obj)).charAt(0);
        if (i == 'P' || i == 'p')
        {
            period = periodformatter.withParseType(getPeriodType(obj)).parsePeriod(((String) (obj)));
            obj = null;
        } else
        {
            obj = datetimeformatter.parseDateTime(((String) (obj)));
            l = ((DateTime) (obj)).getMillis();
            obj = ((DateTime) (obj)).getChronology();
        }
        i = s1.charAt(0);
        if (i != 'P' && i != 'p') goto _L2; else goto _L1
_L1:
        long l1;
        if (period != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Interval composed of two durations: ").append(s).toString());
        }
        period = periodformatter.withParseType(getPeriodType(s1)).parsePeriod(s1);
        if (chronology == null)
        {
            chronology = ((Chronology) (obj));
        }
        l1 = chronology.add(period, l, 1);
_L4:
        readwritableinterval.setInterval(l, l1);
        readwritableinterval.setChronology(chronology);
        return;
_L2:
        DateTime datetime = datetimeformatter.parseDateTime(s1);
        l1 = datetime.getMillis();
        if (obj == null)
        {
            obj = datetime.getChronology();
        }
        if (chronology == null)
        {
            chronology = ((Chronology) (obj));
        }
        if (period != null)
        {
            l = chronology.add(period, l1, -1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology)
    {
        obj = (String)obj;
        chronology = ISOPeriodFormat.standard();
        readwritableperiod.clear();
        int i = chronology.parseInto(readwritableperiod, ((String) (obj)), 0);
        if (i < ((String) (obj)).length())
        {
            if (i < 0)
            {
                chronology.withParseType(readwritableperiod.getPeriodType()).parseMutablePeriod(((String) (obj)));
            }
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid format: \"").append(((String) (obj))).append('"').toString());
        } else
        {
            return;
        }
    }

}

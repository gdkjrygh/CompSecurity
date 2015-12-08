// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder, PeriodFormatter, PeriodParser, PeriodPrinter

public class PeriodFormat
{
    static class DynamicWordBased
        implements PeriodParser, PeriodPrinter
    {

        private final PeriodFormatter iFormatter;

        private PeriodParser getParser(Locale locale)
        {
            if (locale != null && !locale.equals(iFormatter.getLocale()))
            {
                return PeriodFormat.wordBased(locale).getParser();
            } else
            {
                return iFormatter.getParser();
            }
        }

        private PeriodPrinter getPrinter(Locale locale)
        {
            if (locale != null && !locale.equals(iFormatter.getLocale()))
            {
                return PeriodFormat.wordBased(locale).getPrinter();
            } else
            {
                return iFormatter.getPrinter();
            }
        }

        public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
        {
            return getPrinter(locale).calculatePrintedLength(readableperiod, locale);
        }

        public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
        {
            return getPrinter(locale).countFieldsToPrint(readableperiod, i, locale);
        }

        public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
        {
            return getParser(locale).parseInto(readwritableperiod, s, i, locale);
        }

        public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
            throws IOException
        {
            getPrinter(locale).printTo(writer, readableperiod, locale);
        }

        public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
        {
            getPrinter(locale).printTo(stringbuffer, readableperiod, locale);
        }

        DynamicWordBased(PeriodFormatter periodformatter)
        {
            iFormatter = periodformatter;
        }
    }


    private static final String BUNDLE_NAME = "org.joda.time.format.messages";
    private static final ConcurrentMap FORMATTERS = new ConcurrentHashMap();

    protected PeriodFormat()
    {
    }

    private static PeriodFormatter buildNonRegExFormatter(ResourceBundle resourcebundle, Locale locale)
    {
        String as[] = retrieveVariants(resourcebundle);
        return (new PeriodFormatterBuilder()).appendYears().appendSuffix(resourcebundle.getString("PeriodFormat.year"), resourcebundle.getString("PeriodFormat.years")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendMonths().appendSuffix(resourcebundle.getString("PeriodFormat.month"), resourcebundle.getString("PeriodFormat.months")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendWeeks().appendSuffix(resourcebundle.getString("PeriodFormat.week"), resourcebundle.getString("PeriodFormat.weeks")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendDays().appendSuffix(resourcebundle.getString("PeriodFormat.day"), resourcebundle.getString("PeriodFormat.days")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendHours().appendSuffix(resourcebundle.getString("PeriodFormat.hour"), resourcebundle.getString("PeriodFormat.hours")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendMinutes().appendSuffix(resourcebundle.getString("PeriodFormat.minute"), resourcebundle.getString("PeriodFormat.minutes")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendSeconds().appendSuffix(resourcebundle.getString("PeriodFormat.second"), resourcebundle.getString("PeriodFormat.seconds")).appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as).appendMillis().appendSuffix(resourcebundle.getString("PeriodFormat.millisecond"), resourcebundle.getString("PeriodFormat.milliseconds")).toFormatter().withLocale(locale);
    }

    private static PeriodFormatter buildRegExFormatter(ResourceBundle resourcebundle, Locale locale)
    {
        String as[] = retrieveVariants(resourcebundle);
        String s = resourcebundle.getString("PeriodFormat.regex.separator");
        PeriodFormatterBuilder periodformatterbuilder = new PeriodFormatterBuilder();
        periodformatterbuilder.appendYears();
        if (containsKey(resourcebundle, "PeriodFormat.years.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.years.regex").split(s), resourcebundle.getString("PeriodFormat.years.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.year"), resourcebundle.getString("PeriodFormat.years"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendMonths();
        if (containsKey(resourcebundle, "PeriodFormat.months.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.months.regex").split(s), resourcebundle.getString("PeriodFormat.months.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.month"), resourcebundle.getString("PeriodFormat.months"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendWeeks();
        if (containsKey(resourcebundle, "PeriodFormat.weeks.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.weeks.regex").split(s), resourcebundle.getString("PeriodFormat.weeks.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.week"), resourcebundle.getString("PeriodFormat.weeks"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendDays();
        if (containsKey(resourcebundle, "PeriodFormat.days.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.days.regex").split(s), resourcebundle.getString("PeriodFormat.days.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.day"), resourcebundle.getString("PeriodFormat.days"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendHours();
        if (containsKey(resourcebundle, "PeriodFormat.hours.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.hours.regex").split(s), resourcebundle.getString("PeriodFormat.hours.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.hour"), resourcebundle.getString("PeriodFormat.hours"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendMinutes();
        if (containsKey(resourcebundle, "PeriodFormat.minutes.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.minutes.regex").split(s), resourcebundle.getString("PeriodFormat.minutes.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.minute"), resourcebundle.getString("PeriodFormat.minutes"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendSeconds();
        if (containsKey(resourcebundle, "PeriodFormat.seconds.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.seconds.regex").split(s), resourcebundle.getString("PeriodFormat.seconds.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.second"), resourcebundle.getString("PeriodFormat.seconds"));
        }
        periodformatterbuilder.appendSeparator(resourcebundle.getString("PeriodFormat.commaspace"), resourcebundle.getString("PeriodFormat.spaceandspace"), as);
        periodformatterbuilder.appendMillis();
        if (containsKey(resourcebundle, "PeriodFormat.milliseconds.regex"))
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.milliseconds.regex").split(s), resourcebundle.getString("PeriodFormat.milliseconds.list").split(s));
        } else
        {
            periodformatterbuilder.appendSuffix(resourcebundle.getString("PeriodFormat.millisecond"), resourcebundle.getString("PeriodFormat.milliseconds"));
        }
        return periodformatterbuilder.toFormatter().withLocale(locale);
    }

    private static PeriodFormatter buildWordBased(Locale locale)
    {
        ResourceBundle resourcebundle = ResourceBundle.getBundle("org.joda.time.format.messages", locale);
        if (containsKey(resourcebundle, "PeriodFormat.regex.separator"))
        {
            return buildRegExFormatter(resourcebundle, locale);
        } else
        {
            return buildNonRegExFormatter(resourcebundle, locale);
        }
    }

    private static boolean containsKey(ResourceBundle resourcebundle, String s)
    {
        for (resourcebundle = resourcebundle.getKeys(); resourcebundle.hasMoreElements();)
        {
            if (((String)resourcebundle.nextElement()).equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static PeriodFormatter getDefault()
    {
        return wordBased(Locale.ENGLISH);
    }

    private static String[] retrieveVariants(ResourceBundle resourcebundle)
    {
        return (new String[] {
            resourcebundle.getString("PeriodFormat.space"), resourcebundle.getString("PeriodFormat.comma"), resourcebundle.getString("PeriodFormat.commandand"), resourcebundle.getString("PeriodFormat.commaspaceand")
        });
    }

    public static PeriodFormatter wordBased()
    {
        return wordBased(Locale.getDefault());
    }

    public static PeriodFormatter wordBased(Locale locale)
    {
        PeriodFormatter periodformatter;
label0:
        {
            periodformatter = (PeriodFormatter)FORMATTERS.get(locale);
            Object obj = periodformatter;
            if (periodformatter == null)
            {
                obj = new DynamicWordBased(buildWordBased(locale));
                periodformatter = new PeriodFormatter(((PeriodPrinter) (obj)), ((PeriodParser) (obj)), locale, null);
                obj = (PeriodFormatter)FORMATTERS.putIfAbsent(locale, periodformatter);
                if (obj == null)
                {
                    break label0;
                }
            }
            return ((PeriodFormatter) (obj));
        }
        return periodformatter;
    }

}

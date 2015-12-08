// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FastDateParser
    implements Serializable
{
    static class CopyQuotedStrategy extends Strategy
    {

        private final String formatField;

        boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
        {
            FastDateParser.escapeRegex(stringbuilder, formatField, true);
            return false;
        }

        boolean isNumber()
        {
            char c1 = formatField.charAt(0);
            char c = c1;
            if (c1 == '\'')
            {
                c = formatField.charAt(1);
            }
            return Character.isDigit(c);
        }

        CopyQuotedStrategy(String s)
        {
            formatField = s;
        }
    }

    static class NumberStrategy extends Strategy
    {

        private final int field;

        boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
        {
            if (fastdateparser.isNextNumber())
            {
                stringbuilder.append("(\\p{Nd}{").append(fastdateparser.getFieldWidth()).append("}+)");
            } else
            {
                stringbuilder.append("(\\p{Nd}++)");
            }
            return true;
        }

        boolean isNumber()
        {
            return true;
        }

        int modify(int i)
        {
            return i;
        }

        void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
        {
            calendar.set(field, modify(Integer.parseInt(s)));
        }

        NumberStrategy(int i)
        {
            field = i;
        }
    }

    static abstract class Strategy
    {

        abstract boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder);

        boolean isNumber()
        {
            return false;
        }

        void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
        {
        }

        private Strategy()
        {
        }

    }

    static class TextStrategy extends Strategy
    {

        private final int field;
        private final Map keyValues;

        boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
        {
            stringbuilder.append('(');
            for (fastdateparser = keyValues.keySet().iterator(); fastdateparser.hasNext(); FastDateParser.escapeRegex(stringbuilder, (String)fastdateparser.next(), false).append('|')) { }
            stringbuilder.setCharAt(stringbuilder.length() - 1, ')');
            return true;
        }

        void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
        {
            fastdateparser = (Integer)keyValues.get(s);
            if (fastdateparser == null)
            {
                fastdateparser = new StringBuilder(s);
                fastdateparser.append(" not in (");
                for (calendar = keyValues.keySet().iterator(); calendar.hasNext(); fastdateparser.append((String)calendar.next()).append(' ')) { }
                fastdateparser.setCharAt(fastdateparser.length() - 1, ')');
                throw new IllegalArgumentException(fastdateparser.toString());
            } else
            {
                calendar.set(field, fastdateparser.intValue());
                return;
            }
        }

        TextStrategy(int i, Calendar calendar, Locale locale1)
        {
            field = i;
            keyValues = FastDateParser.getDisplayNames(i, calendar, locale1);
        }
    }

    static class TimeZoneStrategy extends Strategy
    {

        private final SortedMap tzNames;
        private final String validTimeZoneChars;

        boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
        {
            stringbuilder.append(validTimeZoneChars);
            return true;
        }

        void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
        {
            if (s.charAt(0) != '+' && s.charAt(0) != '-') goto _L2; else goto _L1
_L1:
            fastdateparser = TimeZone.getTimeZone((new StringBuilder("GMT")).append(s).toString());
_L4:
            calendar.setTimeZone(fastdateparser);
            return;
_L2:
            if (!s.startsWith("GMT"))
            {
                break; /* Loop/switch isn't completed */
            }
            fastdateparser = TimeZone.getTimeZone(s);
            if (true) goto _L4; else goto _L3
_L3:
            TimeZone timezone = (TimeZone)tzNames.get(s);
            fastdateparser = timezone;
            if (timezone == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(" is not a supported timezone name").toString());
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        TimeZoneStrategy(Locale locale1)
        {
            tzNames = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            locale1 = DateFormatSymbols.getInstance(locale1).getZoneStrings();
            int j = locale1.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = locale1[i];
                if (obj[0].startsWith("GMT"))
                {
                    continue;
                }
                TimeZone timezone = TimeZone.getTimeZone(obj[0]);
                if (!tzNames.containsKey(obj[1]))
                {
                    tzNames.put(obj[1], timezone);
                }
                if (!tzNames.containsKey(obj[2]))
                {
                    tzNames.put(obj[2], timezone);
                }
                if (!timezone.useDaylightTime())
                {
                    continue;
                }
                if (!tzNames.containsKey(obj[3]))
                {
                    tzNames.put(obj[3], timezone);
                }
                if (!tzNames.containsKey(obj[4]))
                {
                    tzNames.put(obj[4], timezone);
                }
            }

            locale1 = new StringBuilder();
            locale1.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            for (Iterator iterator = tzNames.keySet().iterator(); iterator.hasNext(); FastDateParser.escapeRegex(locale1, (String)iterator.next(), false).append('|')) { }
            locale1.setCharAt(locale1.length() - 1, ')');
            validTimeZoneChars = locale1.toString();
        }
    }


    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(1) {

        final void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
        {
            int j = Integer.parseInt(s);
            int i = j;
            if (j < 100)
            {
                i = fastdateparser.adjustYear(j);
            }
            calendar.set(1, i);
        }

    };
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(5);
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(8);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(6);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(11);
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(10);
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(1);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(14);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(12);
    private static final Strategy MODULO_HOUR_OF_DAY_STRATEGY = new NumberStrategy(11) {

        final int modify(int i)
        {
            return i % 24;
        }

    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(10) {

        final int modify(int i)
        {
            return i % 12;
        }

    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) {

        final int modify(int i)
        {
            return i - 1;
        }

    };
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(13);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(4);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(3);
    private static final ConcurrentMap caches[] = new ConcurrentMap[17];
    private static final Pattern formatPattern = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private final int century;
    private transient String currentFormatField;
    private final Locale locale;
    private transient Strategy nextStrategy;
    private transient Pattern parsePattern;
    private final String pattern;
    private final int startYear;
    private transient Strategy strategies[];
    private final TimeZone timeZone;

    protected FastDateParser(String s, TimeZone timezone, Locale locale1, Date date)
    {
        pattern = s;
        timeZone = timezone;
        locale = locale1;
        s = Calendar.getInstance(timezone, locale1);
        int i;
        if (date != null)
        {
            s.setTime(date);
            i = s.get(1);
        } else
        if (locale1.equals(JAPANESE_IMPERIAL))
        {
            i = 0;
        } else
        {
            s.setTime(new Date());
            i = s.get(1) - 80;
        }
        century = (i / 100) * 100;
        startYear = i - century;
        init(s);
    }

    private int adjustYear(int i)
    {
        int j = century + i;
        if (i >= startYear)
        {
            return j;
        } else
        {
            return j + 100;
        }
    }

    private static StringBuilder escapeRegex(StringBuilder stringbuilder, String s, boolean flag)
    {
        int i;
        stringbuilder.append("\\Q");
        i = 0;
_L2:
        char c;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        c = s.charAt(i);
        switch (c)
        {
        default:
            break;

        case 39: // '\''
            break; /* Loop/switch isn't completed */

        case 92: // '\\'
            break;
        }
        break MISSING_BLOCK_LABEL_98;
_L3:
        stringbuilder.append(c);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            i++;
            if (i == s.length())
            {
                return stringbuilder;
            }
            c = s.charAt(i);
        }
          goto _L3
        i++;
        if (i != s.length())
        {
            stringbuilder.append(c);
            c = s.charAt(i);
            if (c == 'E')
            {
                stringbuilder.append("E\\\\E\\");
                c = 'Q';
            }
        }
          goto _L3
        stringbuilder.append("\\E");
        return stringbuilder;
    }

    private static ConcurrentMap getCache(int i)
    {
        ConcurrentMap concurrentmap;
        synchronized (caches)
        {
            if (caches[i] == null)
            {
                caches[i] = new ConcurrentHashMap(3);
            }
            concurrentmap = caches[i];
        }
        return concurrentmap;
        exception;
        aconcurrentmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static Map getDisplayNames(int i, Calendar calendar, Locale locale1)
    {
        return calendar.getDisplayNames(i, 0, locale1);
    }

    private Strategy getLocaleSpecificStrategy(int i, Calendar calendar)
    {
        ConcurrentMap concurrentmap = getCache(i);
        Strategy strategy = (Strategy)concurrentmap.get(locale);
        if (strategy == null)
        {
            if (i == 15)
            {
                calendar = new TimeZoneStrategy(locale);
            } else
            {
                calendar = new TextStrategy(i, calendar, locale);
            }
            strategy = (Strategy)concurrentmap.putIfAbsent(locale, calendar);
            if (strategy != null)
            {
                return strategy;
            }
        } else
        {
            calendar = strategy;
        }
        return calendar;
    }

    private Strategy getStrategy(String s, Calendar calendar)
    {
        s.charAt(0);
        JVM INSTR lookupswitch 20: default 176
    //                   39: 185
    //                   68: 212
    //                   69: 216
    //                   70: 224
    //                   71: 228
    //                   72: 235
    //                   75: 239
    //                   77: 243
    //                   83: 262
    //                   87: 266
    //                   90: 318
    //                   97: 270
    //                   100: 278
    //                   104: 282
    //                   107: 286
    //                   109: 290
    //                   115: 294
    //                   119: 298
    //                   121: 302
    //                   122: 318;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L12
_L1:
        return new CopyQuotedStrategy(s);
_L2:
        if (s.length() > 2)
        {
            return new CopyQuotedStrategy(s.substring(1, s.length() - 1));
        }
          goto _L1
_L3:
        return DAY_OF_YEAR_STRATEGY;
_L4:
        return getLocaleSpecificStrategy(7, calendar);
_L5:
        return DAY_OF_WEEK_IN_MONTH_STRATEGY;
_L6:
        return getLocaleSpecificStrategy(0, calendar);
_L7:
        return MODULO_HOUR_OF_DAY_STRATEGY;
_L8:
        return HOUR_STRATEGY;
_L9:
        if (s.length() >= 3)
        {
            return getLocaleSpecificStrategy(2, calendar);
        } else
        {
            return NUMBER_MONTH_STRATEGY;
        }
_L10:
        return MILLISECOND_STRATEGY;
_L11:
        return WEEK_OF_MONTH_STRATEGY;
_L13:
        return getLocaleSpecificStrategy(9, calendar);
_L14:
        return DAY_OF_MONTH_STRATEGY;
_L15:
        return MODULO_HOUR_STRATEGY;
_L16:
        return HOUR_OF_DAY_STRATEGY;
_L17:
        return MINUTE_STRATEGY;
_L18:
        return SECOND_STRATEGY;
_L19:
        return WEEK_OF_YEAR_STRATEGY;
_L20:
        if (s.length() > 2)
        {
            return LITERAL_YEAR_STRATEGY;
        } else
        {
            return ABBREVIATED_YEAR_STRATEGY;
        }
_L12:
        return getLocaleSpecificStrategy(15, calendar);
    }

    private void init(Calendar calendar)
    {
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        Matcher matcher = formatPattern.matcher(pattern);
        if (!matcher.lookingAt())
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal pattern character '")).append(pattern.charAt(matcher.regionStart())).append("'").toString());
        }
        currentFormatField = matcher.group();
        Strategy strategy = getStrategy(currentFormatField, calendar);
        do
        {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt())
            {
                nextStrategy = null;
                if (matcher.regionStart() != matcher.regionEnd())
                {
                    throw new IllegalArgumentException((new StringBuilder("Failed to parse \"")).append(pattern).append("\" ; gave up at index ").append(matcher.regionStart()).toString());
                }
                break;
            }
            String s = matcher.group();
            nextStrategy = getStrategy(s, calendar);
            if (strategy.addRegex(this, stringbuilder))
            {
                arraylist.add(strategy);
            }
            currentFormatField = s;
            strategy = nextStrategy;
        } while (true);
        if (strategy.addRegex(this, stringbuilder))
        {
            arraylist.add(strategy);
        }
        currentFormatField = null;
        strategies = (Strategy[])arraylist.toArray(new Strategy[arraylist.size()]);
        parsePattern = Pattern.compile(stringbuilder.toString());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FastDateParser)
        {
            if (pattern.equals(((FastDateParser) (obj = (FastDateParser)obj)).pattern) && timeZone.equals(((FastDateParser) (obj)).timeZone) && locale.equals(((FastDateParser) (obj)).locale))
            {
                return true;
            }
        }
        return false;
    }

    int getFieldWidth()
    {
        return currentFormatField.length();
    }

    public int hashCode()
    {
        return pattern.hashCode() + (timeZone.hashCode() + locale.hashCode() * 13) * 13;
    }

    boolean isNextNumber()
    {
        return nextStrategy != null && nextStrategy.isNumber();
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        int k = parseposition.getIndex();
        s = parsePattern.matcher(s.substring(k));
        if (!s.lookingAt())
        {
            return null;
        }
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.clear();
        int j;
        for (int i = 0; i < strategies.length; i = j)
        {
            Strategy astrategy[] = strategies;
            j = i + 1;
            astrategy[i].setCalendar(this, calendar, s.group(j));
        }

        parseposition.setIndex(s.end() + k);
        return calendar.getTime();
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        return parse(s, parseposition);
    }

    public String toString()
    {
        return (new StringBuilder("FastDateParser[")).append(pattern).append(",").append(locale).append(",").append(timeZone.getID()).append("]").toString();
    }




}

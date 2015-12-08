// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            DateTimeFormatter, DateTimeFormatterBuilder, InternalParser, InternalPrinter, 
//            DateTimeParserBucket

public class DateTimeFormat
{
    static class StyleFormatter
        implements InternalParser, InternalPrinter
    {

        private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        private DateTimeFormatter getFormatter(Locale locale)
        {
            Object obj;
label0:
            {
                obj = locale;
                if (locale == null)
                {
                    obj = Locale.getDefault();
                }
                StyleFormatterCacheKey styleformattercachekey = new StyleFormatterCacheKey(iType, iDateStyle, iTimeStyle, ((Locale) (obj)));
                DateTimeFormatter datetimeformatter = (DateTimeFormatter)cCache.get(styleformattercachekey);
                locale = datetimeformatter;
                if (datetimeformatter == null)
                {
                    obj = DateTimeFormat.forPattern(getPattern(((Locale) (obj))));
                    locale = (DateTimeFormatter)cCache.putIfAbsent(styleformattercachekey, obj);
                    if (locale == null)
                    {
                        break label0;
                    }
                }
                return locale;
            }
            return ((DateTimeFormatter) (obj));
        }

        public int estimateParsedLength()
        {
            return 40;
        }

        public int estimatePrintedLength()
        {
            return 40;
        }

        String getPattern(Locale locale)
        {
            DateFormat dateformat = null;
            iType;
            JVM INSTR tableswitch 0 2: default 32
        //                       0 66
        //                       1 78
        //                       2 90;
               goto _L1 _L2 _L3 _L4
_L1:
            break; /* Loop/switch isn't completed */
_L4:
            break MISSING_BLOCK_LABEL_90;
_L5:
            if (!(dateformat instanceof SimpleDateFormat))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("No datetime pattern for locale: ").append(locale).toString());
            } else
            {
                return ((SimpleDateFormat)dateformat).toPattern();
            }
_L2:
            dateformat = DateFormat.getDateInstance(iDateStyle, locale);
              goto _L5
_L3:
            dateformat = DateFormat.getTimeInstance(iTimeStyle, locale);
              goto _L5
            dateformat = DateFormat.getDateTimeInstance(iDateStyle, iTimeStyle, locale);
              goto _L5
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            return getFormatter(datetimeparserbucket.getLocale()).getParser0().parseInto(datetimeparserbucket, charsequence, i);
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            getFormatter(locale).getPrinter0().printTo(appendable, l, chronology, i, datetimezone, locale);
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            getFormatter(locale).getPrinter0().printTo(appendable, readablepartial, locale);
        }


        StyleFormatter(int i, int j, int k)
        {
            iDateStyle = i;
            iTimeStyle = j;
            iType = k;
        }
    }

    static class StyleFormatterCacheKey
    {

        private final int combinedTypeAndStyle;
        private final Locale locale;

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof StyleFormatterCacheKey))
            {
                return false;
            }
            obj = (StyleFormatterCacheKey)obj;
            if (combinedTypeAndStyle != ((StyleFormatterCacheKey) (obj)).combinedTypeAndStyle)
            {
                return false;
            }
            if (locale != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((StyleFormatterCacheKey) (obj)).locale == null) goto _L1; else goto _L3
_L3:
            return false;
            if (locale.equals(((StyleFormatterCacheKey) (obj)).locale)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public int hashCode()
        {
            int j = combinedTypeAndStyle;
            int i;
            if (locale == null)
            {
                i = 0;
            } else
            {
                i = locale.hashCode();
            }
            return i + (j + 31) * 31;
        }

        public StyleFormatterCacheKey(int i, int j, int k, Locale locale1)
        {
            locale = locale1;
            combinedTypeAndStyle = (j << 4) + i + (k << 8);
        }
    }


    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final ConcurrentHashMap cPatternCache = new ConcurrentHashMap();
    private static final AtomicReferenceArray cStyleCache = new AtomicReferenceArray(25);

    protected DateTimeFormat()
    {
    }

    static void appendPatternTo(DateTimeFormatterBuilder datetimeformatterbuilder, String s)
    {
        parsePatternTo(datetimeformatterbuilder, s);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i, int j)
    {
        byte byte0 = 2;
        if (i != 4) goto _L2; else goto _L1
_L1:
        byte0 = 1;
_L4:
        StyleFormatter styleformatter = new StyleFormatter(i, j, byte0);
        return new DateTimeFormatter(styleformatter, styleformatter);
_L2:
        if (j == 4)
        {
            byte0 = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static DateTimeFormatter createFormatterForPattern(String s)
    {
        DateTimeFormatter datetimeformatter;
label0:
        {
            if (s == null || s.length() == 0)
            {
                throw new IllegalArgumentException("Invalid pattern specification");
            }
            datetimeformatter = (DateTimeFormatter)cPatternCache.get(s);
            Object obj = datetimeformatter;
            if (datetimeformatter == null)
            {
                obj = new DateTimeFormatterBuilder();
                parsePatternTo(((DateTimeFormatterBuilder) (obj)), s);
                datetimeformatter = ((DateTimeFormatterBuilder) (obj)).toFormatter();
                if (cPatternCache.size() >= 500)
                {
                    break label0;
                }
                obj = (DateTimeFormatter)cPatternCache.putIfAbsent(s, datetimeformatter);
                if (obj == null)
                {
                    break label0;
                }
            }
            return ((DateTimeFormatter) (obj));
        }
        return datetimeformatter;
    }

    private static DateTimeFormatter createFormatterForStyle(String s)
    {
        if (s == null || s.length() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid style specification: ").append(s).toString());
        }
        int i = selectStyle(s.charAt(0));
        int j = selectStyle(s.charAt(1));
        if (i == 4 && j == 4)
        {
            throw new IllegalArgumentException("Style '--' is invalid");
        } else
        {
            return createFormatterForStyleIndex(i, j);
        }
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i, int j)
    {
        int k = (i << 2) + i + j;
        DateTimeFormatter datetimeformatter;
        if (k >= cStyleCache.length())
        {
            datetimeformatter = createDateTimeFormatter(i, j);
        } else
        {
            DateTimeFormatter datetimeformatter1 = (DateTimeFormatter)cStyleCache.get(k);
            datetimeformatter = datetimeformatter1;
            if (datetimeformatter1 == null)
            {
                DateTimeFormatter datetimeformatter2 = createDateTimeFormatter(i, j);
                datetimeformatter = datetimeformatter2;
                if (!cStyleCache.compareAndSet(k, null, datetimeformatter2))
                {
                    return (DateTimeFormatter)cStyleCache.get(k);
                }
            }
        }
        return datetimeformatter;
    }

    public static DateTimeFormatter forPattern(String s)
    {
        return createFormatterForPattern(s);
    }

    public static DateTimeFormatter forStyle(String s)
    {
        return createFormatterForStyle(s);
    }

    public static DateTimeFormatter fullDate()
    {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime()
    {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime()
    {
        return createFormatterForStyleIndex(4, 0);
    }

    private static boolean isNumericToken(String s)
    {
        int i;
        boolean flag;
        flag = true;
        i = s.length();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        s.charAt(0);
        JVM INSTR lookupswitch 19: default 180
    //                   67: 182
    //                   68: 182
    //                   70: 182
    //                   72: 182
    //                   75: 182
    //                   77: 184
    //                   83: 182
    //                   87: 182
    //                   89: 182
    //                   99: 182
    //                   100: 182
    //                   101: 182
    //                   104: 182
    //                   107: 182
    //                   109: 182
    //                   115: 182
    //                   119: 182
    //                   120: 182
    //                   121: 182;
           goto _L2 _L3 _L3 _L3 _L3 _L3 _L4 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L2:
        flag = false;
_L3:
        return flag;
_L4:
        if (i <= 2)
        {
            return true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static DateTimeFormatter longDate()
    {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime()
    {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime()
    {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate()
    {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime()
    {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime()
    {
        return createFormatterForStyleIndex(4, 2);
    }

    private static void parsePatternTo(DateTimeFormatterBuilder datetimeformatterbuilder, String s)
    {
        int ai[];
        int i;
        int i1;
        i1 = s.length();
        ai = new int[1];
        i = 0;
_L23:
        String s1;
        int l;
        int j1;
        char c;
label0:
        {
            if (i < i1)
            {
                ai[0] = i;
                s1 = parseToken(s, ai);
                j1 = ai[0];
                l = s1.length();
                if (l != 0)
                {
                    break label0;
                }
            }
            return;
        }
        c = s1.charAt(0);
        c;
        JVM INSTR lookupswitch 22: default 244
    //                   39: 798
    //                   67: 285
    //                   68: 707
    //                   69: 685
    //                   71: 271
    //                   72: 613
    //                   75: 633
    //                   77: 547
    //                   83: 663
    //                   89: 297
    //                   90: 750
    //                   97: 595
    //                   100: 585
    //                   101: 675
    //                   104: 603
    //                   107: 623
    //                   109: 643
    //                   115: 653
    //                   119: 717
    //                   120: 297
    //                   121: 297
    //                   122: 727;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L11 _L11 _L21
_L2:
        break MISSING_BLOCK_LABEL_798;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Illegal pattern component: ").append(s1).toString());
_L6:
        datetimeformatterbuilder.appendEraText();
_L24:
        i = j1 + 1;
        if (true) goto _L23; else goto _L22
_L22:
        datetimeformatterbuilder.appendCenturyOfEra(l, l);
          goto _L24
_L11:
        if (l == 2)
        {
            boolean flag = true;
            boolean flag1 = true;
            if (j1 + 1 < i1)
            {
                ai[0] = ai[0] + 1;
                flag = flag1;
                if (isNumericToken(parseToken(s, ai)))
                {
                    flag = false;
                }
                ai[0] = ai[0] - 1;
            }
            switch (c)
            {
            default:
                datetimeformatterbuilder.appendTwoDigitYear((new DateTime()).getYear() - 30, flag);
                break;

            case 120: // 'x'
                datetimeformatterbuilder.appendTwoDigitWeekyear((new DateTime()).getWeekyear() - 30, flag);
                break;
            }
        } else
        {
            int j = 9;
            int k = j;
            if (j1 + 1 < i1)
            {
                ai[0] = ai[0] + 1;
                if (isNumericToken(parseToken(s, ai)))
                {
                    j = l;
                }
                ai[0] = ai[0] - 1;
                k = j;
            }
            switch (c)
            {
            case 89: // 'Y'
                datetimeformatterbuilder.appendYearOfEra(l, k);
                break;

            case 120: // 'x'
                datetimeformatterbuilder.appendWeekyear(l, k);
                break;

            case 121: // 'y'
                datetimeformatterbuilder.appendYear(l, k);
                break;
            }
        }
        if (true) goto _L24; else goto _L25
_L25:
_L9:
        if (l >= 3)
        {
            if (l >= 4)
            {
                datetimeformatterbuilder.appendMonthOfYearText();
            } else
            {
                datetimeformatterbuilder.appendMonthOfYearShortText();
            }
        } else
        {
            datetimeformatterbuilder.appendMonthOfYear(l);
        }
          goto _L24
_L14:
        datetimeformatterbuilder.appendDayOfMonth(l);
          goto _L24
_L13:
        datetimeformatterbuilder.appendHalfdayOfDayText();
          goto _L24
_L16:
        datetimeformatterbuilder.appendClockhourOfHalfday(l);
          goto _L24
_L7:
        datetimeformatterbuilder.appendHourOfDay(l);
          goto _L24
_L17:
        datetimeformatterbuilder.appendClockhourOfDay(l);
          goto _L24
_L8:
        datetimeformatterbuilder.appendHourOfHalfday(l);
          goto _L24
_L18:
        datetimeformatterbuilder.appendMinuteOfHour(l);
          goto _L24
_L19:
        datetimeformatterbuilder.appendSecondOfMinute(l);
          goto _L24
_L10:
        datetimeformatterbuilder.appendFractionOfSecond(l, l);
          goto _L24
_L15:
        datetimeformatterbuilder.appendDayOfWeek(l);
          goto _L24
_L5:
        if (l >= 4)
        {
            datetimeformatterbuilder.appendDayOfWeekText();
        } else
        {
            datetimeformatterbuilder.appendDayOfWeekShortText();
        }
          goto _L24
_L4:
        datetimeformatterbuilder.appendDayOfYear(l);
          goto _L24
_L20:
        datetimeformatterbuilder.appendWeekOfWeekyear(l);
          goto _L24
_L21:
        if (l >= 4)
        {
            datetimeformatterbuilder.appendTimeZoneName();
        } else
        {
            datetimeformatterbuilder.appendTimeZoneShortName(null);
        }
          goto _L24
_L12:
        if (l == 1)
        {
            datetimeformatterbuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
        } else
        if (l == 2)
        {
            datetimeformatterbuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
        } else
        {
            datetimeformatterbuilder.appendTimeZoneId();
        }
          goto _L24
        s1 = s1.substring(1);
        if (s1.length() == 1)
        {
            datetimeformatterbuilder.appendLiteral(s1.charAt(0));
        } else
        {
            datetimeformatterbuilder.appendLiteral(new String(s1));
        }
          goto _L24
    }

    private static String parseToken(String s, int ai[])
    {
        char c;
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder();
        i = ai[0];
        l = s.length();
        c = s.charAt(i);
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) goto _L2; else goto _L1
_L1:
        int j;
        stringbuilder.append(c);
        do
        {
            j = i;
            if (i + 1 >= l)
            {
                break;
            }
            j = i;
            if (s.charAt(i + 1) != c)
            {
                break;
            }
            stringbuilder.append(c);
            i++;
        } while (true);
          goto _L3
_L2:
        int k;
        stringbuilder.append('\'');
        k = 0;
_L7:
        j = i;
        if (i >= l) goto _L3; else goto _L4
_L4:
        c = s.charAt(i);
        if (c != '\'') goto _L6; else goto _L5
_L5:
        if (i + 1 < l && s.charAt(i + 1) == '\'')
        {
            i++;
            stringbuilder.append(c);
            j = k;
        } else
        if (k == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
_L8:
        i++;
        k = j;
          goto _L7
_L6:
        if (k != 0 || (c < 'A' || c > 'Z') && (c < 'a' || c > 'z'))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        j = i - 1;
_L3:
        ai[0] = j;
        return stringbuilder.toString();
        stringbuilder.append(c);
        j = k;
          goto _L8
    }

    public static String patternForStyle(String s, Locale locale)
    {
        DateTimeFormatter datetimeformatter = createFormatterForStyle(s);
        s = locale;
        if (locale == null)
        {
            s = Locale.getDefault();
        }
        return ((StyleFormatter)datetimeformatter.getPrinter0()).getPattern(s);
    }

    private static int selectStyle(char c)
    {
        switch (c)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid style character: ").append(c).toString());

        case 83: // 'S'
            return 3;

        case 77: // 'M'
            return 2;

        case 76: // 'L'
            return 1;

        case 70: // 'F'
            return 0;

        case 45: // '-'
            return 4;
        }
    }

    public static DateTimeFormatter shortDate()
    {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime()
    {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime()
    {
        return createFormatterForStyleIndex(4, 3);
    }

}

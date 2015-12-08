// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.Validate;

// Referenced classes of package org.apache.commons.lang3.time:
//            FormatCache

public class FastDateFormat extends Format
{
    private static class CharacterLiteral
        implements Rule
    {

        private final char mValue;

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            stringbuffer.append(mValue);
        }

        public int estimateLength()
        {
            return 1;
        }

        CharacterLiteral(char c)
        {
            mValue = c;
        }
    }

    private static interface NumberRule
        extends Rule
    {

        public abstract void appendTo(StringBuffer stringbuffer, int i);
    }

    private static class PaddedNumberField
        implements NumberRule
    {

        private final int mField;
        private final int mSize;

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            if (i < 100)
            {
                int j = mSize;
                do
                {
                    j--;
                    if (j >= 2)
                    {
                        stringbuffer.append('0');
                    } else
                    {
                        stringbuffer.append((char)(i / 10 + 48));
                        stringbuffer.append((char)(i % 10 + 48));
                        return;
                    }
                } while (true);
            }
            int k;
            int l;
            if (i < 1000)
            {
                k = 3;
            } else
            {
                boolean flag;
                if (i > -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Validate.isTrue(flag, "Negative values should not be possible", i);
                k = Integer.toString(i).length();
            }
            l = mSize;
            do
            {
                l--;
                if (l >= k)
                {
                    stringbuffer.append('0');
                } else
                {
                    stringbuffer.append(Integer.toString(i));
                    return;
                }
            } while (true);
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(mField));
        }

        public int estimateLength()
        {
            return 4;
        }

        PaddedNumberField(int i, int j)
        {
            if (j < 3)
            {
                throw new IllegalArgumentException();
            } else
            {
                mField = i;
                mSize = j;
                return;
            }
        }
    }

    private static interface Rule
    {

        public abstract void appendTo(StringBuffer stringbuffer, Calendar calendar);

        public abstract int estimateLength();
    }

    private static class StringLiteral
        implements Rule
    {

        private final String mValue;

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            stringbuffer.append(mValue);
        }

        public int estimateLength()
        {
            return mValue.length();
        }

        StringLiteral(String s)
        {
            mValue = s;
        }
    }

    private static class TextField
        implements Rule
    {

        private final int mField;
        private final String mValues[];

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            stringbuffer.append(mValues[calendar.get(mField)]);
        }

        public int estimateLength()
        {
            int j = 0;
            int i = mValues.length;
            do
            {
                int k = i - 1;
                if (k < 0)
                {
                    break;
                }
                int l = mValues[k].length();
                i = k;
                if (l > j)
                {
                    j = l;
                    i = k;
                }
            } while (true);
            return j;
        }

        TextField(int i, String as[])
        {
            mField = i;
            mValues = as;
        }
    }

    private static class TimeZoneDisplayKey
    {

        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof TimeZoneDisplayKey)
                {
                    if (!mTimeZone.equals(((TimeZoneDisplayKey) (obj = (TimeZoneDisplayKey)obj)).mTimeZone) || mStyle != ((TimeZoneDisplayKey) (obj)).mStyle || !mLocale.equals(((TimeZoneDisplayKey) (obj)).mLocale))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return (mStyle * 31 + mLocale.hashCode()) * 31 + mTimeZone.hashCode();
        }

        TimeZoneDisplayKey(TimeZone timezone, boolean flag, int i, Locale locale)
        {
            mTimeZone = timezone;
            int j = i;
            if (flag)
            {
                j = i | 0x80000000;
            }
            mStyle = j;
            mLocale = locale;
        }
    }

    private static class TimeZoneNameRule
        implements Rule
    {

        private final String mDaylight;
        private final String mStandard;
        private final TimeZone mTimeZone;

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            if (mTimeZone.useDaylightTime() && calendar.get(16) != 0)
            {
                stringbuffer.append(mDaylight);
                return;
            } else
            {
                stringbuffer.append(mStandard);
                return;
            }
        }

        public int estimateLength()
        {
            return Math.max(mStandard.length(), mDaylight.length());
        }

        TimeZoneNameRule(TimeZone timezone, Locale locale, int i)
        {
            mTimeZone = timezone;
            mStandard = FastDateFormat.getTimeZoneDisplay(timezone, false, i, locale);
            mDaylight = FastDateFormat.getTimeZoneDisplay(timezone, true, i, locale);
        }
    }

    private static class TimeZoneNumberRule
        implements Rule
    {

        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            int i = calendar.get(15) + calendar.get(16);
            int j;
            if (i < 0)
            {
                stringbuffer.append('-');
                i = -i;
            } else
            {
                stringbuffer.append('+');
            }
            j = i / 0x36ee80;
            stringbuffer.append((char)(j / 10 + 48));
            stringbuffer.append((char)(j % 10 + 48));
            if (mColon)
            {
                stringbuffer.append(':');
            }
            i = i / 60000 - j * 60;
            stringbuffer.append((char)(i / 10 + 48));
            stringbuffer.append((char)(i % 10 + 48));
        }

        public int estimateLength()
        {
            return 5;
        }


        TimeZoneNumberRule(boolean flag)
        {
            mColon = flag;
        }
    }

    private static class TwelveHourField
        implements NumberRule
    {

        private final NumberRule mRule;

        public void appendTo(StringBuffer stringbuffer, int i)
        {
            mRule.appendTo(stringbuffer, i);
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            int j = calendar.get(10);
            int i = j;
            if (j == 0)
            {
                i = calendar.getLeastMaximum(10) + 1;
            }
            mRule.appendTo(stringbuffer, i);
        }

        public int estimateLength()
        {
            return mRule.estimateLength();
        }

        TwelveHourField(NumberRule numberrule)
        {
            mRule = numberrule;
        }
    }

    private static class TwentyFourHourField
        implements NumberRule
    {

        private final NumberRule mRule;

        public void appendTo(StringBuffer stringbuffer, int i)
        {
            mRule.appendTo(stringbuffer, i);
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            int j = calendar.get(11);
            int i = j;
            if (j == 0)
            {
                i = calendar.getMaximum(11) + 1;
            }
            mRule.appendTo(stringbuffer, i);
        }

        public int estimateLength()
        {
            return mRule.estimateLength();
        }

        TwentyFourHourField(NumberRule numberrule)
        {
            mRule = numberrule;
        }
    }

    private static class TwoDigitMonthField
        implements NumberRule
    {

        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            stringbuffer.append((char)(i / 10 + 48));
            stringbuffer.append((char)(i % 10 + 48));
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(2) + 1);
        }

        public int estimateLength()
        {
            return 2;
        }


        TwoDigitMonthField()
        {
        }
    }

    private static class TwoDigitNumberField
        implements NumberRule
    {

        private final int mField;

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            if (i < 100)
            {
                stringbuffer.append((char)(i / 10 + 48));
                stringbuffer.append((char)(i % 10 + 48));
                return;
            } else
            {
                stringbuffer.append(Integer.toString(i));
                return;
            }
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(mField));
        }

        public int estimateLength()
        {
            return 2;
        }

        TwoDigitNumberField(int i)
        {
            mField = i;
        }
    }

    private static class TwoDigitYearField
        implements NumberRule
    {

        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            stringbuffer.append((char)(i / 10 + 48));
            stringbuffer.append((char)(i % 10 + 48));
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(1) % 100);
        }

        public int estimateLength()
        {
            return 2;
        }


        TwoDigitYearField()
        {
        }
    }

    private static class UnpaddedMonthField
        implements NumberRule
    {

        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            if (i < 10)
            {
                stringbuffer.append((char)(i + 48));
                return;
            } else
            {
                stringbuffer.append((char)(i / 10 + 48));
                stringbuffer.append((char)(i % 10 + 48));
                return;
            }
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(2) + 1);
        }

        public int estimateLength()
        {
            return 2;
        }


        UnpaddedMonthField()
        {
        }
    }

    private static class UnpaddedNumberField
        implements NumberRule
    {

        private final int mField;

        public final void appendTo(StringBuffer stringbuffer, int i)
        {
            if (i < 10)
            {
                stringbuffer.append((char)(i + 48));
                return;
            }
            if (i < 100)
            {
                stringbuffer.append((char)(i / 10 + 48));
                stringbuffer.append((char)(i % 10 + 48));
                return;
            } else
            {
                stringbuffer.append(Integer.toString(i));
                return;
            }
        }

        public void appendTo(StringBuffer stringbuffer, Calendar calendar)
        {
            appendTo(stringbuffer, calendar.get(mField));
        }

        public int estimateLength()
        {
            return 4;
        }

        UnpaddedNumberField(int i)
        {
            mField = i;
        }
    }


    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static ConcurrentMap cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final FormatCache cache = new FormatCache() {

        protected volatile Format createInstance(String s, TimeZone timezone, Locale locale)
        {
            return createInstance(s, timezone, locale);
        }

        protected FastDateFormat createInstance(String s, TimeZone timezone, Locale locale)
        {
            return new FastDateFormat(s, timezone, locale);
        }

    };
    private static final long serialVersionUID = 1L;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient Rule mRules[];
    private final TimeZone mTimeZone;

    protected FastDateFormat(String s, TimeZone timezone, Locale locale)
    {
        mPattern = s;
        mTimeZone = timezone;
        mLocale = locale;
        init();
    }

    public static FastDateFormat getDateInstance(int i)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), null, null, null);
    }

    public static FastDateFormat getDateInstance(int i, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), null, null, locale);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timezone)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), null, timezone, null);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timezone, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), null, timezone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int j)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(j), null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int j, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(j), null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int j, TimeZone timezone)
    {
        return getDateTimeInstance(i, j, timezone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int j, TimeZone timezone, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(j), timezone, locale);
    }

    public static FastDateFormat getInstance()
    {
        return (FastDateFormat)cache.getDateTimeInstance(Integer.valueOf(3), Integer.valueOf(3), null, null);
    }

    public static FastDateFormat getInstance(String s)
    {
        return (FastDateFormat)cache.getInstance(s, null, null);
    }

    public static FastDateFormat getInstance(String s, Locale locale)
    {
        return (FastDateFormat)cache.getInstance(s, null, locale);
    }

    public static FastDateFormat getInstance(String s, TimeZone timezone)
    {
        return (FastDateFormat)cache.getInstance(s, timezone, null);
    }

    public static FastDateFormat getInstance(String s, TimeZone timezone, Locale locale)
    {
        return (FastDateFormat)cache.getInstance(s, timezone, locale);
    }

    public static FastDateFormat getTimeInstance(int i)
    {
        return (FastDateFormat)cache.getDateTimeInstance(null, Integer.valueOf(i), null, null);
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(null, Integer.valueOf(i), null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timezone)
    {
        return (FastDateFormat)cache.getDateTimeInstance(null, Integer.valueOf(i), timezone, null);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timezone, Locale locale)
    {
        return (FastDateFormat)cache.getDateTimeInstance(null, Integer.valueOf(i), timezone, locale);
    }

    static String getTimeZoneDisplay(TimeZone timezone, boolean flag, int i, Locale locale)
    {
        TimeZoneDisplayKey timezonedisplaykey = new TimeZoneDisplayKey(timezone, flag, i, locale);
        String s = (String)cTimeZoneDisplayCache.get(timezonedisplaykey);
        Object obj = s;
        if (s == null)
        {
            obj = timezone.getDisplayName(flag, i, locale);
            timezone = (String)cTimeZoneDisplayCache.putIfAbsent(timezonedisplaykey, obj);
            if (timezone != null)
            {
                obj = timezone;
            }
        }
        return ((String) (obj));
    }

    private void init()
    {
        List list = parsePattern();
        mRules = (Rule[])list.toArray(new Rule[list.size()]);
        int i = 0;
        int j = mRules.length;
        do
        {
            j--;
            if (j >= 0)
            {
                i += mRules[j].estimateLength();
            } else
            {
                mMaxLengthEstimate = i;
                return;
            }
        } while (true);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        init();
    }

    protected StringBuffer applyRules(Calendar calendar, StringBuffer stringbuffer)
    {
        Rule arule[] = mRules;
        int j = arule.length;
        for (int i = 0; i < j; i++)
        {
            arule[i].appendTo(stringbuffer, calendar);
        }

        return stringbuffer;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FastDateFormat)
        {
            if (mPattern.equals(((FastDateFormat) (obj = (FastDateFormat)obj)).mPattern) && mTimeZone.equals(((FastDateFormat) (obj)).mTimeZone) && mLocale.equals(((FastDateFormat) (obj)).mLocale))
            {
                return true;
            }
        }
        return false;
    }

    public String format(long l)
    {
        return format(new Date(l));
    }

    public String format(Calendar calendar)
    {
        return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
    }

    public String format(Date date)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(mTimeZone, mLocale);
        gregoriancalendar.setTime(date);
        return applyRules(gregoriancalendar, new StringBuffer(mMaxLengthEstimate)).toString();
    }

    public StringBuffer format(long l, StringBuffer stringbuffer)
    {
        return format(new Date(l), stringbuffer);
    }

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        if (obj instanceof Date)
        {
            return format((Date)obj, stringbuffer);
        }
        if (obj instanceof Calendar)
        {
            return format((Calendar)obj, stringbuffer);
        }
        if (obj instanceof Long)
        {
            return format(((Long)obj).longValue(), stringbuffer);
        }
        stringbuffer = (new StringBuilder()).append("Unknown class: ");
        if (obj == null)
        {
            obj = "<null>";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(stringbuffer.append(((String) (obj))).toString());
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringbuffer)
    {
        return applyRules(calendar, stringbuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(mTimeZone, mLocale);
        gregoriancalendar.setTime(date);
        return applyRules(gregoriancalendar, stringbuffer);
    }

    public Locale getLocale()
    {
        return mLocale;
    }

    public int getMaxLengthEstimate()
    {
        return mMaxLengthEstimate;
    }

    public String getPattern()
    {
        return mPattern;
    }

    public TimeZone getTimeZone()
    {
        return mTimeZone;
    }

    public int hashCode()
    {
        return mPattern.hashCode() + (mTimeZone.hashCode() + mLocale.hashCode() * 13) * 13;
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        parseposition.setIndex(0);
        parseposition.setErrorIndex(0);
        return null;
    }

    protected List parsePattern()
    {
        String as[];
        String as1[];
        ArrayList arraylist;
        String as2[];
        String as3[];
        String as4[];
        String as5[];
        int ai[];
        int i;
        int l;
        DateFormatSymbols dateformatsymbols = new DateFormatSymbols(mLocale);
        arraylist = new ArrayList();
        as2 = dateformatsymbols.getEras();
        as3 = dateformatsymbols.getMonths();
        as4 = dateformatsymbols.getShortMonths();
        as = dateformatsymbols.getWeekdays();
        as1 = dateformatsymbols.getShortWeekdays();
        as5 = dateformatsymbols.getAmPmStrings();
        l = mPattern.length();
        ai = new int[1];
        i = 0;
_L23:
        Object obj;
        int k;
        int i1;
label0:
        {
            if (i < l)
            {
                ai[0] = i;
                obj = parseToken(mPattern, ai);
                i1 = ai[0];
                k = ((String) (obj)).length();
                if (k != 0)
                {
                    break label0;
                }
            }
            return arraylist;
        }
        ((String) (obj)).charAt(0);
        JVM INSTR lookupswitch 20: default 292
    //                   39: 709
    //                   68: 551
    //                   69: 524
    //                   70: 563
    //                   71: 320
    //                   72: 476
    //                   75: 631
    //                   77: 386
    //                   83: 512
    //                   87: 586
    //                   90: 689
    //                   97: 597
    //                   100: 446
    //                   104: 457
    //                   107: 612
    //                   109: 488
    //                   115: 500
    //                   119: 575
    //                   121: 349
    //                   122: 643;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L2:
        break MISSING_BLOCK_LABEL_709;
_L20:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Illegal pattern component: ").append(((String) (obj))).toString());
_L6:
        obj = new TextField(0, as2);
_L24:
        arraylist.add(obj);
        i = i1 + 1;
        if (true) goto _L23; else goto _L22
_L22:
        if (k == 2)
        {
            obj = TwoDigitYearField.INSTANCE;
        } else
        {
            int j = k;
            if (k < 4)
            {
                j = 4;
            }
            obj = selectNumberRule(1, j);
        }
          goto _L24
_L9:
        if (k >= 4)
        {
            obj = new TextField(2, as3);
        } else
        if (k == 3)
        {
            obj = new TextField(2, as4);
        } else
        if (k == 2)
        {
            obj = TwoDigitMonthField.INSTANCE;
        } else
        {
            obj = UnpaddedMonthField.INSTANCE;
        }
          goto _L24
_L14:
        obj = selectNumberRule(5, k);
          goto _L24
_L15:
        obj = new TwelveHourField(selectNumberRule(10, k));
          goto _L24
_L7:
        obj = selectNumberRule(11, k);
          goto _L24
_L17:
        obj = selectNumberRule(12, k);
          goto _L24
_L18:
        obj = selectNumberRule(13, k);
          goto _L24
_L10:
        obj = selectNumberRule(14, k);
          goto _L24
_L4:
        if (k < 4)
        {
            obj = as1;
        } else
        {
            obj = as;
        }
        obj = new TextField(7, ((String []) (obj)));
          goto _L24
_L3:
        obj = selectNumberRule(6, k);
          goto _L24
_L5:
        obj = selectNumberRule(8, k);
          goto _L24
_L19:
        obj = selectNumberRule(3, k);
          goto _L24
_L11:
        obj = selectNumberRule(4, k);
          goto _L24
_L13:
        obj = new TextField(9, as5);
          goto _L24
_L16:
        obj = new TwentyFourHourField(selectNumberRule(11, k));
          goto _L24
_L8:
        obj = selectNumberRule(10, k);
          goto _L24
_L21:
        if (k >= 4)
        {
            obj = new TimeZoneNameRule(mTimeZone, mLocale, 1);
        } else
        {
            obj = new TimeZoneNameRule(mTimeZone, mLocale, 0);
        }
          goto _L24
_L12:
        if (k == 1)
        {
            obj = TimeZoneNumberRule.INSTANCE_NO_COLON;
        } else
        {
            obj = TimeZoneNumberRule.INSTANCE_COLON;
        }
          goto _L24
        obj = ((String) (obj)).substring(1);
        if (((String) (obj)).length() == 1)
        {
            obj = new CharacterLiteral(((String) (obj)).charAt(0));
        } else
        {
            obj = new StringLiteral(((String) (obj)));
        }
          goto _L24
    }

    protected String parseToken(String s, int ai[])
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
            break MISSING_BLOCK_LABEL_253;
        }
        j = i - 1;
_L3:
        ai[0] = j;
        return stringbuilder.toString();
        stringbuilder.append(c);
        j = k;
          goto _L8
    }

    protected NumberRule selectNumberRule(int i, int j)
    {
        switch (j)
        {
        default:
            return new PaddedNumberField(i, j);

        case 1: // '\001'
            return new UnpaddedNumberField(i);

        case 2: // '\002'
            return new TwoDigitNumberField(i);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("FastDateFormat[").append(mPattern).append("]").toString();
    }

}

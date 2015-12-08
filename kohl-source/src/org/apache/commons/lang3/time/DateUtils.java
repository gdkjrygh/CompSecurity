// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DateUtils
{
    static class DateIterator
        implements Iterator
    {

        private final Calendar endFinal;
        private final Calendar spot;

        public boolean hasNext()
        {
            return spot.before(endFinal);
        }

        public volatile Object next()
        {
            return next();
        }

        public Calendar next()
        {
            if (spot.equals(endFinal))
            {
                throw new NoSuchElementException();
            } else
            {
                spot.add(5, 1);
                return (Calendar)spot.clone();
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        DateIterator(Calendar calendar, Calendar calendar1)
        {
            endFinal = calendar1;
            spot = calendar;
            spot.add(5, -1);
        }
    }


    public static final long MILLIS_PER_DAY = 0x5265c00L;
    public static final long MILLIS_PER_HOUR = 0x36ee80L;
    public static final long MILLIS_PER_MINUTE = 60000L;
    public static final long MILLIS_PER_SECOND = 1000L;
    private static final int MODIFY_CEILING = 2;
    private static final int MODIFY_ROUND = 1;
    private static final int MODIFY_TRUNCATE = 0;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    private static final int fields[][] = {
        {
            14
        }, {
            13
        }, {
            12
        }, {
            11, 10
        }, {
            5, 5, 9
        }, {
            2, 1001
        }, {
            1
        }, {
            0
        }
    };

    public DateUtils()
    {
    }

    private static Date add(Date date, int i, int j)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(i, j);
            return calendar.getTime();
        }
    }

    public static Date addDays(Date date, int i)
    {
        return add(date, 5, i);
    }

    public static Date addHours(Date date, int i)
    {
        return add(date, 11, i);
    }

    public static Date addMilliseconds(Date date, int i)
    {
        return add(date, 14, i);
    }

    public static Date addMinutes(Date date, int i)
    {
        return add(date, 12, i);
    }

    public static Date addMonths(Date date, int i)
    {
        return add(date, 2, i);
    }

    public static Date addSeconds(Date date, int i)
    {
        return add(date, 13, i);
    }

    public static Date addWeeks(Date date, int i)
    {
        return add(date, 3, i);
    }

    public static Date addYears(Date date, int i)
    {
        return add(date, 1, i);
    }

    public static Calendar ceiling(Calendar calendar, int i)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            calendar = (Calendar)calendar.clone();
            modify(calendar, i, 2);
            return calendar;
        }
    }

    public static Date ceiling(Object obj, int i)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date)
        {
            return ceiling((Date)obj, i);
        }
        if (obj instanceof Calendar)
        {
            return ceiling((Calendar)obj, i).getTime();
        } else
        {
            throw new ClassCastException((new StringBuilder()).append("Could not find ceiling of for type: ").append(obj.getClass()).toString());
        }
    }

    public static Date ceiling(Date date, int i)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 2);
            return calendar.getTime();
        }
    }

    private static long getFragment(Calendar calendar, int i, int j)
    {
        long l;
        long l5;
        if (calendar == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        l5 = getMillisPerUnit(j);
        l = 0L;
        i;
        JVM INSTR tableswitch 1 2: default 44
    //                   1 160
    //                   2 180;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_180;
_L4:
        long l1 = l;
        long l2 = l;
        long l3 = l;
        long l4 = l;
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("The fragment ").append(i).append(" is not supported").toString());

        case 1: // '\001'
        case 2: // '\002'
        case 5: // '\005'
        case 6: // '\006'
            l1 = l + ((long)calendar.get(11) * 0x36ee80L) / l5;
            // fall through

        case 11: // '\013'
            l2 = l1 + ((long)calendar.get(12) * 60000L) / l5;
            // fall through

        case 12: // '\f'
            l3 = l2 + ((long)calendar.get(13) * 1000L) / l5;
            // fall through

        case 13: // '\r'
            l4 = l3 + (long)(calendar.get(14) * 1) / l5;
            // fall through

        case 14: // '\016'
            return l4;
        }
_L2:
        l = 0L + ((long)calendar.get(6) * 0x5265c00L) / l5;
          goto _L4
        l = 0L + ((long)calendar.get(5) * 0x5265c00L) / l5;
          goto _L4
    }

    private static long getFragment(Date date, int i, int j)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return getFragment(calendar, i, j);
        }
    }

    public static long getFragmentInDays(Calendar calendar, int i)
    {
        return getFragment(calendar, i, 6);
    }

    public static long getFragmentInDays(Date date, int i)
    {
        return getFragment(date, i, 6);
    }

    public static long getFragmentInHours(Calendar calendar, int i)
    {
        return getFragment(calendar, i, 11);
    }

    public static long getFragmentInHours(Date date, int i)
    {
        return getFragment(date, i, 11);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i)
    {
        return getFragment(calendar, i, 14);
    }

    public static long getFragmentInMilliseconds(Date date, int i)
    {
        return getFragment(date, i, 14);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i)
    {
        return getFragment(calendar, i, 12);
    }

    public static long getFragmentInMinutes(Date date, int i)
    {
        return getFragment(date, i, 12);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i)
    {
        return getFragment(calendar, i, 13);
    }

    public static long getFragmentInSeconds(Date date, int i)
    {
        return getFragment(date, i, 13);
    }

    private static long getMillisPerUnit(int i)
    {
        switch (i)
        {
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("The unit ").append(i).append(" cannot be represented is milleseconds").toString());

        case 5: // '\005'
        case 6: // '\006'
            return 0x5265c00L;

        case 11: // '\013'
            return 0x36ee80L;

        case 12: // '\f'
            return 60000L;

        case 13: // '\r'
            return 1000L;

        case 14: // '\016'
            return 1L;
        }
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar1)
    {
        if (calendar == null || calendar1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(0) == calendar1.get(0) && calendar.get(1) == calendar1.get(1) && calendar.get(6) == calendar1.get(6);
    }

    public static boolean isSameDay(Date date, Date date1)
    {
        if (date == null || date1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            date = Calendar.getInstance();
            date.setTime(date1);
            return isSameDay(calendar, ((Calendar) (date)));
        }
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar1)
    {
        if (calendar == null || calendar1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.getTime().getTime() == calendar1.getTime().getTime();
    }

    public static boolean isSameInstant(Date date, Date date1)
    {
        if (date == null || date1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        return date.getTime() == date1.getTime();
    }

    public static boolean isSameLocalTime(Calendar calendar, Calendar calendar1)
    {
        if (calendar == null || calendar1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(14) == calendar1.get(14) && calendar.get(13) == calendar1.get(13) && calendar.get(12) == calendar1.get(12) && calendar.get(11) == calendar1.get(11) && calendar.get(6) == calendar1.get(6) && calendar.get(1) == calendar1.get(1) && calendar.get(0) == calendar1.get(0) && calendar.getClass() == calendar1.getClass();
    }

    public static Iterator iterator(Object obj, int i)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date)
        {
            return iterator((Date)obj, i);
        }
        if (obj instanceof Calendar)
        {
            return iterator((Calendar)obj, i);
        } else
        {
            throw new ClassCastException((new StringBuilder()).append("Could not iterate based on ").append(obj).toString());
        }
    }

    public static Iterator iterator(Calendar calendar, int i)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        boolean flag = true;
        byte byte0 = 7;
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("The range style ").append(i).append(" is not valid.").toString());

        case 5: // '\005'
        case 6: // '\006'
            calendar = truncate(calendar, 2);
            Calendar calendar3 = (Calendar)calendar.clone();
            calendar3.add(2, 1);
            calendar3.add(5, -1);
            Calendar calendar1 = calendar3;
            int j = byte0;
            Calendar calendar2 = calendar;
            int k = ((flag) ? 1 : 0);
            if (i == 6)
            {
                k = 2;
                j = 1;
                calendar2 = calendar;
                calendar1 = calendar3;
            }
            do
            {
                i = k;
                if (k < 1)
                {
                    i = k + 7;
                }
                k = i;
                if (i > 7)
                {
                    k = i - 7;
                }
                i = j;
                if (j < 1)
                {
                    i = j + 7;
                }
                j = i;
                if (i > 7)
                {
                    j = i - 7;
                }
                Calendar calendar4;
                Calendar calendar5;
                for (; calendar2.get(7) != k; calendar2.add(5, -1)) { }
                for (; calendar1.get(7) != j; calendar1.add(5, 1)) { }
                return new DateIterator(calendar2, calendar1);
            } while (true);

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            calendar4 = truncate(calendar, 5);
            calendar5 = truncate(calendar, 5);
            calendar1 = calendar5;
            j = byte0;
            calendar2 = calendar4;
            k = ((flag) ? 1 : 0);
            switch (i)
            {
            default:
                calendar1 = calendar5;
                j = byte0;
                calendar2 = calendar4;
                k = ((flag) ? 1 : 0);
                break;

            case 2: // '\002'
                k = 2;
                j = 1;
                calendar1 = calendar5;
                calendar2 = calendar4;
                break;

            case 3: // '\003'
                k = calendar.get(7);
                j = k - 1;
                calendar1 = calendar5;
                calendar2 = calendar4;
                break;

            case 4: // '\004'
                k = calendar.get(7) - 3;
                j = calendar.get(7) + 3;
                calendar1 = calendar5;
                calendar2 = calendar4;
                break;

            case 1: // '\001'
                break;
            }
            continue;
        }
    }

    public static Iterator iterator(Date date, int i)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return iterator(calendar, i);
        }
    }

    private static void modify(Calendar calendar, int i, int j)
    {
        if (calendar.get(1) > 0x10b07600)
        {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (i != 14) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int ai[][];
        int k1;
        int i2;
        int j2;
        Date date;
        boolean flag;
        long l2;
label0:
        {
            date = calendar.getTime();
            long l3 = date.getTime();
            flag = false;
            int l = calendar.get(14);
            if (j != 0)
            {
                l2 = l3;
                if (l >= 500)
                {
                    break label0;
                }
            }
            l2 = l3 - (long)l;
        }
        long l4;
label1:
        {
            if (i == 13)
            {
                flag = true;
            }
            int i1 = calendar.get(13);
            l4 = l2;
            if (flag)
            {
                break label1;
            }
            if (j != 0)
            {
                l4 = l2;
                if (i1 >= 30)
                {
                    break label1;
                }
            }
            l4 = l2 - (long)i1 * 1000L;
        }
label2:
        {
            if (i == 12)
            {
                flag = true;
            }
            int j1 = calendar.get(12);
            l2 = l4;
            if (flag)
            {
                break label2;
            }
            if (j != 0)
            {
                l2 = l4;
                if (j1 >= 30)
                {
                    break label2;
                }
            }
            l2 = l4 - (long)j1 * 60000L;
        }
        if (date.getTime() != l2)
        {
            date.setTime(l2);
            calendar.setTime(date);
        }
        k1 = 0;
        ai = fields;
        j2 = ai.length;
        i2 = 0;
_L6:
        int ai1[];
        int k;
        int l1;
        if (i2 >= j2)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        ai1 = ai[i2];
        l1 = ai1.length;
        k = 0;
        do
        {
            if (k >= l1)
            {
                break;
            }
            if (ai1[k] == i)
            {
                if (j == 2 || j == 1 && k1 != 0)
                {
                    if (i == 1001)
                    {
                        if (calendar.get(5) == 1)
                        {
                            calendar.add(5, 15);
                            return;
                        } else
                        {
                            calendar.add(5, -15);
                            calendar.add(2, 1);
                            return;
                        }
                    }
                    if (i == 9)
                    {
                        if (calendar.get(11) == 0)
                        {
                            calendar.add(11, 12);
                            return;
                        } else
                        {
                            calendar.add(11, -12);
                            calendar.add(5, 1);
                            return;
                        }
                    } else
                    {
                        calendar.add(ai1[0], 1);
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            k++;
        } while (true);
        k = 0;
        l1 = 0;
        i;
        JVM INSTR lookupswitch 2: default 396
    //                   9: 539
    //                   1001: 482;
           goto _L3 _L4 _L5
_L3:
        if (l1 == 0)
        {
            k1 = calendar.getActualMinimum(ai1[0]);
            l1 = calendar.getActualMaximum(ai1[0]);
            k = calendar.get(ai1[0]) - k1;
            if (k > (l1 - k1) / 2)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
        }
        if (k != 0)
        {
            calendar.set(ai1[0], calendar.get(ai1[0]) - k);
        }
        i2++;
        if (true) goto _L6; else goto _L5
_L5:
        if (ai1[0] == 5)
        {
            k1 = calendar.get(5) - 1;
            k = k1;
            if (k1 >= 15)
            {
                k = k1 - 15;
            }
            if (k > 7)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            l1 = 1;
        }
          goto _L3
_L4:
        if (ai1[0] == 11)
        {
            k1 = calendar.get(11);
            k = k1;
            if (k1 >= 12)
            {
                k = k1 - 12;
            }
            if (k >= 6)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            l1 = 1;
        }
          goto _L3
        throw new IllegalArgumentException((new StringBuilder()).append("The field ").append(i).append(" is not supported").toString());
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static transient Date parseDate(String s, String as[])
        throws ParseException
    {
        return parseDateWithLeniency(s, as, true);
    }

    public static transient Date parseDateStrictly(String s, String as[])
        throws ParseException
    {
        return parseDateWithLeniency(s, as, false);
    }

    private static Date parseDateWithLeniency(String s, String as[], boolean flag)
        throws ParseException
    {
        if (s == null || as == null)
        {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        SimpleDateFormat simpledateformat = new SimpleDateFormat();
        simpledateformat.setLenient(flag);
        ParsePosition parseposition = new ParsePosition(0);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s2 = as[i];
            String s1 = s2;
            Object obj = s1;
            if (s2.endsWith("ZZ"))
            {
                obj = s1.substring(0, s1.length() - 1);
            }
            simpledateformat.applyPattern(((String) (obj)));
            parseposition.setIndex(0);
            s1 = s;
            if (s2.endsWith("ZZ"))
            {
                s1 = s.replaceAll("([-+][0-9][0-9]):([0-9][0-9])$", "$1$2");
            }
            obj = simpledateformat.parse(s1, parseposition);
            if (obj != null && parseposition.getIndex() == s1.length())
            {
                return ((Date) (obj));
            }
        }

        throw new ParseException((new StringBuilder()).append("Unable to parse the date: ").append(s).toString(), -1);
    }

    public static Calendar round(Calendar calendar, int i)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            calendar = (Calendar)calendar.clone();
            modify(calendar, i, 1);
            return calendar;
        }
    }

    public static Date round(Object obj, int i)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date)
        {
            return round((Date)obj, i);
        }
        if (obj instanceof Calendar)
        {
            return round((Calendar)obj, i).getTime();
        } else
        {
            throw new ClassCastException((new StringBuilder()).append("Could not round ").append(obj).toString());
        }
    }

    public static Date round(Date date, int i)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 1);
            return calendar.getTime();
        }
    }

    private static Date set(Date date, int i, int j)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.setTime(date);
            calendar.set(i, j);
            return calendar.getTime();
        }
    }

    public static Date setDays(Date date, int i)
    {
        return set(date, 5, i);
    }

    public static Date setHours(Date date, int i)
    {
        return set(date, 11, i);
    }

    public static Date setMilliseconds(Date date, int i)
    {
        return set(date, 14, i);
    }

    public static Date setMinutes(Date date, int i)
    {
        return set(date, 12, i);
    }

    public static Date setMonths(Date date, int i)
    {
        return set(date, 2, i);
    }

    public static Date setSeconds(Date date, int i)
    {
        return set(date, 13, i);
    }

    public static Date setYears(Date date, int i)
    {
        return set(date, 1, i);
    }

    public static Calendar toCalendar(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar truncate(Calendar calendar, int i)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            calendar = (Calendar)calendar.clone();
            modify(calendar, i, 0);
            return calendar;
        }
    }

    public static Date truncate(Object obj, int i)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date)
        {
            return truncate((Date)obj, i);
        }
        if (obj instanceof Calendar)
        {
            return truncate((Calendar)obj, i).getTime();
        } else
        {
            throw new ClassCastException((new StringBuilder()).append("Could not truncate ").append(obj).toString());
        }
    }

    public static Date truncate(Date date, int i)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 0);
            return calendar.getTime();
        }
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar1, int i)
    {
        return truncate(calendar, i).compareTo(truncate(calendar1, i));
    }

    public static int truncatedCompareTo(Date date, Date date1, int i)
    {
        return truncate(date, i).compareTo(truncate(date1, i));
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar1, int i)
    {
        return truncatedCompareTo(calendar, calendar1, i) == 0;
    }

    public static boolean truncatedEquals(Date date, Date date1, int i)
    {
        return truncatedCompareTo(date, date1, i) == 0;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.util:
//            TimeAnomalyException, TimeSeparator

public class TimeUtil
{

    public static final long a;
    public static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static SimpleDateFormat h;
    private java.text.DateFormat i;
    private java.text.DateFormat j;
    private java.text.DateFormat k;
    private SimpleDateFormat l;
    private SimpleDateFormat m;
    private SimpleDateFormat n;
    private Context o;
    private long p;
    private long q;

    public TimeUtil(Application application)
    {
        o = application;
        i = DateFormat.getTimeFormat(application);
        l = new SimpleDateFormat("EEE");
        m = new SimpleDateFormat("EEEE");
        j = DateFormat.getDateFormat(application);
        k = DateFormat.getLongDateFormat(application);
        n = new SimpleDateFormat(((SimpleDateFormat)java.text.DateFormat.getDateInstance(3)).toLocalizedPattern().replaceAll("[^\\p{Alpha}]*y+[^\\p{Alpha}]*", ""));
    }

    public static long a()
    {
        return System.currentTimeMillis() / 1000L;
    }

    public static String a(int i1, String s, int j1)
    {
        GregorianCalendar gregoriancalendar = b(i1);
        if (gregoriancalendar == null)
        {
            return s;
        } else
        {
            return java.text.DateFormat.getDateInstance(j1).format(gregoriancalendar.getTime());
        }
    }

    public static String a(Calendar calendar)
    {
        int i1 = calendar.get(5);
        calendar = new GregorianCalendar(calendar.get(1), calendar.get(2), i1);
        return (new SimpleDateFormat("yyyyMMdd")).format(calendar.getTime());
    }

    private String a(Date date, boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = k;
        } else
        {
            obj = n;
        }
        return ((java.text.DateFormat) (obj)).format(date);
    }

    public static boolean a(long l1, long l2)
    {
        return Math.abs((l1 & 0xffffffffL) - (l2 & 0xffffffffL)) < g;
    }

    private static boolean a(long l1, long l2, long l3, long l4)
    {
        l1 = l3 - l1;
        l2 = l3 - l2;
        l3 = l1 / l4;
        l4 = l2 / l4;
        boolean flag3 = false;
        boolean flag2 = flag3;
        if (l3 == l4)
        {
            boolean flag;
            boolean flag1;
            if (l1 < 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l2 < 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag3;
            if (!(flag1 ^ flag))
            {
                flag2 = true;
            }
        }
        return flag2;
    }

    public static long b()
    {
        return System.currentTimeMillis() / 1000L - a;
    }

    public static String b(long l1, long l2)
        throws TimeAnomalyException
    {
        if (l2 != 0L)
        {
            long l3 = (l1 & 0xffffffffL) - (0xffffffffL & l2);
            if (l3 >= 0L)
            {
                return c(1000L * l3);
            }
        }
        throw new TimeAnomalyException(l2, l1, TimeUnit.SECONDS);
    }

    public static GregorianCalendar b(int i1)
    {
        String s = String.format("%08d", new Object[] {
            Integer.valueOf(i1)
        });
        if (i1 < 10101 || i1 > 0x5f5bebf || TextUtils.isEmpty(s) || s.length() != 8)
        {
            return null;
        } else
        {
            return new GregorianCalendar(Integer.parseInt(s.substring(0, 4)), Integer.parseInt(s.substring(4, 6)) - 1, Integer.parseInt(s.substring(6)));
        }
    }

    public static void b(Calendar calendar)
    {
        byte byte0 = 30;
        int i1 = calendar.get(12);
        if (i1 % 30 != 0)
        {
            if (i1 > 30)
            {
                byte0 = 60;
            }
            calendar.add(12, byte0 - i1);
        }
    }

    public static String c(long l1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = String.format(Locale.US, "%%0%dd", new Object[] {
            Integer.valueOf(2)
        });
        l1 /= 1000L;
        long l2 = l1 / 3600L;
        long l3 = (l1 % 3600L) / 60L;
        if (l2 > 0L)
        {
            stringbuilder.append(String.format(s, new Object[] {
                Long.valueOf(l2)
            }));
            stringbuilder.append(":");
        }
        stringbuilder.append(String.format(s, new Object[] {
            Long.valueOf(l3)
        }));
        stringbuilder.append(":");
        stringbuilder.append(String.format(s, new Object[] {
            Long.valueOf(l1 % 60L)
        }));
        return stringbuilder.toString();
    }

    private static void c(Calendar calendar)
    {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static String d(long l1)
    {
        if (h == null)
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
            h = simpledateformat;
            simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return h.format(Long.valueOf(l1));
    }

    public static Calendar d()
    {
        return Calendar.getInstance();
    }

    private long e()
    {
        if (System.currentTimeMillis() - p >= d)
        {
            Calendar calendar = Calendar.getInstance();
            c(calendar);
            p = calendar.getTimeInMillis();
        }
        return p;
    }

    public static long f(long l1)
    {
        return (0xffffffffL & l1) * 1000L;
    }

    public static long h(long l1)
    {
        if (l1 == 0L)
        {
            return -1L;
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(f(l1));
            c(calendar);
            return calendar.getTimeInMillis() / 1000L;
        }
    }

    public final CharSequence a(int i1, int j1, boolean flag)
        throws TimeAnomalyException
    {
        if (j1 < 0)
        {
            throw new TimeAnomalyException(j1, TimeUnit.SECONDS);
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i2 = (int)TimeUnit.SECONDS.toHours(j1);
        int l1 = (int)(TimeUnit.SECONDS.toMinutes(j1) - TimeUnit.SECONDS.toHours(j1) * 60L);
        int k1 = (int)(TimeUnit.SECONDS.toSeconds(j1) - TimeUnit.SECONDS.toMinutes(j1) * 60L);
        Object obj = o.getResources();
        if (i2 == 0 && l1 == 0)
        {
            if (flag)
            {
                j1 = 0x7f0b000f;
            } else
            {
                j1 = 0x7f0b000e;
            }
            stringbuilder.append(((Resources) (obj)).getQuantityString(j1, k1, new Object[] {
                Integer.valueOf(k1)
            }));
        } else
        {
            String s;
            if (i2 != 0)
            {
                if (flag)
                {
                    j1 = 0x7f0b000b;
                } else
                {
                    j1 = 0x7f0b000a;
                }
                s = ((Resources) (obj)).getQuantityString(j1, i2, new Object[] {
                    Integer.valueOf(i2)
                });
            } else
            {
                if (flag)
                {
                    j1 = 0x7f0b000d;
                } else
                {
                    j1 = 0x7f0b000c;
                }
                s = ((Resources) (obj)).getQuantityString(j1, l1, new Object[] {
                    Integer.valueOf(l1)
                });
            }
            if (i2 != 0)
            {
                if (flag)
                {
                    j1 = 0x7f0b000d;
                } else
                {
                    j1 = 0x7f0b000c;
                }
                obj = ((Resources) (obj)).getQuantityString(j1, l1, new Object[] {
                    Integer.valueOf(l1)
                });
            } else
            {
                if (flag)
                {
                    j1 = 0x7f0b000f;
                } else
                {
                    j1 = 0x7f0b000e;
                }
                obj = ((Resources) (obj)).getQuantityString(j1, k1, new Object[] {
                    Integer.valueOf(k1)
                });
            }
            stringbuilder.append(o.getString(0x7f0802a9, new Object[] {
                s, obj
            }));
        }
        if (i1 != 0)
        {
            return o.getString(i1, new Object[] {
                stringbuilder.toString()
            });
        } else
        {
            return stringbuilder.toString();
        }
    }

    public final CharSequence a(int i1, boolean flag)
        throws TimeAnomalyException
    {
        return a(0, i1, flag);
    }

    public final CharSequence a(long l1)
        throws TimeAnomalyException
    {
        return a(0, (int)l1, false);
    }

    public final String a(int i1)
    {
        if (i1 <= 0)
        {
            return o.getString(0x7f080456, new Object[] {
                "00", "00"
            });
        }
        if (i1 >= 60 && i1 < 3600)
        {
            String s3 = Integer.toString(i1 / 60);
            String s6 = Integer.toString(i1 % 60);
            String s = s3;
            if (i1 / 60 < 10)
            {
                s = (new StringBuilder("0")).append(s3).toString();
            }
            s3 = s6;
            if (i1 % 60 < 10)
            {
                s3 = (new StringBuilder("0")).append(s6).toString();
            }
            return o.getString(0x7f080456, new Object[] {
                s, s3
            });
        }
        if (i1 >= 3600)
        {
            String s4 = Integer.toString(i1 / 3600);
            Integer integer = Integer.valueOf(i1 % 3600);
            String s7 = Integer.toString(integer.intValue() / 60);
            String s1 = s4;
            if (i1 / 3600 < 10)
            {
                s1 = (new StringBuilder("0")).append(s4).toString();
            }
            s4 = s7;
            if (integer.intValue() / 60 < 10)
            {
                s4 = (new StringBuilder("0")).append(s7).toString();
            }
            return o.getString(0x7f080456, new Object[] {
                s1, s4
            });
        }
        String s5 = Integer.toString(i1);
        String s2 = s5;
        if (i1 < 10)
        {
            s2 = (new StringBuilder("0")).append(s5).toString();
        }
        return o.getString(0x7f080456, new Object[] {
            "00", s2
        });
    }

    public final String a(long l1, long l2, boolean flag)
        throws TimeAnomalyException
    {
        long l4 = f(l1);
        long l3 = f(l2);
        Date date = new Date(l3);
        l4 -= l3;
        if (l1 == 0L)
        {
            return a(date, flag);
        }
        if (l2 < 0L || l4 < 0L)
        {
            throw new TimeAnomalyException(l2, l1, TimeUnit.SECONDS);
        }
        p = e();
        if (l4 <= b)
        {
            return o.getString(0x7f0802c9);
        }
        if (l3 >= p)
        {
            return i.format(date);
        }
        if (System.currentTimeMillis() - q >= e)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.set(7, calendar.getFirstDayOfWeek());
            c(calendar);
            q = calendar.getTimeInMillis();
        }
        if (a(l2, l1, q / 1000L, f))
        {
            if (flag)
            {
                return m.format(date);
            } else
            {
                return l.format(date);
            }
        } else
        {
            return a(date, flag);
        }
    }

    public final String a(long l1, boolean flag)
    {
        return a(new Date(f(l1)), flag);
    }

    public final CharSequence b(int i1, boolean flag)
        throws TimeAnomalyException
    {
        if (i1 < 0)
        {
            throw new TimeAnomalyException(i1, TimeUnit.SECONDS);
        }
        if (!flag)
        {
            return a(0, i1, false);
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = (int)TimeUnit.SECONDS.toHours(i1);
        int k1 = (int)(TimeUnit.SECONDS.toMinutes(i1) - TimeUnit.SECONDS.toHours(i1) * 60L);
        i1 = (int)(TimeUnit.SECONDS.toSeconds(i1) - TimeUnit.SECONDS.toMinutes(i1) * 60L);
        Object obj = o.getResources();
        if (j1 == 0 && k1 == 0)
        {
            stringbuilder.append(((Resources) (obj)).getString(0x7f08029b, new Object[] {
                Integer.valueOf(i1)
            }));
        } else
        {
            String s;
            if (j1 != 0)
            {
                s = ((Resources) (obj)).getString(0x7f080299, new Object[] {
                    Integer.valueOf(j1)
                });
            } else
            {
                s = ((Resources) (obj)).getString(0x7f08029a, new Object[] {
                    Integer.valueOf(k1)
                });
            }
            if (j1 != 0)
            {
                obj = ((Resources) (obj)).getString(0x7f08029a, new Object[] {
                    Integer.valueOf(k1)
                });
            } else
            {
                obj = ((Resources) (obj)).getString(0x7f08029b, new Object[] {
                    Integer.valueOf(i1)
                });
            }
            stringbuilder.append(o.getString(0x7f080298, new Object[] {
                s, obj
            }));
        }
        return stringbuilder.toString();
    }

    public final String b(long l1)
    {
        if (l1 == 0L)
        {
            return "";
        }
        l1 = f(l1);
        Date date = new Date(l1);
        long l2 = System.currentTimeMillis() - date.getTime();
        if (l2 <= b)
        {
            return o.getString(0x7f0802c9);
        }
        if (i(l1))
        {
            return i.format(date);
        }
        String s;
        if (l2 <= e)
        {
            s = m.format(date);
        } else
        {
            s = k.format(date);
        }
        return String.format("%s %s", new Object[] {
            s, i.format(date)
        });
    }

    public final long c()
    {
        PackageManager packagemanager = o.getPackageManager();
        long l1;
        try
        {
            l1 = packagemanager.getPackageInfo(o.getPackageName(), 0).lastUpdateTime;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return 0L;
        }
        return l1;
    }

    public final String c(long l1, long l2)
        throws TimeAnomalyException
    {
        return d(l1, l2);
    }

    public final String d(long l1, long l2)
        throws TimeAnomalyException
    {
        if (l1 == 0L)
        {
            return a(l2, false);
        }
        long l3 = f(l2);
        long l4 = f(l1);
        if (l2 < 0L || l3 > l4)
        {
            throw new TimeAnomalyException(l2, l1, TimeUnit.SECONDS);
        }
        if (i(l3))
        {
            return o.getString(0x7f080339);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.roll(3, -1);
        c(calendar);
        boolean flag;
        if (l3 >= calendar.getTimeInMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return m.format(new Date(l3));
        } else
        {
            return j.format(new Date(l3));
        }
    }

    public final TimeSeparator e(long l1)
    {
        long l2 = f(l1);
        long l3 = System.currentTimeMillis();
        if (l1 < 0L || l2 > l3)
        {
            return new TimeSeparator("", 0L);
        }
        l1 = e();
        l3 = l1 - d;
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, calendar.getFirstDayOfWeek());
        c(calendar);
        long l4 = calendar.getTimeInMillis();
        long l5 = l4 - e;
        if (l2 >= l1)
        {
            return new TimeSeparator(o.getString(0x7f080339), l1);
        }
        if (l2 >= l3)
        {
            return new TimeSeparator(o.getString(0x7f08033a), l3);
        }
        if (l2 >= l4)
        {
            return new TimeSeparator(o.getString(0x7f080338), l4);
        }
        if (l2 >= l5)
        {
            return new TimeSeparator(o.getString(0x7f080336), l5);
        } else
        {
            return new TimeSeparator(o.getString(0x7f080337), l5 - 1L);
        }
    }

    public final boolean e(long l1, long l2)
    {
        return a(l1, l2, e() / 1000L, c);
    }

    public final String g(long l1)
    {
        if (l1 == 0L)
        {
            return "";
        }
        Date date = new Date(f(l1));
        if (System.currentTimeMillis() - date.getTime() <= b)
        {
            return o.getString(0x7f0802c9);
        } else
        {
            return i.format(date);
        }
    }

    public final boolean i(long l1)
    {
        return l1 >= e();
    }

    static 
    {
        a = TimeUnit.MINUTES.toSeconds(5L);
        b = TimeUnit.MINUTES.toMillis(5L);
        c = TimeUnit.DAYS.toSeconds(1L);
        d = TimeUnit.DAYS.toMillis(1L);
        e = TimeUnit.DAYS.toMillis(7L);
        f = TimeUnit.DAYS.toSeconds(7L);
        g = a;
    }
}

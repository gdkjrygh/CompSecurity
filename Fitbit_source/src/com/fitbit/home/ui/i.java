// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import com.fitbit.util.al;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class i
{

    public static long a = 60000L;
    public static long b = 60000L;
    public static long c = 0x36ee7fL;
    public static long d = 0x36ee80L;
    public static long e = 0xdbba00L;
    public static long f = 0x5265c00L;

    public i()
    {
    }

    public String a(Context context, long l)
    {
        String s1;
        long l1;
        s1 = "";
        l1 = TimeUnit.MILLISECONDS.toDays(l);
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        if (l1 != 1L) goto _L4; else goto _L3
_L3:
        String s = (new StringBuilder()).append("").append(context.getString(0x7f08042f, new Object[] {
            Long.valueOf(l1)
        })).toString();
_L6:
        return s;
_L4:
        return (new StringBuilder()).append("").append(context.getString(0x7f080136, new Object[] {
            Long.valueOf(l1)
        })).toString();
_L2:
        if (l < a)
        {
            return context.getString(0x7f08027e);
        }
        if (l >= b && l < d)
        {
            l = Math.round((double)l / 60000D);
            if (l == 1L)
            {
                return context.getString(0x7f080432);
            } else
            {
                return String.format(context.getString(0x7f0803db), new Object[] {
                    (new StringBuilder()).append(l).append("").toString()
                });
            }
        }
        s = s1;
        if (l >= d)
        {
            s = s1;
            if (l < f)
            {
                l = Math.round((double)l / 3600000D);
                if (l == 1L)
                {
                    return context.getString(0x7f080431);
                } else
                {
                    return String.format(context.getString(0x7f080261), new Object[] {
                        (new StringBuilder()).append(l).append("").toString()
                    });
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String a(Context context, long l, int j)
    {
        return bh.a(context, j, new String[] {
            a(context, l)
        });
    }

    public String a(Context context, Date date)
    {
        String s;
        if (date == null)
        {
            s = "";
        } else
        {
            s = com.fitbit.util.format.e.o(context, date);
            if (!o.i(date))
            {
                return a(context, date, 0x7f0803cd);
            }
        }
        return s;
    }

    public String a(Context context, Date date, int j)
    {
        if (date == null)
        {
            return "";
        }
        String s = com.fitbit.util.format.e.o(context, date);
        if (o.i(date))
        {
            date = context.getString(0x7f0800dc);
        } else
        if (o.p(date))
        {
            date = context.getString(0x7f0800e1);
        } else
        if (o.q(date))
        {
            date = context.getString(0x7f0800dd);
        } else
        {
            date = com.fitbit.util.format.e.l(date).toString();
        }
        return bh.a(context, j, new String[] {
            date, s
        });
    }

    public String a(Context context, Date date, int j, int k)
    {
        if (date.before(Calendar.getInstance(al.a()).getTime()))
        {
            return a(context, date, j);
        } else
        {
            return a(context, date, k);
        }
    }

    public String a(Date date, Context context)
    {
        return a(date, context, 0x7f080157);
    }

    public String a(Date date, Context context, int j)
    {
        if (date == null)
        {
            return "";
        }
        long l = Math.max(0L, (new Date()).getTime() - date.getTime());
        if (l < a)
        {
            return context.getString(0x7f080406);
        }
        if (l >= b && l < d)
        {
            l = Math.round((double)l / 60000D);
            if (l == 1L)
            {
                return context.getString(0x7f080433);
            } else
            {
                return String.format(context.getString(0x7f0803da), new Object[] {
                    (new StringBuilder()).append(l).append("").toString()
                });
            }
        }
        if (l >= d && l <= e)
        {
            l = Math.round((double)l / 3600000D);
            if (l == 1L)
            {
                date = context.getString(0x7f08025d);
            } else
            {
                date = context.getString(0x7f080260);
            }
            return String.format(date, new Object[] {
                (new StringBuilder()).append(l).append("").toString()
            });
        }
        if (l > e && o.i(date))
        {
            date = com.fitbit.util.format.e.o(context, date);
            return bh.a(context, 0x7f080223, new String[] {
                context.getString(0x7f080540), date
            });
        }
        if (o.p(date))
        {
            date = com.fitbit.util.format.e.o(context, date);
            return bh.a(context, 0x7f080223, new String[] {
                context.getString(0x7f0805ad), date
            });
        } else
        {
            String s = com.fitbit.util.format.e.o(context, date);
            return bh.a(context, j, new String[] {
                o.a(context, date), s
            });
        }
    }

    public String b(Context context, long l, int j)
    {
        long l1 = TimeUnit.MILLISECONDS.toDays(l);
        String s;
        if (l1 > 0L)
        {
            long l4 = (l / 0x36ee80L) % 24L;
            l = (l / 60000L) % 60L;
            if (l1 == 1L)
            {
                s = bh.a(context, 0x7f080430, new String[] {
                    (new StringBuilder()).append("").append(l4).toString(), (new StringBuilder()).append("").append(l).toString()
                });
            } else
            {
                s = bh.a(context, 0x7f080138, new String[] {
                    (new StringBuilder()).append("").append(l1).toString(), (new StringBuilder()).append("").append(l4).toString(), (new StringBuilder()).append("").append(l).toString()
                });
            }
        } else
        {
            long l2 = TimeUnit.MILLISECONDS.toHours(l);
            if (l2 > 0L)
            {
                l /= 60000L;
                s = bh.a(context, 0x7f080263, new String[] {
                    (new StringBuilder()).append("").append(l2).toString(), (new StringBuilder()).append("").append(l % 60L).toString()
                });
            } else
            {
                long l3 = TimeUnit.MILLISECONDS.toMinutes(l);
                if (l3 > 0L)
                {
                    s = bh.a(context, 0x7f0803dc, new String[] {
                        (new StringBuilder()).append("").append(l3).toString()
                    });
                } else
                {
                    l = TimeUnit.MILLISECONDS.toSeconds(l);
                    s = bh.a(context, 0x7f0804a4, new String[] {
                        (new StringBuilder()).append("").append(l).toString()
                    });
                }
            }
        }
        return bh.a(context, j, new String[] {
            s
        });
    }

}

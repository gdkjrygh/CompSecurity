// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.p;

import android.content.res.Resources;
import com.facebook.l.a;
import com.facebook.l.x;
import com.facebook.o;
import com.facebook.user.LastActive;

// Referenced classes of package com.facebook.orca.p:
//            f

public class e
{

    private final Resources a;

    public e(Resources resources)
    {
        a = resources;
    }

    public int a(LastActive lastactive, x x1)
    {
        if (lastactive == null)
        {
            return 0;
        } else
        {
            long l = a(lastactive.a(), lastactive.b(), x1.a());
            return (int)((System.currentTimeMillis() - l) / 0x36ee80L);
        }
    }

    public long a(long l, boolean flag, a a1)
    {
        long l1;
        if (l == 0L)
        {
            return 0L;
        }
        l1 = System.currentTimeMillis() - l;
        if (a1 != a.AVAILABLE && (!flag || l1 >= 0x36ee80L)) goto _L2; else goto _L1
_L1:
        l = System.currentTimeMillis();
_L4:
        return l;
_L2:
        if (l1 > 0x14997000L)
        {
            l = 0L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String a(long l)
    {
        if (l == 0L)
        {
            return null;
        }
        int i = (int)((System.currentTimeMillis() - l) / 1000L);
        int j = i / 60;
        int k = j / 60;
        int i1 = k / 24;
        if (i < 60)
        {
            return a.getString(o.presence_active_now);
        }
        if (j == 1)
        {
            return a.getString(o.presence_active_one_min_ago);
        }
        if (j < 60)
        {
            return a.getString(o.presence_active_x_mins_ago, new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k == 1)
        {
            return a.getString(o.presence_active_one_hour_ago);
        }
        if (k < 24)
        {
            return a.getString(o.presence_active_x_hours_ago, new Object[] {
                Integer.valueOf(k)
            });
        }
        if (i1 == 1)
        {
            return a.getString(o.presence_active_one_day_ago);
        } else
        {
            return a.getString(o.presence_active_x_days_ago, new Object[] {
                Integer.valueOf(i1)
            });
        }
    }

    public String a(LastActive lastactive, x x1, f f1)
    {
        if (lastactive == null)
        {
            return null;
        }
        long l = a(lastactive.a(), lastactive.b(), x1.a());
        if (f.SHORT == f1)
        {
            return b(l);
        } else
        {
            return a(l);
        }
    }

    public String b(long l)
    {
        if (l == 0L)
        {
            return null;
        }
        int i = (int)((System.currentTimeMillis() - l) / 1000L);
        int j = i / 60;
        int k = j / 60;
        int i1 = k / 24;
        if (i < 60)
        {
            return a.getString(o.short_active_x_mins_ago, new Object[] {
                Integer.valueOf(1)
            });
        }
        if (j < 60)
        {
            return a.getString(o.short_active_x_mins_ago, new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k < 24)
        {
            return a.getString(o.short_active_x_hours_ago, new Object[] {
                Integer.valueOf(k)
            });
        } else
        {
            return a.getString(o.short_active_x_days_ago, new Object[] {
                Integer.valueOf(i1)
            });
        }
    }
}

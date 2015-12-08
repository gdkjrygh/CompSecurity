// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.b.a.t;

// Referenced classes of package b.a:
//            ht

public final class b
    implements ht
{

    public int a;
    public int b;
    public long c;
    private final int d = 0x36ee80;
    private int e;
    private long f;
    private long g;
    private Context h;

    public b(Context context)
    {
        f = 0L;
        g = 0L;
        h = context.getApplicationContext();
        context = context.getSharedPreferences("umeng_general_config", 0);
        a = context.getInt("successful_request", 0);
        b = context.getInt("failed_requests ", 0);
        e = context.getInt("last_request_spent_ms", 0);
        c = context.getLong("last_request_time", 0L);
        f = context.getLong("last_req", 0L);
    }

    public final boolean a()
    {
        boolean flag;
        boolean flag1;
        if (c == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!t.a(h).h())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    public final void b()
    {
        h.getSharedPreferences("umeng_general_config", 0).edit().putInt("successful_request", a).putInt("failed_requests ", b).putInt("last_request_spent_ms", e).putLong("last_request_time", c).putLong("last_req", f).commit();
    }

    public final void c()
    {
        h.getSharedPreferences("umeng_general_config", 0).edit().putLong("first_activate_time", System.currentTimeMillis()).commit();
    }

    public final boolean d()
    {
        boolean flag = false;
        if (g == 0L)
        {
            g = h.getSharedPreferences("umeng_general_config", 0).getLong("first_activate_time", 0L);
        }
        if (g == 0L)
        {
            flag = true;
        }
        return flag;
    }

    public final long e()
    {
        if (d())
        {
            return System.currentTimeMillis();
        } else
        {
            return g;
        }
    }

    public final long f()
    {
        return f;
    }

    public final void g()
    {
        f = System.currentTimeMillis();
    }

    public final void h()
    {
        e = (int)(System.currentTimeMillis() - f);
    }

    public final void i()
    {
        a = a + 1;
        c = f;
    }

    public final void j()
    {
        b = b + 1;
    }
}

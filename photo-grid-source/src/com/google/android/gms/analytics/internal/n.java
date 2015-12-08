// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.wg;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, o, bh, bi, 
//            aa, p

public final class n extends y
{

    private SharedPreferences a;
    private long b;
    private long c;
    private final o d;

    protected n(aa aa1)
    {
        super(aa1);
        c = -1L;
        d = new o(this, "monitoring", ((Long)bh.P.a()).longValue(), (byte)0);
    }

    static SharedPreferences a(n n1)
    {
        return n1.a;
    }

    protected final void a()
    {
        a = m().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void a(String s)
    {
        aa.r();
        B();
        android.content.SharedPreferences.Editor editor = a.edit();
        if (TextUtils.isEmpty(s))
        {
            editor.remove("installation_campaign");
        } else
        {
            editor.putString("installation_campaign", s);
        }
        if (!editor.commit())
        {
            e("Failed to commit campaign data");
        }
    }

    public final long b()
    {
        aa.r();
        B();
        if (b == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                b = l;
            } else
            {
                long l1 = l().a();
                android.content.SharedPreferences.Editor editor = a.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    e("Failed to commit first run time");
                }
                b = l1;
            }
        }
        return b;
    }

    public final p c()
    {
        return new p(l(), b());
    }

    public final long d()
    {
        aa.r();
        B();
        if (c == -1L)
        {
            c = a.getLong("last_dispatch", 0L);
        }
        return c;
    }

    public final void e()
    {
        aa.r();
        B();
        long l = l().a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        c = l;
    }

    public final String f()
    {
        aa.r();
        B();
        String s = a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public final o g()
    {
        return d;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.d.q;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, p, bb, q, 
//            ab

public class n extends z
{

    private SharedPreferences a;
    private long b;
    private long c;
    private final p d = new p(this, "monitoring", q().G(), null);

    protected n(ab ab)
    {
        super(ab);
        c = -1L;
    }

    static SharedPreferences a(n n1)
    {
        return n1.a;
    }

    protected void a()
    {
        a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public void a(String s)
    {
        m();
        D();
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

    public long b()
    {
        m();
        D();
        if (b == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                b = l;
            } else
            {
                long l1 = n().a();
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

    public com.google.android.gms.analytics.internal.q c()
    {
        return new com.google.android.gms.analytics.internal.q(n(), b());
    }

    public long d()
    {
        m();
        D();
        if (c == -1L)
        {
            c = a.getLong("last_dispatch", 0L);
        }
        return c;
    }

    public void e()
    {
        m();
        D();
        long l = n().a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        c = l;
    }

    public String f()
    {
        m();
        D();
        String s = a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public p g()
    {
        return d;
    }
}

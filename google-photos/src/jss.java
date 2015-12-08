// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class jss extends jsw
{

    SharedPreferences a;
    final jst b;
    private long c;
    private long e;

    protected jss(jrk jrk1)
    {
        super(jrk1);
        e = -1L;
        b = new jst(this, "monitoring", ((Long)jsl.D.a()).longValue());
    }

    protected final void a()
    {
        a = h().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void a(String s)
    {
        jrk.i();
        r();
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
        jrk.i();
        r();
        if (c == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                c = l;
            } else
            {
                long l1 = g().a();
                android.content.SharedPreferences.Editor editor = a.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    e("Failed to commit first run time");
                }
                c = l1;
            }
        }
        return c;
    }

    public final jsu c()
    {
        return new jsu(g(), b());
    }

    public final long d()
    {
        jrk.i();
        r();
        if (e == -1L)
        {
            e = a.getLong("last_dispatch", 0L);
        }
        return e;
    }

    public final void e()
    {
        jrk.i();
        r();
        long l = g().a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        e = l;
    }

    public final String m()
    {
        jrk.i();
        r();
        String s = a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }
}

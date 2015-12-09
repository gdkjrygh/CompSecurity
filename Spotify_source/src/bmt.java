// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class bmt extends bnd
{

    SharedPreferences a;
    final bmu b;
    private long c;
    private long d;

    protected bmt(bnf bnf1)
    {
        super(bnf1);
        d = -1L;
        b = new bmu(this, "monitoring", ((Long)bnz.D.a).longValue(), (byte)0);
    }

    protected final void a()
    {
        a = super.f.a.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void a(String s)
    {
        bnf.i();
        m();
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
        bnf.i();
        m();
        if (c == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                c = l;
            } else
            {
                long l1 = super.f.c.a();
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

    public final bmv c()
    {
        return new bmv(super.f.c, b());
    }

    public final long d()
    {
        bnf.i();
        m();
        if (d == -1L)
        {
            d = a.getLong("last_dispatch", 0L);
        }
        return d;
    }

    public final void e()
    {
        bnf.i();
        m();
        long l = super.f.c.a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        d = l;
    }

    public final String f()
    {
        bnf.i();
        m();
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

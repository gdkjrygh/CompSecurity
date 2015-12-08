// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

public final class bmu
{

    final long a;
    bmt b;
    private final String c;

    private bmu(bmt bmt1, String s, long l)
    {
        b = bmt1;
        super();
        btl.a(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag);
        c = s;
        a = l;
    }

    bmu(bmt bmt1, String s, long l, byte byte0)
    {
        this(bmt1, s, l);
    }

    private String e()
    {
        return (new StringBuilder()).append(c).append(":start").toString();
    }

    final void a()
    {
        long l = ((bnc) (b)).f.c.a();
        android.content.SharedPreferences.Editor editor = b.a.edit();
        editor.remove(c());
        editor.remove(d());
        editor.putLong(e(), l);
        editor.commit();
    }

    final long b()
    {
        return b.a.getLong(e(), 0L);
    }

    final String c()
    {
        return (new StringBuilder()).append(c).append(":count").toString();
    }

    final String d()
    {
        return (new StringBuilder()).append(c).append(":value").toString();
    }
}

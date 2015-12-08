// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            j

public final class <init>
{

    final j a;
    private final String b;
    private final long c;

    private void c()
    {
        long l = a.n().a();
        android.content.edPreferences.Editor editor = j.a(a).edit();
        editor.remove(g());
        editor.remove(b());
        editor.putLong(f(), l);
        editor.commit();
    }

    private long d()
    {
        long l = e();
        if (l == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(l - a.n().a());
        }
    }

    private long e()
    {
        return j.a(a).getLong(f(), 0L);
    }

    private String f()
    {
        return (new StringBuilder()).append(b).append(":start").toString();
    }

    private String g()
    {
        return (new StringBuilder()).append(b).append(":count").toString();
    }

    public Pair a()
    {
        long l = d();
        if (l >= c)
        {
            if (l > c * 2L)
            {
                c();
                return null;
            }
            String s = j.a(a).getString(b(), null);
            l = j.a(a).getLong(g(), 0L);
            c();
            if (s != null && l > 0L)
            {
                return new Pair(s, Long.valueOf(l));
            }
        }
        return null;
    }

    public void a(String s)
    {
        String s1;
        if (e() == 0L)
        {
            c();
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        this;
        JVM INSTR monitorenter ;
        long l = j.a(a).getLong(g(), 0L);
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = j.a(a).edit();
        s.putString(b(), s1);
        s.putLong(g(), 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag;
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (l + 1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = j.a(a).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s.putString(b(), s1);
        s.putLong(g(), l + 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected String b()
    {
        return (new StringBuilder()).append(b).append(":value").toString();
    }

    private (j j1, String s, long l)
    {
        a = j1;
        super();
        z.a(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.b(flag);
        b = s;
        c = l;
    }

    c(j j1, String s, long l, c c1)
    {
        this(j1, s, l);
    }
}

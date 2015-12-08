// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            n

public final class o
{

    final n a;
    private final String b;
    private final long c;

    private o(n n1, String s, long l)
    {
        a = n1;
        super();
        bl.a(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag);
        b = s;
        c = l;
    }

    o(n n1, String s, long l, byte byte0)
    {
        this(n1, s, l);
    }

    private void b()
    {
        long l = a.l().a();
        android.content.SharedPreferences.Editor editor = n.a(a).edit();
        editor.remove(e());
        editor.remove(f());
        editor.putLong(d(), l);
        editor.commit();
    }

    private long c()
    {
        return n.a(a).getLong(d(), 0L);
    }

    private String d()
    {
        return (new StringBuilder()).append(b).append(":start").toString();
    }

    private String e()
    {
        return (new StringBuilder()).append(b).append(":count").toString();
    }

    private String f()
    {
        return (new StringBuilder()).append(b).append(":value").toString();
    }

    public final Pair a()
    {
        long l = c();
        if (l == 0L)
        {
            l = 0L;
        } else
        {
            l = Math.abs(l - a.l().a());
        }
        if (l < c)
        {
            return null;
        }
        if (l > c * 2L)
        {
            b();
            return null;
        }
        String s = n.a(a).getString(f(), null);
        l = n.a(a).getLong(e(), 0L);
        b();
        if (s == null || l <= 0L)
        {
            return null;
        } else
        {
            return new Pair(s, Long.valueOf(l));
        }
    }

    public final void a(String s)
    {
        String s1;
        if (c() == 0L)
        {
            b();
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        this;
        JVM INSTR monitorenter ;
        long l = n.a(a).getLong(e(), 0L);
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = n.a(a).edit();
        s.putString(f(), s1);
        s.putLong(e(), 1L);
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
        s = n.a(a).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s.putString(f(), s1);
        s.putLong(e(), l + 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}

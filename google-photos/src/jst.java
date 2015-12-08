// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.UUID;

public final class jst
{

    private final String a;
    private final long b;
    private jss c;

    jst(jss jss1, String s, long l)
    {
        c = jss1;
        super();
        b.o(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag);
        a = s;
        b = l;
    }

    private void b()
    {
        long l = c.g().a();
        android.content.SharedPreferences.Editor editor = c.a.edit();
        editor.remove(e());
        editor.remove(f());
        editor.putLong(d(), l);
        editor.commit();
    }

    private long c()
    {
        return c.a.getLong(d(), 0L);
    }

    private String d()
    {
        return (new StringBuilder()).append(a).append(":start").toString();
    }

    private String e()
    {
        return (new StringBuilder()).append(a).append(":count").toString();
    }

    private String f()
    {
        return (new StringBuilder()).append(a).append(":value").toString();
    }

    public final Pair a()
    {
        long l = c();
        if (l == 0L)
        {
            l = 0L;
        } else
        {
            l = Math.abs(l - c.g().a());
        }
        if (l < b)
        {
            return null;
        }
        if (l > b << 1)
        {
            b();
            return null;
        }
        String s = c.a.getString(f(), null);
        l = c.a.getLong(e(), 0L);
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
        long l = c.a.getLong(e(), 0L);
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = c.a.edit();
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
        s = c.a.edit();
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class mnw
    implements mmz
{

    private final String a;
    private final int b;
    private final Map c;
    private final Map d;
    private boolean e;
    private mnn f;

    mnw(mnn mnn1, int j)
    {
        this(mnn1, j, "", ((Map) (new HashMap())));
    }

    private mnw(mnn mnn1, int j, String s, Map map)
    {
        f = mnn1;
        super();
        d = mnn.b(f).getAll();
        b = j;
        a = String.valueOf(s).concat(".");
        c = map;
    }

    private Object a(String s, Object obj)
    {
        s = i(s);
        mnz mnz1 = (mnz)c.get(s);
        if (mnz1 != null)
        {
            obj = mnz1.a(obj);
        } else
        {
            s = a(b, s);
            if (d.containsKey(s))
            {
                return d.get(s);
            }
        }
        return obj;
    }

    private static String a(int j, String s)
    {
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(j).append(s).toString();
    }

    private void a(String s, mnz mnz1)
    {
        c.put(i(s), mnz1);
    }

    private String i(String s)
    {
        String s1 = String.valueOf(a);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public final int a(String s, int j)
    {
        return ((Integer)a(s, Integer.valueOf(j))).intValue();
    }

    public final long a(String s, long l)
    {
        return ((Long)a(s, Long.valueOf(l))).longValue();
    }

    public final String a(String s, String s1)
    {
        return (String)a(s, s1);
    }

    public final Set a(String s, Set set)
    {
        return (Set)a(s, set);
    }

    final void a(int j, android.content.SharedPreferences.Editor editor)
    {
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); ((mnz)c.get(s)).a(editor, a(j, s)))
        {
            s = (String)iterator.next();
        }

    }

    public final boolean a()
    {
        return a("logged_in", false);
    }

    public final boolean a(String s)
    {
        s = i(s);
        mnz mnz1 = (mnz)c.get(s);
        if (mnz1 != null)
        {
            return mnz1 != mnn.b;
        } else
        {
            return mnn.b(f).contains(a(b, s));
        }
    }

    public final boolean a(String s, boolean flag)
    {
        return ((Boolean)a(s, Boolean.valueOf(flag))).booleanValue();
    }

    public final String b(String s)
    {
        return a(s, ((String) (null)));
    }

    public final mmz b(String s, int j)
    {
        return c(s, j);
    }

    public final mmz b(String s, long l)
    {
        a(s, new mob(l));
        return this;
    }

    public final mmz b(String s, String s1)
    {
        return c(s, s1);
    }

    public final mmz b(String s, Set set)
    {
        a(s, new mof(set));
        return this;
    }

    public final mmz b(String s, boolean flag)
    {
        return c(s, flag);
    }

    public final boolean b()
    {
        return a("logged_out", false);
    }

    public final mmz c()
    {
        e = true;
        return this;
    }

    public final mmz c(String s, int j)
    {
        a(s, new moa(j));
        return this;
    }

    public final mmz c(String s, String s1)
    {
        a(s, new moe(s1));
        return this;
    }

    public final mmz c(String s, boolean flag)
    {
        a(s, new mny(flag));
        return this;
    }

    public final boolean c(String s)
    {
        return a(s, false);
    }

    public final int d()
    {
        boolean flag;
        int k;
        k = b;
        if (e && b != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            for (Iterator iterator = mnn.c(f).iterator(); iterator.hasNext(); ((mmu)iterator.next()).b(b)) { }
        }
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        int j = f.b(a("account_name", ((String) (null))), a("effective_gaia_id", ((String) (null))));
        Exception exception;
        android.content.SharedPreferences.Editor editor;
        if (j != b && j != -1)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        throw new mna("Duplicate account.");
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (k != -1)
        {
            j = k;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_181;
            }
        }
        j = mnn.d(f);
        mnn.a(f, j);
        editor = mnn.b(f).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        mnn.a(f, b, j, editor);
        mnn.b(f, b);
        a(j, editor);
        editor.apply();
        mnn.e(f);
        obj;
        JVM INSTR monitorexit ;
        if (j != b)
        {
            for (obj = mnn.c(f).iterator(); ((Iterator) (obj)).hasNext(); ((mmu)((Iterator) (obj)).next()).a(j)) { }
        }
        mnn.a(f);
        return j;
    }

    public final mmx d(String s)
    {
        return h(s);
    }

    public final mmz e(String s)
    {
        return g(s);
    }

    public final mmz f(String s)
    {
        return h(s);
    }

    public final mmz g(String s)
    {
        a(s, mnn.b);
        return this;
    }

    public final mmz h(String s)
    {
        mnn mnn1 = f;
        int j = b;
        String s1 = String.valueOf(a);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return new mnw(mnn1, j, s, c);
    }
}

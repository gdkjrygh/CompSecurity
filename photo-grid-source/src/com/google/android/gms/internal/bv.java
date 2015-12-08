// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            ce

public final class bv
{

    private final int a;
    private final int b;
    private final int c;
    private final ce d;
    private final Object e = new Object();
    private ArrayList f;
    private int g;
    private int h;
    private int i;
    private int j;
    private String k;

    public bv(int l, int i1, int j1, int k1)
    {
        f = new ArrayList();
        g = 0;
        h = 0;
        i = 0;
        k = "";
        a = l;
        b = i1;
        c = j1;
        d = new ce(k1);
    }

    private static String a(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            arraylist = "";
        } else
        {
            Object obj = new StringBuffer();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                ((StringBuffer) (obj)).append((String)arraylist.next());
                ((StringBuffer) (obj)).append(' ');
            } while (((StringBuffer) (obj)).length() <= 200);
            ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
            obj = ((StringBuffer) (obj)).toString();
            arraylist = ((ArrayList) (obj));
            if (((String) (obj)).length() >= 200)
            {
                return ((String) (obj)).substring(0, 200);
            }
        }
        return arraylist;
    }

    private void c(String s)
    {
        if (s == null || s.length() < c)
        {
            return;
        }
        synchronized (e)
        {
            f.add(s);
            g = g + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(int l)
    {
        h = l;
    }

    public final void a(String s)
    {
        c(s);
        synchronized (e)
        {
            if (i < 0)
            {
                zzb.zzaF("ActivityContent: negative number of WebViews.");
            }
            f();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String b()
    {
        return k;
    }

    public final void b(String s)
    {
        c(s);
    }

    public final void c()
    {
        synchronized (e)
        {
            j = j - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (e)
        {
            i = i - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        synchronized (e)
        {
            i = i + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof bv)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (bv)obj;
            if (((bv) (obj)).k != null && ((bv) (obj)).k.equals(k))
            {
                return true;
            }
        }
        return false;
    }

    public final void f()
    {
        synchronized (e)
        {
            int l = g;
            int i1 = h;
            l = l * a + i1 * b;
            if (l > j)
            {
                j = l;
                k = d.a(f);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int g()
    {
        return j;
    }

    final int h()
    {
        return g;
    }

    public final int hashCode()
    {
        return k.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("ActivityContent fetchId: ")).append(h).append(" score:").append(j).append(" total_length:").append(g).append("\n text: ").append(a(f)).append("\n signture: ").append(k).toString();
    }
}

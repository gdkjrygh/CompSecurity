// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dk, dl, ek, ah, 
//            em

public final class dj
{

    public final ah a = new dk(this);
    public final ah b = new dl(this);
    private final Object c = new Object();
    private em d;
    private String e;
    private int f;
    private String g;

    public dj(String s)
    {
        f = -2;
        e = s;
    }

    static Object a(dj dj1)
    {
        return dj1.c;
    }

    static String a(dj dj1, String s)
    {
        dj1.g = s;
        return s;
    }

    static int b(dj dj1)
    {
        dj1.f = 1;
        return 1;
    }

    static String c(dj dj1)
    {
        return dj1.e;
    }

    public final int a()
    {
        int i;
        synchronized (c)
        {
            i = f;
        }
        return i;
    }

    public final void a(em em)
    {
        synchronized (c)
        {
            d = em;
        }
    }

    public final String b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = f;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c.wait();
          goto _L1
        Object obj1;
        obj1;
        ek.d("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        String s = g;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }
}

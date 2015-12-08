// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.c.a;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.d.b;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.nuance.b.b:
//            bj, bf, bg, be, 
//            bd, bi, bl, bh, 
//            bk

public final class bc extends a
{

    private final e a;
    private final b b;
    private final Handler c;
    private final Handler d;
    private final List e;
    private final bl f;
    private boolean g;
    private boolean h;
    private boolean i;
    private volatile boolean j;
    private bk k;

    bc(e e1, bl bl1)
    {
        j = true;
        e1.l;
        JVM INSTR lookupswitch 2: default 40
    //                   8000: 50
    //                   16000: 147;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException("audioType must have a frequency of 8khz or 16khz");
_L2:
        a = e.f;
_L5:
        f = bl1;
        g = false;
        h = false;
        i = false;
        e = new LinkedList();
        d = new Handler();
        b = new b("NinaMicrophoneRecorderSource");
        b.a();
        c = b.c();
        c.post(new bj(this));
        return;
_L3:
        a = e.d;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static bk a(bc bc1)
    {
        return bc1.k;
    }

    static bk a(bc bc1, bk bk)
    {
        bc1.k = bk;
        return bk;
    }

    static void a(bc bc1, g g1)
    {
        bc1.d.post(new bf(bc1, g1));
    }

    static void a(bc bc1, boolean flag)
    {
        bc1.d.post(new bg(bc1, flag));
    }

    static void b(bc bc1)
    {
        bc1.d.post(new be(bc1));
    }

    static bl c(bc bc1)
    {
        return bc1.f;
    }

    static List d(bc bc1)
    {
        return bc1.e;
    }

    static void e(bc bc1)
    {
        bc1.f();
    }

    static boolean f(bc bc1)
    {
        bc1.g = false;
        return false;
    }

    static boolean g(bc bc1)
    {
        return bc1.i;
    }

    static boolean h(bc bc1)
    {
        bc1.i = true;
        return true;
    }

    static void i(bc bc1)
    {
        bc1.g();
    }

    static b j(bc bc1)
    {
        return bc1.b;
    }

    static e k(bc bc1)
    {
        return bc1.a;
    }

    static void l(bc bc1)
    {
        bc1.d.post(new bd(bc1));
    }

    static boolean m(bc bc1)
    {
        return bc1.j;
    }

    public final e a()
    {
        return a;
    }

    public final int b()
    {
        return e.size();
    }

    public final boolean c()
    {
        return !i;
    }

    protected final h d()
    {
        if (!e.isEmpty())
        {
            return (g)e.remove(0);
        } else
        {
            return null;
        }
    }

    final void e()
    {
        j = false;
    }

    final void h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!g)
        {
            g = true;
        }
        flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.post(new bi(this));
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        h = true;
        f.d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!h)
        {
            h = true;
            c.post(new bh(this));
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}

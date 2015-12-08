// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.b;

import java.util.LinkedList;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kik.a.f.f.z;

// Referenced classes of package kik.a.f.b:
//            a

final class b extends TimerTask
{

    final a a;
    private final z b;

    public final void run()
    {
        boolean flag2 = false;
        if (!b.a(System.currentTimeMillis())) goto _L2; else goto _L1
_L1:
        Object obj = kik.a.f.b.a.a(a);
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (b.k() <= 0 && kik.a.f.b.a.b(a).contains(b.l_()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        if (kik.a.f.b.a.c(a).remove(b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L6; else goto _L5
_L5:
        flag1 = flag2;
        if (!kik.a.f.b.a.d(a).remove(b)) goto _L7; else goto _L6
_L7:
        if (flag1) goto _L4; else goto _L8
_L8:
        kik.a.f.b.a.e(a).remove(b);
_L4:
        obj;
        JVM INSTR monitorexit ;
        Exception exception;
        if (flag)
        {
            kik.a.f.b.a.f(a).schedule(new <init>(a, b), 500L);
            return;
        } else
        {
            b.b(101);
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        kik.a.f.b.a.a(a, b);
        return;
_L6:
        flag1 = true;
        if (true) goto _L7; else goto _L9
_L9:
    }

    public r(a a1, z z1)
    {
        a = a1;
        super();
        b = z1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import kik.a.d.k;
import kik.a.e.f;
import kik.a.f.q;

// Referenced classes of package kik.a.g:
//            v, ax, ay

final class aw extends r
{

    final String a;
    final v b;

    aw(v v1, String s)
    {
        b = v1;
        a = s;
        super();
    }

    public final void a()
    {
        v.g(b);
        if (v.c(b).k())
        {
            synchronized (v.h(b))
            {
                b.p();
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final volatile void a(Object obj)
    {
        b.a(false, false);
    }

    public final void a(Throwable throwable)
    {
        boolean flag1 = false;
        if (!(throwable instanceof q)) goto _L2; else goto _L1
_L1:
        ((q)throwable).a();
        JVM INSTR tableswitch 101 109: default 68
    //                   101 139
    //                   102 139
    //                   103 68
    //                   104 68
    //                   105 68
    //                   106 139
    //                   107 139
    //                   108 139
    //                   109 139;
           goto _L3 _L4 _L4 _L3 _L3 _L3 _L4 _L4 _L4 _L4
_L3:
        boolean flag = false;
_L9:
        if (flag) goto _L2; else goto _L5
_L5:
        flag = true;
_L10:
        throwable = b.a(a, true, new ax(this));
        if (flag) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (throwable.f() < 5) goto _L8; else goto _L7
_L7:
        flag = true;
_L8:
        if (flag)
        {
            b.a(a, true, new ay(this));
        }
        return;
_L4:
        flag = true;
          goto _L9
_L2:
        flag = false;
          goto _L10
    }
}

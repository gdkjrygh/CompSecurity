// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.util.Set;

// Referenced classes of package com.c.a.a.b:
//            s, o, a

final class z extends c
{

    final int b;
    final a c;
    final s d;

    transient z(s s1, String s2, Object aobj[], int i, a a1)
    {
        d = s1;
        b = i;
        c = a1;
        super(s2, aobj);
    }

    public final void a()
    {
        s.j(d).c();
        synchronized (d)
        {
            s.k(d).remove(Integer.valueOf(b));
        }
        return;
        exception;
        s1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

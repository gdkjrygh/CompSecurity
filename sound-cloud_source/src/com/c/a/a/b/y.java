// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import com.c.a.a.c;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.c.a.a.b:
//            s, o, a, c

final class y extends c
{

    final int b;
    final e c;
    final int d;
    final boolean e;
    final s f;

    transient y(s s1, String s2, Object aobj[], int i, e e1, int j, boolean flag)
    {
        f = s1;
        b = i;
        c = e1;
        d = j;
        e = flag;
        super(s2, aobj);
    }

    public final void a()
    {
        s.j(f).a(c, d);
        f.i.a(b, a.l);
        synchronized (f)
        {
            s.k(f).remove(Integer.valueOf(b));
        }
        return;
        exception;
        s1;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}

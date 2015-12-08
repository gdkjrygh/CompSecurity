// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.c.a.a.b:
//            s, o, a, c

final class w extends c
{

    final int b;
    final List c;
    final s d;

    transient w(s s1, String s2, Object aobj[], int i, List list)
    {
        d = s1;
        b = i;
        c = list;
        super(s2, aobj);
    }

    public final void a()
    {
        s.j(d).a();
        d.i.a(b, a.l);
        synchronized (d)
        {
            s.k(d).remove(Integer.valueOf(b));
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

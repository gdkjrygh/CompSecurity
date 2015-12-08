// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.f;
import java.io.IOException;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, l, ErrorCode, b

final class d extends f
{

    final int a;
    final List c;
    final boolean d;
    final c e;

    public final void b()
    {
        com.squareup.okhttp.internal.framed.c.j(e).b();
        e.i.a(a, ErrorCode.l);
        synchronized (e)
        {
            com.squareup.okhttp.internal.framed.c.k(e).remove(Integer.valueOf(a));
        }
        return;
        exception;
        c1;
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

    transient rCode(c c1, String s, Object aobj[], int i, List list, boolean flag)
    {
        e = c1;
        a = i;
        c = list;
        d = flag;
        super(s, aobj);
    }
}

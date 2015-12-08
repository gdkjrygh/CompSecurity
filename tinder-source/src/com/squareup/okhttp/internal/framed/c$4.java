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

final class c extends f
{

    final int a;
    final List c;
    final c d;

    public final void b()
    {
        com.squareup.okhttp.internal.framed.c.j(d).a();
        d.i.a(a, ErrorCode.l);
        synchronized (d)
        {
            com.squareup.okhttp.internal.framed.c.k(d).remove(Integer.valueOf(a));
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

    transient rCode(c c1, String s, Object aobj[], int i, List list)
    {
        d = c1;
        a = i;
        c = list;
        super(s, aobj);
    }
}

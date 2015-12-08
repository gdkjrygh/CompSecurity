// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.f;
import java.io.IOException;
import java.util.Set;
import okio.c;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, l, ErrorCode, b

final class e extends f
{

    final int a;
    final c c;
    final int d;
    final boolean e;
    final com.squareup.okhttp.internal.framed.c f;

    public final void b()
    {
        com.squareup.okhttp.internal.framed.c.j(f).a(c, d);
        f.i.a(a, ErrorCode.l);
        synchronized (f)
        {
            com.squareup.okhttp.internal.framed.c.k(f).remove(Integer.valueOf(a));
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

    transient rCode(com.squareup.okhttp.internal.framed.c c1, String s, Object aobj[], int i, c c2, int j, boolean flag)
    {
        f = c1;
        a = i;
        c = c2;
        d = j;
        e = flag;
        super(s, aobj);
    }
}

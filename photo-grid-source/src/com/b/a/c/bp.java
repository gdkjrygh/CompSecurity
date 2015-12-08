// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.af;
import java.io.InputStream;

// Referenced classes of package com.b.a.c:
//            bo

final class bp
    implements af
{

    final byte a[];
    final int b[];
    final bo c;

    bp(bo bo, byte abyte0[], int ai[])
    {
        c = bo;
        a = abyte0;
        b = ai;
        super();
    }

    public final void a(InputStream inputstream, int i)
    {
        int ai[];
        inputstream.read(a, b[0], i);
        ai = b;
        ai[0] = ai[0] + i;
        inputstream.close();
        return;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }
}

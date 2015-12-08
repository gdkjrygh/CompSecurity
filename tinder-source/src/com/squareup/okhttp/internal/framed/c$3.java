// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.f;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, k

final class d extends f
{

    final boolean a = true;
    final int c;
    final int d;
    final k e = null;
    final c f;

    public final void b()
    {
        try
        {
            com.squareup.okhttp.internal.framed.c.a(f, a, c, d, e);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (c c1, String s, Object aobj[], int i, int j)
    {
        f = c1;
        c = i;
        d = j;
        super(s, aobj);
    }
}

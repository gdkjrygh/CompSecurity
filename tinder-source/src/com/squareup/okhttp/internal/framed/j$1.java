// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import okio.c;
import okio.h;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            j

final class a extends h
{

    final j a;

    public final long a(c c, long l)
        throws IOException
    {
        if (a.a != 0)
        {
            if ((l = super.a(c, Math.min(l, a.a))) != -1L)
            {
                a.a = (int)((long)a.a - l);
                return l;
            }
        }
        return -1L;
    }

    (j j1, r r)
    {
        a = j1;
        super(r);
    }
}

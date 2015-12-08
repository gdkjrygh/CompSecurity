// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.b;
import com.squareup.okhttp.internal.e;
import com.squareup.okhttp.internal.http.c;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp:
//            c, v, t

final class a
    implements e
{

    final com.squareup.okhttp.c a;

    public final com.squareup.okhttp.internal.http.b a(v v1)
        throws IOException
    {
        return a.a(v1);
    }

    public final v a(t t)
        throws IOException
    {
        return a.a(t);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(c c1)
    {
        a.a(c1);
    }

    public final void a(v v1, v v2)
        throws IOException
    {
        rnal..c c1 = new <init>(v2);
        v2 = a((a)v1.g);
        v1 = null;
        try
        {
            v2 = com.squareup.okhttp.internal.b.a(((com.squareup.okhttp.internal..c) (v2)).d, ((com.squareup.okhttp.internal.d) (v2)).a, ((com.squareup.okhttp.internal.a) (v2)).b);
        }
        // Misplaced declaration of an exception variable
        catch (v v2)
        {
            c.a(v1);
            return;
        }
        if (v2 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        v1 = v2;
        c1.a(v2);
        v1 = v2;
        v2.a();
    }

    public final void b(t t)
        throws IOException
    {
        a.b(t);
    }

    rnal.http.c(com.squareup.okhttp.c c1)
    {
        a = c1;
        super();
    }
}

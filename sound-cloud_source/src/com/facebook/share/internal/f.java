// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.G;
import com.facebook.internal.K;
import com.facebook.internal.U;

// Referenced classes of package com.facebook.share.internal:
//            c

final class f
    implements com.facebook.C.a
{

    final c.e a;
    final c.g b;
    final c.k c;
    final c d;

    f(c c1, c.e e, c.g g, c.k k)
    {
        d = c1;
        a = e;
        b = g;
        c = k;
        super();
    }

    public final void a()
    {
        com.facebook.share.internal.c.b(d, a.e);
        if (U.a(com.facebook.share.internal.c.i(d)))
        {
            com.facebook.share.internal.c.b(d, b.e);
            com.facebook.share.internal.c.c(d, b.f);
        }
        if (U.a(com.facebook.share.internal.c.i(d)))
        {
            K.a(G.f, com.facebook.share.internal.c.f(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                com.facebook.share.internal.c.l(d)
            });
            c c1 = d;
            com.facebook.r r;
            if (b.c != null)
            {
                r = b.c;
            } else
            {
                r = a.c;
            }
            com.facebook.share.internal.c.a(c1, "get_verified_id", r);
        }
        if (c != null)
        {
            c.a();
        }
    }
}

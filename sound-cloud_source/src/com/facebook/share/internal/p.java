// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.G;
import com.facebook.internal.K;

// Referenced classes of package com.facebook.share.internal:
//            c, o

final class p
    implements com.facebook.C.a
{

    final c.f a;
    final c.d b;
    final o c;

    p(o o1, c.f f, c.d d)
    {
        c = o1;
        a = f;
        b = d;
        super();
    }

    public final void a()
    {
        if (a.c != null || b.c != null)
        {
            K.a(G.a, com.facebook.share.internal.c.f(), "Unable to refresh like state for id: '%s'", new Object[] {
                com.facebook.share.internal.c.l(c.a)
            });
            return;
        } else
        {
            com.facebook.share.internal.c.a(c.a, a.e, b.e, b.f, b.g, b.h, a.f);
            return;
        }
    }
}

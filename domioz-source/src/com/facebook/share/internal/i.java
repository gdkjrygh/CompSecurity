// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.ah;
import com.facebook.am;
import com.facebook.internal.ak;

// Referenced classes of package com.facebook.share.internal:
//            p, n, a, h

final class i
    implements ah
{

    final p a;
    final n b;
    final h c;

    i(h h1, p p1, n n1)
    {
        c = h1;
        a = p1;
        b = n1;
        super();
    }

    public final void a()
    {
        if (a.c != null || b.c != null)
        {
            ak.a(am.a, com.facebook.share.internal.a.e(), "Unable to refresh like state for id: '%s'", new Object[] {
                com.facebook.share.internal.a.i(c.a)
            });
            return;
        } else
        {
            com.facebook.share.internal.a.a(c.a, a.e, b.e, b.f, b.g, b.h, a.f);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.ah;
import com.facebook.am;
import com.facebook.internal.ak;
import com.facebook.internal.aw;

// Referenced classes of package com.facebook.share.internal:
//            o, a, q, s

final class c
    implements ah
{

    final o a;
    final q b;
    final s c;
    final a d;

    c(a a1, o o1, q q1, s s1)
    {
        d = a1;
        a = o1;
        b = q1;
        c = s1;
        super();
    }

    public final void a()
    {
        com.facebook.share.internal.a.a(d, a.e);
        if (aw.a(com.facebook.share.internal.a.g(d)))
        {
            com.facebook.share.internal.a.a(d, b.e);
            com.facebook.share.internal.a.a(d, b.f);
        }
        if (aw.a(com.facebook.share.internal.a.g(d)))
        {
            ak.a(am.f, com.facebook.share.internal.a.e(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                com.facebook.share.internal.a.i(d)
            });
            a a1 = d;
            com.facebook.n n;
            if (b.c != null)
            {
                n = b.c;
            } else
            {
                n = a.c;
            }
            com.facebook.share.internal.a.a(a1, "get_verified_id", n);
        }
        if (c != null)
        {
            c.a();
        }
    }
}

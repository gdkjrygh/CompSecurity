// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;

import com.facebook.l;
import com.facebook.share.internal.a;
import com.facebook.share.internal.m;

// Referenced classes of package com.facebook.share.a:
//            a

final class e
    implements m
{

    final com.facebook.share.a.a a;
    private boolean b;

    private e(com.facebook.share.a.a a1)
    {
        a = a1;
        super();
    }

    e(com.facebook.share.a.a a1, byte byte0)
    {
        this(a1);
    }

    public final void a()
    {
        b = true;
    }

    public final void a(a a1)
    {
        if (b)
        {
            return;
        }
        if (a1 != null)
        {
            if (a1.d())
            {
                new l("Cannot use LikeView. The device may not be supported.");
            }
            com.facebook.share.a.a.a(a, a1);
            com.facebook.share.a.a.b(a);
        }
        com.facebook.share.a.a.e(a);
    }
}

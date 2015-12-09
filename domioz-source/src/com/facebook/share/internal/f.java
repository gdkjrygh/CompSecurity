// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.l;

// Referenced classes of package com.facebook.share.internal:
//            m, a

final class f
    implements Runnable
{

    final m a;
    final a b;
    final l c;

    f(m m1, a a1, l l)
    {
        a = m1;
        b = a1;
        c = l;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ab;
import com.nuance.b.b.a.ad;

// Referenced classes of package com.nuance.b.b:
//            dk

final class dl
    implements Runnable
{

    final ad a;
    final ab b;
    final dk c;

    dl(dk dk, ad ad1, ab ab)
    {
        c = dk;
        a = ad1;
        b = ab;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}

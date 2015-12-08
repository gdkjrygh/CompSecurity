// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.aa;
import com.nuance.b.b.a.ad;

// Referenced classes of package com.nuance.b.b:
//            dk

final class dm
    implements Runnable
{

    final ad a;
    final aa b;
    final dk c;

    dm(dk dk, ad ad1, aa aa)
    {
        c = dk;
        a = ad1;
        b = aa;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}

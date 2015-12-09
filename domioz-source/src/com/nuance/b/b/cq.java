// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.ag;

// Referenced classes of package com.nuance.b.b:
//            co

final class cq
    implements Runnable
{

    final ag a;
    final ae b;
    final co c;

    cq(co co, ag ag1, ae ae)
    {
        c = co;
        a = ag1;
        b = ae;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}

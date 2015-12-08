// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ca, ap, bh

class agq
    implements agq
{

    final ca agq;

    public void a(ap ap1)
    {
        ca.a(agq, ap1.dg());
    }

    public void b(ap ap1)
    {
        ca.a(agq, ap1.dg());
        bh.C((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(ap1.dg()).toString());
    }

    public void c(ap ap1)
    {
        long l = ap1.lI();
        if (l == 0L)
        {
            ca.a(agq, ap1.dg(), ca.a(agq).currentTimeMillis());
        } else
        if (l + 0xdbba00L < ca.a(agq).currentTimeMillis())
        {
            ca.a(agq, ap1.dg());
            bh.C((new StringBuilder()).append("Giving up on failed hitId: ").append(ap1.dg()).toString());
            return;
        }
    }

    (ca ca1)
    {
        agq = ca1;
        super();
    }
}

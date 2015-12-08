// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ca, ap, bh

class agt
    implements agt
{

    final ca agt;

    public void a(ap ap1)
    {
        ca.a(agt, ap1.dl());
    }

    public void b(ap ap1)
    {
        ca.a(agt, ap1.dl());
        bh.C((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(ap1.dl()).toString());
    }

    public void c(ap ap1)
    {
        long l = ap1.lN();
        if (l == 0L)
        {
            ca.a(agt, ap1.dl(), ca.a(agt).currentTimeMillis());
        } else
        if (l + 0xdbba00L < ca.a(agt).currentTimeMillis())
        {
            ca.a(agt, ap1.dl());
            bh.C((new StringBuilder()).append("Giving up on failed hitId: ").append(ap1.dl()).toString());
            return;
        }
    }

    (ca ca1)
    {
        agt = ca1;
        super();
    }
}

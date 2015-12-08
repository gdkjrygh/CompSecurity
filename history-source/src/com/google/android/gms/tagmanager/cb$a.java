// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ld;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cb, ap, bh

class asi
    implements asi
{

    final cb asi;

    public void a(ap ap1)
    {
        cb.a(asi, ap1.fb());
    }

    public void b(ap ap1)
    {
        cb.a(asi, ap1.fb());
        bh.V((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(ap1.fb()).toString());
    }

    public void c(ap ap1)
    {
        long l = ap1.pK();
        if (l == 0L)
        {
            cb.a(asi, ap1.fb(), cb.a(asi).currentTimeMillis());
        } else
        if (l + 0xdbba00L < cb.a(asi).currentTimeMillis())
        {
            cb.a(asi, ap1.fb());
            bh.V((new StringBuilder()).append("Giving up on failed hitId: ").append(ap1.fb()).toString());
            return;
        }
    }

    (cb cb1)
    {
        asi = cb1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gl;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ca, ap, bh

class YL
    implements YL
{

    final ca YL;

    public void a(ap ap1)
    {
        ca.a(YL, ap1.cP());
    }

    public void b(ap ap1)
    {
        ca.a(YL, ap1.cP());
        bh.y((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(ap1.cP()).toString());
    }

    public void c(ap ap1)
    {
        long l = ap1.kD();
        if (l == 0L)
        {
            ca.a(YL, ap1.cP(), ca.a(YL).currentTimeMillis());
        } else
        if (l + 0xdbba00L < ca.a(YL).currentTimeMillis())
        {
            ca.a(YL, ap1.cP());
            bh.y((new StringBuilder()).append("Giving up on failed hitId: ").append(ap1.cP()).toString());
            return;
        }
    }

    (ca ca1)
    {
        YL = ca1;
        super();
    }
}

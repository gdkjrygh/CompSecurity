// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ju;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cb, ap, bh

class apZ
    implements apZ
{

    final cb apZ;

    public void a(ap ap1)
    {
        cb.a(apZ, ap1.eG());
    }

    public void b(ap ap1)
    {
        cb.a(apZ, ap1.eG());
        bh.V((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(ap1.eG()).toString());
    }

    public void c(ap ap1)
    {
        long l = ap1.ot();
        if (l == 0L)
        {
            cb.a(apZ, ap1.eG(), cb.a(apZ).currentTimeMillis());
        } else
        if (l + 0xdbba00L < cb.a(apZ).currentTimeMillis())
        {
            cb.a(apZ, ap1.eG());
            bh.V((new StringBuilder()).append("Giving up on failed hitId: ").append(ap1.eG()).toString());
            return;
        }
    }

    (cb cb1)
    {
        apZ = cb1;
        super();
    }
}

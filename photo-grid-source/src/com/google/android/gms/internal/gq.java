// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            pj, gs, gt, qa, 
//            gr, ry

public final class gq extends pj
{

    final ry a;
    final gt b;
    private final String c;

    gq(ry ry, gt gt1, String s)
    {
        a = ry;
        b = gt1;
        c = s;
        zzp.zzbI().a(this);
    }

    public final void onStop()
    {
        b.a();
    }

    public final void zzbn()
    {
        b.a(c);
        qa.a.post(new gr(this));
        return;
        Exception exception;
        exception;
        qa.a.post(new gr(this));
        throw exception;
    }
}

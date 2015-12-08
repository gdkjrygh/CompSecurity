// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            gs, cr, cs, gw, 
//            hs

public class cq extends gs
{

    final hs a;
    final cs b;
    private final String c;

    cq(hs hs, cs cs1, String s)
    {
        a = hs;
        b = cs1;
        c = s;
        zzp.zzbK().a(this);
    }

    public void onStop()
    {
        b.a();
    }

    public void zzdG()
    {
        b.a(c);
        gw.a.post(new zzdp._cls1(this));
        return;
        Exception exception;
        exception;
        gw.a.post(new zzdp._cls1(this));
        throw exception;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh, zzdr, zzdq, zzhl, 
//            zzid

public class zzdp extends zzhh
{

    final zzid zzoA;
    final zzdr zzwB;
    private final String zzwC;

    zzdp(zzid zzid, String s)
    {
        zzoA = zzid;
        zzwB = new zzdr(zzid);
        zzwC = s;
        zzo.zzbH().zza(this);
    }

    public void onStop()
    {
        zzwB.abort();
    }

    public void zzdP()
    {
        zzwB.zzW(zzwC);
        zzhl.zzGk.post(new Runnable() {

            final zzdp zzwD;

            public void run()
            {
                zzo.zzbH().zzb(zzwD);
            }

            
            {
                zzwD = zzdp.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        zzhl.zzGk.post(new _cls1());
        throw exception;
    }
}

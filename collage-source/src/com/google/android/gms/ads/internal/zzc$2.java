// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hs;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzq, zzp, zze

class zzoC
    implements Runnable
{

    final com.google.android.gms.internal.c._cls2.zzoC zzoA;
    final zzc zzoB;
    final bd zzoC;

    public void run()
    {
        if (zzoA..zzEg && zzoB.zzos.zzqu != null)
        {
            Object obj = null;
            if (zzoA..zzAT != null)
            {
                obj = zzp.zzbx().a(zzoA..zzAT);
            }
            obj = new be(zzoB, ((String) (obj)), zzoA..body);
            zzoB.zzos.zzqz = 1;
            try
            {
                zzoB.zzos.zzqu.a(((com.google.android.gms.internal.bg) (obj)));
                return;
            }
            catch (RemoteException remoteexception)
            {
                zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
        }
        zze zze1 = new zze();
        hs hs1 = zzoB.zza(zzoA, zze1);
        zze1.zza(new b(zzoA, hs1));
        hs1.setOnTouchListener(new android.view.View.OnTouchListener(zze1) {

            final zze zzoD;
            final zzc._cls2 zzoE;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                zzoD.recordClick();
                return false;
            }

            
            {
                zzoE = zzc._cls2.this;
                zzoD = zze1;
                super();
            }
        });
        hs1.setOnClickListener(new android.view.View.OnClickListener(zze1) {

            final zze zzoD;
            final zzc._cls2 zzoE;

            public void onClick(View view)
            {
                zzoD.recordClick();
            }

            
            {
                zzoE = zzc._cls2.this;
                zzoD = zze1;
                super();
            }
        });
        zzoB.zzos.zzqz = 0;
        zzoB.zzos.zzqe = zzp.zzbw().a(zzoB.zzos.context, zzoB, zzoA, zzoB.zzos.zzqa, hs1, zzoB.zzow, zzoB, zzoC);
    }

    _cls2.zzoD(zzc zzc1, com.google.android.gms.internal.c c, bd bd)
    {
        zzoB = zzc1;
        zzoA = c;
        zzoC = bd;
        super();
    }
}

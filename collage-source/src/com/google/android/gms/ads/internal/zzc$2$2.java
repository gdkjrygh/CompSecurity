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
//            zze, zzc, zzq, zzp

class zzoD
    implements android.view.lickListener
{

    final zze zzoD;
    final rdClick zzoE;

    public void onClick(View view)
    {
        zzoD.recordClick();
    }

    oC(oC oc, zze zze1)
    {
        zzoE = oc;
        zzoD = zze1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/zzc$2

/* anonymous class */
    class zzc._cls2
        implements Runnable
    {

        final com.google.android.gms.internal.gl.a zzoA;
        final zzc zzoB;
        final bd zzoC;

        public void run()
        {
            if (zzoA.b.zzEg && zzoB.zzos.zzqu != null)
            {
                Object obj = null;
                if (zzoA.b.zzAT != null)
                {
                    obj = zzp.zzbx().a(zzoA.b.zzAT);
                }
                obj = new be(zzoB, ((String) (obj)), zzoA.b.body);
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
            zze1.zza(new zze.zzb(zzoA, hs1));
            hs1.setOnTouchListener(new zzc._cls2._cls1(zze1));
            hs1.setOnClickListener(new zzc._cls2._cls2(this, zze1));
            zzoB.zzos.zzqz = 0;
            zzoB.zzos.zzqe = zzp.zzbw().a(zzoB.zzos.context, zzoB, zzoA, zzoB.zzos.zzqa, hs1, zzoB.zzow, zzoB, zzoC);
        }

            
            {
                zzoB = zzc1;
                zzoA = a;
                zzoC = bd;
                super();
            }

        // Unreferenced inner class com/google/android/gms/ads/internal/zzc$2$1

/* anonymous class */
        class zzc._cls2._cls1
            implements android.view.View.OnTouchListener
        {

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
        }

    }

}

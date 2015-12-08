// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzvk;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzo, zzcc, zzbf, zzn, 
//            Container, TagManager

class zzaxY
    implements zzaxY
{

    final axW zzaxY;

    public void zzcQ(String s)
    {
        zzaxY.axX.zzcQ(s);
    }

    public String zzsK()
    {
        return zzaxY.axX.zzsK();
    }

    public void zzsM()
    {
        if (zzo.zze(zzaxY.axX).zzgv())
        {
            zzaxY.axX.load(zzaxY.axW);
        }
    }

    axW(axW axw)
    {
        zzaxY = axw;
        super();
    }

    // Unreferenced inner class com/google/android/gms/tagmanager/zzo$1

/* anonymous class */
    class zzo._cls1
        implements com.google.android.gms.internal.zzvg.zza
    {

        final String zzaxW;
        final zzo zzaxX;

        public void zza(zzvk zzvk1)
        {
            if (zzvk1.getStatus() != Status.zzNo)
            {
                zzbf.zzZ((new StringBuilder("Load request failed for the container ")).append(zzo.zza(zzaxX)).toString());
                zzaxX.setResult(zzaxX.zzaN(Status.zzNq));
                return;
            }
            com.google.android.gms.internal.zzvl.zzc zzc = zzvk1.zzuo().zzus();
            if (zzc == null)
            {
                zzbf.zzZ("Response doesn't have the requested container");
                zzaxX.setResult(zzaxX.zzaN(new Status(8, "Response doesn't have the requested container", null)));
                return;
            } else
            {
                long l = zzvk1.zzuo().zzut();
                zzo.zza(zzaxX, new zzn(zzo.zzb(zzaxX), zzo.zzc(zzaxX), new Container(zzo.zzd(zzaxX), zzo.zzb(zzaxX).getDataLayer(), zzo.zza(zzaxX), l, zzc), new zzo._cls1._cls1(this)));
                zzaxX.setResult(zzo.zzf(zzaxX));
                return;
            }
        }

            
            {
                zzaxX = zzo1;
                zzaxW = s;
                super();
            }
    }

}

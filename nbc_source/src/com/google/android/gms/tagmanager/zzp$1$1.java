// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzqe;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, zzbg, zzo, Container, 
//            TagManager

class zzaLa
    implements zzaLa
{

    final zzaLa zzaLa;

    aKY(aKY aky)
    {
        zzaLa = aky;
        super();
    }

    // Unreferenced inner class com/google/android/gms/tagmanager/zzp$1

/* anonymous class */
    class zzp._cls1
        implements com.google.android.gms.internal.zzqa.zza
    {

        final String zzaKY;
        final zzp zzaKZ;

        public void zza(zzqe zzqe1)
        {
            if (zzqe1.getStatus() != Status.zzXP)
            {
                zzbg.zzaz((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaKZ)).toString());
                zzaKZ.setResult(zzaKZ.zzaU(Status.zzXR));
                return;
            }
            com.google.android.gms.internal.zzqf.zzc zzc = zzqe1.zzAg().zzAk();
            if (zzc == null)
            {
                zzbg.zzaz("Response doesn't have the requested container");
                zzaKZ.setResult(zzaKZ.zzaU(new Status(8, "Response doesn't have the requested container", null)));
                return;
            } else
            {
                long l = zzqe1.zzAg().zzAl();
                zzp.zza(zzaKZ, new zzo(zzp.zzb(zzaKZ), zzp.zzc(zzaKZ), new Container(zzp.zzd(zzaKZ), zzp.zzb(zzaKZ).getDataLayer(), zzp.zza(zzaKZ), l, zzc), new zzp._cls1._cls1(this)));
                zzaKZ.setResult(zzp.zzf(zzaKZ));
                return;
            }
        }

            
            {
                zzaKZ = zzp1;
                zzaKY = s;
                super();
            }
    }

}

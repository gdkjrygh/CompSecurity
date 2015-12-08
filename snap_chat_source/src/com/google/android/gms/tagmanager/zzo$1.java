// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzvk;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzo, zzbf, zzn, Container, 
//            TagManager, zzcc

class zzaxW
    implements com.google.android.gms.internal.za
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
        com.google.android.gms.internal.zc zc = zzvk1.zzuo().zzus();
        if (zc == null)
        {
            zzbf.zzZ("Response doesn't have the requested container");
            zzaxX.setResult(zzaxX.zzaN(new Status(8, "Response doesn't have the requested container", null)));
            return;
        } else
        {
            long l = zzvk1.zzuo().zzut();
            zzo.zza(zzaxX, new zzn(zzo.zzb(zzaxX), zzo.zzc(zzaxX), new Container(zzo.zzd(zzaxX), zzo.zzb(zzaxX).getDataLayer(), zzo.zza(zzaxX), l, zc), new zzn.zza() {

                final zzo._cls1 zzaxY;

                public void zzcQ(String s)
                {
                    zzaxY.zzaxX.zzcQ(s);
                }

                public String zzsK()
                {
                    return zzaxY.zzaxX.zzsK();
                }

                public void zzsM()
                {
                    if (zzo.zze(zzaxY.zzaxX).zzgv())
                    {
                        zzaxY.zzaxX.load(zzaxY.zzaxW);
                    }
                }

            
            {
                zzaxY = zzo._cls1.this;
                super();
            }
            }));
            zzaxX.setResult(zzo.zzf(zzaxX));
            return;
        }
    }

    _cls1.zzaxY(zzo zzo1, String s)
    {
        zzaxX = zzo1;
        zzaxW = s;
        super();
    }
}

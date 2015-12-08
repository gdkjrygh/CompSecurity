// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzmp;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, zzbg, zzo, Container, 
//            TagManager, az

class a
    implements com.google.android.gms.internal.za
{

    final String a;
    final zzp b;

    public void zza(zzmp zzmp1)
    {
        if (zzmp1.getStatus() != Status.zzQU)
        {
            zzbg.zzak((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(b)).toString());
            b.setResult(b.zzaO(Status.zzQW));
            return;
        }
        com.google.android.gms.internal.zc zc = zzmp1.zzym().zzyq();
        if (zc == null)
        {
            zzbg.zzak("Response doesn't have the requested container");
            b.setResult(b.zzaO(new Status(8, "Response doesn't have the requested container", null)));
            return;
        } else
        {
            long l = zzmp1.zzym().zzyr();
            zzp.zza(b, new zzo(zzp.zzb(b), zzp.zzc(b), new Container(zzp.zzd(b), zzp.zzb(b).getDataLayer(), zzp.zza(b), l, zc), new zzo.zza() {

                final zzp._cls1 a;

                public void zzdB(String s)
                {
                    a.b.zzdB(s);
                }

                public String zzwu()
                {
                    return a.b.zzwu();
                }

                public void zzww()
                {
                    if (zzp.zze(a.b).a())
                    {
                        a.b.load(a.a);
                    }
                }

            
            {
                a = zzp._cls1.this;
                super();
            }
            }));
            b.setResult(zzp.zzf(b));
            return;
        }
    }

    _cls1.a(zzp zzp1, String s)
    {
        b = zzp1;
        a = s;
        super();
    }
}

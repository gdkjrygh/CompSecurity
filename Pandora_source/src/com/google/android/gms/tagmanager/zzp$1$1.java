// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzmp;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, az, zzbg, zzo, 
//            Container, TagManager

class a
    implements a
{

    final a a;

    public void zzdB(String s)
    {
        a.a.zzdB(s);
    }

    public String zzwu()
    {
        return a.a.zzwu();
    }

    public void zzww()
    {
        if (zzp.zze(a.a).a())
        {
            a.a.load(a.a);
        }
    }

    er(er er)
    {
        a = er;
        super();
    }

    // Unreferenced inner class com/google/android/gms/tagmanager/zzp$1

/* anonymous class */
    class zzp._cls1
        implements com.google.android.gms.internal.zzml.zza
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
            com.google.android.gms.internal.zzmq.zzc zzc = zzmp1.zzym().zzyq();
            if (zzc == null)
            {
                zzbg.zzak("Response doesn't have the requested container");
                b.setResult(b.zzaO(new Status(8, "Response doesn't have the requested container", null)));
                return;
            } else
            {
                long l = zzmp1.zzym().zzyr();
                zzp.zza(b, new zzo(zzp.zzb(b), zzp.zzc(b), new Container(zzp.zzd(b), zzp.zzb(b).getDataLayer(), zzp.zza(b), l, zzc), new zzp._cls1._cls1(this)));
                b.setResult(zzp.zzf(b));
                return;
            }
        }

            
            {
                b = zzp1;
                a = s;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.zzbg;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv, zzmo, zzmj, zzmp, 
//            zzmm, zzht

public abstract class zzmy
{
    public static final class zza extends Enum
    {

        public static final zza zzaHJ;
        public static final zza zzaHK;
        public static final zza zzaHL;
        private static final zza zzaHM[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzmy$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaHM.clone();
        }

        static 
        {
            zzaHJ = new zza("NOT_AVAILABLE", 0);
            zzaHK = new zza("IO_ERROR", 1);
            zzaHL = new zza("SERVER_ERROR", 2);
            zzaHM = (new zza[] {
                zzaHJ, zzaHK, zzaHL
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

    public class zzb
    {

        private final Object zzaHN;
        private final zzmp.zza.zza zzaHb;
        private final long zzaHd;

        public Object zzyN()
        {
            return zzaHN;
        }

        public zzmp.zza.zza zzyn()
        {
            return zzaHb;
        }

        public long zzyr()
        {
            return zzaHd;
        }
    }


    private zzmo zzaHH;
    private zzmm zzaHI;
    private zzht zznR;

    public zzmy(zzmo zzmo1, zzmm zzmm1)
    {
        this(zzmo1, zzmm1, zzhv.zznd());
    }

    public zzmy(zzmo zzmo1, zzmm zzmm1, zzht zzht1)
    {
        boolean flag = true;
        super();
        if (zzmo1.zzyl().size() != 1)
        {
            flag = false;
        }
        zzv.zzQ(flag);
        zzaHH = zzmo1;
        zzaHI = zzmm1;
        zznR = zzht1;
    }

    protected abstract zzb zza(zzmj zzmj1);

    protected abstract void zza(zzmp zzmp1);

    public void zza(zza zza1)
    {
        zzbg.zzak((new StringBuilder()).append("ResourceManager: Failed to download a resource: ").append(zza1.name()).toString());
        zza1 = (zzmj)zzaHH.zzyl().get(0);
        zzb zzb1 = zza(((zzmj) (zza1)));
        if (zzb1 != null && (zzb1.zzyN() instanceof zzmq.zzc))
        {
            zza1 = new zzmp.zza(Status.zzQU, zza1, null, (zzmq.zzc)zzb1.zzyN(), zzb1.zzyn(), zzb1.zzyr());
        } else
        {
            zza1 = new zzmp.zza(Status.zzQW, zza1, zzmp.zza.zza.zzaHg);
        }
        zza(new zzmp(zza1));
    }

    public void zzq(byte abyte0[])
    {
        Object obj;
        zzmp.zza.zza zza1;
        zzmp.zza.zza zza2;
        zzmj zzmj1;
        long l;
        long l1;
        zzbg.zzam((new StringBuilder()).append("ResourceManager: Resource downloaded from Network: ").append(zzaHH.getId()).toString());
        zzmj1 = (zzmj)zzaHH.zzyl().get(0);
        zza2 = zzmp.zza.zza.zzaHg;
        obj = null;
        l1 = 0L;
        l = l1;
        zza1 = zza2;
        Object obj1 = zzaHI.zzp(abyte0);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zznR.currentTimeMillis();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzbg.zzal("Parsed resource from network is null");
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzb zzb2 = zza(zzmj1);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (zzb2 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        obj1 = zzb2.zzyN();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zza2 = zzb2.zzyn();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzb2.zzyr();
        l = l1;
        zza1 = zza2;
        obj = obj1;
_L1:
        zzmq.zzg zzg;
        zzb zzb1;
        if (obj != null)
        {
            abyte0 = new zzmp.zza(Status.zzQU, zzmj1, abyte0, (zzmq.zzc)obj, zza1, l);
        } else
        {
            abyte0 = new zzmp.zza(Status.zzQW, zzmj1, zzmp.zza.zza.zzaHg);
        }
        zza(new zzmp(abyte0));
        return;
        zzg;
        zzbg.zzal("Resource from network is corrupted");
        zzb1 = zza(zzmj1);
        if (zzb1 != null)
        {
            obj = zzb1.zzyN();
            zza1 = zzb1.zzyn();
        }
          goto _L1
    }
}

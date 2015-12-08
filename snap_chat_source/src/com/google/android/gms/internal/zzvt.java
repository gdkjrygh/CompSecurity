// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbf;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlx, zzvj, zzve, zzvk, 
//            zzvh, zzlv

public abstract class zzvt
{
    public static final class zza extends Enum
    {

        public static final zza zzaCI;
        public static final zza zzaCJ;
        public static final zza zzaCK;
        private static final zza zzaCL[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzvt$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaCL.clone();
        }

        static 
        {
            zzaCI = new zza("NOT_AVAILABLE", 0);
            zzaCJ = new zza("IO_ERROR", 1);
            zzaCK = new zza("SERVER_ERROR", 2);
            zzaCL = (new zza[] {
                zzaCI, zzaCJ, zzaCK
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

    public class zzb
    {

        private final Object zzaCM;
        private final zzvk.zza.zza zzaCa;
        private final long zzaCc;

        public Object zzuP()
        {
            return zzaCM;
        }

        public zzvk.zza.zza zzup()
        {
            return zzaCa;
        }

        public long zzut()
        {
            return zzaCc;
        }
    }


    private zzvj zzaCG;
    private zzvh zzaCH;
    private zzlv zzmW;

    public zzvt(zzvj zzvj1, zzvh zzvh1)
    {
        this(zzvj1, zzvh1, zzlx.zzkc());
    }

    public zzvt(zzvj zzvj1, zzvh zzvh1, zzlv zzlv1)
    {
        boolean flag = true;
        super();
        if (zzvj1.zzun().size() != 1)
        {
            flag = false;
        }
        zzx.zzO(flag);
        zzaCG = zzvj1;
        zzaCH = zzvh1;
        zzmW = zzlv1;
    }

    protected abstract zzb zza(zzve zzve1);

    protected abstract void zza(zzvk zzvk1);

    public void zza(zza zza1)
    {
        zzbf.zzZ((new StringBuilder("ResourceManager: Failed to download a resource: ")).append(zza1.name()).toString());
        zza1 = (zzve)zzaCG.zzun().get(0);
        zzb zzb1 = zza(((zzve) (zza1)));
        if (zzb1 != null && (zzb1.zzuP() instanceof zzvl.zzc))
        {
            zza1 = new zzvk.zza(Status.zzNo, zza1, null, (zzvl.zzc)zzb1.zzuP(), zzb1.zzup(), zzb1.zzut());
        } else
        {
            zza1 = new zzvk.zza(Status.zzNq, zza1, zzvk.zza.zza.zzaCf);
        }
        zza(new zzvk(zza1));
    }

    public void zzo(byte abyte0[])
    {
        Object obj;
        zzvk.zza.zza zza1;
        zzvk.zza.zza zza2;
        zzve zzve1;
        long l;
        long l1;
        zzbf.zzab((new StringBuilder("ResourceManager: Resource downloaded from Network: ")).append(zzaCG.getId()).toString());
        zzve1 = (zzve)zzaCG.zzun().get(0);
        zza2 = zzvk.zza.zza.zzaCf;
        obj = null;
        l1 = 0L;
        l = l1;
        zza1 = zza2;
        Object obj1 = zzaCH.zzn(abyte0);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzmW.currentTimeMillis();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzbf.zzaa("Parsed resource from network is null");
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzb zzb2 = zza(zzve1);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (zzb2 == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        obj1 = zzb2.zzuP();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zza2 = zzb2.zzup();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzb2.zzut();
        l = l1;
        zza1 = zza2;
        obj = obj1;
_L1:
        zzvl.zzg zzg;
        zzb zzb1;
        if (obj != null)
        {
            abyte0 = new zzvk.zza(Status.zzNo, zzve1, abyte0, (zzvl.zzc)obj, zza1, l);
        } else
        {
            abyte0 = new zzvk.zza(Status.zzNq, zzve1, zzvk.zza.zza.zzaCf);
        }
        zza(new zzvk(abyte0));
        return;
        zzg;
        zzbf.zzaa("Resource from network is corrupted");
        zzb1 = zza(zzve1);
        if (zzb1 != null)
        {
            obj = zzb1.zzuP();
            zza1 = zzb1.zzup();
        }
          goto _L1
    }
}

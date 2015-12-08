// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzpy

public class zzqe
    implements Result
{
    public static class zza
    {

        private final Status zzOt;
        private final zza zzaPp;
        private final byte zzaPq[];
        private final long zzaPr;
        private final zzpy zzaPs;
        private final zzqf.zzc zzaPt;

        public Status getStatus()
        {
            return zzOt;
        }

        public zza zzAh()
        {
            return zzaPp;
        }

        public byte[] zzAi()
        {
            return zzaPq;
        }

        public zzpy zzAj()
        {
            return zzaPs;
        }

        public zzqf.zzc zzAk()
        {
            return zzaPt;
        }

        public long zzAl()
        {
            return zzaPr;
        }

        public zza(Status status, zzpy zzpy, zza zza1)
        {
            this(status, zzpy, null, null, zza1, 0L);
        }

        public zza(Status status, zzpy zzpy, byte abyte0[], zzqf.zzc zzc, zza zza1, long l)
        {
            zzOt = status;
            zzaPs = zzpy;
            zzaPq = abyte0;
            zzaPt = zzc;
            zzaPp = zza1;
            zzaPr = l;
        }
    }

    public static final class zza.zza extends Enum
    {

        public static final zza.zza zzaPu;
        public static final zza.zza zzaPv;
        public static final zza.zza zzaPw;
        private static final zza.zza zzaPx[];

        public static zza.zza valueOf(String s)
        {
            return (zza.zza)Enum.valueOf(com/google/android/gms/internal/zzqe$zza$zza, s);
        }

        public static zza.zza[] values()
        {
            return (zza.zza[])zzaPx.clone();
        }

        static 
        {
            zzaPu = new zza.zza("NETWORK", 0);
            zzaPv = new zza.zza("DISK", 1);
            zzaPw = new zza.zza("DEFAULT", 2);
            zzaPx = (new zza.zza[] {
                zzaPu, zzaPv, zzaPw
            });
        }

        private zza.zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final zza zzaPo;

    public zzqe(zza zza1)
    {
        zzaPo = zza1;
    }

    public Status getStatus()
    {
        return zzaPo.getStatus();
    }

    public zza zzAg()
    {
        return zzaPo;
    }
}

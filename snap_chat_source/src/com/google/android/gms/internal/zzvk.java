// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzve

public class zzvk
    implements Result
{
    public static class zza
    {

        private final Status zzHb;
        private final zza zzaCa;
        private final byte zzaCb[];
        private final long zzaCc;
        private final zzve zzaCd;
        private final zzvl.zzc zzaCe;

        public Status getStatus()
        {
            return zzHb;
        }

        public zza zzup()
        {
            return zzaCa;
        }

        public byte[] zzuq()
        {
            return zzaCb;
        }

        public zzve zzur()
        {
            return zzaCd;
        }

        public zzvl.zzc zzus()
        {
            return zzaCe;
        }

        public long zzut()
        {
            return zzaCc;
        }

        public zza(Status status, zzve zzve, zza zza1)
        {
            this(status, zzve, null, null, zza1, 0L);
        }

        public zza(Status status, zzve zzve, byte abyte0[], zzvl.zzc zzc, zza zza1, long l)
        {
            zzHb = status;
            zzaCd = zzve;
            zzaCb = abyte0;
            zzaCe = zzc;
            zzaCa = zza1;
            zzaCc = l;
        }
    }

    public static final class zza.zza extends Enum
    {

        public static final zza.zza zzaCf;
        public static final zza.zza zzaCg;
        public static final zza.zza zzaCh;
        private static final zza.zza zzaCi[];

        public static zza.zza valueOf(String s)
        {
            return (zza.zza)Enum.valueOf(com/google/android/gms/internal/zzvk$zza$zza, s);
        }

        public static zza.zza[] values()
        {
            return (zza.zza[])zzaCi.clone();
        }

        static 
        {
            zzaCf = new zza.zza("NETWORK", 0);
            zzaCg = new zza.zza("DISK", 1);
            zzaCh = new zza.zza("DEFAULT", 2);
            zzaCi = (new zza.zza[] {
                zzaCf, zzaCg, zzaCh
            });
        }

        private zza.zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final zza zzaBZ;

    public zzvk(zza zza1)
    {
        zzaBZ = zza1;
    }

    public Status getStatus()
    {
        return zzaBZ.getStatus();
    }

    public zza zzuo()
    {
        return zzaBZ;
    }
}

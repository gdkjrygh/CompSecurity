// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzvk, zzve

public static class zzaCc
{
    public static final class zza extends Enum
    {

        public static final zza zzaCf;
        public static final zza zzaCg;
        public static final zza zzaCh;
        private static final zza zzaCi[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzvk$zza$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaCi.clone();
        }

        static 
        {
            zzaCf = new zza("NETWORK", 0);
            zzaCg = new zza("DISK", 1);
            zzaCh = new zza("DEFAULT", 2);
            zzaCi = (new zza[] {
                zzaCf, zzaCg, zzaCh
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status zzHb;
    private final zza zzaCa;
    private final byte zzaCb[];
    private final long zzaCc;
    private final zzve zzaCd;
    private final zza zzaCe;

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

    public zzaCd zzus()
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

    public zza(Status status, zzve zzve, byte abyte0[], zza zza1, zza zza2, long l)
    {
        zzHb = status;
        zzaCd = zzve;
        zzaCb = abyte0;
        zzaCe = zza1;
        zzaCa = zza2;
        zzaCc = l;
    }
}

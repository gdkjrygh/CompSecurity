// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzcb
{
    static final class zza extends Enum
    {

        public static final zza zzaMI;
        public static final zza zzaMJ;
        public static final zza zzaMK;
        private static final zza zzaML[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaML.clone();
        }

        static 
        {
            zzaMI = new zza("NONE", 0);
            zzaMJ = new zza("CONTAINER", 1);
            zzaMK = new zza("CONTAINER_DEBUG", 2);
            zzaML = (new zza[] {
                zzaMI, zzaMJ, zzaMK
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static zzcb zzaME;
    private volatile String zzaKy;
    private volatile zza zzaMF;
    private volatile String zzaMG;
    private volatile String zzaMH;

    zzcb()
    {
        clear();
    }

    static zzcb zzzf()
    {
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if (zzaME == null)
        {
            zzaME = new zzcb();
        }
        zzcb1 = zzaME;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        return zzcb1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        zzaMF = zza.zzaMI;
        zzaMG = null;
        zzaKy = null;
        zzaMH = null;
    }

    String getContainerId()
    {
        return zzaKy;
    }

    zza zzzg()
    {
        return zzaMF;
    }

    String zzzh()
    {
        return zzaMG;
    }
}

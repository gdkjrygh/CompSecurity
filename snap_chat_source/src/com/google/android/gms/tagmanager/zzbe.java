// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface zzbe
{
    public static final class zza extends Enum
    {

        public static final zza zzazg;
        public static final zza zzazh;
        public static final zza zzazi;
        private static final zza zzazj[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzbe$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzazj.clone();
        }

        static 
        {
            zzazg = new zza("NOT_AVAILABLE", 0);
            zzazh = new zza("IO_ERROR", 1);
            zzazi = new zza("SERVER_ERROR", 2);
            zzazj = (new zza[] {
                zzazg, zzazh, zzazi
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void zza(zza zza1);

    public abstract void zzo(Object obj);

    public abstract void zzsR();
}

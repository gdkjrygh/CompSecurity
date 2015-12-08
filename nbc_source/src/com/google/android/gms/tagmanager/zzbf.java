// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface zzbf
{
    public static final class zza extends Enum
    {

        public static final zza zzaMi;
        public static final zza zzaMj;
        public static final zza zzaMk;
        private static final zza zzaMl[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaMl.clone();
        }

        static 
        {
            zzaMi = new zza("NOT_AVAILABLE", 0);
            zzaMj = new zza("IO_ERROR", 1);
            zzaMk = new zza("SERVER_ERROR", 2);
            zzaMl = (new zza[] {
                zzaMi, zzaMj, zzaMk
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

}

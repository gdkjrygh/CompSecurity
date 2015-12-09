// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface zzbf
{
    public static final class zza extends Enum
    {

        public static final zza zzaDU;
        public static final zza zzaDV;
        public static final zza zzaDW;
        private static final zza zzaDX[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaDX.clone();
        }

        static 
        {
            zzaDU = new zza("NOT_AVAILABLE", 0);
            zzaDV = new zza("IO_ERROR", 1);
            zzaDW = new zza("SERVER_ERROR", 2);
            zzaDX = (new zza[] {
                zzaDU, zzaDV, zzaDW
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();

    public abstract void a(zza zza1);

    public abstract void a(Object obj);
}

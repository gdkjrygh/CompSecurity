// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzpv
{
    public static final class zza
    {

        private boolean zzaOS;
        private boolean zzaOT;
        private final String zzaOU;
        private String zztd;

        static String zza(zza zza1)
        {
            return zza1.zzaOU;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzaOS;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzaOT;
        }

        static String zzd(zza zza1)
        {
            return zza1.zztd;
        }

        public zza zzap(boolean flag)
        {
            zzaOS = flag;
            return this;
        }

        public zza zzaq(boolean flag)
        {
            zzaOT = flag;
            return this;
        }

        public zza zzeS(String s)
        {
            zztd = s;
            return this;
        }

        public zzpv zzzW()
        {
            return new zzpv(this);
        }

        public zza(String s)
        {
            zzaOS = true;
            zzaOT = false;
            zzaOU = s;
        }
    }


    private final boolean zzaOS;
    private final boolean zzaOT;
    private final String zzaOU;
    private final String zztd;

    private zzpv(zza zza1)
    {
        zzaOU = zza.zza(zza1);
        zzaOS = zza.zzb(zza1);
        zzaOT = zza.zzc(zza1);
        zztd = zza.zzd(zza1);
    }


    public String getTrackingId()
    {
        return zztd;
    }

    public String zzzT()
    {
        return zzaOU;
    }

    public boolean zzzU()
    {
        return zzaOS;
    }

    public boolean zzzV()
    {
        return zzaOT;
    }
}

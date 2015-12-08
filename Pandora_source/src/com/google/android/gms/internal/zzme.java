// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;

public final class zzme
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class zza
    {

        private boolean zzaBI;
        private boolean zzaBJ;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaBK;
        private String zzayN;

        private String zzds(String s)
        {
            zzv.zzr(s);
            boolean flag;
            if (zzayN == null || zzayN.equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "two different server client ids provided");
            return s;
        }

        public zza zza(String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
        {
            zzaBI = true;
            zzaBJ = true;
            zzayN = zzds(s);
            zzaBK = (com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks)zzv.zzr(serverauthcodecallbacks);
            return this;
        }

        public zzme zzwi()
        {
            return new zzme(zzaBI, zzaBJ, zzayN, zzaBK);
        }

        public zza()
        {
        }
    }


    public static final zzme zzaBD = (new zza()).zzwi();
    private final boolean zzaBE;
    private final boolean zzaBF;
    private final String zzaBG;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaBH;

    private zzme(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzaBE = flag;
        zzaBF = flag1;
        zzaBG = s;
        zzaBH = serverauthcodecallbacks;
    }


    public String zzvx()
    {
        return zzaBG;
    }

    public boolean zzwf()
    {
        return zzaBE;
    }

    public boolean zzwg()
    {
        return zzaBF;
    }

    public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzwh()
    {
        return zzaBH;
    }

}

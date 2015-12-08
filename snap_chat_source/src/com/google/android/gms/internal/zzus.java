// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzus
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class zza
    {

        private String zzauh;
        private boolean zzawU;
        private boolean zzawV;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzawW;

        public final zzus zzsy()
        {
            return new zzus(zzawU, zzawV, zzauh, zzawW);
        }

        public zza()
        {
        }
    }


    public static final zzus zzawP = (new zza()).zzsy();
    private final boolean zzawQ;
    private final boolean zzawR;
    private final String zzawS;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzawT;

    private zzus(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzawQ = flag;
        zzawR = flag1;
        zzawS = s;
        zzawT = serverauthcodecallbacks;
    }


    public final String zzrN()
    {
        return zzawS;
    }

    public final boolean zzsv()
    {
        return zzawQ;
    }

    public final boolean zzsw()
    {
        return zzawR;
    }

    public final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzsx()
    {
        return zzawT;
    }

}

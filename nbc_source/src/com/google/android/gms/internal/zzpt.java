// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzpt
{
    public static final class zza
    {

        private String zzaHb;
        private boolean zzaJV;
        private boolean zzaJW;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaJX;

        public zzpt zzyc()
        {
            return new zzpt(zzaJV, zzaJW, zzaHb, zzaJX);
        }

        public zza()
        {
        }
    }


    public static final zzpt zzaJQ = (new zza()).zzyc();
    private final boolean zzaJR;
    private final boolean zzaJS;
    private final String zzaJT;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaJU;

    private zzpt(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzaJR = flag;
        zzaJS = flag1;
        zzaJT = s;
        zzaJU = serverauthcodecallbacks;
    }


}

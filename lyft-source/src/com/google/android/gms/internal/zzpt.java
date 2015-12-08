// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzpt
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{

    public static final zzpt a = (new zza()).a();
    private final boolean b;
    private final boolean c;
    private final String d;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks e;

    private zzpt(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        b = flag;
        c = flag1;
        d = s;
        e = serverauthcodecallbacks;
    }


    public boolean a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks d()
    {
        return e;
    }


    private class zza
    {

        private boolean a;
        private boolean b;
        private String c;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks d;

        public zzpt a()
        {
            return new zzpt(a, b, c, d);
        }

        public zza()
        {
        }
    }

}

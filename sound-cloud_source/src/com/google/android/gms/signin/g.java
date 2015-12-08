// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;


public final class g
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class a
    {

        public boolean a;
        public boolean b;
        public String c;
        public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks d;

        public final g a()
        {
            return new g(a, b, c, d, (byte)0);
        }

        public a()
        {
        }
    }


    public static final g a = (new a()).a();
    public final boolean b;
    public final boolean c;
    public final String d;
    public final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks e;

    private g(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        b = flag;
        c = flag1;
        d = s;
        e = serverauthcodecallbacks;
    }

    g(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks, byte byte0)
    {
        this(flag, flag1, s, serverauthcodecallbacks);
    }

}

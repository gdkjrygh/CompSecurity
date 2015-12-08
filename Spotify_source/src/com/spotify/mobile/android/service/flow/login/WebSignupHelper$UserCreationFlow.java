// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import ctz;

public final class mSource extends Enum
{

    public static final b a;
    private static b b;
    private static final b c[];
    private final String mSource;

    public static mSource valueOf(String s)
    {
        return (mSource)Enum.valueOf(com/spotify/mobile/android/service/flow/login/WebSignupHelper$UserCreationFlow, s);
    }

    public static mSource[] values()
    {
        return (mSource[])c.clone();
    }

    public final String toString()
    {
        return mSource;
    }

    static 
    {
        a = new <init>("CLIENT_MOBILE", 0, "client_mobile");
        b = new <init>("PRE_INSTALLED", 1, "pre_installed_client");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        ctz.a(s1);
        mSource = s1;
    }
}

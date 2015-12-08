// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import ctz;

public final class mCreationPoint extends Enum
{

    public static final a a;
    private static final a b[];
    private final String mCreationPoint;

    public static mCreationPoint valueOf(String s)
    {
        return (mCreationPoint)Enum.valueOf(com/spotify/mobile/android/service/flow/login/WebSignupHelper$UserCreationPoint, s);
    }

    public static mCreationPoint[] values()
    {
        return (mCreationPoint[])b.clone();
    }

    public final String toString()
    {
        return mCreationPoint;
    }

    static 
    {
        a = new <init>("CLIENT_MOBILE", "client_mobile");
        b = (new b[] {
            a
        });
    }

    private (String s, String s1)
    {
        super(s, 0);
        ctz.a(s1);
        mCreationPoint = s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.auth;


public final class authTokenType extends Enum
{

    public static final WEBUPDATES GPLUS;
    public static final WEBUPDATES SID;
    public static final WEBUPDATES WEBUPDATES;
    private static final WEBUPDATES a[];
    private final String authTokenType;

    public static authTokenType valueOf(String s)
    {
        return (authTokenType)Enum.valueOf(com/google/android/apps/unveil/auth/AuthToken$AuthTokenType, s);
    }

    public static authTokenType[] values()
    {
        return (authTokenType[])a.clone();
    }

    public final String getAuthTokenType()
    {
        return authTokenType;
    }

    static 
    {
        SID = new <init>("SID", 0, "SID");
        GPLUS = new <init>("GPLUS", 1, "oauth2:https://www.googleapis.com/auth/emeraldsea.stream.read https://www.googleapis.com/auth/emeraldsea.stream.write https://www.googleapis.com/auth/emeraldsea.circles.read https://www.googleapis.com/auth/emeraldsea.circles.write https://www.googleapis.com/auth/picasa https://www.googleapis.com/auth/userinfo.email");
        WEBUPDATES = new <init>("WEBUPDATES", 2, "webupdates");
        a = (new a[] {
            SID, GPLUS, WEBUPDATES
        });
    }

    private A(String s, int i, String s1)
    {
        super(s, i);
        authTokenType = s1;
    }
}

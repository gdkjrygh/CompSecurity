// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Set;

public class LoginResult
{

    private final AccessToken accessToken;
    private final Set recentlyDeniedPermissions;
    private final Set recentlyGrantedPermissions;

    public LoginResult(AccessToken accesstoken, Set set, Set set1)
    {
        accessToken = accesstoken;
        recentlyGrantedPermissions = set;
        recentlyDeniedPermissions = set1;
    }

    public AccessToken getAccessToken()
    {
        return accessToken;
    }

    public Set getRecentlyDeniedPermissions()
    {
        return recentlyDeniedPermissions;
    }

    public Set getRecentlyGrantedPermissions()
    {
        return recentlyGrantedPermissions;
    }
}

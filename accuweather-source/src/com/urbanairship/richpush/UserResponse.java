// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;


class UserResponse
{

    private String userId;
    private String userToken;

    public UserResponse(String s, String s1)
    {
        userId = s;
        userToken = s1;
    }

    String getUserId()
    {
        return userId;
    }

    String getUserToken()
    {
        return userToken;
    }
}

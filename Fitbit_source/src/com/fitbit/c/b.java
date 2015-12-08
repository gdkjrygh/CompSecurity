// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.c;

import android.text.TextUtils;
import com.facebook.AccessToken;

public class b
{

    public b()
    {
    }

    public static boolean a()
    {
        return a(AccessToken.getCurrentAccessToken());
    }

    public static boolean a(AccessToken accesstoken)
    {
        return accesstoken != null && !TextUtils.isEmpty(accesstoken.getToken()) && !TextUtils.isEmpty(accesstoken.getUserId()) && !accesstoken.isExpired();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.SharedPreferences;

public class GcmStorage
{

    private static final String TOKEN_KEY = "gcmToken";
    private final SharedPreferences sharedPreferences;

    public GcmStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void clearToken()
    {
        sharedPreferences.edit().remove("gcmToken").apply();
    }

    public String getToken()
    {
        return sharedPreferences.getString("gcmToken", null);
    }

    public boolean hasToken()
    {
        return sharedPreferences.contains("gcmToken");
    }

    public void storeToken(String s)
    {
        sharedPreferences.edit().putString("gcmToken", s).apply();
    }
}

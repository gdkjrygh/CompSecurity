// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.content.SharedPreferences;

class TokenStorage
{

    private static final String KEY_PENDING_URN = "pending_transaction_urn";
    private final SharedPreferences sharedPreferences;

    public TokenStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void clear()
    {
        sharedPreferences.edit().clear().apply();
    }

    public String getCheckoutToken()
    {
        return sharedPreferences.getString("pending_transaction_urn", null);
    }

    public void setCheckoutToken(String s)
    {
        sharedPreferences.edit().putString("pending_transaction_urn", s).apply();
    }
}

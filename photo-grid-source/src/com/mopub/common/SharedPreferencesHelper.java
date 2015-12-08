// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.content.SharedPreferences;

public final class SharedPreferencesHelper
{

    public static final String PREFERENCE_NAME = "mopubSettings";

    private SharedPreferencesHelper()
    {
    }

    public static SharedPreferences getSharedPreferences(Context context)
    {
        return context.getSharedPreferences("mopubSettings", 0);
    }
}

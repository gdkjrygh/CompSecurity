// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.prefence;

import android.content.Context;
import android.content.SharedPreferences;

public class KohlsApptentivePreference
{

    private final Context appContext;

    public KohlsApptentivePreference(Context context)
    {
        appContext = context;
    }

    private SharedPreferences getDefaultSharePreference()
    {
        return appContext.getSharedPreferences("apptentive", 0);
    }

    public boolean isApptentivesurveyShown()
    {
        return getDefaultSharePreference().getBoolean("apptentive", false);
    }

    public void setApptentivePreference(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("apptentive", flag);
        editor.commit();
    }
}

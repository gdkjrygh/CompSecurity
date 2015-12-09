// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.sharedpreferences;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.app.filenames.Filenames;

public class UserScopedSharedPreferenceModule
{

    public UserScopedSharedPreferenceModule()
    {
    }

    static SharedPreferences getSharedPreferences(Application application, String s)
    {
        return application.getSharedPreferences(Filenames.getUserSharedPreferenceName(s), 0);
    }
}

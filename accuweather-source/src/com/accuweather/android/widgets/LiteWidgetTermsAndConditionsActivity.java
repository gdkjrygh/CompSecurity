// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.accuweather.android.LiteTermsAndConditionsActivity;

public class LiteWidgetTermsAndConditionsActivity extends LiteTermsAndConditionsActivity
{

    public LiteWidgetTermsAndConditionsActivity()
    {
    }

    public void accept()
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("terms_and_conditions_accepted", true).commit();
        setResult(-1);
        finish();
    }

    public void decline()
    {
        setResult(0);
        finish();
    }
}

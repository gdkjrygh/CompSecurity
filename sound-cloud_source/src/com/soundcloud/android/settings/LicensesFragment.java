// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class LicensesFragment extends PreferenceFragment
{

    public LicensesFragment()
    {
    }

    public static LicensesFragment create()
    {
        return new LicensesFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050004);
    }
}

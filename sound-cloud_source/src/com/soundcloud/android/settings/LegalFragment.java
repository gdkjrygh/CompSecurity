// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import com.soundcloud.android.main.WebViewActivity;

public class LegalFragment extends PreferenceFragment
    implements android.preference.Preference.OnPreferenceClickListener
{

    public LegalFragment()
    {
    }

    public static LegalFragment create()
    {
        return new LegalFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050003);
        findPreference("terms_of_service").setOnPreferenceClickListener(this);
        findPreference("privacy_policy").setOnPreferenceClickListener(this);
        findPreference("imprint").setOnPreferenceClickListener(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        Intent intent = new Intent(getActivity(), com/soundcloud/android/main/WebViewActivity);
        intent.setData(preference.getIntent().getData());
        startActivity(intent);
        return true;
    }
}

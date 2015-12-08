// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.ContentResolver;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.storage.provider.ScContentProvider;
import dagger.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationSettingsFragment extends PreferenceFragment
{

    AccountOperations accountOperations;
    final List syncPreferences = new ArrayList();

    public NotificationSettingsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private boolean checkSyncNecessary()
    {
        Object obj = syncPreferences.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (!((CheckBoxPreference)((Iterator) (obj)).next()).isChecked()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L11:
        if (!accountOperations.isUserLoggedIn()) goto _L6; else goto _L5
_L5:
        boolean flag1;
        obj = accountOperations.getSoundCloudAccount();
        flag1 = ContentResolver.getSyncAutomatically(((android.accounts.Account) (obj)), "com.soundcloud.android.provider.ScContentProvider");
        if (!flag || flag1) goto _L8; else goto _L7
_L7:
        ScContentProvider.enableSyncing(((android.accounts.Account) (obj)), 3600L);
_L6:
        return flag;
_L8:
        if (flag || !flag1) goto _L6; else goto _L9
_L9:
        ScContentProvider.disableSyncing(((android.accounts.Account) (obj)));
        return flag;
_L2:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static NotificationSettingsFragment create()
    {
        return new NotificationSettingsFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050008);
        for (int i = 0; i < getPreferenceScreen().getPreferenceCount(); i++)
        {
            if (!(getPreferenceScreen().getPreference(i) instanceof PreferenceCategory))
            {
                continue;
            }
            bundle = (PreferenceCategory)getPreferenceScreen().getPreference(i);
            for (int j = 0; j < bundle.getPreferenceCount(); j++)
            {
                if (bundle.getPreference(j) instanceof CheckBoxPreference)
                {
                    CheckBoxPreference checkboxpreference = (CheckBoxPreference)bundle.getPreference(j);
                    syncPreferences.add(checkboxpreference);
                    checkboxpreference.setOnPreferenceClickListener(new _cls1());
                }
            }

        }

    }


    private class _cls1
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final NotificationSettingsFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            checkSyncNecessary();
            return false;
        }

        _cls1()
        {
            this$0 = NotificationSettingsFragment.this;
            super();
        }
    }

}

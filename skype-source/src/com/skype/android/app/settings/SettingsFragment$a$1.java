// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.android.service.SyncAccountUtil;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import java.util.Set;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment, ContactSyncDialogPreference, UserPreferences

final class dapter extends PermissionHandlerAdapter
{

    final is._cls0 this$1;
    final Object val$newValue;

    public final void onDenied(Set set)
    {
        boolean flag = ((Boolean)val$newValue).booleanValue();
        pyToPhoneBook.setOnPreferenceChangeListener(null);
        set = pyToPhoneBook;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        set.setValue(flag);
        pyToPhoneBook.setOnPreferenceChangeListener(this._cls1.this);
    }

    public final void onGranted()
    {
        boolean flag = ((Boolean)val$newValue).booleanValue();
        ncAccountUtil.setContactSyncModePreference(flag);
        userPrefs.setEnableSyncContacts(flag);
        neric.setSummary(SettingsFragment.access$000(_fld0)[SettingsFragment.access$100(_fld0, flag)]);
    }

    erence()
    {
        this$1 = final_erence;
        val$newValue = Object.this;
        super();
    }
}

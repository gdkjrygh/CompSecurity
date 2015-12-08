// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.android.service.SyncAccountUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import java.util.Set;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment, ContactSyncDialogPreference, UserPreferences

private final class syncAccountUtil
    implements android.preference.enceChangeListener
{

    ContactSyncDialogPreference copyToPhoneBook;
    Preference generic;
    final SyncAccountUtil syncAccountUtil;
    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, final Object newValue)
    {
        permissionRequest.a(Permission.p, true, new PermissionHandlerAdapter() {

            final SettingsFragment.a this$1;
            final Object val$newValue;

            public final void onDenied(Set set)
            {
                boolean flag = ((Boolean)newValue).booleanValue();
                copyToPhoneBook.setOnPreferenceChangeListener(null);
                set = copyToPhoneBook;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                set.setValue(flag);
                copyToPhoneBook.setOnPreferenceChangeListener(SettingsFragment.a.this);
            }

            public final void onGranted()
            {
                boolean flag = ((Boolean)newValue).booleanValue();
                syncAccountUtil.setContactSyncModePreference(flag);
                userPrefs.setEnableSyncContacts(flag);
                generic.setSummary(SettingsFragment.access$000(this$0)[SettingsFragment.access$100(this$0, flag)]);
            }

            
            {
                this$1 = SettingsFragment.a.this;
                newValue = obj;
                super();
            }
        });
        return true;
    }

    public eference(Preference preference, ContactSyncDialogPreference contactsyncdialogpreference, SyncAccountUtil syncaccountutil)
    {
        this$0 = SettingsFragment.this;
        super();
        generic = preference;
        copyToPhoneBook = contactsyncdialogpreference;
        syncAccountUtil = syncaccountutil;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.Application;
import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import com.skype.android.sync.ContactsIngestManager;

// Referenced classes of package com.skype.android.app.settings:
//            UserPreferences

public class SkypePreferenceListener
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private BackupManager backupManager;
    private ContactsIngestManager contactsIngestManager;
    private Application context;

    public SkypePreferenceListener(Application application, ContactsIngestManager contactsingestmanager)
    {
        context = application;
        contactsIngestManager = contactsingestmanager;
    }

    public void init(UserPreferences userpreferences)
    {
        userpreferences.registerOnSharedPreferenceChangeListener(this);
        backupManager = userpreferences.getBackupManager();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals(context.getString(0x7f08053f)) && sharedpreferences.getBoolean(s, false))
        {
            contactsIngestManager.runNow();
        }
        backupManager.dataChanged();
    }
}

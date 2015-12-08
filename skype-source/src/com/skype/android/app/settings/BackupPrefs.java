// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;

// Referenced classes of package com.skype.android.app.settings:
//            DaggerBackupPrefsComponent, BackupPrefsComponent

public class BackupPrefs extends BackupAgentHelper
{

    static final String PREFS_BACKUP_KEY = "skypePrefs";
    private BackupPrefsComponent component;
    SkyLib lib;

    public BackupPrefs()
    {
    }

    public BackupPrefsComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerBackupPrefsComponent.builder().skypeApplicationComponent(((SkypeApplication)getApplicationContext()).a()).build();
        }
        return component;
    }

    public void onCreate()
    {
        getComponent().inject(this);
        String s = lib.getDefaultAccountName();
        if (s == null || s.isEmpty())
        {
            return;
        } else
        {
            addHelper("skypePrefs", new SharedPreferencesBackupHelper(this, new String[] {
                s
            }));
            return;
        }
    }
}

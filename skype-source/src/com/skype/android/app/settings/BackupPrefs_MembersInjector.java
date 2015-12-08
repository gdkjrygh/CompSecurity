// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.SkyLib;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            BackupPrefs

public final class BackupPrefs_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;

    public BackupPrefs_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new BackupPrefs_MembersInjector(provider);
    }

    public static void injectLib(BackupPrefs backupprefs, Provider provider)
    {
        backupprefs.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(BackupPrefs backupprefs)
    {
        if (backupprefs == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            backupprefs.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((BackupPrefs)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/BackupPrefs_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.app.filenames.Filenames;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.common.base.Strings;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AccountNameChangeHandler
{

    private final Application application;
    private final SharedPreferences globalPrefs;

    AccountNameChangeHandler(Application application1, SharedPreferences sharedpreferences)
    {
        application = application1;
        globalPrefs = sharedpreferences;
    }

    private void renameDbAndSharedPrefsFiles(String s, String s1)
    {
        Filenames.getSharedPrefsFile(application, Filenames.getUserSharedPreferenceName(s)).renameTo(Filenames.getSharedPrefsFile(application, Filenames.getUserSharedPreferenceName(s1)));
        application.getDatabasePath(Filenames.getWalletDatabaseName(s)).renameTo(application.getDatabasePath(Filenames.getWalletDatabaseName(s1)));
        application.getDatabasePath(Filenames.getHceDatabaseName(s)).renameTo(application.getDatabasePath(Filenames.getHceDatabaseName(s1)));
    }

    private void renameGlobalSharedPrefValues(String s, String s1)
    {
        Iterator iterator = globalPrefs.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (s2.startsWith("GAIA_ID_KEY_PREFIX") && globalPrefs.getString(s2, "").equals(s))
            {
                globalPrefs.edit().putString(s2, s1).apply();
            }
        } while (true);
    }

    public final void handleAccountNameChange()
    {
        if (!SharedPreference.OLD_ACCOUNT_NAME.isPresent(globalPrefs))
        {
            return;
        }
        String s = (String)SharedPreference.OLD_ACCOUNT_NAME.get(globalPrefs);
        String s1 = (String)SharedPreference.ACCOUNT_NAME.get(globalPrefs);
        if (!Strings.isNullOrEmpty(s) && !Strings.isNullOrEmpty(s1) && !s1.equals("[ANONYMOUS_USER]"))
        {
            renameDbAndSharedPrefsFiles(s, s1);
            renameGlobalSharedPrefValues(s, s1);
        }
        SharedPreference.OLD_ACCOUNT_NAME.remove(globalPrefs);
        return;
        Exception exception;
        exception;
        SharedPreference.OLD_ACCOUNT_NAME.remove(globalPrefs);
        throw exception;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.skype.android.sync.ContactOperationUtils;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.permission.PermissionUtil;

public class SyncAccountUtil
{

    private static final long PERIODIC_SYNC_FREQUENCY_SECONDS = 21600L;
    private AccountManager accountManager;
    private Context context;
    private PermissionUtil permissionUtil;
    private TimeUtil timeUtil;

    public SyncAccountUtil(Context context1, TimeUtil timeutil)
    {
        if (context1 == null)
        {
            throw new IllegalArgumentException("null context");
        } else
        {
            context = context1;
            timeUtil = timeutil;
            accountManager = AccountManager.get(context1);
            permissionUtil = new PermissionUtil(context1);
            return;
        }
    }

    private boolean createAccountWithSyncMode(String s, boolean flag)
    {
        s = new Account(s, "com.skype.contacts.sync");
        boolean flag1 = accountManager.addAccountExplicitly(s, null, null);
        if (flag1)
        {
            createSyncLevel(s, flag);
        }
        return flag1;
    }

    private void createSyncLevel(Account account, boolean flag)
    {
        Object obj = account.name;
        String s = account.type;
        obj = context.getContentResolver().query(android.provider.ContactsContract.Settings.CONTENT_URI, new String[] {
            "account_name"
        }, "account_name = ? and account_type = ?", new String[] {
            obj, s
        }, null);
        if (obj != null)
        {
            if (!((Cursor) (obj)).moveToFirst())
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("account_name", account.name);
                contentvalues.put("account_type", account.type);
                contentvalues.put("ungrouped_visible", Boolean.valueOf(flag));
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                contentvalues.put("should_sync", Integer.valueOf(i));
                context.getContentResolver().insert(android.provider.ContactsContract.Settings.CONTENT_URI, contentvalues);
            }
            ((Cursor) (obj)).close();
        }
        obj = new ContactOperationUtils(context, timeUtil);
        if (!flag)
        {
            ((ContactOperationUtils) (obj)).removeAllContacts(account.name);
        }
        ContentResolver.setSyncAutomatically(account, "com.android.contacts", flag);
        ContentResolver.addPeriodicSync(account, "com.android.contacts", new Bundle(), 21600L);
        ((ContactOperationUtils) (obj)).setGroupVisibility(account.name, flag);
    }

    public boolean createOrUpdateAccount(String s, String s1, boolean flag)
    {
        Account account = getCurrentAccount();
        String s2 = s;
        if (account != null)
        {
            s2 = s;
            if (!account.name.equals(s))
            {
                if (account.name.equals(s1))
                {
                    s2 = s1;
                } else
                {
                    accountManager.removeAccount(account, null, null);
                    s2 = s;
                }
            }
        }
        return createAccountWithSyncMode(s2, flag);
    }

    public Account getCurrentAccount()
    {
        Account aaccount[] = accountManager.getAccountsByType("com.skype.contacts.sync");
        if (aaccount == null || aaccount.length == 0)
        {
            return null;
        } else
        {
            return aaccount[0];
        }
    }

    public void setContactSyncModePreference(boolean flag)
    {
        Account account;
        Object obj;
label0:
        {
            account = getCurrentAccount();
            if (account != null)
            {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", flag);
                obj = new ContactOperationUtils(context, timeUtil);
                ((ContactOperationUtils) (obj)).setGroupVisibility(account.name, flag);
                if (!flag)
                {
                    break label0;
                }
                obj = new Bundle();
                ((Bundle) (obj)).putBoolean("force", true);
                ((Bundle) (obj)).putBoolean("expedited", true);
                ContentResolver.requestSync(account, "com.android.contacts", ((Bundle) (obj)));
            }
            return;
        }
        ((ContactOperationUtils) (obj)).removeAllContacts(account.name);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.translate.c.d;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import java.io.IOException;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            m, n, r, l, 
//            b, PhraseSyncService, q

public final class k
{

    final Context a;
    final AccountManager b;
    final SharedPreferences c;

    public k(Context context)
    {
        a = context;
        b = AccountManager.get(a);
        c = a.getSharedPreferences("sync", 0);
    }

    private String f()
    {
        return c.getString("account", "");
    }

    public final Account a()
    {
        String s = f();
        if (!TextUtils.isEmpty(s))
        {
            Account aaccount[] = b();
            int j = aaccount.length;
            for (int i = 0; i < j; i++)
            {
                Account account = aaccount[i];
                if (account.name.equals(s))
                {
                    return account;
                }
            }

        }
        return null;
    }

    protected final String a(AccountManagerFuture accountmanagerfuture, Activity activity)
    {
        int i;
        try
        {
            accountmanagerfuture = (Bundle)accountmanagerfuture.getResult();
            if (accountmanagerfuture.containsKey("authtoken"))
            {
                return accountmanagerfuture.getString("authtoken");
            }
            i = f.msg_auth_error;
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            i = 0;
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            i = f.msg_auth_error;
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            i = f.msg_network_error;
        }
        if (activity != null && i != 0)
        {
            activity.runOnUiThread(new m(this, i));
        }
        return null;
    }

    public final void a(Activity activity, q q)
    {
        int j = -1;
        Object obj = f();
        Account aaccount[] = b();
        if (aaccount.length > 0)
        {
            String as[] = new String[aaccount.length];
            for (int i = 0; i < aaccount.length; i++)
            {
                as[i] = aaccount[i].name;
                if (as[i].equals(obj))
                {
                    j = i;
                }
            }

            android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(activity)).setTitle(f.msg_choose_account);
            if (j >= 0)
            {
                obj = Event.GOOGLE_LOGIN_CHANGE;
            } else
            {
                obj = Event.GOOGLE_SIGNIN;
            }
            activity = builder.setSingleChoiceItems(as, j, new n(this, activity, q, ((Event) (obj)))).setNegativeButton(f.label_cancel, null);
            if (j >= 0)
            {
                activity.setNeutralButton(f.msg_signout, new r(this, q));
            }
            activity.show();
            return;
        } else
        {
            b.addAccount("com.google", null, null, null, activity, new l(this, activity, q), null);
            return;
        }
    }

    final Account[] b()
    {
        return b.getAccountsByType("com.google");
    }

    public final String c()
    {
        Account account = a();
        if (account == null)
        {
            return null;
        } else
        {
            return a(b.getAuthToken(account, "oauth2:https://www.googleapis.com/auth/translate", true, null, null), ((Activity) (null)));
        }
    }

    public final void d()
    {
        c.edit().remove("account").remove("last_sync_time").remove("last_sync_client_time").commit();
        com.google.android.libraries.translate.sync.b.a();
        com.google.android.libraries.translate.c.d.f(a);
        Singleton.b().a(Event.GOOGLE_SIGNOUT, null, null);
    }

    public final void e()
    {
        Intent intent = new Intent(a, com/google/android/libraries/translate/sync/PhraseSyncService);
        a.startService(intent);
    }
}

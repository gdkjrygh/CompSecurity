// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import com.google.android.libraries.translate.c.d;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            n, k, PhraseSyncService, b, 
//            q

final class o extends k
{

    final AccountManagerFuture a;
    final ProgressDialog b;
    final Account c;
    final n d;

    o(n n1, AccountManagerFuture accountmanagerfuture, ProgressDialog progressdialog, Account account)
    {
        d = n1;
        a = accountmanagerfuture;
        b = progressdialog;
        c = account;
        super();
    }

    private transient String a()
    {
        String s;
        s = d.a.a(a, n.a(d));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        for (int i = 10; i > 0 && PhraseSyncService.a() && !isCancelled();)
        {
            i--;
            try
            {
                Thread.sleep(1000L);
            }
            catch (Exception exception) { }
        }

        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!PhraseSyncService.a())
        {
            break; /* Loop/switch isn't completed */
        }
        publishProgress(new Integer[] {
            Integer.valueOf(f.msg_sign_in_timeout)
        });
        long l = d.a.c.getLong("last_sync_time", 0L);
        if (l > 0L)
        {
            Singleton.b().a(-603, (new LogParams()).addParam("last_sync", Long.valueOf(l)));
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        com.google.android.libraries.translate.sync.b.a();
        com.google.android.libraries.translate.c.d.e(d.a.a);
        return s;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        p.a(b, "SigninProgress");
        if (obj != null)
        {
            d.a.c.edit().putString("account", c.name).putLong("last_sync_time", 0L).putLong("last_sync_client_time", 0L).commit();
            d.a.e();
            Singleton.b().a(n.b(d), null, null);
            n.c(d).a(c);
        }
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        m.a(((Integer[])aobj)[0].intValue(), 1);
    }
}

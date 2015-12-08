// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.sony.snei.np.android.account.oauth.InsufficientApkCapabilityException;
import com.sony.snei.np.android.account.oauth.InvalidInstanceException;
import com.sony.snei.np.android.account.oauth.NpAccountManager;
import com.spotify.mobile.android.ui.page.DebugFlag;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public final class dkn extends dkl
{

    private Handler a;
    private NpAccountManager b;
    private Context c;

    public dkn(Context context)
    {
        a = new Handler();
        c = context;
        context = new dal() {

            public final void a(com.sony.snei.np.android.account.oauth.NpAccountManager.SsoEventType ssoeventtype, Bundle bundle)
            {
                bundle.toString();
            }

        };
        try
        {
            String s = dkw.a(c);
            b = NpAccountManager.a(c, context, a);
            if (!TextUtils.isEmpty(s))
            {
                b.a.a(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b = null;
        }
    }

    static String a(Bundle bundle, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = new StringBuilder();
        for (int j = 0; j < i; j++)
        {
            ((StringBuilder) (obj)).append("  ");
        }

        obj = ((StringBuilder) (obj)).toString();
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj1 = bundle.get(s);
            if (obj1 instanceof Bundle)
            {
                stringbuilder.append(((String) (obj)));
                stringbuilder.append(s).append('=');
                stringbuilder.append('\n');
                stringbuilder.append(a((Bundle)obj1, i + 1));
            } else
            {
                stringbuilder.append(((String) (obj)));
                stringbuilder.append(s).append('=').append(obj1);
                if (obj1 instanceof Number)
                {
                    stringbuilder.append('(');
                    stringbuilder.append(String.format("0x%X", new Object[] {
                        obj1
                    }));
                    stringbuilder.append(')');
                }
                stringbuilder.append('\n');
            }
        }

        return stringbuilder.toString();
    }

    public final void a(Activity activity, dkm dkm)
    {
        boolean flag;
        flag = false;
        DebugFlag debugflag = DebugFlag.c;
        if (b == null)
        {
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        NpAccountManager npaccountmanager = b;
        String s = dkw.d;
        AccountManagerCallback accountmanagercallback = new AccountManagerCallback(dkm) {

            private dkm a;

            public final void run(AccountManagerFuture accountmanagerfuture)
            {
                AccountManagerFuture accountmanagerfuture1;
                Object obj;
                AccountManagerFuture accountmanagerfuture2;
                Object obj1;
                String s1;
                Object obj2;
                Object obj3;
                obj2 = null;
                obj3 = null;
                s1 = null;
                obj1 = "";
                accountmanagerfuture1 = s1;
                obj = obj2;
                accountmanagerfuture2 = obj3;
                Bundle bundle = (Bundle)accountmanagerfuture.getResult();
                accountmanagerfuture1 = s1;
                obj = obj2;
                accountmanagerfuture2 = obj3;
                boolean flag1 = bundle.getBoolean("booleanResult");
                accountmanagerfuture1 = s1;
                obj = obj2;
                accountmanagerfuture2 = obj3;
                dkn.a(bundle, 0);
                if (!flag1) goto _L2; else goto _L1
_L1:
                accountmanagerfuture1 = s1;
                obj = obj2;
                accountmanagerfuture2 = obj3;
                accountmanagerfuture = bundle.getString("authtoken");
                accountmanagerfuture1 = accountmanagerfuture;
                obj = accountmanagerfuture;
                accountmanagerfuture2 = accountmanagerfuture;
                s1 = bundle.getString("authAccount");
                obj = s1;
                accountmanagerfuture1 = accountmanagerfuture;
                accountmanagerfuture = ((AccountManagerFuture) (obj));
_L5:
                obj1 = accountmanagerfuture;
                accountmanagerfuture = accountmanagerfuture1;
_L3:
                if (accountmanagerfuture != null)
                {
                    a.a(accountmanagerfuture, ((String) (obj1)));
                    return;
                } else
                {
                    a.a();
                    return;
                }
                accountmanagerfuture;
                accountmanagerfuture = accountmanagerfuture1;
                continue; /* Loop/switch isn't completed */
                accountmanagerfuture;
                accountmanagerfuture = ((AccountManagerFuture) (obj));
                continue; /* Loop/switch isn't completed */
                accountmanagerfuture;
                accountmanagerfuture = accountmanagerfuture2;
                if (true) goto _L3; else goto _L2
_L2:
                accountmanagerfuture = "";
                accountmanagerfuture1 = null;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = dkm1;
                super();
            }
        };
        Handler handler = a;
        npaccountmanager.a.a(activity, "73dc1b67-5e95-4010-b12a-50770d0d9492", s, "openid,grc:get_session,psm:account_link_user_sp,kamaji:account_link_user_link_account,kamaji:commerce_container,kamaji:commerce_sp", "com.spotify.music.npam://redirect", "urn:service-entity:np", accountmanagercallback, handler);
_L2:
        if (flag)
        {
            a.post(new Runnable(dkm) {

                private dkm a;

                public final void run()
                {
                    a.a();
                }

            
            {
                a = dkm1;
                super();
            }
            });
        }
        return;
        activity;
_L3:
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        activity;
          goto _L3
    }

    public final void a(dkm dkm)
    {
        a(((Activity) (null)), dkm);
    }

    public final boolean a()
    {
        DebugFlag debugflag = DebugFlag.c;
        boolean flag;
        if (AccountManager.get(c).getAccountsByType("com.sony.snei.np.android.account").length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public final void b()
    {
        if (b != null)
        {
            b.a.a();
        }
    }
}

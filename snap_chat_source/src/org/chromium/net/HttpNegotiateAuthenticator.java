// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

public class HttpNegotiateAuthenticator
{

    private static boolean c;
    private Bundle a;
    private final String b;

    private HttpNegotiateAuthenticator(String s)
    {
        a = null;
        if (!c && TextUtils.isEmpty(s))
        {
            throw new AssertionError();
        } else
        {
            b = s;
            return;
        }
    }

    static Bundle a(HttpNegotiateAuthenticator httpnegotiateauthenticator, Bundle bundle)
    {
        httpnegotiateauthenticator.a = bundle;
        return bundle;
    }

    static HttpNegotiateAuthenticator create(String s)
    {
        return new HttpNegotiateAuthenticator(s);
    }

    void getNextAuthToken(long l, String s, String s1, boolean flag)
    {
        if (!c && s == null)
        {
            throw new AssertionError();
        }
        s = (new StringBuilder("SPNEGO:HOSTBASED:")).append(s).toString();
        android.app.Activity activity = ApplicationStatus.a();
        if (activity == null)
        {
            nativeSetResult(l, -9, null);
            return;
        }
        AccountManager accountmanager = AccountManager.get(activity);
        Bundle bundle = new Bundle();
        if (s1 != null)
        {
            bundle.putString("incomingAuthToken", s1);
        }
        if (a != null)
        {
            bundle.putBundle("spnegoContext", a);
        }
        bundle.putBoolean("canDelegate", flag);
        s1 = b;
        AccountManagerCallback accountmanagercallback = new AccountManagerCallback(l) {

            private long a;
            private HttpNegotiateAuthenticator b;

            public final void run(AccountManagerFuture accountmanagerfuture)
            {
                byte byte0 = -9;
                accountmanagerfuture = (Bundle)accountmanagerfuture.getResult();
                HttpNegotiateAuthenticator.a(b, accountmanagerfuture.getBundle("spnegoContext"));
                char c1 = byte0;
                accountmanagerfuture.getInt("spnegoResult", 1);
                JVM INSTR tableswitch 0 9: default 195
            //                           0 111
            //                           1 92
            //                           2 116
            //                           3 122
            //                           4 129
            //                           5 136
            //                           6 143
            //                           7 150
            //                           8 157
            //                           9 164;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
                break; /* Loop/switch isn't completed */
_L1:
                break MISSING_BLOCK_LABEL_195;
_L12:
                b.nativeSetResult(a, c1, accountmanagerfuture.getString("authtoken"));
                return;
_L2:
                c1 = '\0';
                  goto _L12
_L4:
                c1 = '\uFFFD';
                  goto _L12
_L5:
                c1 = '\uFEAA';
                  goto _L12
_L6:
                c1 = '\uFEC0';
                  goto _L12
_L7:
                c1 = '\uFEAE';
                  goto _L12
_L8:
                c1 = '\uFEAD';
                  goto _L12
_L9:
                c1 = '\uFEAB';
                  goto _L12
_L10:
                c1 = '\uFEA8';
                  goto _L12
_L11:
                c1 = '\uFEB7';
                  goto _L12
                accountmanagerfuture;
_L14:
                b.nativeSetResult(a, -3, null);
                return;
                accountmanagerfuture;
                continue; /* Loop/switch isn't completed */
                accountmanagerfuture;
                if (true) goto _L14; else goto _L13
_L13:
                c1 = byte0;
                  goto _L12
            }

            
            {
                b = HttpNegotiateAuthenticator.this;
                a = l;
                super();
            }
        };
        Handler handler = new Handler(ThreadUtils.b());
        accountmanager.getAuthTokenByFeatures(s1, s, new String[] {
            "SPNEGO"
        }, activity, null, bundle, accountmanagercallback, handler);
    }

    native void nativeSetResult(long l, int i, String s);

    static 
    {
        boolean flag;
        if (!org/chromium/net/HttpNegotiateAuthenticator.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}

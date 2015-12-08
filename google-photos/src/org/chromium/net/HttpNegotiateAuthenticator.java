// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.accounts.AccountManager;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import qxq;

public class HttpNegotiateAuthenticator
{

    private Bundle a;
    private final String b;

    private HttpNegotiateAuthenticator(String s)
    {
        a = null;
        b = s;
    }

    public static Bundle a(HttpNegotiateAuthenticator httpnegotiateauthenticator, Bundle bundle)
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
        qxq qxq1 = new qxq(this, l);
        Handler handler = new Handler(ThreadUtils.a());
        accountmanager.getAuthTokenByFeatures(s1, s, new String[] {
            "SPNEGO"
        }, activity, null, bundle, qxq1, handler);
    }

    public native void nativeSetResult(long l, int i, String s);
}

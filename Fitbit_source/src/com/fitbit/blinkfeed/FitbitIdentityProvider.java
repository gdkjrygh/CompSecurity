// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.blinkfeed;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.an;
import com.fitbit.e.a;
import com.fitbit.onboarding.landing.LandingActivity_;
import com.fitbit.savedstate.d;
import com.htc.blinkfeed.provider.IdentityProvider;

public class FitbitIdentityProvider
    implements IdentityProvider
{

    private static final String a = "FitbitIdentityProvider";
    private static final String b = "com.fitbit.blinkfeed";
    private static final String c = "content://com.htc.socialnetwork.accounts/";

    public FitbitIdentityProvider()
    {
    }

    public static void a()
    {
        FitBitApplication.a().getContentResolver().notifyChange(Uri.parse("content://com.htc.socialnetwork.accounts/com.fitbit.blinkfeed"), null);
    }

    public Account getAccount()
    {
        com.fitbit.e.a.a("FitbitIdentityProvider", "getAccount", new Object[0]);
        Object obj = an.a();
        boolean flag;
        if (((an) (obj)).g() || ((an) (obj)).i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return null;
        }
        String s = d.h();
        if (b.a.a())
        {
            com.fitbit.e.a.a("FitbitIdentityProvider", "userName: %s", new Object[] {
                s
            });
        }
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = " ";
        }
        return new Account(((String) (obj)), "com.fitbit.blinkfeed");
    }

    public String getAuthenticationIntentURI()
    {
        String s = LandingActivity_.b(FitBitApplication.a()).a().toUri(1);
        if (b.a.a())
        {
            com.fitbit.e.a.a("FitbitIdentityProvider", "URI: %s", new Object[] {
                s
            });
        }
        return s;
    }
}

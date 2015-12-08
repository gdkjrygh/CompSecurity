// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;

import android.content.Context;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.k;
import org.androidannotations.api.c.n;
import org.androidannotations.api.c.p;

public final class DominosPrefs_ extends n
{

    public DominosPrefs_(Context context)
    {
        super(context.getSharedPreferences("DominosPrefs", 0));
    }

    public final p CHECKOUT_EMAIL()
    {
        return stringField("CHECKOUT_EMAIL", "");
    }

    public final p CHECKOUT_FIRST_NAME()
    {
        return stringField("CHECKOUT_FIRST_NAME", "");
    }

    public final p CHECKOUT_LAST_NAME()
    {
        return stringField("CHECKOUT_LAST_NAME", "");
    }

    public final p CHECKOUT_PHONE()
    {
        return stringField("CHECKOUT_PHONE", "");
    }

    public final p CHECKOUT_PHONE_EXT()
    {
        return stringField("CHECKOUT_PHONE_EXT", "");
    }

    public final p OAUTH_JWT()
    {
        return stringField("OAUTH_JWT", "");
    }

    public final d UTILIZE_USER_INFO_FROM_CHECKOUT()
    {
        return booleanField("UTILIZE_USER_INFO_FROM_CHECKOUT", false);
    }

    public final p deliveryAddress()
    {
        return stringField("deliveryAddress", "");
    }

    public final DominosPrefsEditor_ edit()
    {
        return new DominosPrefsEditor_(getSharedPreferences());
    }

    public final d extraAnonymousCardUsed()
    {
        return booleanField("extraAnonymousCardUsed", false);
    }

    public final d firstTimePebbleDetected()
    {
        return booleanField("firstTimePebbleDetected", false);
    }

    public final p googleWalletState()
    {
        return stringField("googleWalletState", "not_authorized");
    }

    public final k oAuthLastAccessTime()
    {
        return longField("oAuthLastAccessTime", 0L);
    }

    public final d orderPlacedRemove()
    {
        return booleanField("orderPlacedRemove", false);
    }

    public final p ratedAppVersion()
    {
        return stringField("ratedAppVersion", "");
    }

    public final p rememberMeCookieValue()
    {
        return stringField("rememberMeCookieValue", "");
    }

    public final d saveCurrentUser()
    {
        return booleanField("saveCurrentUser", false);
    }

    public final p shopRunnerMemberToken()
    {
        return stringField("shopRunnerMemberToken", "");
    }

    public final d triggredWearIntro()
    {
        return booleanField("triggredWearIntro", false);
    }

    private class DominosPrefsEditor_ extends e
    {

        public final o CHECKOUT_EMAIL()
        {
            return stringField("CHECKOUT_EMAIL");
        }

        public final o CHECKOUT_FIRST_NAME()
        {
            return stringField("CHECKOUT_FIRST_NAME");
        }

        public final o CHECKOUT_LAST_NAME()
        {
            return stringField("CHECKOUT_LAST_NAME");
        }

        public final o CHECKOUT_PHONE()
        {
            return stringField("CHECKOUT_PHONE");
        }

        public final o CHECKOUT_PHONE_EXT()
        {
            return stringField("CHECKOUT_PHONE_EXT");
        }

        public final o OAUTH_JWT()
        {
            return stringField("OAUTH_JWT");
        }

        public final c UTILIZE_USER_INFO_FROM_CHECKOUT()
        {
            return booleanField("UTILIZE_USER_INFO_FROM_CHECKOUT");
        }

        public final o deliveryAddress()
        {
            return stringField("deliveryAddress");
        }

        public final c extraAnonymousCardUsed()
        {
            return booleanField("extraAnonymousCardUsed");
        }

        public final c firstTimePebbleDetected()
        {
            return booleanField("firstTimePebbleDetected");
        }

        public final o googleWalletState()
        {
            return stringField("googleWalletState");
        }

        public final j oAuthLastAccessTime()
        {
            return longField("oAuthLastAccessTime");
        }

        public final c orderPlacedRemove()
        {
            return booleanField("orderPlacedRemove");
        }

        public final o ratedAppVersion()
        {
            return stringField("ratedAppVersion");
        }

        public final o rememberMeCookieValue()
        {
            return stringField("rememberMeCookieValue");
        }

        public final c saveCurrentUser()
        {
            return booleanField("saveCurrentUser");
        }

        public final o shopRunnerMemberToken()
        {
            return stringField("shopRunnerMemberToken");
        }

        public final c triggredWearIntro()
        {
            return booleanField("triggredWearIntro");
        }

        DominosPrefsEditor_(SharedPreferences sharedpreferences)
        {
            super(sharedpreferences);
        }
    }

}

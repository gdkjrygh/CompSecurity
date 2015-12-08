// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;

import android.content.SharedPreferences;
import org.androidannotations.api.c.c;
import org.androidannotations.api.c.e;
import org.androidannotations.api.c.j;
import org.androidannotations.api.c.o;

public final class  extends e
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

    (SharedPreferences sharedpreferences)
    {
        super(sharedpreferences);
    }
}

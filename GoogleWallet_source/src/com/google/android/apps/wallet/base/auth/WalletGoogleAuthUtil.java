// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.auth;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.UserRecoverableNotifiedException;
import java.io.IOException;
import java.util.List;

public class WalletGoogleAuthUtil
{

    private final Application application;

    public WalletGoogleAuthUtil(Application application1)
    {
        application = application1;
    }

    public final void clearToken(String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        GoogleAuthUtil.clearToken(application, s);
    }

    public final List getAccountChangeEvents(String s)
        throws GoogleAuthException, IOException
    {
        return GoogleAuthUtil.getAccountChangeEvents(application, 0, s);
    }

    public final String getToken(String s, String s1)
        throws UserRecoverableAuthException, IOException, GoogleAuthException
    {
        return GoogleAuthUtil.getToken(application, s, s1);
    }

    public final String getTokenWithNotification(String s, String s1, Bundle bundle)
        throws UserRecoverableNotifiedException, IOException, GoogleAuthException
    {
        return GoogleAuthUtil.getTokenWithNotification(application, s, s1, bundle);
    }
}

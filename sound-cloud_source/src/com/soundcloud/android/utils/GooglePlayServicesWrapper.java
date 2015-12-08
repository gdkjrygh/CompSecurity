// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class GooglePlayServicesWrapper
{

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    public GooglePlayServicesWrapper()
    {
    }

    public int isPlayServicesAvailable(Context context)
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
    }

    public boolean isUserRecoverableError(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }

    public void showUnrecoverableErrorDialog(Activity activity, int i)
    {
        GooglePlayServicesUtil.getErrorDialog(i, activity, 9000).show();
    }
}

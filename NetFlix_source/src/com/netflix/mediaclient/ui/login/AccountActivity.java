// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;

public abstract class AccountActivity extends NetflixActivity
{

    private static final String ACTION_FINISH_ACCOUNT_ACTIVITIES = "com.netflix.mediaclient.ui.login.ACTION_FINISH_ACCOUNT_ACTIVITIES";

    public AccountActivity()
    {
    }

    public static void finishAllAccountActivities(Context context)
    {
        context.sendBroadcast(new Intent("com.netflix.mediaclient.ui.login.ACTION_FINISH_ACCOUNT_ACTIVITIES"));
    }

    protected boolean hasUpAction()
    {
        return false;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        registerFinishReceiverWithAutoUnregister("com.netflix.mediaclient.ui.login.ACTION_FINISH_ACCOUNT_ACTIVITIES");
    }

    public void performUpAction()
    {
    }

    public boolean showMdxInMenu()
    {
        return false;
    }

    protected boolean showSettingsInMenu()
    {
        return false;
    }

    protected boolean showSignOutInMenu()
    {
        return false;
    }
}

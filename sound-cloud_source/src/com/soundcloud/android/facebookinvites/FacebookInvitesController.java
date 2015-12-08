// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesStorage

public class FacebookInvitesController extends DefaultActivityLightCycle
{

    private final FacebookInvitesStorage facebookInvitesStorage;

    public FacebookInvitesController(FacebookInvitesStorage facebookinvitesstorage)
    {
        facebookInvitesStorage = facebookinvitesstorage;
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        facebookInvitesStorage.setAppOpened();
    }

    public volatile void onNewIntent(Activity activity, Intent intent)
    {
        onNewIntent((AppCompatActivity)activity, intent);
    }

    public void onNewIntent(AppCompatActivity appcompatactivity, Intent intent)
    {
        facebookInvitesStorage.setAppOpened();
    }
}

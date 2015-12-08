// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.os.Bundle;
import android.os.UserManager;
import com.netflix.mediaclient.Log;
import java.util.ArrayList;

public class RestrictedProfilesReceiver extends BroadcastReceiver
{

    private static final String KEY_DISABLE_PROFILE_SWITCHING = "key_disable_profile_switching";
    private static final String TAG = "RestrictedProfilesReceiver";

    public RestrictedProfilesReceiver()
    {
    }

    public static boolean isProfileSwitchingDisabled(Context context)
    {
        return ((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName()).getBoolean("key_disable_profile_switching");
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!"android.intent.action.GET_RESTRICTION_ENTRIES".equals(s))
        {
            Log.w("RestrictedProfilesReceiver", (new StringBuilder()).append("Unknown action: ").append(s).toString());
            return;
        } else
        {
            Log.i("RestrictedProfilesReceiver", "Adding restriction to disable profile switching");
            intent = new RestrictionEntry("key_disable_profile_switching", intent.getBundleExtra("android.intent.extra.restrictions_bundle").getBoolean("key_disable_profile_switching", false));
            intent.setTitle(context.getString(0x7f0c01a7));
            context = new ArrayList();
            context.add(intent);
            intent = new Bundle();
            intent.putParcelableArrayList("android.intent.extra.restrictions_list", context);
            setResult(-1, null, intent);
            return;
        }
    }
}

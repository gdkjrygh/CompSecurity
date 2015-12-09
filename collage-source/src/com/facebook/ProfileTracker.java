// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook:
//            FacebookSdk, Profile

public abstract class ProfileTracker
{
    private class ProfileBroadcastReceiver extends BroadcastReceiver
    {

        final ProfileTracker this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED".equals(intent.getAction()))
            {
                context = (Profile)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE");
                intent = (Profile)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE");
                onCurrentProfileChanged(context, intent);
            }
        }

        private ProfileBroadcastReceiver()
        {
            this$0 = ProfileTracker.this;
            super();
        }

    }


    private final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
    private boolean isTracking;
    private final BroadcastReceiver receiver = new ProfileBroadcastReceiver();

    public ProfileTracker()
    {
        isTracking = false;
        Validate.sdkInitialized();
        startTracking();
    }

    private void addBroadcastReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        broadcastManager.registerReceiver(receiver, intentfilter);
    }

    public boolean isTracking()
    {
        return isTracking;
    }

    protected abstract void onCurrentProfileChanged(Profile profile, Profile profile1);

    public void startTracking()
    {
        if (isTracking)
        {
            return;
        } else
        {
            addBroadcastReceiver();
            isTracking = true;
            return;
        }
    }

    public void stopTracking()
    {
        if (!isTracking)
        {
            return;
        } else
        {
            broadcastManager.unregisterReceiver(receiver);
            isTracking = false;
            return;
        }
    }
}

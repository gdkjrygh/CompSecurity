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
//            FacebookSdk, AccessToken

public abstract class AccessTokenTracker
{
    private class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver
    {

        final AccessTokenTracker this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()))
            {
                context = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                intent = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                onCurrentAccessTokenChanged(context, intent);
            }
        }

        private CurrentAccessTokenBroadcastReceiver()
        {
            this$0 = AccessTokenTracker.this;
            super();
        }

    }


    private final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
    private boolean isTracking;
    private final BroadcastReceiver receiver = new CurrentAccessTokenBroadcastReceiver();

    public AccessTokenTracker()
    {
        isTracking = false;
        Validate.sdkInitialized();
        startTracking();
    }

    private void addBroadcastReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        broadcastManager.registerReceiver(receiver, intentfilter);
    }

    public boolean isTracking()
    {
        return isTracking;
    }

    protected abstract void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1);

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

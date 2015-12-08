// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AccessToken, AccessTokenTracker

class <init> extends BroadcastReceiver
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

    private I()
    {
        this$0 = AccessTokenTracker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

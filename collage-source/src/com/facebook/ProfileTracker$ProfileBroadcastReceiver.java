// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            ProfileTracker, Profile

private class <init> extends BroadcastReceiver
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

    private ()
    {
        this$0 = ProfileTracker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

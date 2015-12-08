// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Utility

final class _cls1 extends BroadcastReceiver
{

    public final void onReceive(final Context broadcastContext, Intent intent)
    {
        if (LikeActionController.access$200())
        {
            return;
        }
        intent = intent.getAction();
        class _cls1
            implements Runnable
        {

            final LikeActionController._cls4 this$0;
            final Context val$broadcastContext;
            final boolean val$shouldClearDisk;

            public void run()
            {
                if (shouldClearDisk)
                {
                    int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
                    broadcastContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
                    LikeActionController.access$400().clear();
                    LikeActionController.access$500().clearCache();
                }
                LikeActionController.access$600(broadcastContext, null, "com.facebook.sdk.LikeActionController.DID_RESET");
                boolean _tmp1 = LikeActionController.access$202(false);
            }

            _cls1()
            {
                this$0 = LikeActionController._cls4.this;
                shouldClearDisk = flag;
                broadcastContext = context;
                super();
            }
        }

        final boolean shouldClearDisk;
        if (Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", intent) || Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", intent))
        {
            shouldClearDisk = true;
        } else
        {
            shouldClearDisk = false;
        }
        boolean _tmp = LikeActionController.access$202(true);
        LikeActionController.access$700().postDelayed(new _cls1(), 100L);
    }

    _cls1()
    {
    }
}

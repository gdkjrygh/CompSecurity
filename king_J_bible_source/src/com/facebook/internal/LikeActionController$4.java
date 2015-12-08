// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Utility, FileLruCache

class _cls1.val.broadcastContext extends BroadcastReceiver
{

    public void onReceive(final Context broadcastContext, Intent intent)
    {
        if (LikeActionController.access$13())
        {
            return;
        }
        intent = intent.getAction();
        final boolean shouldClearDisk;
        if (!Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", intent) && !Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", intent))
        {
            shouldClearDisk = false;
        } else
        {
            shouldClearDisk = true;
        }
        LikeActionController.access$14(true);
        LikeActionController.access$15().postDelayed(new Runnable() {

            final LikeActionController._cls4 this$1;
            private final Context val$broadcastContext;
            private final boolean val$shouldClearDisk;

            public void run()
            {
                if (shouldClearDisk)
                {
                    LikeActionController.access$17((LikeActionController.access$16() + 1) % 1000);
                    broadcastContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$16()).apply();
                    LikeActionController.access$8().clear();
                    LikeActionController.access$18().clearCache();
                }
                LikeActionController.access$19(broadcastContext, null, "com.facebook.sdk.LikeActionController.DID_RESET");
                LikeActionController.access$14(false);
            }

            
            {
                this$1 = LikeActionController._cls4.this;
                shouldClearDisk = flag;
                broadcastContext = context;
                super();
            }
        }, 100L);
    }

    _cls1.val.broadcastContext()
    {
    }
}

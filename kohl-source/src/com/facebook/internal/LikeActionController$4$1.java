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
//            LikeActionController, FileLruCache, Utility

class val.shouldClearDisk
    implements Runnable
{

    final ss._cls202 this$0;
    final boolean val$shouldClearDisk;

    public void run()
    {
        if (val$shouldClearDisk)
        {
            int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
            LikeActionController.access$400().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
            LikeActionController.access$500().clear();
            LikeActionController.access$600().clearCache();
        }
        LikeActionController.access$700(null, "com.facebook.sdk.LikeActionController.DID_RESET");
        boolean _tmp1 = LikeActionController.access$202(false);
    }

    ()
    {
        this$0 = final_;
        val$shouldClearDisk = Z.this;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$4

/* anonymous class */
    static final class LikeActionController._cls4 extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (LikeActionController.access$200())
            {
                return;
            }
            context = intent.getAction();
            boolean flag;
            if (Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", context) || Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", context))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean _tmp = LikeActionController.access$202(true);
            LikeActionController.access$800().postDelayed(flag. new LikeActionController._cls4._cls1(), 100L);
        }

    }

}

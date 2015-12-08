// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, FileLruCache

class val.broadcastContext
    implements Runnable
{

    final ss._cls202 this$0;
    final Context val$broadcastContext;
    final boolean val$shouldClearDisk;

    public void run()
    {
        if (val$shouldClearDisk)
        {
            int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
            val$broadcastContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
            LikeActionController.access$400().clear();
            LikeActionController.access$500().clearCache();
        }
        LikeActionController.access$600(val$broadcastContext, null, "com.facebook.sdk.LikeActionController.DID_RESET");
        boolean _tmp1 = LikeActionController.access$202(false);
    }

    ()
    {
        this$0 = final_;
        val$shouldClearDisk = flag;
        val$broadcastContext = Context.this;
        super();
    }
}

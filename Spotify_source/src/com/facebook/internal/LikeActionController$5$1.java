// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import apt;
import arp;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class b
    implements Runnable
{

    private boolean a;
    private Context b;

    public final void run()
    {
        if (a)
        {
            LikeActionController.a((LikeActionController.d() + 1) % 1000);
            b.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.d()).apply();
            LikeActionController.e().clear();
            LikeActionController.f().a();
        }
        LikeActionController.a(b, "com.facebook.sdk.LikeActionController.DID_RESET");
        LikeActionController.b(false);
    }

    (boolean flag, Context context)
    {
        a = flag;
        b = context;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$5

/* anonymous class */
    final class LikeActionController._cls5 extends BroadcastReceiver
    {

        public final void onReceive(Context context, Intent intent)
        {
            if (LikeActionController.c())
            {
                return;
            }
            intent = intent.getAction();
            boolean flag;
            if (arp.a("com.facebook.sdk.ACTIVE_SESSION_UNSET", intent) || arp.a("com.facebook.sdk.ACTIVE_SESSION_CLOSED", intent))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            LikeActionController.b(true);
            LikeActionController.g().postDelayed(new LikeActionController._cls5._cls1(flag, context), 100L);
        }

    }

}

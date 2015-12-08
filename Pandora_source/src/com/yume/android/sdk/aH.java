// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.yume.android.sdk:
//            YuMeBSPException, YuMePlayerException, YuMeSDKInterfaceImpl, M, 
//            YuMeBSPInterface, YuMePlayerInterface, p, q, 
//            YuMeStorageMode, U, YuMeAdParams

final class aH extends BroadcastReceiver
{

    aH()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null)
        {
            YuMeSDKInterfaceImpl.a.b((new StringBuilder("Notifying Broadcast Event: ")).append(context).append(" to BSP & Player.").toString());
            try
            {
                YuMeSDKInterfaceImpl.d.YuMeBSP_HandleBroadcastEvent(context);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
            }
            try
            {
                YuMeSDKInterfaceImpl.e.YuMePlayer_HandleBroadcastEvent(context);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
            }
            if (context.equalsIgnoreCase("android.intent.action.MEDIA_REMOVED") || context.equalsIgnoreCase("android.intent.action.MEDIA_UNMOUNTED") || context.equalsIgnoreCase("android.intent.action.MEDIA_BAD_REMOVAL") || context.equalsIgnoreCase("android.intent.action.MEDIA_EJECT") || context.equalsIgnoreCase("android.intent.action.MEDIA_SHARED"))
            {
                if (YuMeSDKInterfaceImpl.k.f().e != YuMeStorageMode.NONE)
                {
                    YuMeSDKInterfaceImpl.i.o();
                }
                YuMeSDKInterfaceImpl.a.c();
                YuMeSDKInterfaceImpl.a.a(false);
            } else
            if (context.equalsIgnoreCase("android.intent.action.MEDIA_MOUNTED"))
            {
                YuMeSDKInterfaceImpl.a.b((new StringBuilder("Handling Broadcast Event: ")).append(context).toString());
                if (YuMeSDKInterfaceImpl.b.bEnableFileLogging.booleanValue())
                {
                    YuMeSDKInterfaceImpl.a.a(true);
                    YuMeSDKInterfaceImpl.a.a(YuMeSDKInterfaceImpl.a());
                }
                if (YuMeSDKInterfaceImpl.k.f().e != YuMeStorageMode.NONE)
                {
                    YuMeSDKInterfaceImpl.i.b(YuMeSDKInterfaceImpl.i.a);
                    return;
                }
            }
        }
    }
}

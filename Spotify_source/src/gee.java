// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LockScreenController;
import java.lang.ref.WeakReference;

public final class gee extends BroadcastReceiver
{

    private LockScreenController a;

    private gee(LockScreenController lockscreencontroller)
    {
        a = lockscreencontroller;
        super();
    }

    public gee(LockScreenController lockscreencontroller, byte byte0)
    {
        this(lockscreencontroller);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag = intent.getBooleanExtra("lockscreen_required", false);
        intent.getStringExtra("sender_id");
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        LockScreenController.a(a, com.spotify.mobile.android.util.LockScreenController.State.b);
        LockScreenController.a(a, intent.getIntExtra("logo_resource_id", -1));
        LockScreenController.a(a, intent.getBooleanExtra("dismissible_lockscreen", false));
        if (LockScreenController.a(a).get() != null)
        {
            LockScreenController.a(context, LockScreenController.b(a), LockScreenController.c(a));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        LockScreenController.a(a, com.spotify.mobile.android.util.LockScreenController.State.a);
        context = (Activity)LockScreenController.a(a).get();
        if (LockScreenController.a(context))
        {
            context.finish();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}

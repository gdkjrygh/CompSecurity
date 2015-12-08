// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto.activities;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.cardinalblue.android.piccollage.a.g;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto.activities:
//            MainActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        MainActivity mainactivity = (MainActivity)a.get();
        message.what;
        JVM INSTR tableswitch 1 1: default 32
    //                   1 38;
           goto _L1 _L2
_L1:
        super.handleMessage(message);
_L4:
        return;
_L2:
        if (mainactivity != null)
        {
            message = new Intent(mainactivity, com/cardinalblue/android/piccollage/activities/HomeActivity);
            g.a(message, mainactivity.getIntent().getExtras());
            mainactivity.startActivity(message);
            mainactivity.finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Y(MainActivity mainactivity)
    {
        a = new WeakReference(mainactivity);
    }
}

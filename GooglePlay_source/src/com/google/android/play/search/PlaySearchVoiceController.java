// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchController

public final class PlaySearchVoiceController extends BroadcastReceiver
{

    static final Intent sVoiceIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    private final PlaySearchController mController;
    boolean mRegistered;

    public PlaySearchVoiceController(PlaySearchController playsearchcontroller)
    {
        mController = playsearchcontroller;
    }

    public static boolean canPerformVoiceSearch(Context context)
    {
        boolean flag = false;
        if (context.getPackageManager().queryIntentActivities(sVoiceIntent, 0).size() > 0)
        {
            flag = true;
        }
        return flag;
    }

    final void cancelPendingVoiceSearch(Context context)
    {
        if (mRegistered)
        {
            context.unregisterReceiver(this);
            mRegistered = false;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (intent != null && !intent.isEmpty())
        {
            mController.setQueryInternal((String)intent.get(0), true);
        }
        cancelPendingVoiceSearch(context);
    }

}

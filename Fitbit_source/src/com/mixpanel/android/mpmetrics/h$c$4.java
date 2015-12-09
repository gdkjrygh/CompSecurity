// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import com.mixpanel.android.util.a;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            h, UpdateDisplayState, g, InAppNotification, 
//            c, f

class b
    implements Runnable
{

    final InAppNotification a;
    final Activity b;
    final otification c;

    public void run()
    {
        ReentrantLock reentrantlock;
        reentrantlock = com.mixpanel.android.mpmetrics.UpdateDisplayState.a();
        reentrantlock.lock();
        if (!UpdateDisplayState.b())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
        }
        reentrantlock.unlock();
        return;
        InAppNotification inappnotification = a;
        if (inappnotification != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        inappnotification = c.c();
        if (inappnotification != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "No notification available, will not show.");
        }
        reentrantlock.unlock();
        return;
        otification.Type type;
        type = inappnotification.e();
        if (type != otification.Type.c || com.mixpanel.android.mpmetrics.c.c(b.getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
        }
        reentrantlock.unlock();
        return;
        int i = com.mixpanel.android.mpmetrics.UpdateDisplayState.a(new DisplayState.DisplayState.InAppNotificationState(inappnotification, com.mixpanel.android.util.a.a(b)), c.c(), h.i(c.c));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
        reentrantlock.unlock();
        return;
        com.mixpanel.android.mpmetrics.ock.unlock[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 457
    //                   1 263
    //                   2 389;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_389;
_L1:
        Log.e("MixpanelAPI.API", (new StringBuilder()).append("Unrecognized notification type ").append(type).append(" can't be shown").toString());
_L4:
        if (!h.e(c.c).i())
        {
            c.c(inappnotification);
        }
        reentrantlock.unlock();
        return;
_L2:
        Object obj = UpdateDisplayState.b(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
        }
        reentrantlock.unlock();
        return;
        f f1 = new f();
        f1.a(c.c, i, (DisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj)).c());
        f1.setRetainInstance(true);
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
        }
        obj = b.getFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj)).setCustomAnimations(0, com.mixpanel.android..com_mixpanel_android_slide_down);
        ((FragmentTransaction) (obj)).add(0x1020002, f1);
        ((FragmentTransaction) (obj)).commit();
          goto _L4
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
        if (g.b)
        {
            Log.v("MixpanelAPI.API", "Sending intent for takeover notification.");
        }
        Intent intent = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
        b.startActivity(intent);
          goto _L4
    }

    otification(otification otification, InAppNotification inappnotification, Activity activity)
    {
        c = otification;
        a = inappnotification;
        b = activity;
        super();
    }
}

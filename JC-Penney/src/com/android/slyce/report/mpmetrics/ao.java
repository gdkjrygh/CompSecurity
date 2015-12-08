// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;
import com.android.a.b;
import com.android.slyce.report.b.a;
import com.android.slyce.report.surveys.k;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            UpdateDisplayState, ab, al, InAppNotification, 
//            x, k, af, ai, 
//            q

class ao
    implements Runnable
{

    final InAppNotification a;
    final Activity b;
    final al c;

    ao(al al1, InAppNotification inappnotification, Activity activity)
    {
        c = al1;
        a = inappnotification;
        b = activity;
        super();
    }

    public void run()
    {
        ReentrantLock reentrantlock;
        reentrantlock = com.android.slyce.report.mpmetrics.UpdateDisplayState.a();
        reentrantlock.lock();
        if (!com.android.slyce.report.mpmetrics.UpdateDisplayState.b())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "DisplayState is locked, will not show notifications.");
        }
        reentrantlock.unlock();
        return;
        InAppNotification inappnotification = a;
        if (inappnotification != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        inappnotification = c.a();
        if (inappnotification != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "No notification available, will not show.");
        }
        reentrantlock.unlock();
        return;
        x x1;
        x1 = inappnotification.d();
        if (x1 != x.c || com.android.slyce.report.mpmetrics.k.b(b.getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Application is not configured to show takeover notifications, none will be shown.");
        }
        reentrantlock.unlock();
        return;
        int i = com.android.slyce.report.mpmetrics.UpdateDisplayState.a(new UpdateDisplayState.DisplayState.InAppNotificationState(inappnotification, com.android.slyce.report.b.a.a(b)), c.c(), af.f(c.a));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        Log.e("MixpanelAPI.MixpanelAPI", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
        reentrantlock.unlock();
        return;
        com.android.slyce.report.mpmetrics.ai.a[x1.ordinal()];
        JVM INSTR tableswitch 1 2: default 457
    //                   1 263
    //                   2 389;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_389;
_L1:
        Log.e("MixpanelAPI.MixpanelAPI", (new StringBuilder()).append("Unrecognized notification type ").append(x1).append(" can't be shown").toString());
_L4:
        if (!af.e(c.a).h())
        {
            c.a(inappnotification);
        }
        reentrantlock.unlock();
        return;
_L2:
        Object obj = com.android.slyce.report.mpmetrics.UpdateDisplayState.b(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Notification's display proposal was already consumed, no notification will be shown.");
        }
        reentrantlock.unlock();
        return;
        q q1 = new q();
        q1.a(c.a, i, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj)).c());
        q1.setRetainInstance(true);
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Attempting to show mini notification.");
        }
        obj = b.getFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj)).setCustomAnimations(0, b.com_mixpanel_android_slide_down);
        ((FragmentTransaction) (obj)).add(0x1020002, q1);
        ((FragmentTransaction) (obj)).commit();
          goto _L4
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
        if (com.android.slyce.report.mpmetrics.ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Sending intent for takeover notification.");
        }
        Intent intent = new Intent(b.getApplicationContext(), com/android/slyce/report/surveys/k);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
        b.startActivity(intent);
          goto _L4
    }
}

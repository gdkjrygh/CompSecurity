// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.mixpanel.android.a.a;
import com.mixpanel.android.surveys.SurveyActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, v, t, h, 
//            InAppNotification, f, k

final class aa
    implements Runnable
{

    final InAppNotification a = null;
    final Activity b;
    final v.c c;

    aa(v.c c1, Activity activity)
    {
        c = c1;
        b = activity;
        super();
    }

    public final void run()
    {
        ReentrantLock reentrantlock;
        reentrantlock = com.mixpanel.android.mpmetrics.UpdateDisplayState.a();
        reentrantlock.lock();
        boolean flag = UpdateDisplayState.b();
        if (flag)
        {
            reentrantlock.unlock();
            return;
        }
        Object obj = a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = c;
        flag = ((v.c) (obj)).a.d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = null;
_L1:
        if (obj == null)
        {
            reentrantlock.unlock();
            return;
        }
        break MISSING_BLOCK_LABEL_86;
        obj = v.b(((v.c) (obj)).a).b(v.e(((v.c) (obj)).a).e());
          goto _L1
        Object obj1;
        obj1 = ((InAppNotification) (obj)).c();
        if (obj1 != InAppNotification.a.c)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        flag = com.mixpanel.android.mpmetrics.f.a(b.getApplicationContext());
        if (!flag)
        {
            reentrantlock.unlock();
            return;
        }
        Object obj2 = b;
        int i = 0xff000000;
        obj2 = com.mixpanel.android.a.a.a(((Activity) (obj2)), 1, 1, false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        i = ((Bitmap) (obj2)).getPixel(0, 0);
        i = com.mixpanel.android.mpmetrics.UpdateDisplayState.a(new UpdateDisplayState.DisplayState.InAppNotificationState(((InAppNotification) (obj)), com.mixpanel.android.a.a.a(i)), c.b(), v.c(c.a));
        if (i <= 0)
        {
            reentrantlock.unlock();
            return;
        }
        com.mixpanel.android.mpmetrics.v._cls1.a[((InAppNotification.a) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 2: default 536
    //                   1 380
    //                   2 462;
           goto _L2 _L3 _L4
_L2:
        Log.e("MixpanelAPI", (new StringBuilder("Unrecognized notification type ")).append(obj1).append(" can't be shown").toString());
_L7:
        if (v.e(c.a).e()) goto _L6; else goto _L5
_L5:
        SimpleDateFormat simpledateformat;
        c.a.a("$campaign_delivery", ((InAppNotification) (obj)).a());
        obj1 = c.a.c().b(c.b());
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        obj2 = ((InAppNotification) (obj)).a();
        ((JSONObject) (obj2)).put("$time", simpledateformat.format(new Date()));
_L8:
        ((v.b) (obj1)).a("$campaigns", Integer.valueOf(((InAppNotification) (obj)).b()));
        ((v.b) (obj1)).a("$notifications", obj2);
_L6:
        reentrantlock.unlock();
        return;
_L3:
        Object obj3 = UpdateDisplayState.b(i);
        k k1 = new k();
        k1.a(i, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj3)).c());
        k1.setRetainInstance(true);
        obj3 = b.getFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj3)).setCustomAnimations(0, com.mixpanel.android.a.a.b);
        ((FragmentTransaction) (obj3)).add(0x1020002, k1);
        ((FragmentTransaction) (obj3)).commit();
          goto _L7
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
_L4:
        Intent intent = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
        b.startActivity(intent);
          goto _L7
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI", "Exception trying to track an in app notification seen", jsonexception);
          goto _L8
    }
}

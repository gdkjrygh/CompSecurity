// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.a.e;
import android.telephony.TelephonyManager;
import com.facebook.c.s;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.push.mqtt.v;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb, ax, a, ai, 
//            aj

class av extends d
{

    final ai a;

    private av(ai ai)
    {
        a = ai;
        super();
    }

    av(ai ai, aj aj)
    {
        this(ai);
    }

    public bb a()
    {
        return new bb((Context)e().a(android/content/Context), (s)a(com/facebook/c/s), (ax)a(com/facebook/orca/fbwebrtc/ax), (v)a(com/facebook/push/mqtt/v), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.orca.fbwebrtc.a)a(com/facebook/orca/fbwebrtc/a), (AudioManager)e().a(android/media/AudioManager), (Vibrator)e().a(android/os/Vibrator), (TelephonyManager)e().a(android/telephony/TelephonyManager), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThread), (a)a(com/facebook/common/time/a), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (e)a(android/support/v4/a/e), (Handler)a(android/os/Handler, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}

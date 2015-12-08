// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.sensors.proxies.camera.ImageSequenceCamera;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.unveil:
//            UnveilSettings, TrackingTestActivity, h

public class TrackingSequenceActivity extends Activity
{

    private final af a = new af();
    private boolean b;
    private String c;
    private float d;
    private float e;
    private int f;

    public TrackingSequenceActivity()
    {
    }

    static float a(TrackingSequenceActivity trackingsequenceactivity)
    {
        trackingsequenceactivity.d = 0.0F;
        return 0.0F;
    }

    static String a(TrackingSequenceActivity trackingsequenceactivity, String s)
    {
        trackingsequenceactivity.c = s;
        return s;
    }

    private static String a(String s, String s1)
    {
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("=").append(s1).toString();
    }

    static float b(TrackingSequenceActivity trackingsequenceactivity)
    {
        trackingsequenceactivity.e = 0.0F;
        return 0.0F;
    }

    static void b(TrackingSequenceActivity trackingsequenceactivity, String s)
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(a("image_sequence_directory", s));
        ((ArrayList) (obj)).add(a("lockstep_callbacks", "true"));
        ((ArrayList) (obj)).add(a("skip_rendering", "false"));
        s = TextUtils.join(",", ((Iterable) (obj)));
        obj = String.valueOf(com/google/android/apps/unveil/sensors/proxies/camera/ImageSequenceCamera.getSimpleName());
        s = new UnveilSettings(0x7fffffff, (new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(s).length())).append(((String) (obj))).append("[").append(s).append("]").toString(), null, null, false, false, true, true);
        obj = new Intent();
        ((Intent) (obj)).putExtra("UnveilSettings", s);
        ((Intent) (obj)).setClass(trackingsequenceactivity.getApplicationContext(), com/google/android/apps/unveil/TrackingTestActivity);
        trackingsequenceactivity.startActivityForResult(((Intent) (obj)), 42);
    }

    static int c(TrackingSequenceActivity trackingsequenceactivity)
    {
        trackingsequenceactivity.f = 0;
        return 0;
    }

    static String d(TrackingSequenceActivity trackingsequenceactivity)
    {
        return trackingsequenceactivity.c;
    }

    static af e(TrackingSequenceActivity trackingsequenceactivity)
    {
        return trackingsequenceactivity.a;
    }

    static boolean f(TrackingSequenceActivity trackingsequenceactivity)
    {
        trackingsequenceactivity.b = false;
        return false;
    }

    static void g(TrackingSequenceActivity trackingsequenceactivity)
    {
        trackingsequenceactivity;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = trackingsequenceactivity.b;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        trackingsequenceactivity.wait();
          goto _L1
        Object obj;
        obj;
        trackingsequenceactivity.a.e("Exception!", new Object[] {
            obj
        });
          goto _L1
        obj;
        trackingsequenceactivity;
        JVM INSTR monitorexit ;
        throw obj;
        trackingsequenceactivity.b = false;
        trackingsequenceactivity;
        JVM INSTR monitorexit ;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 42)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        this;
        JVM INSTR monitorenter ;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        b = true;
        float f1 = intent.getFloatExtra("performance_key", -1F);
        float f2 = intent.getFloatExtra("cpu_key", -1F);
        d = d + f1;
        e = e + f2;
        f = f + 1;
        a.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>> Finished sequence %4d %80s! Score: %1.4f score (%1.4f running average), %6.3f ms/frame (%6.3f running average)", new Object[] {
            Integer.valueOf(f), c, Float.valueOf(f1), Float.valueOf(d / (float)f), Float.valueOf(f2), Float.valueOf(e / (float)f)
        });
        notify();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        a.e("Failure on sequence %s", new Object[] {
            c
        });
        setResult(0);
        finish();
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new Thread(new h(this))).start();
    }
}

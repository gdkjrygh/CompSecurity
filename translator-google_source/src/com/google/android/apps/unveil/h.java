// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.util.Pair;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.sensors.proxies.camera.ImageSequenceCamera;

// Referenced classes of package com.google.android.apps.unveil:
//            TrackingSequenceActivity

final class h
    implements Runnable
{

    final TrackingSequenceActivity a;

    h(TrackingSequenceActivity trackingsequenceactivity)
    {
        a = trackingsequenceactivity;
        super();
    }

    public final void run()
    {
        Pair apair[] = ImageSequenceCamera.getImageSequenceDirectories(a);
        TrackingSequenceActivity.a(a);
        TrackingSequenceActivity.b(a);
        TrackingSequenceActivity.c(a);
        int j = apair.length;
        for (int i = 0; i < j; i++)
        {
            Pair pair = apair[i];
            TrackingSequenceActivity.a(a, (String)pair.second);
            if (!((String)pair.second).startsWith("asset"))
            {
                TrackingSequenceActivity.e(a).b("<<<<<<<<<<<< EVALUATING %s >>>>>>>>>>>>>>", new Object[] {
                    TrackingSequenceActivity.d(a)
                });
                TrackingSequenceActivity.f(a);
                TrackingSequenceActivity.b(a, TrackingSequenceActivity.d(a));
                TrackingSequenceActivity.g(a);
            }
        }

        a.setResult(-1);
        a.finish();
    }
}

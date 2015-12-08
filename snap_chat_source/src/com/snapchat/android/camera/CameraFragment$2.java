// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import com.snapchat.android.analytics.CameraEventAnalytics;
import qX;
import qZ;

// Referenced classes of package com.snapchat.android.camera:
//            CameraFragment, TakeSnapButtonTouchIntent

final class a
    implements Runnable
{

    private CameraFragment a;

    public final void run()
    {
        if (a.g.e)
        {
            qZ qz = a.g;
            if (!qZ.f())
            {
                CameraFragment.b(a);
                return;
            }
        }
        CameraEventAnalytics cameraeventanalytics = CameraFragment.a(a);
        boolean flag = CameraFragment.c(a).c;
        String s;
        if (CameraFragment.c(a).b())
        {
            s = CameraFragment.c(a).c();
        } else
        {
            s = null;
        }
        cameraeventanalytics.a(flag, s);
        a.k.a = chIntent.MediaCaptureType.VIDEO;
        a.w();
    }

    chIntent(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }
}

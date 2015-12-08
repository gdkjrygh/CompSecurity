// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import Gt;
import PG;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import fP;
import gc;
import lk;
import qX;

// Referenced classes of package com.snapchat.android.camera:
//            CameraFragment

final class a
    implements Runnable
{

    private rdEventLogger.a a;

    public final void run()
    {
        if (a.a.h() && !a.a.a.c && !a.a.x())
        {
            lk lk1 = CameraFragment.d(a.a);
            if (lk1.mLensInitializationMetric != null)
            {
                lk1.mLensInitializationMetric.b(false);
                lk1.mLensInitializationMetric = null;
                lk1.mFaceTappedCount = 0;
            }
            a.a.o();
            lk1 = CameraFragment.d(a.a);
            long l = CameraFragment.e(a.a).getCount() - 1;
            long l1 = CameraFragment.e(a.a).b;
            long l2 = CameraFragment.e(a.a).c;
            gc gc1 = lk.d();
            gc1.withFilterLensSwipe = Boolean.valueOf(true);
            gc1.filterLensCount = Long.valueOf(l);
            gc1.filterGeolensCount = Long.valueOf(l1);
            gc1.filterLensStoreCount = Long.valueOf(l2);
            lk1.mBlizzardEventLogger.a(gc1);
            lk.c();
        }
    }

    rdEventLogger(rdEventLogger rdeventlogger)
    {
        a = rdeventlogger;
        super();
    }

    // Unreferenced inner class com/snapchat/android/camera/CameraFragment$5

/* anonymous class */
    final class CameraFragment._cls5
        implements fP
    {

        final CameraFragment a;

        public final void a(boolean flag)
        {
            if (!flag)
            {
                lk lk1 = CameraFragment.d(a);
                gc gc1 = lk.d();
                gc1.withFilterLensSwipe = Boolean.valueOf(false);
                gc1.filterLensCount = Long.valueOf(0L);
                gc1.filterGeolensCount = Long.valueOf(0L);
                gc1.filterLensStoreCount = Long.valueOf(0L);
                lk1.mBlizzardEventLogger.a(gc1);
                lk.c();
                return;
            } else
            {
                PG.a(new CameraFragment._cls5._cls1(this));
                return;
            }
        }

            
            {
                a = camerafragment;
                super();
            }
    }

}

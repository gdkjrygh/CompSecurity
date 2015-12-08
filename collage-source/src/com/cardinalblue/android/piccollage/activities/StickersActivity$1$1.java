// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;
import com.supersonic.mediationsdk.logger.SupersonicError;
import com.supersonic.mediationsdk.model.Placement;
import com.supersonic.mediationsdk.sdk.RewardedVideoListener;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

class a
    implements Callable
{

    final boolean a;
    final a b;

    public Object call()
        throws Exception
    {
        StickersActivity.a(b.b, a);
        d.a().c(new nit>(a));
        return null;
    }

    I(I i, boolean flag)
    {
        b = i;
        a = flag;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/StickersActivity$1

/* anonymous class */
    class StickersActivity._cls1
        implements RewardedVideoListener
    {

        final StickersActivity a;

        public void onRewardedVideoAdClosed()
        {
        }

        public void onRewardedVideoAdOpened()
        {
        }

        public void onRewardedVideoAdRewarded(Placement placement)
        {
            StickersActivity.a(placement);
        }

        public void onRewardedVideoInitFail(SupersonicError supersonicerror)
        {
            f.a(new Exception(supersonicerror.getErrorMessage()));
        }

        public void onRewardedVideoInitSuccess()
        {
        }

        public void onRewardedVideoShowFail(SupersonicError supersonicerror)
        {
            f.a(new Exception(supersonicerror.getErrorMessage()));
        }

        public void onVideoAvailabilityChanged(boolean flag)
        {
            j.a(new StickersActivity._cls1._cls1(this, flag), j.b);
        }

        public void onVideoEnd()
        {
        }

        public void onVideoStart()
        {
        }

            
            {
                a = stickersactivity;
                super();
            }
    }

}

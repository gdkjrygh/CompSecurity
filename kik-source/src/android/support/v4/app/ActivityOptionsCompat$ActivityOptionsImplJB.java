// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            ActivityOptionsCompat, ActivityOptionsCompatJB

private static class mImpl extends ActivityOptionsCompat
{

    private final ActivityOptionsCompatJB mImpl;

    public Bundle toBundle()
    {
        return mImpl.toBundle();
    }

    public void update(ActivityOptionsCompat activityoptionscompat)
    {
        if (activityoptionscompat instanceof mImpl)
        {
            activityoptionscompat = (mImpl)activityoptionscompat;
            mImpl.update(((mImpl) (activityoptionscompat)).mImpl);
        }
    }

    (ActivityOptionsCompatJB activityoptionscompatjb)
    {
        mImpl = activityoptionscompatjb;
    }
}

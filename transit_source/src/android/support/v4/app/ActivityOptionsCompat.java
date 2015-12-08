// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            ActivityOptionsCompatJB

public class ActivityOptionsCompat
{
    private static class ActivityOptionsImplJB extends ActivityOptionsCompat
    {

        private final ActivityOptionsCompatJB mImpl;

        public Bundle toBundle()
        {
            return mImpl.toBundle();
        }

        public void update(ActivityOptionsCompat activityoptionscompat)
        {
            if (activityoptionscompat instanceof ActivityOptionsImplJB)
            {
                activityoptionscompat = (ActivityOptionsImplJB)activityoptionscompat;
                mImpl.update(((ActivityOptionsImplJB) (activityoptionscompat)).mImpl);
            }
        }

        ActivityOptionsImplJB(ActivityOptionsCompatJB activityoptionscompatjb)
        {
            mImpl = activityoptionscompatjb;
        }
    }


    protected ActivityOptionsCompat()
    {
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeCustomAnimation(context, i, j));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeScaleUpAnimation(view, i, j, k, l));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(view, bitmap, i, j));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public Bundle toBundle()
    {
        return null;
    }

    public void update(ActivityOptionsCompat activityoptionscompat)
    {
    }
}

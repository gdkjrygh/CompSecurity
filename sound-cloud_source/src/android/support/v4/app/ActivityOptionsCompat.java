// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            ActivityOptionsCompatJB, ActivityOptionsCompat21

public class ActivityOptionsCompat
{
    private static class ActivityOptionsImpl21 extends ActivityOptionsCompat
    {

        private final ActivityOptionsCompat21 mImpl;

        public Bundle toBundle()
        {
            return mImpl.toBundle();
        }

        public void update(ActivityOptionsCompat activityoptionscompat)
        {
            if (activityoptionscompat instanceof ActivityOptionsImpl21)
            {
                activityoptionscompat = (ActivityOptionsImpl21)activityoptionscompat;
                mImpl.update(((ActivityOptionsImpl21) (activityoptionscompat)).mImpl);
            }
        }

        ActivityOptionsImpl21(ActivityOptionsCompat21 activityoptionscompat21)
        {
            mImpl = activityoptionscompat21;
        }
    }

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

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, view, s));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, Pair apair[])
    {
        View aview[] = null;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            if (apair != null)
            {
                aview = new View[apair.length];
                String as[] = new String[apair.length];
                for (int i = 0; i < apair.length; i++)
                {
                    aview[i] = (View)apair[i].first;
                    as[i] = (String)apair[i].second;
                }

                apair = as;
            } else
            {
                Object obj = null;
                apair = aview;
                aview = obj;
            }
            return new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, aview, apair));
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

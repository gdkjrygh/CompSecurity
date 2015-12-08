// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            TourDetailFragment

class this._cls0
    implements com.nirhart.parallaxscroll.views.ScrollListener
{

    final TourDetailFragment this$0;

    public void onScrollReachedEnd(boolean flag)
    {
        if (flag)
        {
            Utils.logger(TourDetailFragment.access$300(), "make the start tour button bigger");
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(TourDetailFragment.access$400(TourDetailFragment.this), "scaleY", new float[] {
                1.3F
            });
            objectanimator.setDuration(200L);
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(TourDetailFragment.access$400(TourDetailFragment.this), "scaleX", new float[] {
                1.3F
            });
            objectanimator2.setDuration(200L);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(objectanimator).ith(objectanimator2);
            animatorset.start();
            return;
        } else
        {
            Utils.logger(TourDetailFragment.access$300(), "make the start tour button smaller");
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(TourDetailFragment.access$400(TourDetailFragment.this), "scaleY", new float[] {
                1.0F
            });
            objectanimator1.setDuration(200L);
            ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(TourDetailFragment.access$400(TourDetailFragment.this), "scaleX", new float[] {
                1.0F
            });
            objectanimator3.setDuration(200L);
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.play(objectanimator1).ith(objectanimator3);
            animatorset1.start();
            return;
        }
    }

    r()
    {
        this$0 = TourDetailFragment.this;
        super();
    }
}

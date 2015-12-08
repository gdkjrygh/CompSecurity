// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.aetn.history.android.historyhere.MainNavigationActivity;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

class this._cls0
    implements android.view.animation.tener
{

    final MapOverlayFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        MainNavigationActivity _tmp = MapOverlayFragment.access$600(MapOverlayFragment.this);
        if (MainNavigationActivity.isMapTypeTours())
        {
            int i = MapOverlayFragment.access$1600(MapOverlayFragment.this).getHeight();
            animation = ObjectAnimator.ofFloat(MapOverlayFragment.access$1200(MapOverlayFragment.this), "translationY", new float[] {
                (float)i
            });
            animation.setDuration(300);
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(MapOverlayFragment.access$1600(MapOverlayFragment.this), "translationY", new float[] {
                0.0F
            });
            objectanimator.setDuration(300);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(animation);
            animatorset.play(animation).th(objectanimator);
            animatorset.start();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    I()
    {
        this$0 = MapOverlayFragment.this;
        super();
    }
}

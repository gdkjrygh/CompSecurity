// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.play.widget.RaindropMaskDrawable;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardHostFragment

final class this._cls1
    implements android.view.animation.ner
{

    final t this$1;

    public final void onAnimationEnd(Animation animation)
    {
        OnboardHostFragment.access$000();
        mSplash.setVisibility(8);
        dropsDrawable.start();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    l.dropsDrawable()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/play/onboard/OnboardHostFragment$7

/* anonymous class */
    final class OnboardHostFragment._cls7
        implements Runnable
    {

        final OnboardHostFragment this$0;
        final RaindropMaskDrawable val$dropsDrawable;

        public final void run()
        {
            mShowedSplash = true;
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setAnimationListener(new OnboardHostFragment._cls7._cls1());
            alphaanimation.setDuration(200L);
            mSplash.startAnimation(alphaanimation);
        }

            
            {
                this$0 = final_onboardhostfragment;
                dropsDrawable = RaindropMaskDrawable.this;
                super();
            }
    }

}

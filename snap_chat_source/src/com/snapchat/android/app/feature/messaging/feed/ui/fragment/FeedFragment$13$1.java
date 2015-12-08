// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements android.view.animation.nListener
{

    private a a;

    public final void onAnimationEnd(Animation animation)
    {
        if (a.a == null)
        {
            a.a.setTranslationX(0.0F);
            return;
        } else
        {
            a.a.run();
            return;
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedFragment$13

/* anonymous class */
    final class FeedFragment._cls13
        implements android.view.animation.Animation.AnimationListener
    {

        final Runnable a;
        final View b;
        private FeedFragment c;

        public final void onAnimationEnd(Animation animation)
        {
            animation = new TranslateAnimation(FeedFragment.w(c), 0.0F, 0.0F, 0.0F);
            animation.setInterpolator(new BounceInterpolator());
            animation.setDuration(400L);
            animation.setAnimationListener(new FeedFragment._cls13._cls1(this));
            b.startAnimation(animation);
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            
            {
                c = feedfragment;
                a = runnable;
                b = view;
                super();
            }
    }

}

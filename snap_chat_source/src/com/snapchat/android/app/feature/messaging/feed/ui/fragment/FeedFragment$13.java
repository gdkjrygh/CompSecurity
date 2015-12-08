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

final class b
    implements android.view.animation.ionListener
{

    final Runnable a;
    final View b;
    private FeedFragment c;

    public final void onAnimationEnd(Animation animation)
    {
        animation = new TranslateAnimation(FeedFragment.w(c), 0.0F, 0.0F, 0.0F);
        animation.setInterpolator(new BounceInterpolator());
        animation.setDuration(400L);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            private FeedFragment._cls13 a;

            public final void onAnimationEnd(Animation animation1)
            {
                if (a.a == null)
                {
                    a.b.setTranslationX(0.0F);
                    return;
                } else
                {
                    a.a.run();
                    return;
                }
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                a = FeedFragment._cls13.this;
                super();
            }
        });
        b.startAnimation(animation);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    _cls1.a(FeedFragment feedfragment, Runnable runnable, View view)
    {
        c = feedfragment;
        a = runnable;
        b = view;
        super();
    }
}

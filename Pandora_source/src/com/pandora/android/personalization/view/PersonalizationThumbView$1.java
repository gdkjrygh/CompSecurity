// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.pandora.android.personalization.view:
//            PersonalizationThumbView, a

class a
    implements Runnable
{

    final View a;
    final PersonalizationThumbView b;

    public void run()
    {
        PersonalizationThumbView.a(b).setVisibility(0);
        PersonalizationThumbView.b(b).setVisibility(8);
        PersonalizationThumbView.c(b).setVisibility(8);
        Object obj = new Rect();
        PersonalizationThumbView.d(b).getGlobalVisibleRect(((Rect) (obj)));
        int i = ((android.widget.)PersonalizationThumbView.d(b).getLayoutParams()).leftMargin;
        AnimatorSet animatorset = new AnimatorSet();
        ObjectAnimator objectanimator = com.pandora.android.personalization.view.a.c(a, PersonalizationThumbView.e(b).top - a.getTop(), ((Rect) (obj)).top - a.getTop());
        ObjectAnimator objectanimator1 = com.pandora.android.personalization.view.a.b(a, PersonalizationThumbView.e(b).left - a.getLeft(), ((Rect) (obj)).left - a.getLeft());
        objectanimator1.addListener(new AnimatorListenerAdapter(((Rect) (obj)), i) {

            final Rect a;
            final int b;
            final PersonalizationThumbView._cls1 c;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                c.b.setVisibility(0);
                ((ViewGroup)c.b.getRootView()).removeView(PersonalizationThumbView.a(c.b));
                int j = PersonalizationThumbView.f(c.b).getMeasuredHeight();
                animator = PersonalizationThumbView.f(c.b).getLayoutParams();
                animator.width = j;
                PersonalizationThumbView.f(c.b).setLayoutParams(animator);
                animator = PersonalizationThumbView.g(c.b).getLayoutParams();
                animator.width = j;
                PersonalizationThumbView.g(c.b).setLayoutParams(animator);
                PersonalizationThumbView.g(c.b).measure(0, 0);
                PersonalizationThumbView.f(c.b).measure(0, 0);
                PersonalizationThumbView.f(c.b).setTranslationX((a.centerX() - PersonalizationThumbView.f(c.b).getRight()) + b);
                PersonalizationThumbView.f(c.b).setVisibility(0);
                PersonalizationThumbView.g(c.b).setTranslationX(-((PersonalizationThumbView.g(c.b).getLeft() - a.centerX()) + b));
                PersonalizationThumbView.g(c.b).setVisibility(0);
                PersonalizationThumbView.a(c.b, false);
            }

            
            {
                c = PersonalizationThumbView._cls1.this;
                a = rect;
                b = i;
                super();
            }
        });
        animatorset.setDuration(350L);
        animatorset.playTogether(new Animator[] {
            objectanimator1, objectanimator
        });
        animatorset.setInterpolator(new DecelerateInterpolator(2.0F));
        obj = com.pandora.android.personalization.view.a.a(b, PersonalizationThumbView.d(b), ((Rect) (obj)));
        ((AnimatorSet) (obj)).setStartDelay(550L);
        ((AnimatorSet) (obj)).start();
        ((AnimatorSet) (obj)).setDuration(350L);
        animatorset.start();
        ((AnimatorSet) (obj)).setDuration(350L);
    }

    _cls1.b(PersonalizationThumbView personalizationthumbview, View view)
    {
        b = personalizationthumbview;
        a = view;
        super();
    }
}

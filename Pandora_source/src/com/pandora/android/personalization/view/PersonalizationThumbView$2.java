// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.pandora.android.personalization.view:
//            PersonalizationThumbView, a

class a
    implements Runnable
{

    final View a;
    final PersonalizationThumbView b;

    public void run()
    {
        Object obj = new Rect();
        PersonalizationThumbView.d(b).getGlobalVisibleRect(((Rect) (obj)));
        AnimatorSet animatorset = new AnimatorSet();
        android.animation.ObjectAnimator objectanimator = com.pandora.android.personalization.view.a.c(a, ((Rect) (obj)).top - a.getTop(), PersonalizationThumbView.e(b).top - a.getTop());
        android.animation.ObjectAnimator objectanimator1 = com.pandora.android.personalization.view.a.b(a, ((Rect) (obj)).left - a.getLeft(), PersonalizationThumbView.e(b).left - a.getLeft());
        android.animation.ObjectAnimator objectanimator2 = com.pandora.android.personalization.view.a.a(a, 1.0F, 0.0F);
        animatorset.setDuration(350L);
        animatorset.setStartDelay(350L);
        animatorset.playTogether(new Animator[] {
            objectanimator1, objectanimator, objectanimator2
        });
        obj = com.pandora.android.personalization.view.a.b(b, PersonalizationThumbView.d(b), ((Rect) (obj)));
        ((AnimatorSet) (obj)).setDuration(175L);
        ((AnimatorSet) (obj)).addListener(new AnimatorListenerAdapter() {

            final PersonalizationThumbView._cls2 a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.b.setVisibility(4);
                PersonalizationThumbView.a(a.b).setVisibility(0);
                PersonalizationThumbView.f(a.b).setTranslationX(0.0F);
                PersonalizationThumbView.f(a.b).setVisibility(8);
                PersonalizationThumbView.g(a.b).setTranslationX(0.0F);
                PersonalizationThumbView.g(a.b).setVisibility(8);
            }

            
            {
                a = PersonalizationThumbView._cls2.this;
                super();
            }
        });
        ((AnimatorSet) (obj)).start();
        animatorset.start();
    }

    _cls1.a(PersonalizationThumbView personalizationthumbview, View view)
    {
        b = personalizationthumbview;
        a = view;
        super();
    }
}

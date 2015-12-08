// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.animation.Animator;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.controls:
//            SimpleAnimationListener, PassengerCarouselView

class <init> extends SimpleAnimationListener
{

    private float firstX;
    final PassengerCarouselView this$0;

    public void onAnimationEnd(Animator animator)
    {
        PassengerCarouselView.access$202(PassengerCarouselView.this, false);
        animator = (ImageView)getChildAt(PassengerCarouselView.access$100(PassengerCarouselView.this)[PassengerCarouselView.access$100(PassengerCarouselView.this).length - 1]);
        animator.setX(firstX);
        animator.setBackgroundColor(PassengerCarouselView.access$300(PassengerCarouselView.this));
        PassengerCarouselView.access$400(PassengerCarouselView.this, animator);
        PassengerCarouselView.access$500(PassengerCarouselView.this);
        if (!PassengerCarouselView.access$600(PassengerCarouselView.this))
        {
            PassengerCarouselView.access$700(PassengerCarouselView.this);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        firstX = ((ImageView)getChildAt(PassengerCarouselView.access$100(PassengerCarouselView.this)[0])).getX();
    }

    ()
    {
        this$0 = PassengerCarouselView.this;
        super();
    }
}

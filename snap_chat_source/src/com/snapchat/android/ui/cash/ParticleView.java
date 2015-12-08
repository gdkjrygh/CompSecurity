// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Random;

public class ParticleView extends ImageView
{
    public static interface a
    {

        public abstract void a(ParticleView particleview);
    }


    static Random c = new Random();
    Point a;
    int b;
    private a d;

    public ParticleView(Context context)
    {
        super(context);
    }

    public ParticleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static a a(ParticleView particleview)
    {
        return particleview.d;
    }

    public void setAnimationListener(a a1)
    {
        d = a1;
    }

    public void setCenterPoint(Point point)
    {
        a = point;
    }

    public void setFinalSize(int i)
    {
        b = i;
    }


    // Unreferenced inner class com/snapchat/android/ui/cash/ParticleView$1

/* anonymous class */
    final class _cls1 extends com.snapchat.android.ui.CashSwiperView.a
    {

        private ParticleView a;
        private ParticleView b;

        public final void onAnimationEnd(Animator animator)
        {
            ParticleView.a(b).a(a);
        }

            
            {
                b = ParticleView.this;
                a = particleview1;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            StateListAnimator

static class <init>
{

    final Animation mAnimation;
    final int mSpecs[];

    Animation getAnimation()
    {
        return mAnimation;
    }

    int[] getSpecs()
    {
        return mSpecs;
    }

    private (int ai[], Animation animation)
    {
        mSpecs = ai;
        mAnimation = animation;
    }

    mAnimation(int ai[], Animation animation, mAnimation manimation)
    {
        this(ai, animation);
    }
}

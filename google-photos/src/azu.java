// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class azu
{

    final int a;

    azu(int i)
    {
        a = i;
    }

    public Animation a()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(a);
        return alphaanimation;
    }
}

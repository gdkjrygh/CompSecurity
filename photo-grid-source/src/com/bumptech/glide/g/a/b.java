// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.a;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.bumptech.glide.g.a:
//            j

final class b
    implements j
{

    private final int a = 300;

    b()
    {
    }

    public final Animation a()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(a);
        return alphaanimation;
    }
}

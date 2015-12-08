// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o

class t
    implements fe.a
{

    final o a;

    t(o o1)
    {
        a = o1;
        super();
    }

    public void a(int i)
    {
        if (o.b(a) == -1)
        {
            o.a(a, i);
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -o.c(a).getMeasuredHeight() * 2);
            translateanimation.setDuration(500L);
            translateanimation.setFillAfter(true);
            translateanimation.setFillBefore(true);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + 200L);
            o.c(a).setAnimation(translateanimation);
            if (!a.q)
            {
                o.a(a, 400, true);
            }
        }
    }
}

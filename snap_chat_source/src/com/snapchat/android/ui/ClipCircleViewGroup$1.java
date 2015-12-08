// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.ValueAnimator;

// Referenced classes of package com.snapchat.android.ui:
//            ClipCircleViewGroup

final class a
    implements android.animation.UpdateListener
{

    private float a;
    private ClipCircleViewGroup b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (b.o == 0)
        {
            b.c(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
            return;
        }
        if (b.o == 1)
        {
            b.d(((Float)valueanimator.getAnimatedValue()).floatValue(), a);
            return;
        } else
        {
            b.e(((Float)valueanimator.getAnimatedValue()).floatValue(), a);
            return;
        }
    }

    Listener(ClipCircleViewGroup clipcircleviewgroup, float f)
    {
        b = clipcircleviewgroup;
        a = f;
        super();
    }
}

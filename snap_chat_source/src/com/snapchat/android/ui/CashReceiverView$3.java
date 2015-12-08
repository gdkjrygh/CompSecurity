// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui:
//            CashReceiverView

public final class h
    implements android.animation.torUpdateListener
{

    private View a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue() * 5000F;
        a.setTranslationX((float)(Math.sin(b * f1 + c) * (double)d + (double)e));
        a.setTranslationY(f + g * f1);
        a.setRotation((float)(-Math.sin(f1 * b + c) * (double)h));
    }

    public ateListener(View view, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7)
    {
        a = view;
        b = f1;
        c = f2;
        d = f3;
        e = f4;
        f = f5;
        g = f6;
        h = f7;
        super();
    }
}

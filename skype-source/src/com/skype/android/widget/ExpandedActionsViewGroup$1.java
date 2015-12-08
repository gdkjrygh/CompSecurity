// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.skype.android.widget:
//            ExpandedActionsViewGroup

final class h
    implements android.animation.eListener
{

    final View a;
    final float b;
    final float c;
    final float d;
    final float e;
    final View f;
    final float g;
    final float h;
    final ExpandedActionsViewGroup i;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue();
        valueanimator = a;
        float f2 = b;
        valueanimator.setTranslationX(f2 + (c - f2) * f1);
        valueanimator = a;
        f2 = d;
        valueanimator.setTranslationY(f2 + (e - f2) * f1);
        valueanimator = f;
        f2 = g;
        valueanimator.setAlpha(f2 + (h - f2) * f1);
    }

    er(ExpandedActionsViewGroup expandedactionsviewgroup, View view, float f1, float f2, float f3, float f4, View view1, 
            float f5, float f6)
    {
        i = expandedactionsviewgroup;
        a = view;
        b = f1;
        c = f2;
        d = f3;
        e = f4;
        f = view1;
        g = f5;
        h = f6;
        super();
    }
}

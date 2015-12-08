// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads:
//            AdChoicesView

class <init> extends Animation
{

    final int a;
    final int b;
    final AdChoicesView c;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = (int)((float)a + (float)(b - a) * f);
        c.getLayoutParams().width = i;
        c.requestLayout();
        AdChoicesView.e(c).getLayoutParams().width = i - a;
        AdChoicesView.e(c).requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    tion(AdChoicesView adchoicesview, int i, int j)
    {
        c = adchoicesview;
        a = i;
        b = j;
        super();
    }
}

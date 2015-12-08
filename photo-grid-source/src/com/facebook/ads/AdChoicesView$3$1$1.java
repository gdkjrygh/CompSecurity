// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads:
//            AdChoicesView

class t> extends Animation
{

    final  a;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = (int)((float)a.a.a + (float)(a.a.a - a.a.a) * f);
        a.a.a.getLayoutParams().width = i;
        a.a.a.requestLayout();
        AdChoicesView.e(a.a.a).getLayoutParams().width = i - a.a.a;
        AdChoicesView.e(a.a.a).requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    ( )
    {
        a = ;
        super();
    }
}

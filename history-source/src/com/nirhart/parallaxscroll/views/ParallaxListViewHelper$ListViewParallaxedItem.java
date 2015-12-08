// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nirhart.parallaxscroll.views;

import android.view.View;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.nirhart.parallaxscroll.views:
//            ParallaxedView, ParallaxListViewHelper

protected class this._cls0 extends ParallaxedView
{

    final ParallaxListViewHelper this$0;

    protected void translatePreICS(View view, float f)
    {
        addAnimation(new TranslateAnimation(0.0F, 0.0F, f, f));
    }

    public (View view)
    {
        this$0 = ParallaxListViewHelper.this;
        super(view);
    }
}

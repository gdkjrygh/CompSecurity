// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nirhart.parallaxscroll.views;

import android.view.View;

// Referenced classes of package com.nirhart.parallaxscroll.views:
//            ParallaxedView, ParallaxScrollView

protected class this._cls0 extends ParallaxedView
{

    final ParallaxScrollView this$0;

    protected void translatePreICS(View view, float f)
    {
        view.offsetTopAndBottom((int)f - lastOffset);
        lastOffset = (int)f;
    }

    public (View view)
    {
        this$0 = ParallaxScrollView.this;
        super(view);
    }
}

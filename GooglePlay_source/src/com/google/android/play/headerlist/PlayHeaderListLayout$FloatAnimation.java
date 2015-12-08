// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

private abstract class mTo extends Animation
{

    private final float mFrom;
    private final float mTo;
    final PlayHeaderListLayout this$0;

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        setValue((mTo - mFrom) * f + mFrom);
    }

    protected abstract void setValue(float f);

    protected (float f, float f1)
    {
        this$0 = PlayHeaderListLayout.this;
        super();
        mFrom = f;
        mTo = f1;
    }
}

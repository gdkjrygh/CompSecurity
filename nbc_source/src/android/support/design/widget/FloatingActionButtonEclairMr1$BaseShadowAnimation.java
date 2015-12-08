// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonEclairMr1, ShadowDrawableWrapper

private abstract class <init> extends Animation
{

    private float mShadowSizeDiff;
    private float mShadowSizeStart;
    final FloatingActionButtonEclairMr1 this$0;

    protected void applyTransformation(float f, Transformation transformation)
    {
        mShadowDrawable.setShadowSize(mShadowSizeStart + mShadowSizeDiff * f);
    }

    protected abstract float getTargetShadowSize();

    public void reset()
    {
        super.reset();
        mShadowSizeStart = mShadowDrawable.getShadowSize();
        mShadowSizeDiff = getTargetShadowSize() - mShadowSizeStart;
    }

    private ()
    {
        this$0 = FloatingActionButtonEclairMr1.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

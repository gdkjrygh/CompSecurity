// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.widget:
//            SwitchCompat

private class <init> extends Animation
{

    final float mDiff;
    final float mEndPosition;
    final float mStartPosition;
    final SwitchCompat this$0;

    protected void applyTransformation(float f, Transformation transformation)
    {
        SwitchCompat.access$100(SwitchCompat.this, mStartPosition + mDiff * f);
    }

    private (float f, float f1)
    {
        this$0 = SwitchCompat.this;
        super();
        mStartPosition = f;
        mEndPosition = f1;
        mDiff = f1 - f;
    }

    mDiff(float f, float f1, mDiff mdiff)
    {
        this(f, f1);
    }
}

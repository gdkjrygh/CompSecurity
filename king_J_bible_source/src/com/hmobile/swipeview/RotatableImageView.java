// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RotatableImageView extends ImageView
{

    private int mRotation;
    private float mXPivot;
    private float mYPivot;

    public RotatableImageView(Context context)
    {
        super(context);
        mRotation = 0;
        mXPivot = 0.0F;
        mYPivot = 0.0F;
    }

    public RotatableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mRotation = 0;
        mXPivot = 0.0F;
        mYPivot = 0.0F;
    }

    public float getRotation()
    {
        return (float)mRotation;
    }

    public float getXPivot()
    {
        return mXPivot;
    }

    public float getYPivot()
    {
        return mYPivot;
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.save();
        canvas.rotate(mRotation, (float)getWidth() * mXPivot, (float)getHeight() * mYPivot);
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setRotation(int i)
    {
        setRotation(i, 0.5F, 0.5F);
    }

    public void setRotation(int i, float f, float f1)
    {
        mRotation = i;
        mXPivot = f;
        mYPivot = f1;
    }
}

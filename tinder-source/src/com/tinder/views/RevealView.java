// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.utils.ad;

public class RevealView extends View
{

    private View mAnchorView;
    private Point mPoint;
    private int mRadius;
    private PorterDuffXfermode mXferMode;

    public RevealView(Context context)
    {
        super(context);
        mXferMode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
    }

    public RevealView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mXferMode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        init();
    }

    public RevealView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mXferMode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        init();
    }

    public RevealView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mXferMode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        init();
    }

    public void init()
    {
        ad.a(((Activity)getContext()).getWindow(), getContext(), this);
    }

    protected void onDraw(Canvas canvas)
    {
        if (mAnchorView == null)
        {
            return;
        } else
        {
            mPoint = ad.a(mAnchorView);
            mRadius = (mAnchorView.getRight() - mAnchorView.getLeft()) / 2;
            int i = mPoint.x + mRadius;
            int j = mPoint.y;
            canvas.drawColor(Color.argb(150, 0, 0, 0));
            Paint paint = new Paint(1);
            paint.setXfermode(mXferMode);
            canvas.drawCircle(i, j, mRadius, paint);
            Path path = new Path();
            path.addCircle(i, j * 2, mRadius / 2, android.graphics.Path.Direction.CCW);
            canvas.drawPath(path, paint);
            return;
        }
    }

    public void setAnchorView(View view)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("Anchor view must not be null!");
        } else
        {
            mAnchorView = view;
            return;
        }
    }
}

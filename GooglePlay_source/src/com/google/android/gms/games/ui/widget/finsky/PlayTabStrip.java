// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget.finsky;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class PlayTabStrip extends LinearLayout
{

    private final Paint mFullUnderlinePaint;
    private final int mFullUnderlineThickness;
    int mIndexForSelection;
    final Paint mSelectedUnderlinePaint;
    private final int mSelectedUnderlineThickness;
    float mSelectionOffset;
    private final int mSideSeparatorHeight;
    private final Paint mSideSeparatorPaint;

    public PlayTabStrip(Context context)
    {
        this(context, null);
    }

    public PlayTabStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setWillNotDraw(false);
        context = context.getResources();
        mFullUnderlineThickness = context.getDimensionPixelSize(0x7f0c033e);
        mFullUnderlinePaint = new Paint();
        mFullUnderlinePaint.setColor(context.getColor(0x7f0b028d));
        mSelectedUnderlineThickness = context.getDimensionPixelSize(0x7f0c0340);
        mSelectedUnderlinePaint = new Paint();
        mSideSeparatorPaint = new Paint();
        mSideSeparatorPaint.setColor(context.getColor(0x7f0b028f));
        mSideSeparatorPaint.setStrokeWidth(context.getDimensionPixelSize(0x7f0c033d));
        mSideSeparatorHeight = context.getDimensionPixelSize(0x7f0c0343);
    }

    protected void onDraw(Canvas canvas)
    {
        int i2 = getHeight();
        int l1 = getChildCount();
        if (l1 > 0)
        {
            View view = getChildAt(mIndexForSelection);
            int k1 = view.getLeft();
            int i1 = view.getRight();
            int k = k1;
            int i = i1;
            if (mSelectionOffset > 0.0F)
            {
                k = k1;
                i = i1;
                if (mIndexForSelection < getChildCount() - 1)
                {
                    View view1 = getChildAt(mIndexForSelection + 1);
                    k = view1.getLeft();
                    i = view1.getRight();
                    k = (int)(mSelectionOffset * (float)k + (1.0F - mSelectionOffset) * (float)k1);
                    i = (int)(mSelectionOffset * (float)i + (1.0F - mSelectionOffset) * (float)i1);
                }
            }
            canvas.drawRect(k, i2 - mSelectedUnderlineThickness, i, i2, mSelectedUnderlinePaint);
        }
        canvas.drawRect(0.0F, i2 - mFullUnderlineThickness, getWidth(), i2, mFullUnderlinePaint);
        for (int j = 1; j < l1; j++)
        {
            View view2 = getChildAt(j);
            int l = view2.getPaddingTop();
            int j1 = view2.getPaddingBottom();
            l = ((view2.getHeight() - l - j1) / 2 + l) - mSideSeparatorHeight / 2;
            canvas.drawLine(view2.getLeft(), l, view2.getLeft(), mSideSeparatorHeight + l, mSideSeparatorPaint);
        }

    }
}

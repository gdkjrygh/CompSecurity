// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayHeaderListTabContainer extends LinearLayout
{

    private static int sNextLeftRight[] = new int[2];
    private static int sSelectedLeftRight[] = new int[2];
    int mIndexForSelection;
    boolean mPaddingValidForTabs;
    final Paint mSelectedUnderlinePaint;
    private final int mSelectedUnderlineThickness;
    float mSelectionOffset;
    int mStripWidth;
    boolean mUseFloatingTabPadding;

    public PlayHeaderListTabContainer(Context context)
    {
        this(context, null);
    }

    public PlayHeaderListTabContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setWillNotDraw(false);
        mSelectedUnderlineThickness = context.getResources().getDimensionPixelSize(0x7f0c0300);
        mSelectedUnderlinePaint = new Paint();
    }

    private static void getUnderlineEdges(View view, int ai[])
    {
        if (!(view instanceof TextView))
        {
            ai[0] = view.getLeft();
            ai[1] = view.getRight();
            return;
        }
        view = (TextView)view;
        CharSequence charsequence = view.getText();
        if (charsequence == null || charsequence.length() == 0)
        {
            ai[0] = (view.getLeft() + view.getRight()) / 2;
            ai[1] = ai[0];
            return;
        } else
        {
            ai[0] = view.getLeft();
            ai[1] = view.getRight();
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (getChildCount() > 0 && mIndexForSelection < getChildCount())
        {
            getUnderlineEdges(getChildAt(mIndexForSelection), sSelectedLeftRight);
            if (mSelectionOffset > 0.0F && mIndexForSelection < getChildCount() - 1)
            {
                getUnderlineEdges(getChildAt(mIndexForSelection + 1), sNextLeftRight);
                sSelectedLeftRight[0] = (int)(mSelectionOffset * (float)sNextLeftRight[0] + (1.0F - mSelectionOffset) * (float)sSelectedLeftRight[0]);
                sSelectedLeftRight[1] = (int)(mSelectionOffset * (float)sNextLeftRight[1] + (1.0F - mSelectionOffset) * (float)sSelectedLeftRight[1]);
            }
            int i = getHeight();
            canvas.drawRect(sSelectedLeftRight[0], i - mSelectedUnderlineThickness, sSelectedLeftRight[1], i, mSelectedUnderlinePaint);
        }
    }

    final void updatePadding()
    {
        int i;
        int j;
        i = 0;
        j = 0;
        if (!mUseFloatingTabPadding) goto _L2; else goto _L1
_L1:
        int k;
        k = getResources().getDimensionPixelSize(0x7f0c02fd);
        j = k;
_L4:
        setPadding(k, 0, j, 0);
        mPaddingValidForTabs = true;
        return;
_L2:
        int l = mStripWidth / 2;
        View view = getChildAt(0);
        if (view != null)
        {
            view.measure(-2, -2);
            i = l - view.getMeasuredWidth() / 2;
        }
        view = getChildAt(getChildCount() - 1);
        k = i;
        if (view != null)
        {
            view.measure(-2, -2);
            j = l - view.getMeasuredWidth() / 2;
            k = i;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}

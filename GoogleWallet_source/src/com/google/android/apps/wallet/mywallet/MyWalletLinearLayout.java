// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveLinearLayout;

public class MyWalletLinearLayout extends ScreenWidthSensitiveLinearLayout
{

    private final int height;
    private final Paint paint = new Paint();
    private final boolean platformSupportsElevation;
    private final Rect r = new Rect();

    public MyWalletLinearLayout(Context context, AttributeSet attributeset)
    {
        boolean flag = false;
        super(context, attributeset);
        setWillNotDraw(false);
        paint.setColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.very_light_opaque));
        height = context.getResources().getDimensionPixelOffset(com.google.android.apps.walletnfcrel.R.dimen.divider_width);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        }
        platformSupportsElevation = flag;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i < getChildCount() - 1; i++)
        {
            View view = getChildAt(i + 1);
            if (getChildAt(i).getVisibility() == 0 && (!platformSupportsElevation || view.getElevation() > 0.0F))
            {
                r.right = getChildAt(i).getRight();
                r.left = getChildAt(i).getLeft();
                r.top = getChildAt(i).getBottom();
                r.bottom = r.top + height;
                canvas.drawRect(r, paint);
            }
        }

    }
}

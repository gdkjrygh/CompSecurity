// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;

// Referenced classes of package com.soundcloud.android.view:
//            CustomFontTextView

public class JaggedTextView extends CustomFontTextView
{

    private Paint backgroundPaint;
    private ColorStateList colorStateList;
    private boolean showBackground;

    public JaggedTextView(Context context)
    {
        super(context);
        showBackground = true;
    }

    public JaggedTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        showBackground = true;
        initAttributes(context, attributeset);
    }

    public JaggedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        showBackground = true;
        initAttributes(context, attributeset);
    }

    private void drawBackground(Canvas canvas, Layout layout)
    {
        int i = 0;
        while (i < layout.getLineCount()) 
        {
            int j = getCompoundPaddingTop();
            int k = getCompoundPaddingBottom();
            float f3 = layout.getLineLeft(i);
            float f = layout.getLineTop(i);
            float f4 = layout.getLineRight(i);
            float f5 = getDrawablePaddingLeft();
            float f6 = getDrawablePaddingRight();
            float f2 = layout.getLineBottom(i) + j + k;
            float f1;
            float f7;
            if (i == 0)
            {
                f -= getPaddingTop();
            } else
            {
                f += j + k;
            }
            f1 = f2;
            if (i == layout.getLineCount() - 1)
            {
                f1 = f2 + (float)getPaddingBottom();
            }
            f2 = getPaddingLeft();
            f7 = getPaddingRight();
            j = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            backgroundPaint.setColor(j);
            canvas.drawRect(f3 - f2, f, f6 + (f4 + f5) + f7, f1, backgroundPaint);
            i++;
        }
    }

    private int getDrawablePaddingLeft()
    {
        return getCompoundPaddingLeft() - getPaddingLeft();
    }

    private int getDrawablePaddingRight()
    {
        return getCompoundPaddingRight() - getPaddingRight();
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.JaggedTextView);
        colorStateList = context.getColorStateList(0);
        context.recycle();
        backgroundPaint = new Paint();
    }

    public boolean isShowingBackground()
    {
        return showBackground;
    }

    protected void onDraw(Canvas canvas)
    {
        if (getLayout() == null)
        {
            forceLayout();
        }
        Layout layout = getLayout();
        if (layout == null)
        {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        if (showBackground && !TextUtils.isEmpty(getText()))
        {
            drawBackground(canvas, layout);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    public void setBackground(Drawable drawable)
    {
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
    }

    public void showBackground(boolean flag)
    {
        showBackground = flag;
        invalidate();
    }
}

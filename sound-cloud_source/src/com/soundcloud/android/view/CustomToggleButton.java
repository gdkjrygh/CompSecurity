// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.soundcloud.java.strings.Strings;

public class CustomToggleButton extends ToggleButton
{
    private class CustomToggleButtonDrawable extends StateListDrawable
    {

        private final Drawable background;
        final CustomToggleButton this$0;

        public void draw(Canvas canvas)
        {
            int i = 0;
            String s;
            android.text.TextPaint textpaint;
            Drawable drawable;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            if (isChecked())
            {
                s = Strings.safeToString(getTextOn());
            } else
            {
                s = Strings.safeToString(getTextOff());
            }
            textpaint = getPaint();
            drawable = getCompoundDrawables()[0];
            l = getCompoundDrawablePadding();
            i1 = getWidth();
            k = getHeight();
            j1 = (int)textpaint.measureText(s);
            if (background != null)
            {
                background.setBounds(getBounds());
                background.draw(canvas);
            }
            if (drawable != null)
            {
                i = drawable.getIntrinsicWidth();
            }
            j = i + (j1 + 0);
            i = j;
            if (drawable != null)
            {
                i = j;
                if (j1 > 0)
                {
                    i = j + l;
                }
            }
            j = (i1 - i) / 2;
            i = j;
            if (drawable != null)
            {
                i = (k - drawable.getIntrinsicHeight()) / 2;
                drawable.setBounds(j, i, drawable.getIntrinsicWidth() + j, drawable.getIntrinsicHeight() + i);
                drawable.draw(canvas);
                i = j + (drawable.getIntrinsicWidth() + l);
            }
            j = (k - (int)(textpaint.getTextSize() - textpaint.getFontMetrics().bottom)) / 2;
            canvas.drawText(s, i, k - j, textpaint);
        }

        public int getOpacity()
        {
            return 1;
        }

        public void setAlpha(int i)
        {
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
        }

        public boolean setState(int ai[])
        {
            boolean flag = background.setState(ai);
            invalidate();
            return flag;
        }

        public CustomToggleButtonDrawable(Drawable drawable)
        {
            this$0 = CustomToggleButton.this;
            super();
            background = drawable;
        }
    }


    public CustomToggleButton(Context context)
    {
        super(context);
        setBackgroundDrawable(new CustomToggleButtonDrawable(getBackground()));
    }

    public CustomToggleButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBackgroundDrawable(new CustomToggleButtonDrawable(getBackground()));
    }

    public CustomToggleButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setBackgroundDrawable(new CustomToggleButtonDrawable(getBackground()));
    }

    protected void onDraw(Canvas canvas)
    {
    }
}

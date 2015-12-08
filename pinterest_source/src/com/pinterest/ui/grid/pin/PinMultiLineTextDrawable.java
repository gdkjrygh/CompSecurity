// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import com.pinterest.base.Colors;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinMultiLineTextDrawable extends PinCellDrawable
{

    public static final Bitmap INFO_ICON = ((BitmapDrawable)Resources.drawable(0x7f0201ab)).getBitmap();
    public static final int MAX_LINES = Resources.integer(0x7f0d0023).intValue();
    private Bitmap icon;
    private final TextPaint paintText = new TextPaint(1);
    private String text;
    private LimitedLayout textLayout;

    public PinMultiLineTextDrawable()
    {
        text = "";
        paintText.setColor(Colors.TEXT_LIGHT);
        paintText.setTextSize(subTitleSize);
        paintText.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void updateTextLayout(String s)
    {
        do
        {
            textLayout = new LimitedLayout(s, paintText, Math.max(50, width - padding.left - padding.right), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, Math.round((double)paintText.getTextSize() * 0.33000000000000002D), false);
            if (textLayout.getActualLineCount() > textLayout.getLineCount())
            {
                s = s.substring(0, textLayout.getLineStart(textLayout.getLineCount()) - 3);
                s = (new StringBuilder()).append(s).append("\u2026").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    public void draw(Canvas canvas)
    {
        int i = y;
        if (pressed)
        {
            canvas.drawRect(getBounds(), touchPaint);
        }
        int j = padding.top;
        canvas.save();
        canvas.translate(padding.left, i + j);
        textLayout.draw(canvas);
        canvas.restore();
        textLayout.getHeight();
    }

    public void measure()
    {
        updateTextLayout(text);
        setHeight(textLayout.getHeight() + padding.top + padding.bottom / 2 + 0);
    }

    public void setColor(int i)
    {
        paintText.setColor(i);
    }

    public void setIcon(Bitmap bitmap)
    {
        icon = bitmap;
    }

    public void setText(String s)
    {
        text = s;
        updateTextLayout(text);
    }

    public void setTextSize(float f)
    {
        paintText.setTextSize(f);
    }

    public void setTypeface(Typeface typeface)
    {
        paintText.setTypeface(typeface);
    }


    private class LimitedLayout extends StaticLayout
    {

        public int getActualLineCount()
        {
            return super.getLineCount();
        }

        public int getLineCount()
        {
            int j = super.getLineCount();
            int i = j;
            if (j >= PinMultiLineTextDrawable.MAX_LINES)
            {
                i = PinMultiLineTextDrawable.MAX_LINES;
            }
            return i;
        }

        public LimitedLayout(CharSequence charsequence, int i, int j, TextPaint textpaint, int k, android.text.Layout.Alignment alignment, float f, 
                float f1, boolean flag)
        {
            super(charsequence, i, j, textpaint, k, alignment, f, f1, flag);
        }

        public LimitedLayout(CharSequence charsequence, int i, int j, TextPaint textpaint, int k, android.text.Layout.Alignment alignment, float f, 
                float f1, boolean flag, android.text.TextUtils.TruncateAt truncateat, int l)
        {
            super(charsequence, i, j, textpaint, k, alignment, f, f1, flag, truncateat, l);
        }

        public LimitedLayout(CharSequence charsequence, TextPaint textpaint, int i, android.text.Layout.Alignment alignment, float f, float f1, boolean flag)
        {
            super(charsequence, textpaint, i, alignment, f, f1, flag);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import com.pinterest.base.Colors;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinTextDrawable extends PinCellDrawable
{

    public static final Bitmap FEEDBACK_ICON = ((BitmapDrawable)Resources.drawable(0x7f02018f)).getBitmap();
    public static final Bitmap INFO_ICON = ((BitmapDrawable)Resources.drawable(0x7f0201ab)).getBitmap();
    private boolean centered;
    private Bitmap icon;
    private final TextPaint paintText = new TextPaint(1);
    private boolean renderfeedbackIcon;
    private String text;

    public PinTextDrawable()
    {
        text = "";
        renderfeedbackIcon = false;
        centered = false;
        paintText.setColor(Colors.TEXT_LIGHT);
        paintText.setTextSize(subTitleSize);
        paintText.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void centerText()
    {
        centered = true;
    }

    public void draw(Canvas canvas)
    {
label0:
        {
            if (pressed)
            {
                canvas.drawRect(getBounds(), touchPaint);
            }
            float f = padding.left;
            if (centered)
            {
                f = canvas.getWidth() / 2;
                paintText.setTextAlign(android.graphics.Paint.Align.CENTER);
            }
            canvas.drawText(ellipsize(text, paintText, width - padding.left - padding.right), f, ((float)(padding.top + y) + subTitleSize) - (float)DP2, paintText);
            int i = ICON_SIZE;
            int j = padding.right;
            int k = DP2;
            if (icon != null)
            {
                if (!renderfeedbackIcon)
                {
                    break label0;
                }
                canvas.drawBitmap(icon, width - (i + j + k), (y + height) - padding.right - ICON_SIZE, blankPaint);
            }
            return;
        }
        sharedMatrix.reset();
        sharedMatrix.postScale(ICON_SIZE / icon.getWidth(), ICON_SIZE / icon.getHeight(), 0.0F, 0.0F);
        sharedMatrix.postTranslate((width - padding.right - ICON_SIZE) + 1, (y + height / 2) - ICON_SIZE / 2 - 1);
        canvas.drawBitmap(icon, sharedMatrix, blankPaint);
    }

    public Rect getIconBounds()
    {
        if (renderfeedbackIcon)
        {
            return new Rect(width - ICON_SIZE - padding.right - DP8, getBounds().top, getBounds().right, getBounds().bottom);
        } else
        {
            return new Rect();
        }
    }

    public boolean getRenderFeedbackIcon()
    {
        return renderfeedbackIcon;
    }

    public void measure()
    {
        setHeight((int)((float)padding.top + subTitleSize + (float)padding.bottom));
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
    }

    public void setTextSize(float f)
    {
        paintText.setTextSize(f);
    }

    public void setTypeface(Typeface typeface)
    {
        paintText.setTypeface(typeface);
    }

    public void showFeedbackIcon(boolean flag)
    {
        renderfeedbackIcon = flag;
    }

}

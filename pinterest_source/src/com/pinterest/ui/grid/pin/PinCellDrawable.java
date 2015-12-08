// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;

public abstract class PinCellDrawable extends Drawable
{

    public static final int DIVIDER_HEIGHT = (int)Resources.dimension(0x7f0a0134);
    public static final int DIVIDER_INDENT = 1;
    protected static final int DP1 = Math.round(Device.dpToPixel(1.0F));
    protected static final int DP11 = Math.round(Device.dpToPixel(11F));
    protected static final int DP2 = Math.round(Device.dpToPixel(2.0F));
    protected static final int DP3 = Math.round(Device.dpToPixel(3F));
    protected static final int DP4 = Math.round(Device.dpToPixel(4F));
    protected static final int DP8 = Math.round(Device.dpToPixel(8F));
    protected static final int ICON_IMAGE_SIZE = (int)Resources.dimension(0x7f0a0017);
    protected static final int ICON_SIZE = (int)Resources.dimension(0x7f0a01df);
    protected static final int PADDING_IMAGE = (int)Resources.dimension(0x7f0a0191);
    protected Paint backgroundPaint;
    protected Paint blankPaint;
    protected int height;
    protected Paint iconPaint;
    protected boolean iconPressed;
    protected float nameSize;
    protected Rect padding;
    protected TextPaint paintBold;
    protected TextPaint paintLight;
    protected boolean pressed;
    protected Matrix sharedMatrix;
    protected Rect sharedRect;
    protected RectF sharedRectF;
    protected float subTitleSize;
    protected Paint touchPaint;
    protected int width;
    protected int x;
    protected int y;

    protected PinCellDrawable()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        padding = new Rect();
        pressed = false;
        iconPressed = false;
        sharedMatrix = new Matrix();
        sharedRectF = new RectF();
        sharedRect = new Rect();
        initDimens();
        initPaint();
        initTextPaint();
    }

    private void initDimens()
    {
        nameSize = Resources.dimension(0x7f0a01df);
        subTitleSize = Resources.dimension(0x7f0a01e0);
    }

    private void initPaint()
    {
        blankPaint = new Paint();
        blankPaint.setAntiAlias(true);
        blankPaint.setFilterBitmap(true);
        iconPaint = new Paint();
        iconPaint.setAntiAlias(true);
        iconPaint.setFilterBitmap(true);
        iconPaint.setColorFilter(new PorterDuffColorFilter(Colors.GRAY_SOLID, android.graphics.PorterDuff.Mode.SRC_IN));
        backgroundPaint = new Paint(1);
        backgroundPaint.setColor(Colors.GRAY_SOLID);
        backgroundPaint.setAntiAlias(true);
        backgroundPaint.setStyle(android.graphics.Paint.Style.FILL);
        touchPaint = new Paint(1);
        touchPaint.setColor(Colors.BG_TOUCH);
        touchPaint.setAntiAlias(true);
        touchPaint.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void initTextPaint()
    {
        paintBold = new TextPaint(1);
        paintBold.setColor(Colors.TEXT_DARK);
        paintBold.setTextSize(nameSize);
        paintBold.setStyle(android.graphics.Paint.Style.FILL);
        paintBold.setTypeface(Typeface.DEFAULT_BOLD);
        paintLight = new TextPaint(1);
        paintLight.setColor(Colors.TEXT_LIGHT);
        paintLight.setTextSize(subTitleSize);
        paintLight.setStyle(android.graphics.Paint.Style.FILL);
    }

    protected String ellipsize(String s, TextPaint textpaint, float f)
    {
        if (s == null || s.length() == 0)
        {
            return "";
        } else
        {
            return (String)TextUtils.ellipsize(s, textpaint, f, android.text.TextUtils.TruncateAt.END);
        }
    }

    public int getHeight()
    {
        return height;
    }

    public int getIntrinsicHeight()
    {
        return height;
    }

    public int getIntrinsicWidth()
    {
        return width;
    }

    public int getOpacity()
    {
        return -2;
    }

    public int getWidth()
    {
        return width;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean isIconPressed()
    {
        return iconPressed;
    }

    public boolean isPressed()
    {
        return pressed;
    }

    public abstract void measure();

    public void prepareForReuse()
    {
        setBounds(0, 0, 0, 0);
        pressed = false;
        iconPressed = false;
    }

    public void setAlpha(int i)
    {
    }

    public void setBounds(int i, int j, int k, int l)
    {
        super.setBounds(i, j, k, l);
        Rect rect = getBounds();
        x = rect.left;
        y = rect.top;
        width = rect.width();
        height = rect.height();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public void setHeight(int i)
    {
        height = i;
        Rect rect = getBounds();
        rect.bottom = rect.top + i;
        setBounds(rect);
    }

    public void setIconPressed(boolean flag)
    {
        iconPressed = flag;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        padding.set(i, j, k, l);
    }

    public void setPadding(Rect rect)
    {
        padding.set(rect);
    }

    public void setPressed(boolean flag)
    {
        pressed = flag;
    }

    public void setWidth(int i)
    {
        width = i;
        Rect rect = getBounds();
        rect.right = rect.left + i;
        setBounds(rect);
    }

    public void setX(int i)
    {
        x = i;
        Rect rect = getBounds();
        rect.left = i;
        rect.right = rect.left + rect.width();
        setBounds(rect);
    }

    public void setY(int i)
    {
        y = i;
        Rect rect = getBounds();
        rect.top = i;
        rect.bottom = rect.top + rect.height();
        setBounds(rect);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import com.pandora.android.util.s;
import java.util.List;

public class FeaturedTrackLayout extends View
{

    private TextPaint a;
    private Paint b;
    private Rect c;
    private float d;
    private float e;
    private float f;
    private float g;
    private String h;

    public FeaturedTrackLayout(Context context)
    {
        super(context);
        a(-1, -1, context.getResources().getDimensionPixelSize(0x7f0900e3));
    }

    public FeaturedTrackLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FeaturedTrackLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.FeaturedTrackLayout, i, 0x7f0d0066);
        setFocusable(true);
        g = getAlpha();
        i = context.getColor(0, 0xff000000);
        int j = context.getColor(3, -1);
        float f1 = context.getDimensionPixelSize(1, 0);
        h = context.getString(2);
        a(i, j, f1);
        context.recycle();
    }

    private void a()
    {
        if (c == null)
        {
            c = new Rect();
        }
        if (h != null)
        {
            a.getTextBounds(h, 0, h.length(), c);
        }
    }

    private void a(int i, int j, float f1)
    {
        a = new TextPaint(1);
        a.density = s.t().density;
        a.setColor(j);
        a.setTextSize(f1);
        a.setTypeface(Typeface.SANS_SERIF);
        a();
        b = new Paint();
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setAntiAlias(true);
        b.setColor(i);
        setAlpha(g);
    }

    private void a(ImageView imageview)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)imageview.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
        float f1 = (float)Math.ceil((((float)imageview.getHeight() - d) / 2.0F + (d - f) + (float)layoutparams.topMargin) - (float)layoutparams1.bottomMargin);
        float f2 = ((float)imageview.getWidth() - e) / 2.0F;
        f2 = (float)Math.floor((float)layoutparams.leftMargin + f2);
        setTranslationY(f1);
        setTranslationX(f2);
    }

    public void a(ImageView imageview, float f1, float f2, float f3, float f4)
    {
        float f5 = 0.0F;
        setPivotX(imageview.getWidth());
        setPivotY(0.0F);
        setScaleX(f1);
        setScaleY(f1);
        f = d * 0.1F * f1;
        float f6 = ((float)imageview.getHeight() - d) / 2.0F;
        float f7 = d;
        float f8 = f;
        float f9 = ((float)imageview.getWidth() - e) / 2.0F;
        setTranslationY((float)Math.ceil(((f6 + (f7 - f8)) * f1 - f2 * f4) + f2 * f4));
        setTranslationX((float)Math.floor(f2 * f3 + f9));
        f1 = -1.3F * (1.0F - f1) + g;
        if (f1 <= 0.0F)
        {
            f1 = f5;
        }
        setAlpha(f1);
    }

    public void a(ImageView imageview, boolean flag)
    {
        if (imageview.getDrawable() == null)
        {
            return;
        }
        float f1;
        android.view.ViewGroup.LayoutParams layoutparams;
        if (flag)
        {
            f1 = (float)Math.min(imageview.getWidth(), imageview.getHeight()) / (float)Math.max(imageview.getDrawable().getIntrinsicWidth(), imageview.getDrawable().getIntrinsicHeight());
        } else
        {
            f1 = 1.0F;
        }
        d = (float)imageview.getDrawable().getIntrinsicHeight() * f1;
        e = f1 * (float)imageview.getDrawable().getIntrinsicWidth();
        if (imageview.getHeight() < imageview.getDrawable().getIntrinsicHeight())
        {
            d = imageview.getHeight();
            e = (float)imageview.getHeight() - (float)imageview.getDrawable().getIntrinsicWidth() / (float)imageview.getWidth();
        }
        f = d * 0.1F;
        layoutparams = getLayoutParams();
        layoutparams.height = (int)f;
        layoutparams.width = (int)e;
        a(imageview);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawRect(0.0F, getTop() - ((android.widget.RelativeLayout.LayoutParams)getLayoutParams()).bottomMargin, getLayoutParams().width, getLayoutParams().height, b);
        if (getLayoutParams().height > c.height())
        {
            canvas.drawText(h, getPaddingLeft(), getTop() + c.height() + (getLayoutParams().height - c.height()) / 2, a);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (s.u())
        {
            View view = (View)getParent();
            setMeasuredDimension(view.getMeasuredWidth(), (int)((float)view.getMeasuredHeight() * 0.1F));
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        accessibilityevent.getText().add(h);
    }

    public void setTitleText(int i)
    {
        if (i > 0)
        {
            h = getContext().getString(i);
            a();
        }
    }

    public void setTitleText(String s1)
    {
        h = s1;
        a();
    }
}

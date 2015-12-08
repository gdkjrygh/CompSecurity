// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.hp.mss.hpprint.model.PrintItem;
import com.hp.mss.hpprint.util.b;

public class PagePreviewView extends View
{

    private Paint a;
    private Bitmap b;
    private final RectF c;
    private float d;
    private float e;
    private float f;
    private int g;
    private Paint h;
    private Rect i;
    private String j;
    private com.hp.mss.hpprint.model.PrintItem.a k;
    private PrintItem l;
    private int m;

    public PagePreviewView(Context context)
    {
        this(context, null);
    }

    public PagePreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new RectF();
        g = -1;
        i = new Rect();
        j = "";
        a(context, attributeset);
        a(context);
    }

    static Bitmap a(PagePreviewView pagepreviewview)
    {
        return pagepreviewview.b;
    }

    static Bitmap a(PagePreviewView pagepreviewview, Bitmap bitmap)
    {
        pagepreviewview.b = bitmap;
        return bitmap;
    }

    private static String a(float f1)
    {
        if (f1 == (float)(long)f1)
        {
            return String.format("%d", new Object[] {
                Long.valueOf((long)f1)
            });
        } else
        {
            return String.format("%s", new Object[] {
                Float.valueOf(f1)
            });
        }
    }

    private void a(Context context)
    {
        d = TypedValue.applyDimension(1, 16F, getResources().getDisplayMetrics());
        h = new Paint(1);
        h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        h.setColor(0xff000000);
        h.setStrokeWidth(1.0F);
        a = new Paint(65);
        a.setColor(m);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setTextAlign(android.graphics.Paint.Align.CENTER);
        if (!isInEditMode())
        {
            context = com.hp.mss.hpprint.util.b.a(context);
            a.setTypeface(context);
        }
        a.setTextSize(TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.hp.mss.hpprint.R.styleable.PagePreviewView, 0, 0);
        m = context.getColor(com.hp.mss.hpprint.R.styleable.PagePreviewView_sizeFontColor, -1);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private RectF getPreviewImageRect()
    {
        float f1 = e;
        float f2 = f;
        float f3;
        float f4;
        boolean flag;
        if (f1 / (float)getMeasuredWidth() > f2 / (float)getMeasuredHeight())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f1 = ((((float)getMeasuredWidth() * 7F) / 9F) * f2) / f1;
            f3 = ((float)getMeasuredHeight() - f1) / 2.0F;
            f4 = (float)getMeasuredWidth() / 9F;
            f2 = ((float)getMeasuredWidth() * 8F) / 9F;
            f1 += f3;
        } else
        {
            f1 = ((((float)getMeasuredHeight() * 7F) / 9F) * f1) / f2;
            f4 = ((float)getMeasuredWidth() - f1) / 2.0F;
            f3 = (float)getMeasuredHeight() / 9F;
            f2 = f4 + f1;
            f1 = ((float)getMeasuredHeight() * 8F) / 9F;
        }
        return new RectF(f4, f3 - d / 2.0F, f2, f1 - d / 2.0F);
    }

    public void a(float f1, float f2)
    {
        e = f1;
        f = f2;
        j = String.format("%s x %s", new Object[] {
            a(e), a(f)
        });
        a.getTextBounds(j, 0, j.length() - 1, i);
    }

    public Bitmap getPhoto()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        c.centerX();
        float f1 = c.bottom;
        f1 = (int)d * 2;
        canvas.saveLayer(c.left, c.top, c.right, c.bottom, null, 17);
        h.setStyle(android.graphics.Paint.Style.FILL);
        h.setColor(-1);
        canvas.drawRect(new RectF(c.left, c.top, c.right, c.bottom), h);
        if (l != null)
        {
            float f2 = c.width() / e;
            l.a(canvas, f2, c);
        }
        canvas.restore();
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        c.set(getPreviewImageRect());
        setMeasuredDimension(i1, j1);
    }

    public void setPaperColor(int i1)
    {
        g = i1;
        postInvalidate();
    }

    public void setPhoto(Bitmap bitmap)
    {
        if (b != null)
        {
            b.recycle();
        }
        b = bitmap;
        invalidate();
    }

    public void setPrintItem(PrintItem printitem)
    {
        l = printitem;
    }

    public void setScaleType(com.hp.mss.hpprint.model.PrintItem.a a1)
    {
        k = a1;
        postInvalidate();
    }

    // Unreferenced inner class com/hp/mss/hpprint/view/PagePreviewView$a
    /* block-local class not found */
    class a {}


    // Unreferenced inner class com/hp/mss/hpprint/view/PagePreviewView$b
    /* block-local class not found */
    class b {}

}

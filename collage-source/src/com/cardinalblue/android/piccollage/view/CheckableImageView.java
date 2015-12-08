// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CheckableImageView extends ImageView
{

    private static Paint a = new Paint();
    private Paint b;
    private Paint c;
    private float d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private int j;
    private boolean k;
    private Matrix l;
    private Rect m;

    public CheckableImageView(Context context)
    {
        this(context, null, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010006);
    }

    public CheckableImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new Paint();
        c = new Paint();
        a.setColor(0xffd9d9d9);
        a.setStyle(android.graphics.Paint.Style.FILL);
        d = 0.0F;
        e = true;
        i = null;
        j = 0;
        k = false;
        l = new Matrix();
        m = new Rect();
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.ADD));
        b.setAntiAlias(true);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.ADD));
        attributeset = context.obtainStyledAttributes(attributeset, com.cardinalblue.android.piccollage.multitouch.photoproto.R.styleable.CheckableImageView, i1, 0);
        setAspectRatio(attributeset.getFloat(0, 0.0F));
        Drawable drawable = attributeset.getDrawable(2);
        if (drawable != null)
        {
            setCheckMarkDrawable(drawable);
        }
        setCheckMarkGravity(attributeset.getInt(3, 0));
        a(attributeset.getBoolean(1, true));
        setCheckedCoverColor(attributeset.getColor(4, 0x6233b5e5));
        setCheckedBorderColor(attributeset.getColor(5, 0xff33b5e5));
        setCheckedBorderWidth(attributeset.getDimensionPixelSize(6, context.getResources().getDimensionPixelSize(0x7f0b00f3)));
        attributeset.recycle();
    }

    private void a(Paint paint, int i1)
    {
        if (i1 == 0)
        {
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.ADD));
            return;
        } else
        {
            paint.setXfermode(null);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (e != flag)
        {
            e = flag;
            invalidate();
        }
    }

    public boolean a()
    {
        return k;
    }

    public void b()
    {
        boolean flag;
        if (!k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    public float getAspectRatio()
    {
        return d;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        getDrawingRect(m);
        if (a()) goto _L2; else goto _L1
_L1:
        if (getDrawable() == null)
        {
            canvas.drawRect(m, a);
        }
_L4:
        return;
_L2:
        canvas.drawRect(m, b);
        canvas.drawRect(m, c);
        if (!e || i == null) goto _L4; else goto _L3
_L3:
        Rect rect;
        int i1;
        int j1;
        canvas.save();
        i1 = getWidth();
        j1 = getHeight();
        i.setBounds(0, 0, i.getIntrinsicWidth(), i.getIntrinsicHeight());
        rect = i.getBounds();
        j;
        JVM INSTR tableswitch 0 4: default 164
    //                   0 198
    //                   1 308
    //                   2 227
    //                   3 251
    //                   4 275;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        float f1;
        float f2;
        f1 = 0.0F;
        f2 = 0.0F;
_L12:
        l.setTranslate(f2, f1);
        canvas.concat(l);
        i.draw(canvas);
        canvas.restore();
        return;
_L6:
        f2 = (float)(i1 - rect.width()) * 0.5F;
        f1 = (float)(j1 - rect.height()) * 0.5F;
        continue; /* Loop/switch isn't completed */
_L8:
        f2 = (i1 - rect.width()) + h;
        f1 = h;
        continue; /* Loop/switch isn't completed */
_L9:
        f2 = h;
        f1 = j1 - rect.height() - h;
        continue; /* Loop/switch isn't completed */
_L10:
        f2 = i1 - rect.width() - h;
        f1 = j1 - rect.height() - h;
        continue; /* Loop/switch isn't completed */
_L7:
        f1 = h;
        f2 = f1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (d > 0.0F)
        {
            i1 = getMeasuredWidth();
            setMeasuredDimension(i1, Math.round((float)i1 * d));
        }
    }

    public void setAspectRatio(float f1)
    {
        if (f1 < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Aspect ratio for height / width should be positive. (").append(f1).append(")").toString());
        }
        if (d != f1)
        {
            d = f1;
            invalidate();
        }
    }

    public void setCheckMarkDrawable(int i1)
    {
        setCheckMarkDrawable(getContext().getDrawable(i1));
    }

    public void setCheckMarkDrawable(Drawable drawable)
    {
        if (i != drawable)
        {
            i = drawable;
            invalidate();
        }
    }

    public void setCheckMarkGravity(int i1)
    {
        if (j != i1)
        {
            j = i1;
            invalidate();
        }
    }

    public void setChecked(boolean flag)
    {
        k = flag;
        invalidate();
    }

    public void setCheckedBorderColor(int i1)
    {
        if (f != i1)
        {
            f = i1;
            a(c, f);
            c.setColor(f);
            c.setAlpha(Color.alpha(f));
            invalidate();
        }
    }

    public void setCheckedBorderWidth(int i1)
    {
        if (h != i1)
        {
            h = i1;
            c.setStrokeWidth(h);
            invalidate();
        }
    }

    public void setCheckedCoverColor(int i1)
    {
        if (g != i1)
        {
            g = i1;
            a(b, g);
            b.setColor(g);
            b.setAlpha(Color.alpha(g));
            invalidate();
        }
    }

}

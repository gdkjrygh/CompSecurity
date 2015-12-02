// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster.widget.DialView;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.k;
import com.qihoo.security.ui.b.c;

// Referenced classes of package com.qihoo.security.booster.widget.DialView:
//            b

public class BoostDialView extends View
{

    private final Paint a = new Paint();
    private int b;
    private final float c;
    private final float d;
    private final float e;
    private float f;
    private int g;
    private RectF h;
    private int i;
    private BitmapDrawable j;

    public BoostDialView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setAntiAlias(true);
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.BoostDialView);
        g = context.getColor(0, 0);
        f = context.getDimension(3, 0.0F);
        e = context.getDimension(4, 0.0F);
        c = context.getDimension(5, 0.0F);
        d = context.getDimension(7, 0.0F);
        context.recycle();
        j = (BitmapDrawable)getResources().getDrawable(0x7f020049);
    }

    static void a(BoostDialView boostdialview, com.qihoo.security.booster.widget.DialView.b b1)
    {
        boostdialview.b(b1);
    }

    private void b(com.qihoo.security.booster.widget.DialView.b b1)
    {
        k k1 = k.a(this, "progress", new int[] {
            0, 100
        });
        k1.a(c.a);
        long l;
        if (com.qihoo.security.app.a.b(getContext()))
        {
            l = 1400L;
        } else
        {
            l = 2600L;
        }
        k1.b(l);
        k1.a(new b(b1) {

            final com.qihoo.security.booster.widget.DialView.b a;
            final BoostDialView b;

            public void a(a a1)
            {
                com.qihoo.security.ui.b.b.a(14, b);
            }

            public void b(a a1)
            {
                com.qihoo.security.ui.b.b.c(14);
                if (a != null)
                {
                    a.c();
                }
            }

            
            {
                b = BoostDialView.this;
                a = b1;
                super();
            }
        });
        k1.a();
    }

    public void a(int l, long l1, com.qihoo.security.booster.widget.DialView.b b1)
    {
        k k1;
        int i1;
        if (l1 > 0L)
        {
            i1 = 0;
        } else
        {
            i1 = b;
        }
        k1 = k.a(this, "progress", new int[] {
            i1, l
        });
        k1.b(700L);
        k1.a(new AccelerateInterpolator());
        k1.a(l1);
        k1.a(new b(b1) {

            final com.qihoo.security.booster.widget.DialView.b a;
            final BoostDialView b;

            public void b(a a1)
            {
                if (a != null)
                {
                    a.a();
                }
            }

            public void d(a a1)
            {
            }

            
            {
                b = BoostDialView.this;
                a = b1;
                super();
            }
        });
        k1.a();
    }

    public void a(int l, com.qihoo.security.booster.widget.DialView.b b1)
    {
        a(l, 0L, b1);
    }

    public void a(com.qihoo.security.booster.widget.DialView.b b1)
    {
        k k1 = k.a(this, "progress", new int[] {
            b, 0
        });
        k1.a(c.b);
        long l;
        if (com.qihoo.security.app.a.b(getContext()))
        {
            l = 400L;
        } else
        {
            l = 500L;
        }
        k1.b(l);
        k1.a(new b(b1) {

            final com.qihoo.security.booster.widget.DialView.b a;
            final BoostDialView b;

            public void a(a a1)
            {
                com.qihoo.security.ui.b.b.a(3, b);
            }

            public void b(a a1)
            {
                com.qihoo.security.ui.b.b.c(3);
                if (a != null)
                {
                    a.b();
                }
                com.qihoo.security.booster.widget.DialView.BoostDialView.a(b, a);
            }

            
            {
                b = BoostDialView.this;
                a = b1;
                super();
            }
        });
        k1.a();
    }

    public int getCricleColor()
    {
        return g;
    }

    public int getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        int l = b;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public float getRoundWidth()
    {
        return f;
    }

    public int getSectorColor()
    {
        return i;
    }

    protected void onDraw(Canvas canvas)
    {
        int l = getWidth() / 2;
        canvas.rotate(150F, l, l);
        int i1 = (int)((float)(int)((float)l - c - d / 2.0F) - (f / 2.0F + e));
        if (h == null)
        {
            h = new RectF(l - i1, l - i1, l + i1, i1 + l);
        }
        a.setStrokeWidth(f);
        a.setColor(i);
        canvas.drawArc(h, 0.0F, (b * 240) / 100, false, a);
        j.setBounds(0, 0, getWidth(), getHeight());
        canvas.rotate((b * 240) / 100 + 90, l, l);
        j.draw(canvas);
    }

    public void setCricleColor(int l)
    {
        g = l;
    }

    public void setProgress(int l)
    {
        this;
        JVM INSTR monitorenter ;
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("progress not less than 0");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        clearAnimation();
        int i1;
        i1 = l;
        if (l > 100)
        {
            i1 = 100;
        }
        if (i1 > 100)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        b = i1;
        postInvalidate();
        this;
        JVM INSTR monitorexit ;
    }

    public void setRoundWidth(float f1)
    {
        f = f1;
    }

    public void setSectorColor(int l)
    {
        i = l;
        postInvalidate();
    }
}

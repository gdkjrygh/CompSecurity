// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

// Referenced classes of package com.snapchat.android.ui:
//            AbstractSnapTimerView

public class StoryTimerView extends AbstractSnapTimerView
{

    private final RectF g;
    private final RectF h;
    private final RectF i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private Bitmap p;
    private Canvas q;
    private Paint r;
    private Paint s;
    private Paint t;
    private Paint u;
    private float v;
    private float w;

    public StoryTimerView(Context context)
    {
        super(context);
        g = new RectF();
        h = new RectF();
        i = new RectF();
        w = 1.0F;
        b();
    }

    public StoryTimerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = new RectF();
        h = new RectF();
        i = new RectF();
        w = 1.0F;
        b();
    }

    private void b()
    {
        float f = Jo.a(7F, getContext());
        float f1 = Jo.a(3F, getContext());
        j = Jo.a(9F, getContext());
        n = j;
        m = j - f / 2.0F;
        o = m;
        k = Jo.a(6.5F, getContext());
        l = Jo.a(4F, getContext());
        setScaleFactor(1.0F);
        u = new Paint(1);
        u.setStrokeWidth(f);
        u.setColor(getResources().getColor(0x7f0c0007));
        r = new Paint(1);
        r.setColor(-1);
        r.setStrokeWidth(f1);
        r.setStyle(android.graphics.Paint.Style.STROKE);
        s = new Paint(1);
        s.setColor(getResources().getColor(0x7f0c0079));
        s.setStyle(android.graphics.Paint.Style.FILL);
        t = new Paint(1);
        t.setAlpha(0);
    }

    private void c()
    {
        int i1 = (int)Math.ceil(Math.sqrt(w * 2.0F * k * w * k));
        h.set(v - (float)i1, v - (float)i1, (float)i1 + v, (float)i1 + v);
        i1 = (int)Math.ceil(Math.sqrt(w * 2.0F * l * w * l));
        i.set(v - (float)i1, v - (float)i1, (float)i1 + v, (float)i1 + v);
    }

    public final void a(int i1, int j1)
    {
    }

    public final void b(boolean flag)
    {
        Paint paint = t;
        char c1;
        if (flag)
        {
            c1 = '\377';
        } else
        {
            c1 = '\0';
        }
        paint.setAlpha(c1);
    }

    public void onDraw(Canvas canvas)
    {
        if (getHeight() != 0 && getWidth() != 0)
        {
            q.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            long l1 = d - c;
            float f = (float)(Math.min(Math.max(0L, b - c), l1) * 360L) / (float)l1;
            l1 = this.f - e;
            float f1 = (float)(Math.min(l1, Math.max(0L, b - e)) * 360L) / (float)l1;
            u.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawCircle(g.centerX(), g.centerY(), n, u);
            u.setStyle(android.graphics.Paint.Style.FILL);
            q.drawCircle(g.centerX(), g.centerY(), o, u);
            canvas.drawArc(h, -90F + f, 360F - f, false, r);
            q.drawArc(i, -90F + f1, 360F - f1, true, s);
            canvas.drawBitmap(p, 0.0F, 0.0F, t);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        v = i1 / 2;
        if (i1 != 0 && j1 != 0)
        {
            if (p == null || p.getWidth() != i1 || p.getHeight() != j1)
            {
                if (p != null)
                {
                    p.recycle();
                }
                p = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
                q = new Canvas(p);
            }
            g.set(0.0F, 0.0F, i1, j1);
            c();
        }
    }

    public void setScaleFactor(float f)
    {
        if (f < 0.0F)
        {
            return;
        } else
        {
            w = f;
            n = j * f;
            o = m * f;
            c();
            return;
        }
    }
}

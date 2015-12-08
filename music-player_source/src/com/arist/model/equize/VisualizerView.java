// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.arist.c.g;
import com.arist.model.skin.b;
import com.arist.model.skin.m;
import java.util.Arrays;

// Referenced classes of package com.arist.model.equize:
//            o, p, n

public class VisualizerView extends View
    implements o, m
{

    private n a;
    private int b[];
    private final Object c = new Object();
    private Paint d;
    private int e[];
    private int f[];
    private int g;
    private int h;
    private int i;
    private Runnable j;

    public VisualizerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = 5;
        i = 1;
        j = new p(this);
        d = new Paint(1);
        d.setAlpha(50);
        d.setColor(-1);
        d.setStyle(android.graphics.Paint.Style.FILL);
        d.setStrokeWidth(h);
        h = com.arist.c.g.a(context, 5F);
    }

    private int[] a()
    {
        int ai[];
        synchronized (c)
        {
            ai = b;
        }
        return ai;
    }

    public final void a(int k)
    {
        d.setColor(k);
    }

    public final void a(n n1)
    {
        a = n1;
        n1.a(this);
    }

    public final void a(byte abyte0[])
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        b = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        int l;
        b = new int[g];
        l = abyte0.length;
        int k = 0;
_L2:
        if (k < g)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        b[k] = Math.abs(abyte0[k]);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
        removeCallbacks(j);
        postDelayed(j, 0L);
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
        removeCallbacks(j);
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        int ai[];
        int k;
        int l;
        int i1;
        if (a() != null && g > 0)
        {
            ai = Arrays.copyOf(a(), g);
        } else
        {
            ai = null;
        }
        if (ai == null || a == null || e == null)
        {
            ai = null;
            break MISSING_BLOCK_LABEL_46;
        }
        l = (getWidth() - h * 2) / 128;
        k = l;
        if (l <= 0)
        {
            k = 1;
        }
        i1 = ai.length;
        l = 0;
_L4:
        if (l < i1) goto _L2; else goto _L1
_L1:
        k = 0;
_L5:
        if (k < i1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
          goto _L3
_L2:
        ai[l] = ai[l] * k;
        l++;
          goto _L4
        l = f[k];
        e[k] = e[k] - (i * l * l) / 2;
        f[k] = l + 1;
        if (e[k] <= ai[k] + h)
        {
            e[k] = ai[k] + h;
            f[k] = 0;
        }
        k++;
          goto _L5
_L3:
        if (a == null || !a.a() || ai == null)
        {
            return;
        }
        canvas.rotate(180F, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
        f1 = (float)(getWidth() - (g * 2 - 1) * h) / 2.0F;
        k = 0;
        do
        {
            if (k >= g)
            {
                canvas.rotate(-180F, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
                return;
            }
            canvas.drawPoint(f1, e[k], d);
            canvas.drawLine(f1, ai[k], f1, 0.0F, d);
            f1 += h * 2;
            k++;
        } while (true);
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        g = k / (h * 2);
        e = new int[g];
        f = new int[g];
    }
}

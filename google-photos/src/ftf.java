// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;

public final class ftf
{

    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    final int c;
    public final int d;
    public final Rect e = new Rect();
    public final Paint f = new Paint(1);
    public final int g;
    final int h;
    final int i;
    final ValueAnimator j = ValueAnimator.ofFloat(new float[] {
        0.0F, 1.0F
    }).setDuration(200L);
    public final ValueAnimator k = ValueAnimator.ofFloat(new float[] {
        0.0F, 1.0F
    });
    public boolean l;
    boolean m;
    public int n;
    public float o;
    public float p;
    public String q;
    public final fsv r;

    public ftf(fsv fsv, Context context)
    {
        r = fsv;
        super();
        context = context.getResources();
        b.setColor(context.getColor(b.qh));
        d = context.getDimensionPixelSize(b.qm);
        c = b.getAlpha();
        f.setColor(context.getColor(b.qi));
        f.setTextSize(context.getDimensionPixelSize(b.qn));
        f.setTypeface(Typeface.DEFAULT_BOLD);
        g = context.getDimensionPixelOffset(b.ql);
        h = context.getDimensionPixelSize(b.qj);
        i = context.getDimensionPixelSize(b.qk);
        p = h;
        j.addUpdateListener(new ftg(this, fsv));
        k.addUpdateListener(new fth(this, fsv));
        k.addListener(new fti(this, fsv));
    }

    public final void a()
    {
        l = true;
        m = false;
        k.setFloatValues(new float[] {
            ((Float)k.getAnimatedValue()).floatValue(), 1.0F
        });
        k.setDuration(100L);
        k.start();
    }

    public final void a(long l1)
    {
        if (m || !l)
        {
            return;
        } else
        {
            m = true;
            k.setFloatValues(new float[] {
                ((Float)k.getAnimatedValue()).floatValue(), 0.0F
            });
            k.setDuration(150L);
            k.start();
            return;
        }
    }
}

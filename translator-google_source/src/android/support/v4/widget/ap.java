// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

final class ap
{

    final RectF a = new RectF();
    final Paint b = new Paint();
    final Paint c = new Paint();
    float d;
    float e;
    float f;
    float g;
    float h;
    int i[];
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p;
    double q;
    int r;
    int s;
    int t;
    final Paint u = new Paint(1);
    int v;
    int w;
    private final android.graphics.drawable.Drawable.Callback x;

    public ap(android.graphics.drawable.Drawable.Callback callback)
    {
        d = 0.0F;
        e = 0.0F;
        f = 0.0F;
        g = 5F;
        h = 2.5F;
        x = callback;
        b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStyle(android.graphics.Paint.Style.FILL);
        c.setAntiAlias(true);
    }

    final int a()
    {
        return (j + 1) % i.length;
    }

    public final void a(float f1)
    {
        d = f1;
        d();
    }

    public final void a(int i1)
    {
        j = i1;
        w = i[j];
    }

    public final void a(boolean flag)
    {
        if (n != flag)
        {
            n = flag;
            d();
        }
    }

    public final void a(int ai[])
    {
        i = ai;
        a(0);
    }

    public final void b()
    {
        k = d;
        l = e;
        m = f;
    }

    public final void b(float f1)
    {
        e = f1;
        d();
    }

    public final void c()
    {
        k = 0.0F;
        l = 0.0F;
        m = 0.0F;
        a(0.0F);
        b(0.0F);
        c(0.0F);
    }

    public final void c(float f1)
    {
        f = f1;
        d();
    }

    final void d()
    {
        x.invalidateDrawable(null);
    }
}

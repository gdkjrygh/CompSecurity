// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            a, b

public class c extends a
{

    private Alignment c;
    private Alignment d;
    private Drawable e;
    private final PointF f;

    public c(Drawable drawable)
    {
        this(drawable, null);
    }

    public c(Drawable drawable, String s)
    {
        c = Alignment.b;
        d = Alignment.b;
        f = new PointF();
        a = s;
        if (drawable == null)
        {
            throw new NullPointerException("Drawable cannot be null");
        } else
        {
            e = drawable;
            return;
        }
    }

    public void a(Canvas canvas, e e1)
    {
        int i;
        int j;
        int k;
        int l;
        b().a(e1, f);
        i = (int)f.x;
        j = (int)f.y;
        k = e.getIntrinsicWidth();
        l = e.getIntrinsicHeight();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Alignment.values().length];
                try
                {
                    a[Alignment.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Alignment.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Alignment.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[d.ordinal()];
        JVM INSTR tableswitch 1 2: default 84
    //                   1 144
    //                   2 152;
           goto _L1 _L2 _L3
_L1:
        _cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 2: default 116
    //                   1 162
    //                   2 172;
           goto _L4 _L5 _L6
_L4:
        e.setBounds(i, j, k + i, l + j);
        e.draw(canvas);
        return;
_L2:
        i -= k;
          goto _L1
_L3:
        i -= k / 2;
          goto _L1
_L5:
        j -= l;
          goto _L4
_L6:
        j -= l / 2;
          goto _L4
    }

    public void a(Alignment alignment)
    {
        if (c != alignment)
        {
            c = alignment;
        }
    }

    public void a(Alignment alignment, Alignment alignment1)
    {
        b(alignment);
        a(alignment1);
    }

    public void b(Alignment alignment)
    {
        if (d != alignment)
        {
            d = alignment;
        }
    }

    public Alignment d()
    {
        return c;
    }

    public Alignment e()
    {
        return d;
    }

    public Drawable f()
    {
        return e;
    }
}

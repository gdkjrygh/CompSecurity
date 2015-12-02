// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.circularprogress;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Interpolator;

// Referenced classes of package com.qihoo.security.widget.circularprogress:
//            CircularProgressDrawable, a

public static class a
{

    private int a[];
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private yle g;
    private Interpolator h;
    private Interpolator i;

    private void a(Context context)
    {
        d = context.getResources().getDimension(0x7f090015);
        b = 1.0F;
        c = 1.0F;
        a = (new int[] {
            context.getResources().getColor(0x7f080048)
        });
        e = context.getResources().getInteger(0x7f0a0002);
        f = context.getResources().getInteger(0x7f0a0003);
        g = yle.ROUNDED;
    }

    public yle.ROUNDED a(float f1)
    {
        com.qihoo.security.widget.circularprogress.a.a(f1);
        b = f1;
        return this;
    }

    public b a(int j)
    {
        a = (new int[] {
            j
        });
        return this;
    }

    public a a(int ai[])
    {
        com.qihoo.security.widget.circularprogress.a.a(ai);
        a = ai;
        return this;
    }

    public CircularProgressDrawable a()
    {
        return new CircularProgressDrawable(a, d, b, c, e, f, g, i, h, null);
    }

    public yle b(float f1)
    {
        com.qihoo.security.widget.circularprogress.a.a(f1);
        c = f1;
        return this;
    }

    public c b(int j)
    {
        com.qihoo.security.widget.circularprogress.a.a(j);
        e = j;
        return this;
    }

    public e c(float f1)
    {
        com.qihoo.security.widget.circularprogress.a.a(f1, "StrokeWidth");
        d = f1;
        return this;
    }

    public d c(int j)
    {
        com.qihoo.security.widget.circularprogress.a.a(j);
        f = j;
        return this;
    }

    public yle(Context context)
    {
        h = CircularProgressDrawable.a();
        i = CircularProgressDrawable.b();
        a(context);
    }
}

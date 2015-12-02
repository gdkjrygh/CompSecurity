// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.graphics.Canvas;

// Referenced classes of package com.facebook.reflex:
//            Image, c, a

public abstract class b extends Image
{

    private static final a b = new c();
    private int c;
    private int d;
    private a e;

    public b()
    {
        e = b;
    }

    public void a(int i, int j)
    {
        if (i == c && j == d)
        {
            return;
        } else
        {
            c = i;
            d = j;
            f();
            return;
        }
    }

    protected abstract void a(Canvas canvas);

    public void a(a a1)
    {
        e = a1;
    }

    public int b()
    {
        return d;
    }

    protected void c()
    {
        if (c == 0 || d == 0)
        {
            a(((android.graphics.Bitmap) (null)));
            return;
        } else
        {
            android.graphics.Bitmap bitmap = e.a(c, d);
            a(new Canvas(bitmap));
            a(bitmap, c, d);
            e.a(bitmap);
            return;
        }
    }

    public int f_()
    {
        return c;
    }

}

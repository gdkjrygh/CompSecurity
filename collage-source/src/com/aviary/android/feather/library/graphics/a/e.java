// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

// Referenced classes of package com.aviary.android.feather.library.graphics.a:
//            d

public class e extends BitmapDrawable
    implements d
{

    BlurMaskFilter a;
    Paint b;
    Bitmap c;
    boolean d;
    Rect e;
    private float f;
    private float g;
    private String h;
    private String i;

    public e(Resources resources, String s, String s1, String s2)
    {
        super(resources, BitmapFactory.decodeFile(s));
        f = 0.0F;
        g = 0.0F;
        d = true;
        e = new Rect();
        h = s1;
        i = s2;
        a = new BlurMaskFilter(5F, android.graphics.BlurMaskFilter.Blur.OUTER);
        b = new Paint(1);
        b.setMaskFilter(a);
        resources = new int[2];
        c = getBitmap().extractAlpha(b, resources);
    }

    public int a()
    {
        return getBitmap().getWidth();
    }

    public void a(boolean flag)
    {
        d = flag;
        invalidateSelf();
    }

    public boolean a(RectF rectf)
    {
        return rectf.width() >= f && rectf.height() >= g;
    }

    public int b()
    {
        return getBitmap().getHeight();
    }

    public void b(float f1, float f2)
    {
        f = f1;
        g = f2;
    }

    public String c()
    {
        return h;
    }

    public String d()
    {
        return i;
    }

    public void draw(Canvas canvas)
    {
        if (d)
        {
            copyBounds(e);
            canvas.drawBitmap(c, null, e, null);
        }
        super.draw(canvas);
    }

    public float f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public float j()
    {
        return (float)getIntrinsicHeight();
    }

    public float k()
    {
        return (float)getIntrinsicWidth();
    }
}

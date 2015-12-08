// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.view.bq;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            a, b

class i extends InsetDrawable
    implements android.graphics.drawable.Drawable.Callback
{

    final a a;
    private final boolean b;
    private final Rect c;
    private float d;
    private float e;

    private i(a a1, Drawable drawable)
    {
        boolean flag = false;
        a = a1;
        super(drawable, 0);
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            flag = true;
        }
        b = flag;
        c = new Rect();
    }

    i(a a1, Drawable drawable, b b1)
    {
        this(a1, drawable);
    }

    public float a()
    {
        return d;
    }

    public void a(float f)
    {
        d = f;
        invalidateSelf();
    }

    public void b(float f)
    {
        e = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        int j = 1;
        copyBounds(c);
        canvas.save();
        float f;
        float f1;
        float f2;
        boolean flag;
        int k;
        if (bq.e(android.support.v4.app.a.a(a).getWindow().getDecorView()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j = -1;
        }
        k = c.width();
        f = -e;
        f1 = k;
        f2 = d;
        canvas.translate((float)j * (f * f1 * f2), 0.0F);
        if (flag && !b)
        {
            canvas.translate(k, 0.0F);
            canvas.scale(-1F, 1.0F);
        }
        super.draw(canvas);
        canvas.restore();
    }
}

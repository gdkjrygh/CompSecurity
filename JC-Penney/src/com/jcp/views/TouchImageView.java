// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.views:
//            af, ae

public class TouchImageView extends ImageView
{

    private static final String q = com/jcp/views/TouchImageView.getName();
    private Matrix a;
    private int b;
    private PointF c;
    private PointF d;
    private float e;
    private float f;
    private float g[];
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;
    private ScaleGestureDetector o;
    private Context p;

    public TouchImageView(Context context)
    {
        super(context);
        b = 0;
        c = new PointF();
        d = new PointF();
        e = 1.0F;
        f = 6F;
        j = 1.0F;
        a(context);
    }

    public TouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        c = new PointF();
        d = new PointF();
        e = 1.0F;
        f = 6F;
        j = 1.0F;
        a(context);
    }

    static float a(TouchImageView touchimageview, float f1)
    {
        f1 = touchimageview.j * f1;
        touchimageview.j = f1;
        return f1;
    }

    static int a(TouchImageView touchimageview, int i1)
    {
        touchimageview.b = i1;
        return i1;
    }

    static ScaleGestureDetector a(TouchImageView touchimageview)
    {
        return touchimageview.o;
    }

    private void a(Context context)
    {
        super.setClickable(true);
        p = context;
        o = new ScaleGestureDetector(context, new af(this, null));
        a = new Matrix();
        g = new float[9];
        setImageMatrix(a);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setOnTouchListener(new com.jcp.views.ae(this));
    }

    static float b(TouchImageView touchimageview, float f1)
    {
        touchimageview.j = f1;
        return f1;
    }

    static PointF b(TouchImageView touchimageview)
    {
        return touchimageview.c;
    }

    static PointF c(TouchImageView touchimageview)
    {
        return touchimageview.d;
    }

    static int d(TouchImageView touchimageview)
    {
        return touchimageview.b;
    }

    static int e(TouchImageView touchimageview)
    {
        return touchimageview.h;
    }

    static float f(TouchImageView touchimageview)
    {
        return touchimageview.k;
    }

    static float g(TouchImageView touchimageview)
    {
        return touchimageview.j;
    }

    static int h(TouchImageView touchimageview)
    {
        return touchimageview.i;
    }

    static float i(TouchImageView touchimageview)
    {
        return touchimageview.l;
    }

    static Matrix j(TouchImageView touchimageview)
    {
        return touchimageview.a;
    }

    static float k(TouchImageView touchimageview)
    {
        return touchimageview.f;
    }

    static float l(TouchImageView touchimageview)
    {
        return touchimageview.e;
    }

    float a(float f1, float f2, float f3)
    {
        float f4 = 0.0F;
        if (f3 <= f2)
        {
            f2 -= f3;
            f3 = 0.0F;
        } else
        {
            f3 = f2 - f3;
            f2 = 0.0F;
        }
        if (f1 < f3)
        {
            f3 = -f1 + f3;
        } else
        {
            f3 = f4;
            if (f1 > f2)
            {
                return -f1 + f2;
            }
        }
        return f3;
    }

    void a()
    {
        a.getValues(g);
        float f2 = g[2];
        float f1 = g[5];
        f2 = a(f2, h, k * j);
        f1 = a(f1, i, l * j);
        if (f2 != 0.0F || f1 != 0.0F)
        {
            a.postTranslate(f2, f1);
        }
    }

    float b(float f1, float f2, float f3)
    {
        if (f3 <= f2)
        {
            f1 = 0.0F;
        }
        return f1;
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        h = android.view.View.MeasureSpec.getSize(i1);
        i = android.view.View.MeasureSpec.getSize(j1);
        if ((n != h || n != i) && h != 0 && i != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        n = i;
        m = h;
        if (j != 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = drawable.getIntrinsicWidth();
        j1 = drawable.getIntrinsicHeight();
        ae.d(q, (new StringBuilder()).append("bmWidth: ").append(i1).append(" bmHeight : ").append(j1).toString());
        float f1 = Math.min((float)h / (float)i1, (float)i / (float)j1);
        a.setScale(f1, f1);
        float f4 = i;
        float f5 = j1;
        float f2 = h;
        float f3 = i1;
        f4 = (f4 - f5 * f1) / 2.0F;
        f1 = (f2 - f3 * f1) / 2.0F;
        a.postTranslate(f1, f4);
        k = (float)h - f1 * 2.0F;
        l = (float)i - f4 * 2.0F;
        setImageMatrix(a);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        a();
        return;
    }

    public void setMaxZoom(float f1)
    {
        f = f1;
    }

}

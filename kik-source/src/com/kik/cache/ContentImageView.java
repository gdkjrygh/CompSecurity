// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import com.kik.g.k;
import kik.a.d.a.a;
import kik.a.z;
import kik.android.widget.KikNetworkedImageView;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            p, q, r, o, 
//            ad

public class ContentImageView extends KikNetworkedImageView
{
    private final class a extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final ContentImageView a;

        public final boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f1 = scalegesturedetector.getScaleFactor();
            float f2 = com.kik.cache.ContentImageView.k(a);
            com.kik.cache.ContentImageView.a(a, f1);
            if (com.kik.cache.ContentImageView.k(a) > ContentImageView.q(a))
            {
                ContentImageView.b(a, ContentImageView.q(a));
                f1 = ContentImageView.q(a) / f2;
            } else
            if (com.kik.cache.ContentImageView.k(a) < ContentImageView.r(a))
            {
                ContentImageView.b(a, ContentImageView.r(a));
                f1 = ContentImageView.r(a) / f2;
            }
            ContentImageView.c(a, ContentImageView.m(a) * com.kik.cache.ContentImageView.k(a) - ContentImageView.m(a) - ContentImageView.s(a) * 2.0F * com.kik.cache.ContentImageView.k(a));
            ContentImageView.d(a, ContentImageView.o(a) * com.kik.cache.ContentImageView.k(a) - ContentImageView.o(a) - ContentImageView.t(a) * 2.0F * com.kik.cache.ContentImageView.k(a));
            if (ContentImageView.j(a) * com.kik.cache.ContentImageView.k(a) <= ContentImageView.m(a) || ContentImageView.l(a) * com.kik.cache.ContentImageView.k(a) <= ContentImageView.o(a))
            {
                ContentImageView.f(a).postScale(f1, f1, ContentImageView.m(a) / 2.0F, ContentImageView.o(a) / 2.0F);
                if (f1 < 1.0F)
                {
                    ContentImageView.f(a).getValues(ContentImageView.e(a));
                    f2 = ContentImageView.e(a)[2];
                    float f4 = ContentImageView.e(a)[5];
                    if (f1 < 1.0F)
                    {
                        if ((float)Math.round(ContentImageView.j(a) * com.kik.cache.ContentImageView.k(a)) < ContentImageView.m(a))
                        {
                            if (f4 < -ContentImageView.n(a))
                            {
                                ContentImageView.f(a).postTranslate(0.0F, -(ContentImageView.n(a) + f4));
                            } else
                            if (f4 > 0.0F)
                            {
                                ContentImageView.f(a).postTranslate(0.0F, -f4);
                            }
                        } else
                        if (f2 < -ContentImageView.p(a))
                        {
                            ContentImageView.f(a).postTranslate(-(f2 + ContentImageView.p(a)), 0.0F);
                        } else
                        if (f2 > 0.0F)
                        {
                            ContentImageView.f(a).postTranslate(-f2, 0.0F);
                        }
                    }
                }
            } else
            {
                ContentImageView.f(a).postScale(f1, f1, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
                ContentImageView.f(a).getValues(ContentImageView.e(a));
                float f3 = ContentImageView.e(a)[2];
                float f5 = ContentImageView.e(a)[5];
                if (f1 < 1.0F)
                {
                    if (f3 < -ContentImageView.p(a))
                    {
                        ContentImageView.f(a).postTranslate(-(f3 + ContentImageView.p(a)), 0.0F);
                    } else
                    if (f3 > 0.0F)
                    {
                        ContentImageView.f(a).postTranslate(-f3, 0.0F);
                    }
                    if (f5 < -ContentImageView.n(a))
                    {
                        ContentImageView.f(a).postTranslate(0.0F, -(ContentImageView.n(a) + f5));
                    } else
                    if (f5 > 0.0F)
                    {
                        ContentImageView.f(a).postTranslate(0.0F, -f5);
                    }
                }
            }
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            com.kik.cache.ContentImageView.a(a, 2);
            return true;
        }

        private a()
        {
            a = ContentImageView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private k A;
    private final com.android.volley.r.a B;
    private final com.android.volley.r.b C;
    private Context D;
    private kik.a.d.a.a a;
    private Bitmap b;
    private Matrix c;
    private int d;
    private PointF h;
    private PointF i;
    private float j;
    private float k;
    private float l[];
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private ScaleGestureDetector x;
    private android.view.View.OnTouchListener y;
    private k z;

    public ContentImageView(Context context)
    {
        super(context);
        c = new Matrix();
        d = 0;
        h = new PointF();
        i = new PointF();
        j = 1.0F;
        k = 4F;
        q = 1.0F;
        z = new k(this);
        A = new k(this);
        B = new p(this);
        C = new q(this);
        a(context);
    }

    public ContentImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Matrix();
        d = 0;
        h = new PointF();
        i = new PointF();
        j = 1.0F;
        k = 4F;
        q = 1.0F;
        z = new k(this);
        A = new k(this);
        B = new p(this);
        C = new q(this);
        a(context);
    }

    public ContentImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new Matrix();
        d = 0;
        h = new PointF();
        i = new PointF();
        j = 1.0F;
        k = 4F;
        q = 1.0F;
        z = new k(this);
        A = new k(this);
        B = new p(this);
        C = new q(this);
        a(context);
    }

    static float a(ContentImageView contentimageview, float f1)
    {
        f1 = contentimageview.q * f1;
        contentimageview.q = f1;
        return f1;
    }

    static int a(ContentImageView contentimageview, int i1)
    {
        contentimageview.d = i1;
        return i1;
    }

    static k a(ContentImageView contentimageview)
    {
        return contentimageview.A;
    }

    private void a(Context context)
    {
        super.setClickable(true);
        D = context;
        x = new ScaleGestureDetector(context, new a((byte)0));
        c.setTranslate(1.0F, 1.0F);
        l = new float[9];
        setImageMatrix(c);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setOnTouchListener(new r(this));
    }

    static float b(ContentImageView contentimageview, float f1)
    {
        contentimageview.q = f1;
        return f1;
    }

    static k b(ContentImageView contentimageview)
    {
        return contentimageview.z;
    }

    static float c(ContentImageView contentimageview, float f1)
    {
        contentimageview.r = f1;
        return f1;
    }

    static android.view.View.OnTouchListener c(ContentImageView contentimageview)
    {
        return contentimageview.y;
    }

    static float d(ContentImageView contentimageview, float f1)
    {
        contentimageview.s = f1;
        return f1;
    }

    static ScaleGestureDetector d(ContentImageView contentimageview)
    {
        return contentimageview.x;
    }

    static float[] e(ContentImageView contentimageview)
    {
        return contentimageview.l;
    }

    static Matrix f(ContentImageView contentimageview)
    {
        return contentimageview.c;
    }

    static PointF g(ContentImageView contentimageview)
    {
        return contentimageview.h;
    }

    static PointF h(ContentImageView contentimageview)
    {
        return contentimageview.i;
    }

    static int i(ContentImageView contentimageview)
    {
        return contentimageview.d;
    }

    static float j(ContentImageView contentimageview)
    {
        return contentimageview.t;
    }

    static float k(ContentImageView contentimageview)
    {
        return contentimageview.q;
    }

    static float l(ContentImageView contentimageview)
    {
        return contentimageview.u;
    }

    static float m(ContentImageView contentimageview)
    {
        return contentimageview.o;
    }

    static float n(ContentImageView contentimageview)
    {
        return contentimageview.s;
    }

    static float o(ContentImageView contentimageview)
    {
        return contentimageview.p;
    }

    static float p(ContentImageView contentimageview)
    {
        return contentimageview.r;
    }

    static float q(ContentImageView contentimageview)
    {
        return contentimageview.k;
    }

    static float r(ContentImageView contentimageview)
    {
        return contentimageview.j;
    }

    static float s(ContentImageView contentimageview)
    {
        return contentimageview.m;
    }

    static float t(ContentImageView contentimageview)
    {
        return contentimageview.n;
    }

    protected final w a(Bitmap bitmap, String s1)
    {
        return new cs(bitmap, s1);
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null || b != null && bitmap != b)
        {
            b = null;
        }
        super.a(bitmap);
    }

    public final void a(kik.a.d.a.a a1, byte abyte0[], ad ad1, com.kik.android.a a2, kik.a.f.k k1, z z1, ad.d d1)
    {
        a = a1;
        a1 = com.kik.cache.o.a(a1, abyte0, a2, k1, z1);
        a(((com.kik.cache.z) (a1)), ad1, 0, 0, true, true);
        ad1.a(a1, d1, 0, 0, true);
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        o = android.view.View.MeasureSpec.getSize(i1);
        p = android.view.View.MeasureSpec.getSize(j1);
        float f1 = Math.min(o / v, p / w);
        c.setScale(f1, f1);
        setImageMatrix(c);
        q = 1.0F;
        n = p - w * f1;
        m = o - f1 * v;
        n = n / 2.0F;
        m = m / 2.0F;
        c.postTranslate(m, n);
        t = o - m * 2.0F;
        u = p - n * 2.0F;
        r = o * q - o - m * 2.0F * q;
        s = p * q - p - n * 2.0F * q;
        setImageMatrix(c);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        if (bitmap != null)
        {
            v = bitmap.getWidth();
            w = bitmap.getHeight();
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        if (drawable != null)
        {
            v = drawable.getIntrinsicWidth();
            w = drawable.getIntrinsicHeight();
        }
    }
}

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
import com.kik.g.e;
import com.kik.g.k;
import kik.a.d.aa;
import kik.android.widget.KikNetworkedImageView;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            aq, ar, at, ak, 
//            ad, k, as

public class ProfileImageView extends KikNetworkedImageView
{
    private final class a extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final ProfileImageView a;

        public final boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f1 = scalegesturedetector.getScaleFactor();
            float f2 = com.kik.cache.ProfileImageView.k(a);
            ProfileImageView.a(a, f1);
            if (com.kik.cache.ProfileImageView.k(a) > ProfileImageView.q(a))
            {
                ProfileImageView.b(a, ProfileImageView.q(a));
                f1 = ProfileImageView.q(a) / f2;
            } else
            if (com.kik.cache.ProfileImageView.k(a) < ProfileImageView.r(a))
            {
                ProfileImageView.b(a, ProfileImageView.r(a));
                f1 = ProfileImageView.r(a) / f2;
            }
            ProfileImageView.c(a, ProfileImageView.m(a) * com.kik.cache.ProfileImageView.k(a) - ProfileImageView.m(a) - ProfileImageView.s(a) * 2.0F * com.kik.cache.ProfileImageView.k(a));
            ProfileImageView.d(a, ProfileImageView.o(a) * com.kik.cache.ProfileImageView.k(a) - ProfileImageView.o(a) - ProfileImageView.t(a) * 2.0F * com.kik.cache.ProfileImageView.k(a));
            if (ProfileImageView.j(a) * com.kik.cache.ProfileImageView.k(a) <= ProfileImageView.m(a) || ProfileImageView.l(a) * com.kik.cache.ProfileImageView.k(a) <= ProfileImageView.o(a))
            {
                ProfileImageView.f(a).postScale(f1, f1, ProfileImageView.m(a) / 2.0F, ProfileImageView.o(a) / 2.0F);
                if (f1 < 1.0F)
                {
                    ProfileImageView.f(a).getValues(com.kik.cache.ProfileImageView.e(a));
                    f2 = com.kik.cache.ProfileImageView.e(a)[2];
                    float f4 = com.kik.cache.ProfileImageView.e(a)[5];
                    if (f1 < 1.0F)
                    {
                        if ((float)Math.round(ProfileImageView.j(a) * com.kik.cache.ProfileImageView.k(a)) < ProfileImageView.m(a))
                        {
                            if (f4 < -ProfileImageView.n(a))
                            {
                                ProfileImageView.f(a).postTranslate(0.0F, -(ProfileImageView.n(a) + f4));
                            } else
                            if (f4 > 0.0F)
                            {
                                ProfileImageView.f(a).postTranslate(0.0F, -f4);
                            }
                        } else
                        if (f2 < -ProfileImageView.p(a))
                        {
                            ProfileImageView.f(a).postTranslate(-(f2 + ProfileImageView.p(a)), 0.0F);
                        } else
                        if (f2 > 0.0F)
                        {
                            ProfileImageView.f(a).postTranslate(-f2, 0.0F);
                        }
                    }
                }
            } else
            {
                ProfileImageView.f(a).postScale(f1, f1, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
                ProfileImageView.f(a).getValues(com.kik.cache.ProfileImageView.e(a));
                float f3 = com.kik.cache.ProfileImageView.e(a)[2];
                float f5 = com.kik.cache.ProfileImageView.e(a)[5];
                if (f1 < 1.0F)
                {
                    if (f3 < -ProfileImageView.p(a))
                    {
                        ProfileImageView.f(a).postTranslate(-(f3 + ProfileImageView.p(a)), 0.0F);
                    } else
                    if (f3 > 0.0F)
                    {
                        ProfileImageView.f(a).postTranslate(-f3, 0.0F);
                    }
                    if (f5 < -ProfileImageView.n(a))
                    {
                        ProfileImageView.f(a).postTranslate(0.0F, -(ProfileImageView.n(a) + f5));
                    } else
                    if (f5 > 0.0F)
                    {
                        ProfileImageView.f(a).postTranslate(0.0F, -f5);
                    }
                }
            }
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            ProfileImageView.a(a, 2);
            return true;
        }

        private a()
        {
            a = ProfileImageView.this;
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
    private kik.a.d.k a;
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

    public ProfileImageView(Context context)
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
        B = new aq(this);
        C = new ar(this);
        a(context);
    }

    public ProfileImageView(Context context, AttributeSet attributeset)
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
        B = new aq(this);
        C = new ar(this);
        a(context);
    }

    public ProfileImageView(Context context, AttributeSet attributeset, int i1)
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
        B = new aq(this);
        C = new ar(this);
        a(context);
    }

    static float a(ProfileImageView profileimageview, float f1)
    {
        f1 = profileimageview.q * f1;
        profileimageview.q = f1;
        return f1;
    }

    static int a(ProfileImageView profileimageview, int i1)
    {
        profileimageview.d = i1;
        return i1;
    }

    static k a(ProfileImageView profileimageview)
    {
        return profileimageview.A;
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
        setOnTouchListener(new at(this));
    }

    static float b(ProfileImageView profileimageview, float f1)
    {
        profileimageview.q = f1;
        return f1;
    }

    static k b(ProfileImageView profileimageview)
    {
        return profileimageview.z;
    }

    static float c(ProfileImageView profileimageview, float f1)
    {
        profileimageview.r = f1;
        return f1;
    }

    static android.view.View.OnTouchListener c(ProfileImageView profileimageview)
    {
        return profileimageview.y;
    }

    static float d(ProfileImageView profileimageview, float f1)
    {
        profileimageview.s = f1;
        return f1;
    }

    static ScaleGestureDetector d(ProfileImageView profileimageview)
    {
        return profileimageview.x;
    }

    static float[] e(ProfileImageView profileimageview)
    {
        return profileimageview.l;
    }

    static Matrix f(ProfileImageView profileimageview)
    {
        return profileimageview.c;
    }

    static PointF g(ProfileImageView profileimageview)
    {
        return profileimageview.h;
    }

    static PointF h(ProfileImageView profileimageview)
    {
        return profileimageview.i;
    }

    static int i(ProfileImageView profileimageview)
    {
        return profileimageview.d;
    }

    static float j(ProfileImageView profileimageview)
    {
        return profileimageview.t;
    }

    static float k(ProfileImageView profileimageview)
    {
        return profileimageview.q;
    }

    static float l(ProfileImageView profileimageview)
    {
        return profileimageview.u;
    }

    static float m(ProfileImageView profileimageview)
    {
        return profileimageview.o;
    }

    static float n(ProfileImageView profileimageview)
    {
        return profileimageview.s;
    }

    static float o(ProfileImageView profileimageview)
    {
        return profileimageview.p;
    }

    static float p(ProfileImageView profileimageview)
    {
        return profileimageview.r;
    }

    static float q(ProfileImageView profileimageview)
    {
        return profileimageview.k;
    }

    static float r(ProfileImageView profileimageview)
    {
        return profileimageview.j;
    }

    static float s(ProfileImageView profileimageview)
    {
        return profileimageview.m;
    }

    static float t(ProfileImageView profileimageview)
    {
        return profileimageview.n;
    }

    public final e a()
    {
        return z.a();
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

    public final void a(aa aa, ad ad1, com.android.volley.r.b b1, ad.d d1)
    {
        aa = ak.a(aa, b1, false, B, true, false);
        a(((z) (aa)), ad1, 0, 0, true, false);
        ad1.a(aa, d1);
    }

    public final void a(kik.a.d.k k1, ad ad1)
    {
        a = k1;
        com.kik.cache.k k2 = null;
        if (k1 != null)
        {
            k2 = com.kik.cache.k.a(k1, C, B, false, 4, true, false);
        }
        a(((z) (k2)), ad1, 0, 0, true, true);
        ad1.a(k2, new as(this));
    }

    public final e b()
    {
        return A.a();
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

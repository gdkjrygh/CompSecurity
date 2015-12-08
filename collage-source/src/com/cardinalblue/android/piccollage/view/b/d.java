// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.b;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.view.b:
//            e

public class d extends e
{
    public static class a
    {

        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;

        public a()
        {
        }
    }


    private a a;
    private float b;
    private float c;
    private Matrix d;
    private Matrix e;

    public d(k k1, PhotoProtoView photoprotoview, a a1)
    {
        super(k1, photoprotoview, 400L);
        a = a1;
        c = a.e - a.a;
        b = a.f / a.b;
    }

    public static a a(k k1, RectF rectf, boolean flag)
    {
        a a1 = new a();
        a1.c = 0.0F;
        a1.d = 0.0F;
        float f = k1.R();
        a1.e = f;
        a1.a = f;
        f = k1.P();
        a1.f = f;
        a1.b = f;
        if (rectf == null)
        {
            return a1;
        }
        f = rectf.right - rectf.left;
        float f1 = rectf.bottom - rectf.top;
        boolean flag1;
        if (k1.a(rectf.left, rectf.top) && k1.a(rectf.left, rectf.bottom) && k1.a(rectf.right, rectf.top) && k1.a(rectf.right, rectf.bottom))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1 || flag)
        {
            a1.e = Math.round(k1.R() / 90F) * 90;
            float f2;
            float f3;
            float f4;
            float f5;
            if (Math.abs(a1.e % 360F) == 0.0F || Math.abs(a1.e % 360F) == 180F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                a1.f = Math.max((f + 7F) / (float)k1.S(), (f1 + 7F) / (float)k1.T());
            } else
            {
                a1.f = Math.max((f + 7F) / (float)k1.T(), (f1 + 7F) / (float)k1.S());
            }
            if (k1.P() >= a1.f && !flag)
            {
                a1.f = k1.P();
            }
            f1 = ((float)k1.p() * a1.f) / 2.0F;
            f2 = ((float)k1.o() * a1.f) / 2.0F;
            if (!flag1)
            {
                f = f2;
            } else
            {
                f = f1;
                f1 = f2;
            }
            f3 = k1.L();
            f2 = k1.L();
            f5 = k1.K();
            f4 = k1.K();
            f5 = f5 - f1 - rectf.left;
            if (f5 > -3F)
            {
                a1.c = -f5 - 3F;
            }
            f1 = rectf.right - (f1 + f4);
            if (f1 > -3F)
            {
                a1.c = f1 + 3F;
            }
            f1 = f3 - f - rectf.top;
            if (f1 > -3F)
            {
                a1.d = -f1 - 3F;
            }
            f = rectf.bottom - (f + f2);
            if (f > -3F)
            {
                a1.d = f + 3F;
            }
        }
        return a1;
    }

    public void a(float f)
    {
        f = b(f);
        float f1;
        if (d == null)
        {
            d = new Matrix();
        } else
        {
            d.reset();
        }
        if (e == null)
        {
            e = new Matrix();
        } else
        {
            e.reset();
        }
        f1 = a(1.0F / b, 1.0F, f);
        d.postScale(f1, f1);
        d.postRotate(a(-c, 0.0F, f));
        e.postTranslate(a(-a.c, 0.0F, f), a(-a.d, 0.0F, f));
        this.f.a(d, e);
    }
}

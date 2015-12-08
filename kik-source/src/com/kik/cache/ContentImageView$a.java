// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.kik.cache:
//            ContentImageView

private final class <init> extends android.view.r.SimpleOnScaleGestureListener
{

    final ContentImageView a;

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getScaleFactor();
        float f1 = ContentImageView.k(a);
        ContentImageView.a(a, f);
        if (ContentImageView.k(a) > ContentImageView.q(a))
        {
            ContentImageView.b(a, ContentImageView.q(a));
            f = ContentImageView.q(a) / f1;
        } else
        if (ContentImageView.k(a) < ContentImageView.r(a))
        {
            ContentImageView.b(a, ContentImageView.r(a));
            f = ContentImageView.r(a) / f1;
        }
        ContentImageView.c(a, ContentImageView.m(a) * ContentImageView.k(a) - ContentImageView.m(a) - ContentImageView.s(a) * 2.0F * ContentImageView.k(a));
        ContentImageView.d(a, ContentImageView.o(a) * ContentImageView.k(a) - ContentImageView.o(a) - ContentImageView.t(a) * 2.0F * ContentImageView.k(a));
        if (ContentImageView.j(a) * ContentImageView.k(a) <= ContentImageView.m(a) || ContentImageView.l(a) * ContentImageView.k(a) <= ContentImageView.o(a))
        {
            ContentImageView.f(a).postScale(f, f, ContentImageView.m(a) / 2.0F, ContentImageView.o(a) / 2.0F);
            if (f < 1.0F)
            {
                ContentImageView.f(a).getValues(ContentImageView.e(a));
                f1 = ContentImageView.e(a)[2];
                float f3 = ContentImageView.e(a)[5];
                if (f < 1.0F)
                {
                    if ((float)Math.round(ContentImageView.j(a) * ContentImageView.k(a)) < ContentImageView.m(a))
                    {
                        if (f3 < -ContentImageView.n(a))
                        {
                            ContentImageView.f(a).postTranslate(0.0F, -(ContentImageView.n(a) + f3));
                        } else
                        if (f3 > 0.0F)
                        {
                            ContentImageView.f(a).postTranslate(0.0F, -f3);
                        }
                    } else
                    if (f1 < -ContentImageView.p(a))
                    {
                        ContentImageView.f(a).postTranslate(-(f1 + ContentImageView.p(a)), 0.0F);
                    } else
                    if (f1 > 0.0F)
                    {
                        ContentImageView.f(a).postTranslate(-f1, 0.0F);
                    }
                }
            }
        } else
        {
            ContentImageView.f(a).postScale(f, f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            ContentImageView.f(a).getValues(ContentImageView.e(a));
            float f2 = ContentImageView.e(a)[2];
            float f4 = ContentImageView.e(a)[5];
            if (f < 1.0F)
            {
                if (f2 < -ContentImageView.p(a))
                {
                    ContentImageView.f(a).postTranslate(-(f2 + ContentImageView.p(a)), 0.0F);
                } else
                if (f2 > 0.0F)
                {
                    ContentImageView.f(a).postTranslate(-f2, 0.0F);
                }
                if (f4 < -ContentImageView.n(a))
                {
                    ContentImageView.f(a).postTranslate(0.0F, -(ContentImageView.n(a) + f4));
                } else
                if (f4 > 0.0F)
                {
                    ContentImageView.f(a).postTranslate(0.0F, -f4);
                }
            }
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        ContentImageView.a(a, 2);
        return true;
    }

    private (ContentImageView contentimageview)
    {
        a = contentimageview;
        super();
    }

    reListener(ContentImageView contentimageview, byte byte0)
    {
        this(contentimageview);
    }
}

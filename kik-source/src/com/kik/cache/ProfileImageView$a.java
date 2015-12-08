// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.kik.cache:
//            ProfileImageView

private final class <init> extends android.view.r.SimpleOnScaleGestureListener
{

    final ProfileImageView a;

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getScaleFactor();
        float f1 = ProfileImageView.k(a);
        ProfileImageView.a(a, f);
        if (ProfileImageView.k(a) > ProfileImageView.q(a))
        {
            ProfileImageView.b(a, ProfileImageView.q(a));
            f = ProfileImageView.q(a) / f1;
        } else
        if (ProfileImageView.k(a) < ProfileImageView.r(a))
        {
            ProfileImageView.b(a, ProfileImageView.r(a));
            f = ProfileImageView.r(a) / f1;
        }
        ProfileImageView.c(a, ProfileImageView.m(a) * ProfileImageView.k(a) - ProfileImageView.m(a) - ProfileImageView.s(a) * 2.0F * ProfileImageView.k(a));
        ProfileImageView.d(a, ProfileImageView.o(a) * ProfileImageView.k(a) - ProfileImageView.o(a) - ProfileImageView.t(a) * 2.0F * ProfileImageView.k(a));
        if (ProfileImageView.j(a) * ProfileImageView.k(a) <= ProfileImageView.m(a) || ProfileImageView.l(a) * ProfileImageView.k(a) <= ProfileImageView.o(a))
        {
            ProfileImageView.f(a).postScale(f, f, ProfileImageView.m(a) / 2.0F, ProfileImageView.o(a) / 2.0F);
            if (f < 1.0F)
            {
                ProfileImageView.f(a).getValues(ProfileImageView.e(a));
                f1 = ProfileImageView.e(a)[2];
                float f3 = ProfileImageView.e(a)[5];
                if (f < 1.0F)
                {
                    if ((float)Math.round(ProfileImageView.j(a) * ProfileImageView.k(a)) < ProfileImageView.m(a))
                    {
                        if (f3 < -ProfileImageView.n(a))
                        {
                            ProfileImageView.f(a).postTranslate(0.0F, -(ProfileImageView.n(a) + f3));
                        } else
                        if (f3 > 0.0F)
                        {
                            ProfileImageView.f(a).postTranslate(0.0F, -f3);
                        }
                    } else
                    if (f1 < -ProfileImageView.p(a))
                    {
                        ProfileImageView.f(a).postTranslate(-(f1 + ProfileImageView.p(a)), 0.0F);
                    } else
                    if (f1 > 0.0F)
                    {
                        ProfileImageView.f(a).postTranslate(-f1, 0.0F);
                    }
                }
            }
        } else
        {
            ProfileImageView.f(a).postScale(f, f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            ProfileImageView.f(a).getValues(ProfileImageView.e(a));
            float f2 = ProfileImageView.e(a)[2];
            float f4 = ProfileImageView.e(a)[5];
            if (f < 1.0F)
            {
                if (f2 < -ProfileImageView.p(a))
                {
                    ProfileImageView.f(a).postTranslate(-(f2 + ProfileImageView.p(a)), 0.0F);
                } else
                if (f2 > 0.0F)
                {
                    ProfileImageView.f(a).postTranslate(-f2, 0.0F);
                }
                if (f4 < -ProfileImageView.n(a))
                {
                    ProfileImageView.f(a).postTranslate(0.0F, -(ProfileImageView.n(a) + f4));
                } else
                if (f4 > 0.0F)
                {
                    ProfileImageView.f(a).postTranslate(0.0F, -f4);
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

    private (ProfileImageView profileimageview)
    {
        a = profileimageview;
        super();
    }

    reListener(ProfileImageView profileimageview, byte byte0)
    {
        this(profileimageview);
    }
}

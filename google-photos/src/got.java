// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.pager.ClippingImageView;

final class got extends azf
{

    private goq a;

    got(goq goq1)
    {
        a = goq1;
        super();
    }

    public final void a(Drawable drawable)
    {
        goq.c(a).setImageDrawable(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Bitmap)obj;
        goq.c(a).setImageBitmap(((Bitmap) (obj)));
        if (!goq.d(a))
        {
            goq.a(a, true);
            goq.e(a).b();
            if (!goq.f(a) && !goq.g(a))
            {
                goq.a(a, goq.i(a).a(goq.h(a)));
            } else
            if (goq.g(a))
            {
                goq.j(a);
            } else
            {
                goq.k(a);
            }
            if (goq.l(a))
            {
                goq.b(a, false);
                goq.a(a);
            }
        }
    }

    public final void b(Drawable drawable)
    {
        goq.c(a).setImageDrawable(drawable);
    }

    public final void c(Drawable drawable)
    {
        goq.c(a).setImageDrawable(drawable);
        if (!goq.d(a))
        {
            goq.a(a, true);
            goq.i(a).a(goq.m(a));
            goq.e(a).b();
        }
    }
}

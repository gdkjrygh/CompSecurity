// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

final class gnq extends aza
{

    private gnk b;

    gnq(gnk gnk1, ImageView imageview)
    {
        b = gnk1;
        super(imageview);
    }

    public final void a(Object obj, azp azp)
    {
        super.a((Bitmap)obj, azp);
        gnk.c(b, true);
        if (gnk.l(b))
        {
            gnk.g(b).a(gnk.f(b));
            gnk.h(b).b();
        }
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        gnk.g(b).a(gnk.i(b));
        gnk.h(b).b();
        gnk.k(b).a(gnk.m(b));
    }
}

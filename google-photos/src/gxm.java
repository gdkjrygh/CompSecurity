// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

final class gxm
    implements gxs
{

    private gxi a;

    gxm(gxi gxi1)
    {
        a = gxi1;
        super();
    }

    public final void a()
    {
        gxp.a(gxi.f(a));
        gxi.b(a).c(true);
    }

    public final void b()
    {
        gxi.b(a).c(false);
    }

    public final void c()
    {
        gxi.g(a);
        gxi.b(a).a(false);
    }

    public final void d()
    {
        gxi.g(a);
        gxi.b(a).a(true);
    }
}

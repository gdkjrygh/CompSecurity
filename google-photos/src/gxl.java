// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

final class gxl
    implements Runnable
{

    private gxi a;

    gxl(gxi gxi1)
    {
        a = gxi1;
        super();
    }

    public final void run()
    {
        if (gxi.c(a).b.b(elt) != null && gxi.b(a) != null)
        {
            gxi.b(a).b(true);
        }
    }
}

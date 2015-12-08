// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;

final class gyv
    implements Runnable
{

    private final int a;
    private gys b;

    public gyv(gys gys1, int i)
    {
        b = gys1;
        super();
        a = i;
    }

    public final void run()
    {
        if (a == b.f)
        {
            b.a = true;
            if (b.c != null)
            {
                b.c.c();
            }
            b.i.invalidate();
            if (b.g.a())
            {
                noy.a("from start load", b.h);
                return;
            }
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gyn extends ayz
{

    private ayo a;
    private PhotoView b;

    public gyn(PhotoView photoview)
    {
        b = photoview;
        super();
    }

    public final ayo a()
    {
        return a;
    }

    public final void a(ayo ayo)
    {
        a = ayo;
    }

    public final void a(azg azg1)
    {
        if (PhotoView.b(b) && b.getWidth() > 0 && b.getHeight() > 0)
        {
            azg1.a(b.getWidth(), b.getHeight());
            return;
        } else
        {
            PhotoView.a(b, azg1);
            return;
        }
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        PhotoView.a(b, ((Drawable) (obj)));
    }

    public final void c(Drawable drawable)
    {
        PhotoView.a(b);
    }
}

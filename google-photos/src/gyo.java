// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gyo extends ayz
{

    private ayo a;
    private PhotoView b;

    public gyo(PhotoView photoview)
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
        obj = (awr)obj;
        PhotoView.b(b, false);
        PhotoView.b(b, ((Drawable) (obj)));
    }

    public final void c(Drawable drawable)
    {
        PhotoView.a(b, false);
        PhotoView.c(b).c();
    }

    public final void c_()
    {
        if (b.a != null && PhotoView.d(b) && (b.a instanceof Animatable))
        {
            ((Animatable)b.a).start();
        }
    }

    public final void d_()
    {
        if (b.a != null && (b.a instanceof Animatable))
        {
            ((Animatable)b.a).stop();
        }
    }
}

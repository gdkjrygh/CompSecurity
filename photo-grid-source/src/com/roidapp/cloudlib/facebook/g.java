// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g.b.d;
import com.bumptech.glide.load.resource.a.b;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbAlbumListActivity

final class g extends d
{

    final FbAlbumListActivity b;

    g(FbAlbumListActivity fbalbumlistactivity, ImageView imageview)
    {
        b = fbalbumlistactivity;
        super(imageview);
    }

    private void g()
    {
        com.bumptech.glide.g.c c1 = e();
        if (c1 != null)
        {
            FbAlbumListActivity.a(b).remove(c1);
        }
        FbAlbumListActivity.c(b);
    }

    public final void a(b b1, com.bumptech.glide.g.a.d d1)
    {
        super.a(b1, d1);
        g();
    }

    public final void a(Exception exception, Drawable drawable)
    {
        super.a(exception, drawable);
        g();
    }

    public final volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((b)obj, d1);
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        g();
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        drawable = e();
        if (drawable != null && !FbAlbumListActivity.a(b).contains(drawable))
        {
            FbAlbumListActivity.a(b).add(drawable);
        }
        com.roidapp.cloudlib.facebook.FbAlbumListActivity.b(b);
    }
}

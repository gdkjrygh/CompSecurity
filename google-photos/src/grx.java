// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;

public final class grx
    implements omb, oos, oov, opp, opr, opv
{

    final nug a = new grz(this);
    TiledImageView b;
    nwm c;
    olm d;
    private final int e;
    private final nug f = new gry(this);
    private final nug g = new gsa(this);
    private final nug h = new gsb(this);
    private grt i;
    private noz j;

    public grx(opd opd1, int k)
    {
        e = k;
        opd1.a(this);
    }

    private void a(PhotoView photoview)
    {
        if (photoview != null)
        {
            photoview.a(null);
        }
        b.a(null, null);
    }

    public final void a()
    {
        i.a.a(h);
        c.a().a(f);
        c();
        b.a(null, null);
        TiledImageView tiledimageview = b;
        if (TiledImageView.a)
        {
            tiledimageview.d.g.a();
        }
        b = null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = (grt)olm1.a(grt);
        c = (nwm)olm1.a(nwm);
        j = noz.a(context, 3, "TiledImageMixin", new String[0]);
    }

    public final void a(View view, Bundle bundle)
    {
        b = (TiledImageView)view.findViewById(e);
        b.b();
        i.a.a(h, false);
        c.a().a(f, false);
    }

    void a(ekp ekp1, PhotoView photoview)
    {
        if (j.a())
        {
            noy.a("media", Long.valueOf(ekp1.b()));
            noy.a("photoView", photoview);
        }
        if (ekp1.c() == euv.b)
        {
            photoview.a(b);
            return;
        } else
        {
            a(photoview);
            return;
        }
    }

    void a(olm olm1, gzb gzb1)
    {
        p.a(gzb1.r());
        olm1 = (grg)olm1.a(grg);
        if (((grg) (olm1)).h != null)
        {
            a(((grg) (olm1)).h, gzb1.r());
            return;
        } else
        {
            ((grg) (olm1)).a.a(g, false);
            return;
        }
    }

    public final void al_()
    {
        TiledImageView tiledimageview = b;
        if (TiledImageView.a)
        {
            tiledimageview.b.c.d();
        }
    }

    public final void am_()
    {
        TiledImageView tiledimageview = b;
        if (TiledImageView.a)
        {
            tiledimageview.b.c.c();
        }
    }

    void c()
    {
        if (d == null)
        {
            return;
        } else
        {
            ((grg)d.a(grg)).a.a(g);
            gzb gzb1 = (gzb)d.a(gzb);
            gzb1.a().a(a);
            a(gzb1.r());
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.io.File;

public final class gys
{

    boolean a;
    public ohp b;
    public TiledImageView c;
    public boolean d;
    AsyncTask e;
    int f;
    final noz g;
    long h;
    public final PhotoView i;
    private Matrix j;
    private final azh k = new gyu(this);
    private final noz l;
    private final noz m;
    private boolean n;

    public gys(PhotoView photoview)
    {
        i = photoview;
        super();
        d = false;
        j = new Matrix();
        g = noz.a(i.getContext(), 3, "FullsizeManager", new String[0]);
        l = noz.a(i.getContext(), 2, "FullsizeManager", new String[0]);
        m = noz.a(i.getContext(), "FullsizeManager", new String[0]);
    }

    public void a()
    {
        if (c != null && b != null && i.a != null)
        {
            j.set(PhotoView.e(i));
            float f1;
            float f2;
            TiledImageView tiledimageview;
            Object obj;
            int i1;
            if (b.d % 180 != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f2 = i.a.getIntrinsicWidth();
            if (i1 != 0)
            {
                f1 = b.c;
            } else
            {
                f1 = b.b;
            }
            f1 = f2 / f1;
            j.preScale(f1, f1);
            tiledimageview = c;
            obj = j;
            if (TiledImageView.a && tiledimageview.d.e != null)
            {
                int k1 = tiledimageview.d.e.e();
                int j1;
                boolean flag;
                int l1;
                int i2;
                if (k1 % 180 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    i1 = tiledimageview.d.e.c();
                } else
                {
                    i1 = tiledimageview.d.e.b();
                }
                if (flag)
                {
                    j1 = tiledimageview.d.e.b();
                } else
                {
                    j1 = tiledimageview.d.e.c();
                }
                tiledimageview.e.set(0.0F, 0.0F, i1, j1);
                ((Matrix) (obj)).mapRect(tiledimageview.e);
                ((Matrix) (obj)).getValues(tiledimageview.c);
                i1 /= 2;
                j1 /= 2;
                f1 = tiledimageview.c[0];
                i2 = Math.round(((float)tiledimageview.getWidth() - tiledimageview.e.width()) / 2.0F / f1);
                l1 = Math.round(((float)tiledimageview.getHeight() - tiledimageview.e.height()) / 2.0F / f1);
                if (k1 == 90 || k1 == 180)
                {
                    i1 = (int)((float)i1 + (tiledimageview.e.left / f1 - (float)i2));
                } else
                {
                    i1 = (int)((float)i1 - (tiledimageview.e.left / f1 - (float)i2));
                }
                if (k1 == 180 || k1 == 270)
                {
                    j1 = (int)((float)j1 + (tiledimageview.e.top / f1 - (float)l1));
                } else
                {
                    j1 = (int)((float)j1 - (tiledimageview.e.top / f1 - (float)l1));
                }
                tiledimageview.d.a = f1;
                obj = tiledimageview.d;
                if (flag)
                {
                    k1 = j1;
                } else
                {
                    k1 = i1;
                }
                obj.b = k1;
                obj = tiledimageview.d;
                if (!flag)
                {
                    i1 = j1;
                }
                obj.c = i1;
                tiledimageview.invalidate();
            }
        }
    }

    public final boolean b()
    {
        return a && d;
    }

    public final void c()
    {
        if (l.a())
        {
            noy.a("tiledViewEnabled", Boolean.valueOf(d));
            noy.a("tiledImageView", c);
            noy.a("isLoadingFullsize", Boolean.valueOf(n));
            noy.a("drawable", i.a);
        }
        if (d && c != null && i.a != null && !n)
        {
            npk npk1 = (npk)olm.a(i.getContext(), npk);
            if (PhotoView.f(i) != PhotoView.g(i) || !npk1.c())
            {
                n = true;
                h = noy.a();
                a = false;
                f = f + 1;
                if (b != null)
                {
                    e();
                    return;
                }
                if (TiledImageView.a())
                {
                    if (PhotoView.h(i).g().f() && nkj.a(PhotoView.h(i).g().a()))
                    {
                        PhotoView.j(i).h().a(PhotoView.i(i).b()).a(PhotoView.h(i)).a(k);
                        return;
                    }
                    if (oql.b(PhotoView.h(i).b()))
                    {
                        PhotoView.j(i).a(java/io/File).a(PhotoView.h(i).b()).a(((ayt)ayt.b(java/io/File).a(true)).a(apa.b)).a(k);
                        return;
                    }
                }
            }
        }
    }

    public void d()
    {
        boolean flag = b();
        a = false;
        if (e != null)
        {
            e.cancel(true);
            e = null;
        }
        PhotoView.j(i).a(k);
        b = null;
        if (flag)
        {
            i.invalidate();
        }
        n = false;
    }

    void e()
    {
        if (c != null && b.a != null)
        {
            if (!a)
            {
                c.a(b, new gyv(this, f));
            }
            a();
        }
    }
}

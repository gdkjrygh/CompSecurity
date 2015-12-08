// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

final class gxp
    implements gyw
{

    private final Rect a = new Rect();
    private final int b[] = new int[2];
    private gxi c;

    gxp(gxi gxi1)
    {
        c = gxi1;
        super();
    }

    private void a()
    {
        Object obj = gxi.d(c);
        Object obj1 = gxi.b(c);
        float f1;
        boolean flag;
        if (((PhotoView) (obj1)).g != 0.0F)
        {
            f1 = ((PhotoView) (obj1)).c() / ((PhotoView) (obj1)).g;
        } else
        {
            f1 = 1.0F;
        }
        if (Math.abs(f1 - 1.0F) > 0.04999995F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.c = flag;
        ((grk) (obj)).a.b();
        obj = gxi.b(c);
        obj1 = a;
        ((PhotoView) (obj)).i.set(((PhotoView) (obj)).h);
        ((PhotoView) (obj)).c.mapRect(((PhotoView) (obj)).i);
        ((Rect) (obj1)).set((int)((PhotoView) (obj)).i.left, (int)((PhotoView) (obj)).i.top, (int)((PhotoView) (obj)).i.right, (int)((PhotoView) (obj)).i.bottom);
        obj = gxi.b(c);
        obj1 = a;
        ((View) (obj)).getLocationInWindow(b);
        ((Rect) (obj1)).offset(b[0], b[1]);
        obj = gxi.d(c);
        obj1 = a;
        ((grk) (obj)).b.set(((Rect) (obj1)));
        ((grk) (obj)).a.b();
    }

    static void a(gxp gxp1)
    {
        gxp1.a();
    }

    public final void a(PhotoView photoview, ekp ekp)
    {
        ekp = c;
        int i;
        if (photoview.d)
        {
            i = gxn.c;
        } else
        {
            i = gxn.d;
        }
        gxi.a(ekp, i);
        photoview = gxi.c(c);
        if (!((grn) (photoview)).c)
        {
            photoview.c = true;
            ((grn) (photoview)).a.b();
        }
        a();
    }

    public final void f()
    {
        a();
    }

    public final void g()
    {
        a();
    }
}

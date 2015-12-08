// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.list.PhotoTileView;

public final class frt extends azi
{

    private PhotoTileView b;

    public frt(PhotoTileView phototileview, PhotoTileView phototileview1)
    {
        b = phototileview;
        super(phototileview1);
    }

    public final void a(Drawable drawable)
    {
        super.a(drawable);
        PhotoTileView.a(b, false);
        PhotoTileView.a(b).reset();
        b.a(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        boolean flag = true;
        obj = (Bitmap)obj;
        PhotoTileView.a(b, true);
        azp = b.a(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), b.getWidth(), b.getHeight());
        PhotoTileView.a(b).setTranslate((int)(((PointF) (azp)).x + 0.5F), (int)(((PointF) (azp)).y + 0.5F));
        azp = b;
        if (((fsf) (azp)).p != obj || ((fsf) (azp)).o != null)
        {
            if (((fsf) (azp)).o != null || ((fsf) (azp)).p != null)
            {
                flag = false;
            }
            azp.b(null);
            azp.p = ((Bitmap) (obj));
            if (obj != null)
            {
                azp.q = ((Bitmap) (obj)).getWidth();
                azp.r = ((Bitmap) (obj)).getHeight();
            } else
            {
                azp.q = -1;
                azp.r = -1;
            }
            azp.e();
            if (flag)
            {
                azp.requestLayout();
            }
            azp.invalidate();
        }
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        PhotoTileView.a(b).reset();
        b.a(drawable);
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        PhotoTileView.a(b).reset();
        b.a(drawable);
    }
}

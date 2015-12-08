// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package uk.co.senab.photoview:
//            c, PhotoViewAttacher

public class PhotoView extends ImageView
    implements c
{

    private final PhotoViewAttacher a;
    private android.widget.ImageView.ScaleType b;

    public PhotoView(Context context)
    {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        a = new PhotoViewAttacher(this);
        if (b != null)
        {
            setScaleType(b);
            b = null;
        }
    }

    public Matrix getDisplayMatrix()
    {
        return a.l();
    }

    public RectF getDisplayRect()
    {
        return a.b();
    }

    public c getIPhotoViewImplementation()
    {
        return a;
    }

    public float getMaxScale()
    {
        return getMaximumScale();
    }

    public float getMaximumScale()
    {
        return a.f();
    }

    public float getMediumScale()
    {
        return a.e();
    }

    public float getMidScale()
    {
        return getMediumScale();
    }

    public float getMinScale()
    {
        return getMinimumScale();
    }

    public float getMinimumScale()
    {
        return a.d();
    }

    public PhotoViewAttacher.b getOnPhotoTapListener()
    {
        return a.i();
    }

    public PhotoViewAttacher.c getOnViewTapListener()
    {
        return a.j();
    }

    public float getScale()
    {
        return a.g();
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return a.h();
    }

    public Bitmap getVisibleRectangleBitmap()
    {
        return a.m();
    }

    protected void onDetachedFromWindow()
    {
        a.a();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean flag)
    {
        a.a(flag);
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        if (a != null)
        {
            a.k();
        }
    }

    public void setImageResource(int i)
    {
        super.setImageResource(i);
        if (a != null)
        {
            a.k();
        }
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        if (a != null)
        {
            a.k();
        }
    }

    public void setMaxScale(float f)
    {
        setMaximumScale(f);
    }

    public void setMaximumScale(float f)
    {
        a.e(f);
    }

    public void setMediumScale(float f)
    {
        a.d(f);
    }

    public void setMidScale(float f)
    {
        setMediumScale(f);
    }

    public void setMinScale(float f)
    {
        setMinimumScale(f);
    }

    public void setMinimumScale(float f)
    {
        a.c(f);
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        a.a(ondoubletaplistener);
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
    {
        a.a(onlongclicklistener);
    }

    public void setOnMatrixChangeListener(PhotoViewAttacher.a a1)
    {
        a.a(a1);
    }

    public void setOnPhotoTapListener(PhotoViewAttacher.b b1)
    {
        a.a(b1);
    }

    public void setOnViewTapListener(PhotoViewAttacher.c c1)
    {
        a.a(c1);
    }

    public void setPhotoViewRotation(float f)
    {
        a.a(f);
    }

    public void setRotationBy(float f)
    {
        a.b(f);
    }

    public void setRotationTo(float f)
    {
        a.a(f);
    }

    public void setScale(float f)
    {
        a.f(f);
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (a != null)
        {
            a.a(scaletype);
            return;
        } else
        {
            b = scaletype;
            return;
        }
    }

    public void setZoomTransitionDuration(int i)
    {
        a.a(i);
    }

    public void setZoomable(boolean flag)
    {
        a.b(flag);
    }
}

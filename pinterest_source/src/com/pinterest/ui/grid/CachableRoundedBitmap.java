// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.CachableImage;
import com.pinterest.reporting.CrashReporting;
import com.squareup.picasso.Transformation;

public class CachableRoundedBitmap
    implements CachableImage
{

    private static int _radius;
    private Paint _bgPaint;
    private Paint _bmpPaint;
    private BitmapShader _bmpShader;
    private Object _imageTag;
    private boolean _isOval;
    private ImageListener _listener;
    private com.squareup.picasso.Picasso.LoadedFrom _loadedFrom;
    private Matrix _m;
    private RectF _r;
    private Transformation _transformation;
    private String _url;
    private View _view;
    public Bitmap bitmap;

    public CachableRoundedBitmap(View view)
    {
        _view = view;
        _m = new Matrix();
        _r = new RectF();
        _bmpPaint = new Paint();
        _bmpPaint.setAntiAlias(true);
        _bmpPaint.setStyle(android.graphics.Paint.Style.FILL);
        _bgPaint = new Paint();
        _bgPaint.setColor(Resources.color(0x7f0e0015));
        _bgPaint.setAntiAlias(true);
        _bgPaint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void draw(Canvas canvas, float f, float f1, float f2, float f3)
    {
        _m.reset();
        if (bitmap != null && _bmpShader != null)
        {
            _m.postScale(f2 / (float)bitmap.getWidth(), f3 / (float)bitmap.getHeight(), 0.0F, 0.0F);
            _m.postTranslate(f, f1);
            _bmpShader.setLocalMatrix(_m);
            _r.set(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
            _m.mapRect(_r);
            if (isOval())
            {
                canvas.drawOval(_r, _bmpPaint);
                return;
            } else
            {
                canvas.drawRoundRect(_r, _radius, _radius, _bmpPaint);
                return;
            }
        }
        _m.postTranslate(f, f1);
        _r.set(0.0F, 0.0F, f2, f3);
        _m.mapRect(_r);
        if (isOval())
        {
            canvas.drawOval(_r, _bgPaint);
            return;
        } else
        {
            canvas.drawRoundRect(_r, _radius, _radius, _bgPaint);
            return;
        }
    }

    public Object getImageTag()
    {
        return _imageTag;
    }

    public com.squareup.picasso.Picasso.LoadedFrom getLoadedFrom()
    {
        return _loadedFrom;
    }

    public Transformation getTransformation()
    {
        return _transformation;
    }

    public String getUrl()
    {
        return _url;
    }

    public boolean isOval()
    {
        return _isOval;
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap1, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setBitmap(bitmap1, false);
        _loadedFrom = loadedfrom;
        if (_listener != null && bitmap1 != null)
        {
            _listener.onBitmapLoaded(bitmap1, loadedfrom);
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void setBackgroundColor(int i)
    {
        _bgPaint.setColor(i);
        if (_view != null)
        {
            _view.postInvalidateDelayed(1L);
        }
    }

    public void setBitmap(Bitmap bitmap1, boolean flag)
    {
        _loadedFrom = null;
        bitmap = bitmap1;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        _bmpPaint.setShader(null);
        _bmpShader = null;
_L2:
        if (_view != null)
        {
            _view.postInvalidateDelayed(1L);
            return;
        }
        break MISSING_BLOCK_LABEL_88;
        _bmpShader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        _bmpPaint.setShader(_bmpShader);
        if (true) goto _L2; else goto _L1
_L1:
        bitmap1;
        CrashReporting.a(bitmap1);
    }

    public void setImageListener(ImageListener imagelistener)
    {
        _listener = imagelistener;
    }

    public void setImageTag(Object obj)
    {
        _imageTag = obj;
    }

    public void setLoadedFrom(com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        _loadedFrom = loadedfrom;
    }

    public void setOval(boolean flag)
    {
        _isOval = flag;
    }

    public void setTransformation(Transformation transformation)
    {
        _transformation = transformation;
    }

    public void setUrl(String s)
    {
        _url = s;
    }

    static 
    {
        _radius = Constants.CORNER_RADIUS;
    }

    private class ImageListener
    {

        public void onBitmapLoaded(Bitmap bitmap1, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
        }

        public ImageListener()
        {
        }
    }

}

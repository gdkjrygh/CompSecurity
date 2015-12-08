// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.makeramen.RoundedImageView;
import com.pinterest.kit.network.image.CachableImage;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.reporting.CrashReporting;
import com.squareup.picasso.PicassoFadeDrawable;
import com.squareup.picasso.Transformation;
import org.apache.commons.lang3.StringUtils;

public class WebImageView extends RoundedImageView
    implements CachableImage
{

    private Object _imageTag;
    private ImageListener _listener;
    private boolean _requestLayout;
    private Transformation _transformation;
    public boolean isLarge;
    public int thumbnailSize;
    public String url;

    public WebImageView(Context context)
    {
        super(context);
        _requestLayout = true;
        thumbnailSize = -1;
    }

    public WebImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _requestLayout = true;
        thumbnailSize = -1;
    }

    public WebImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _requestLayout = true;
        thumbnailSize = -1;
    }

    private void prepareForReuse(boolean flag)
    {
        ImageCache.clean(this);
        if (flag)
        {
            setImageBitmap(null);
        }
        url = "";
    }

    public void clear()
    {
        url = null;
        setImageDrawable(null, false);
    }

    public Object getImageTag()
    {
        return _imageTag;
    }

    public Transformation getTransformation()
    {
        return _transformation;
    }

    public String getUrl()
    {
        return url;
    }

    public void loadUri(Uri uri)
    {
        if (uri != null && StringUtils.isNotEmpty(uri.getScheme()))
        {
            if (uri.getScheme().startsWith("http"))
            {
                loadUrl(uri.toString());
            } else
            if (uri.getScheme().equals("content"))
            {
                try
                {
                    setImageBitmap(android.provider.MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), uri));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    CrashReporting.a(uri);
                }
                return;
            }
        }
    }

    public void loadUrl(String s)
    {
        loadUrl(s, true);
    }

    public void loadUrl(String s, boolean flag)
    {
        prepareForReuse(flag);
        ImageCache.loadImage(this, s, flag);
    }

    public void onBitmapFailed(Drawable drawable)
    {
        if (_listener != null)
        {
            _listener.onBitmapFailed(drawable);
        }
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setImageDrawable(new PicassoFadeDrawable(getContext(), bitmap, loadedfrom), true);
        if (_listener != null && bitmap != null)
        {
            _listener.onBitmapSet();
            _listener.onBitmapLoaded(bitmap, loadedfrom);
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
        if (_listener != null)
        {
            _listener.onPrepareLoad(drawable);
        }
    }

    public void prepareForReuse()
    {
        prepareForReuse(true);
    }

    public void requestLayout()
    {
        if (_requestLayout)
        {
            super.requestLayout();
        }
    }

    public void setBitmap(Bitmap bitmap, boolean flag)
    {
        setImageBitmap(bitmap, true);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        if (_listener != null && bitmap != null)
        {
            _listener.onBitmapSet();
        }
    }

    public void setImageBitmap(Bitmap bitmap, boolean flag)
    {
        _requestLayout = flag;
        setImageBitmap(bitmap);
        _requestLayout = true;
    }

    public void setImageDrawable(Drawable drawable, boolean flag)
    {
        _requestLayout = flag;
        setImageDrawable(drawable);
        _requestLayout = true;
    }

    public void setImageListener(ImageListener imagelistener)
    {
        _listener = imagelistener;
    }

    public void setImageResource(int i, boolean flag)
    {
        _requestLayout = flag;
        setImageResource(i);
        _requestLayout = true;
    }

    public void setImageTag(Object obj)
    {
        _imageTag = obj;
    }

    public void setTransformation(Transformation transformation)
    {
        _transformation = transformation;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    private class ImageListener
    {

        public void onBitmapFailed(Drawable drawable)
        {
        }

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
        }

        public void onBitmapSet()
        {
        }

        public void onPrepareLoad(Drawable drawable)
        {
        }

        public ImageListener()
        {
        }
    }

}

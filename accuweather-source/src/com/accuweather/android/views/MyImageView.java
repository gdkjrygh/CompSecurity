// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.accuweather.android.utilities.Logger;

public class MyImageView extends ImageView
{

    private int defaultImageResourceId;
    private boolean defaultImageSet;

    public MyImageView(Context context)
    {
        super(context);
        defaultImageResourceId = 0;
        defaultImageSet = false;
    }

    public MyImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        defaultImageResourceId = 0;
        defaultImageSet = false;
    }

    private Bitmap getBitmap()
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)getDrawable();
        if (bitmapdrawable != null)
        {
            return bitmapdrawable.getBitmap();
        } else
        {
            return null;
        }
    }

    private void setDefaultImage()
    {
        if (defaultImageResourceId != 0 && !defaultImageSet)
        {
            setImageDrawable(getResources().getDrawable(defaultImageResourceId));
            defaultImageSet = true;
        }
    }

    private boolean shouldDraw()
    {
        Bitmap bitmap = getBitmap();
        return bitmap != null && !bitmap.isRecycled();
    }

    public void cleanupBitmap()
    {
        if (getDrawable() instanceof BitmapDrawable)
        {
            Bitmap bitmap = ((BitmapDrawable)getDrawable()).getBitmap();
            if (bitmap != null && !bitmap.isRecycled())
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(this, "In cleanupBitmap(), about to recycle the bitmap for this view.");
                }
                bitmap.recycle();
            }
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (getDrawable() instanceof BitmapDrawable)
        {
            Bitmap bitmap = getBitmap();
            if (bitmap != null && bitmap.isRecycled())
            {
                setDefaultImage();
            }
        } else
        {
            setDefaultImage();
        }
        if (shouldDraw())
        {
            super.onDraw(canvas);
        }
    }

    public void setDefaultImageToDraw(int i)
    {
        defaultImageResourceId = i;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        if (bitmap == null)
        {
            cleanupBitmap();
        }
        defaultImageSet = false;
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        if (drawable == null)
        {
            cleanupBitmap();
        }
        defaultImageSet = false;
    }
}

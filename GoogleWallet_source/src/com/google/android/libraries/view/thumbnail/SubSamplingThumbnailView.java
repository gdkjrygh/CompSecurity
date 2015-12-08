// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.thumbnail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SubSamplingThumbnailView extends ImageView
{

    private final Handler handler;
    private byte imageBytes[];
    private int width;

    public SubSamplingThumbnailView(Context context)
    {
        super(context);
        handler = new Handler();
    }

    public SubSamplingThumbnailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        handler = new Handler();
    }

    private static int calculateSampleSize(android.graphics.BitmapFactory.Options options, int i)
    {
        int k = options.outWidth;
        int j = 1;
        do
        {
            k >>= 1;
            if (k >= i && k != 0)
            {
                j <<= 1;
            } else
            {
                return j;
            }
        } while (true);
    }

    private void decodeAndSetDrawable()
    {
        if (imageBytes != null && width > 0)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length, options);
            options.inSampleSize = calculateSampleSize(options, width);
            options.inJustDecodeBounds = false;
            setImageDrawable(createDrawable(BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length, options)));
        }
    }

    protected Drawable createDrawable(Bitmap bitmap)
    {
        return new BitmapDrawable(bitmap);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != 0 && i != k)
        {
            width = i;
            handler.post(new Runnable() {

                final SubSamplingThumbnailView this$0;

                public final void run()
                {
                    decodeAndSetDrawable();
                }

            
            {
                this$0 = SubSamplingThumbnailView.this;
                super();
            }
            });
        }
    }

    public void setImageBytes(byte abyte0[])
    {
        imageBytes = abyte0;
        decodeAndSetDrawable();
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.makeramen.RoundedImageView;

public abstract class LoggingImageView extends RoundedImageView
{

    private static final boolean LOG_VERBOSE = false;

    public LoggingImageView(Context context)
    {
        super(context);
    }

    public LoggingImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LoggingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected abstract String getLogTag();

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i)
    {
        super.setImageResource(i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Target;

public class b
    implements Target
{

    protected final Context b;
    protected ImageView c;
    protected boolean d;

    public b(Context context, ImageView imageview)
    {
        d = true;
        b = context;
        c = imageview;
    }

    public void a(ImageView imageview)
    {
        c = imageview;
    }

    public void onBitmapFailed(Drawable drawable)
    {
        if (c != null && drawable != null && d)
        {
            c.setImageDrawable(drawable);
        }
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (c != null && bitmap != null)
        {
            c.setImageDrawable(new BitmapDrawable(b.getResources(), bitmap));
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
        if (c != null && d)
        {
            c.setImageDrawable(drawable);
        }
    }
}

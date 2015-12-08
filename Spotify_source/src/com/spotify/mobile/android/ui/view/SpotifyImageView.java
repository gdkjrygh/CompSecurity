// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.spotify.mobile.android.util.StatefulImageView;
import gmr;
import gwi;

public class SpotifyImageView extends StatefulImageView
{

    public int a;
    public Uri b;
    public gwi c = new gwi() {

        private SpotifyImageView a;

        public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            a.setImageBitmap(bitmap);
        }

        public final void a(Drawable drawable)
        {
        }

        public final void b(Drawable drawable)
        {
            a.setImageDrawable(drawable);
        }

            
            {
                a = SpotifyImageView.this;
                super();
            }
    };
    private boolean d;

    public SpotifyImageView(Context context)
    {
        super(context);
    }

    public SpotifyImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset);
    }

    public SpotifyImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, gmr.h);
        d = attributeset.getBoolean(0, false);
        attributeset.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        if (d)
        {
            int k = android.view.View.MeasureSpec.getSize(j);
            Drawable drawable = getDrawable();
            i = k;
            if (drawable != null)
            {
                int l = drawable.getIntrinsicWidth();
                int i1 = drawable.getIntrinsicHeight();
                i = k;
                if (i1 > 0)
                {
                    float f = Math.max(Math.min((float)l / (float)i1, 2.0F), 0.5F);
                    i = (int)((float)k * f);
                }
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
        super.onMeasure(i, j);
    }

    public void setImageResource(int i)
    {
        b = null;
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri)
    {
        throw new UnsupportedOperationException("Do not use the setImageUri for spotify images!");
    }
}

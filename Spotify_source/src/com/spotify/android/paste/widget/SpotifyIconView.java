// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dfh;
import dfz;
import dgn;
import km;

public class SpotifyIconView extends ImageView
{

    private static final int c[] = {
        0x1010161, 0x1010162, 0x1010163, 0x1010164
    };
    private SpotifyIcon a;
    private dfz b;

    public SpotifyIconView(Context context)
    {
        this(context, null);
    }

    public SpotifyIconView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SpotifyIconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = SpotifyIcon.b;
        dgn.a(com/spotify/android/paste/widget/SpotifyIconView, this);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, dfh.aO, i, 0);
        int j = typedarray.getInt(dfh.aR, -1);
        if (j != -1)
        {
            a = SpotifyIcon.values()[j];
        }
        float f = typedarray.getDimension(dfh.aQ, -1F);
        ColorStateList colorstatelist = typedarray.getColorStateList(dfh.aP);
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, c, i, 0);
        float f1 = context.getFloat(3, 0.0F);
        float f2 = context.getFloat(1, 0.0F);
        float f3 = context.getFloat(2, 0.0F);
        i = context.getColor(0, 0);
        context.recycle();
        if (f != -1F)
        {
            b = new dfz(getContext(), a, f);
        } else
        {
            b = new dfz(getContext(), a);
        }
        attributeset = b;
        if (colorstatelist != null)
        {
            context = colorstatelist;
        } else
        {
            context = ColorStateList.valueOf(-1);
        }
        attributeset.a(context);
        setImageDrawable(b);
        context = b;
        ((dfz) (context)).b.setShadowLayer(f1, f2, f3, i);
        context.invalidateSelf();
    }

    public final void a(int i)
    {
        b.a(i);
    }

    public final void a(ColorStateList colorstatelist)
    {
        b.a(colorstatelist);
    }

    public final void a(SpotifyIcon spotifyicon)
    {
        a = spotifyicon;
        b.a(a);
        km.d(this);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public void setImageDrawable(Drawable drawable)
    {
        if (!(drawable instanceof dfz))
        {
            throw new UnsupportedOperationException("Drawable must be instance of SpotifyIconDrawable");
        } else
        {
            super.setImageDrawable(drawable);
            return;
        }
    }

    public void setImageResource(int i)
    {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.cast.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import egq;

public final class CastImageView extends ImageView
{

    private Handler a;
    private int b;
    private final Runnable c;

    public CastImageView(Context context)
    {
        super(context);
        a = new Handler(Looper.getMainLooper());
        b = 0;
        c = new egq(this);
    }

    public CastImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Handler(Looper.getMainLooper());
        b = 0;
        c = new egq(this);
    }

    public CastImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Handler(Looper.getMainLooper());
        b = 0;
        c = new egq(this);
    }

    public static int a(CastImageView castimageview)
    {
        int i = castimageview.b;
        castimageview.b = i + 1;
        return i;
    }

    public static int b(CastImageView castimageview)
    {
        return castimageview.b;
    }

    public static Runnable c(CastImageView castimageview)
    {
        return castimageview.c;
    }

    public static Handler d(CastImageView castimageview)
    {
        return castimageview.a;
    }

    public final void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        b = 0;
        a.removeCallbacks(c);
        a.post(c);
    }
}

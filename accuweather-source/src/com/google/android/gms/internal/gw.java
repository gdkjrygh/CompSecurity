// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class gw extends ImageView
{
    public static interface a
    {

        public abstract Path d(int i, int j);
    }


    private Uri FL;
    private int FM;
    private int FN;
    private a FO;

    public void al(int i)
    {
        FM = i;
    }

    public void f(Uri uri)
    {
        FL = uri;
    }

    public int fd()
    {
        return FM;
    }

    protected void onDraw(Canvas canvas)
    {
        if (FO != null)
        {
            canvas.clipPath(FO.d(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (FN != 0)
        {
            canvas.drawColor(FN);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g.b.b;
import com.bumptech.glide.g.b.h;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.baselib.view.v;
import com.roidapp.cloudlib.aq;

public final class a extends b
    implements h
{

    private v b;

    public a(ImageView imageview)
    {
        super(imageview);
        a(this);
    }

    public final void a(int i, int j)
    {
        Bitmap bitmap = BitmapFactory.decodeResource(((ImageView)a()).getResources(), aq.w);
        float f = bitmap.getWidth();
        float f1 = bitmap.getHeight();
        if (f > f1)
        {
            f = (float)i / f;
        } else
        {
            f = (float)j / f1;
        }
        com.roidapp.baselib.a.a.a();
        bitmap = com.roidapp.baselib.a.a.a(bitmap, f);
        b = new v(((ImageView)a).getResources(), bitmap);
        b.a(bitmap.getWidth() / 2);
        b.a();
    }

    protected final void a(Bitmap bitmap)
    {
        if (a() instanceof RoundImageView)
        {
            super.a(bitmap);
            return;
        } else
        {
            v v1 = new v(((ImageView)a()).getResources(), bitmap);
            v1.a();
            v1.a(bitmap.getWidth() / 2);
            a(((Drawable) (v1)));
            return;
        }
    }

    public final void a(Exception exception, Drawable drawable)
    {
        if (b != null)
        {
            super.a(exception, b);
        }
    }

    protected final volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }

    public final void b(Drawable drawable)
    {
        if (b != null)
        {
            super.b(b);
        }
    }

    public final void c(Drawable drawable)
    {
        if (b != null)
        {
            super.c(b);
        }
    }
}

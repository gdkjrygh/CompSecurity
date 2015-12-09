// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;

public class b
{

    private Picture a;
    private RectF b;
    private RectF c;

    b(Picture picture, RectF rectf)
    {
        c = null;
        a = picture;
        b = rectf;
    }

    public PictureDrawable a()
    {
        return new PictureDrawable(a);
    }

    void a(RectF rectf)
    {
        c = rectf;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;

public final class b
{

    private Picture a;
    private RectF b;
    private RectF c;
    private Path d;

    b(Picture picture, RectF rectf)
    {
        c = null;
        a = picture;
        b = rectf;
    }

    public final Picture a()
    {
        return a;
    }

    final void a(Path path)
    {
        d = path;
    }

    final void a(RectF rectf)
    {
        c = rectf;
    }

    public final Path b()
    {
        return d;
    }
}

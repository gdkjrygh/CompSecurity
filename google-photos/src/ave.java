// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class ave
    implements aqa
{

    private final Bitmap a;
    private final aqm b;

    public ave(Bitmap bitmap, aqm aqm1)
    {
        a = (Bitmap)b.a(bitmap, "Bitmap must not be null");
        b = (aqm)b.a(aqm1, "BitmapPool must not be null");
    }

    public static ave a(Bitmap bitmap, aqm aqm1)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new ave(bitmap, aqm1);
        }
    }

    public final Class a()
    {
        return android/graphics/Bitmap;
    }

    public final Object b()
    {
        return a;
    }

    public final int c()
    {
        return bag.a(a);
    }

    public final void d()
    {
        b.a(a);
    }
}

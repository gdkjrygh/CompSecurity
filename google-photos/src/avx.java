// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class avx
    implements aqa
{

    private final Bitmap a;
    private final Resources b;
    private final aqm c;

    private avx(Resources resources, aqm aqm1, Bitmap bitmap)
    {
        b = (Resources)b.a(resources, "Argument must not be null");
        c = (aqm)b.a(aqm1, "Argument must not be null");
        a = (Bitmap)b.a(bitmap, "Argument must not be null");
    }

    public static avx a(Resources resources, aqm aqm1, Bitmap bitmap)
    {
        return new avx(resources, aqm1, bitmap);
    }

    public final Class a()
    {
        return android/graphics/drawable/BitmapDrawable;
    }

    public final Object b()
    {
        return new BitmapDrawable(b, a);
    }

    public final int c()
    {
        return bag.a(a);
    }

    public final void d()
    {
        c.a(a);
    }
}

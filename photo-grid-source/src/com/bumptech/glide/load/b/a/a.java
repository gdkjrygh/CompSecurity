// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import android.graphics.Bitmap;
import com.bumptech.glide.i.h;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            l, c, g

final class a
    implements l
{

    private final c a = new c();
    private final g b = new g();

    a()
    {
    }

    static String c(int i, int j, android.graphics.Bitmap.Config config)
    {
        return d(i, j, config);
    }

    private static String d(int i, int j, android.graphics.Bitmap.Config config)
    {
        return (new StringBuilder("[")).append(i).append("x").append(j).append("], ").append(config).toString();
    }

    public final Bitmap a()
    {
        return (Bitmap)b.a();
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        config = a.a(i, j, config);
        return (Bitmap)b.a(config);
    }

    public final void a(Bitmap bitmap)
    {
        b b1 = a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        b.a(b1, bitmap);
    }

    public final String b(int i, int j, android.graphics.Bitmap.Config config)
    {
        return d(i, j, config);
    }

    public final String b(Bitmap bitmap)
    {
        return d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap)
    {
        return h.a(bitmap);
    }

    public final String toString()
    {
        return (new StringBuilder("AttributeStrategy:\n  ")).append(b).toString();
    }
}

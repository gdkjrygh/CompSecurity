// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

final class cgw extends cgu
{

    private final Context a;

    cgw(Context context)
    {
        a = context;
    }

    private static Bitmap a(Resources resources, int i, cgr cgr1)
    {
        android.graphics.BitmapFactory.Options options = d(cgr1);
        if (a(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            a(cgr1.h, cgr1.i, options, cgr1);
        }
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public final boolean a(cgr cgr1)
    {
        if (cgr1.e != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(cgr1.d.getScheme());
        }
    }

    public final cgv b(cgr cgr1)
    {
        Resources resources = chf.a(a, cgr1);
        return new cgv(a(resources, chf.a(resources, cgr1), cgr1), cgl.b);
    }
}

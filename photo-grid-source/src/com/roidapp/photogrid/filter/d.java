// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.filter.aq;

// Referenced classes of package com.roidapp.photogrid.filter:
//            ImageEditGLESActivity

final class d
    implements aq
{

    final ImageEditGLESActivity a;

    d(ImageEditGLESActivity imageeditglesactivity)
    {
        a = imageeditglesactivity;
        super();
    }

    public final Bitmap a(int i)
    {
        return com.roidapp.imagelib.b.d.a(a.i, i, i * i);
    }

    public final Integer[] a()
    {
        return ImageLibrary.a().a(a, a.i);
    }

    public final boolean b()
    {
        return a.getSharedPreferences(a.getPackageName(), 0).getBoolean("FILTER_OPTIMIZATION", false);
    }

    public final String c()
    {
        return ImageLibrary.a().b(a);
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return a.getSharedPreferences(a.getPackageName(), 0).getBoolean("WATER_MARK", false);
    }
}

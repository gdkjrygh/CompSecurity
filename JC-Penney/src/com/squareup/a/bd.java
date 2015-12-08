// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

// Referenced classes of package com.squareup.a:
//            bb, ax, bm, bc, 
//            aq

class bd extends bb
{

    private final Context a;

    bd(Context context)
    {
        a = context;
    }

    private static Bitmap a(Resources resources, int i, ax ax1)
    {
        android.graphics.BitmapFactory.Options options = c(ax1);
        if (a(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            a(ax1.h, ax1.i, options, ax1);
        }
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public bc a(ax ax1, int i)
    {
        Resources resources = bm.a(a, ax1);
        return new bc(a(resources, bm.a(resources, ax1), ax1), aq.b);
    }

    public boolean a(ax ax1)
    {
        if (ax1.e != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(ax1.d.getScheme());
        }
    }
}

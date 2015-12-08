// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

// Referenced classes of package com.c.b:
//            az, aw, bj, ba, 
//            ap

final class bb extends az
{

    private final Context a;

    bb(Context context)
    {
        a = context;
    }

    public final boolean a(aw aw1)
    {
        if (aw1.e != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(aw1.d.getScheme());
        }
    }

    public final ba b(aw aw1)
    {
        android.content.res.Resources resources = bj.a(a, aw1);
        int i = bj.a(resources, aw1);
        android.graphics.BitmapFactory.Options options = d(aw1);
        if (a(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            a(aw1.h, aw1.i, options, aw1);
        }
        return new ba(BitmapFactory.decodeResource(resources, i, options), ap.b);
    }
}

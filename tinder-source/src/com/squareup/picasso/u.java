// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            t, r, ab

final class u extends t
{

    private final Context a;

    u(Context context)
    {
        a = context;
    }

    public final boolean a(r r1)
    {
        if (r1.e != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(r1.d.getScheme());
        }
    }

    public final t.a b(r r1)
        throws IOException
    {
        android.content.res.Resources resources = ab.a(a, r1);
        int i = ab.a(resources, r1);
        android.graphics.BitmapFactory.Options options = d(r1);
        if (a(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            a(r1.h, r1.i, options, r1);
        }
        return new t.a(BitmapFactory.decodeResource(resources, i, options), Picasso.LoadedFrom.b);
    }
}

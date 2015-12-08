// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

// Referenced classes of package com.squareup.picasso:
//            a, e, Picasso, r

final class j extends a
{

    private final Object m = new Object();
    private e n;

    j(Picasso picasso, r r, int i, int k, Object obj, String s)
    {
        super(picasso, null, r, i, k, 0, null, s, obj, false);
        n = null;
    }

    final void a()
    {
        if (n != null)
        {
            n.b();
        }
    }

    final void a(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (n != null)
        {
            n.a();
        }
    }

    final void b()
    {
        super.b();
        n = null;
    }

    final Object c()
    {
        return m;
    }
}

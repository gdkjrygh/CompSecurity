// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.kik.g.k;

// Referenced classes of package com.kik.cache:
//            ad, z

final class ag
    implements com.android.volley.r.b
{

    final String a;
    final z b;
    final ad c;

    ag(ad ad1, String s, z z1)
    {
        c = ad1;
        a = s;
        b = z1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Bitmap)obj;
        ad.a(c, a, ((Bitmap) (obj)));
        if (b.v())
        {
            ad.a(c).a(b);
        }
    }
}

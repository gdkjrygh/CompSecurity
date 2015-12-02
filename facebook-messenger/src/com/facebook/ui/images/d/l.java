// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Bitmap;
import com.facebook.ui.images.base.b;

// Referenced classes of package com.facebook.ui.images.d:
//            j, h, k

class l extends b
{

    final h a;
    final k b;
    private j c;

    l(k k, h h1)
    {
        b = k;
        a = h1;
        super();
    }

    public Bitmap a(Bitmap bitmap)
    {
        c = new j(a, bitmap.getWidth(), bitmap.getHeight());
        return c.a(bitmap);
    }

    public String a()
    {
        return a.h();
    }
}

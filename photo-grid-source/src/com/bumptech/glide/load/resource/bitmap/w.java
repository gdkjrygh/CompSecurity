// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            f, c

public final class w
    implements e
{

    private final f a;
    private com.bumptech.glide.load.b.a.e b;
    private a c;
    private String d;

    public w(com.bumptech.glide.load.b.a.e e1, a a1)
    {
        this(com.bumptech.glide.load.resource.bitmap.f.a, e1, a1);
    }

    private w(f f1, com.bumptech.glide.load.b.a.e e1, a a1)
    {
        a = f1;
        b = e1;
        c = a1;
    }

    public final volatile x a(Object obj, int i, int j)
    {
        obj = (InputStream)obj;
        return com.bumptech.glide.load.resource.bitmap.c.a(a.a(((InputStream) (obj)), b, i, j, c), b);
    }

    public final String a()
    {
        if (d == null)
        {
            d = (new StringBuilder("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap")).append(a.a()).append(c.name()).toString();
        }
        return d;
    }
}

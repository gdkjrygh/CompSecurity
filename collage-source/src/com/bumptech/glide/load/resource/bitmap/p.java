// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.j;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            f, c

public class p
    implements e
{

    private final f a;
    private c b;
    private a c;
    private String d;

    public p(c c1, a a1)
    {
        this(com.bumptech.glide.load.resource.bitmap.f.a, c1, a1);
    }

    public p(f f1, c c1, a a1)
    {
        a = f1;
        b = c1;
        c = a1;
    }

    public j a(InputStream inputstream, int i, int j)
    {
        return com.bumptech.glide.load.resource.bitmap.c.a(a.a(inputstream, b, i, j, c), b);
    }

    public volatile j a(Object obj, int i, int j)
        throws IOException
    {
        return a((InputStream)obj, i, j);
    }

    public String a()
    {
        if (d == null)
        {
            d = (new StringBuilder()).append("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap").append(a.a()).append(c.name()).toString();
        }
        return d;
    }
}

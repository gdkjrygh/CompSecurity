// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.b.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.resource.bitmap.c;
import java.io.IOException;

class h
    implements e
{

    private final com.bumptech.glide.load.engine.a.c a;

    public h(com.bumptech.glide.load.engine.a.c c1)
    {
        a = c1;
    }

    public j a(a a1, int i, int j)
    {
        return c.a(a1.f(), a);
    }

    public volatile j a(Object obj, int i, int j)
        throws IOException
    {
        return a((a)obj, i, j);
    }

    public String a()
    {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }
}

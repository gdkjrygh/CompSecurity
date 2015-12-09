// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.g;
import com.bumptech.glide.load.engine.j;
import java.io.IOException;
import java.io.InputStream;

public class e
    implements com.bumptech.glide.load.e
{

    private final com.bumptech.glide.load.e a;

    public e(com.bumptech.glide.load.e e1)
    {
        a = e1;
    }

    public j a(InputStream inputstream, int i, int j)
        throws IOException
    {
        return a.a(new g(inputstream, null), i, j);
    }

    public volatile j a(Object obj, int i, int j)
        throws IOException
    {
        return a((InputStream)obj, i, j);
    }

    public String a()
    {
        return a.a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.c.j;
import com.bumptech.glide.load.e;
import java.io.InputStream;

public final class g
    implements e
{

    private final e a;

    public g(e e1)
    {
        a = e1;
    }

    public final x a(Object obj, int i, int k)
    {
        obj = (InputStream)obj;
        return a.a(new j(((InputStream) (obj)), null), i, k);
    }

    public final String a()
    {
        return a.a();
    }
}

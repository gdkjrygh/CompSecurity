// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.b;

import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;

final class f
    implements e
{

    private f()
    {
    }

    f(byte byte0)
    {
        this();
    }

    public final x a(Object obj, int i, int j)
    {
        throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
    }

    public final String a()
    {
        return "";
    }
}

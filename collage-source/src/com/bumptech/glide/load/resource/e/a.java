// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.e;

import com.bumptech.glide.load.engine.j;

// Referenced classes of package com.bumptech.glide.load.resource.e:
//            c

public class a
    implements c
{

    private final c a;

    public a(c c1)
    {
        a = c1;
    }

    public j a(j j1)
    {
        j1 = (com.bumptech.glide.load.resource.d.a)j1.b();
        j j2 = j1.b();
        if (j2 != null)
        {
            return a.a(j2);
        } else
        {
            return j1.c();
        }
    }

    public String a()
    {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.a.c;
import java.net.URL;

// Referenced classes of package com.bumptech.glide.load.b:
//            l, d

public class r
    implements l
{

    private final l a;

    public r(l l1)
    {
        a = l1;
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((URL)obj, i, j);
    }

    public c a(URL url, int i, int j)
    {
        return a.a(new d(url), i, j);
    }
}

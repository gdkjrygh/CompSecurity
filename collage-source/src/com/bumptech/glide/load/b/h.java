// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.b;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.b:
//            g

public class h
    implements b
{

    private final b a;
    private final b b;
    private String c;

    public h(b b1, b b2)
    {
        a = b1;
        b = b2;
    }

    public String a()
    {
        if (c == null)
        {
            c = (new StringBuilder()).append(a.a()).append(b.a()).toString();
        }
        return c;
    }

    public boolean a(g g1, OutputStream outputstream)
    {
        if (g1.a() != null)
        {
            return a.a(g1.a(), outputstream);
        } else
        {
            return b.a(g1.b(), outputstream);
        }
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((g)obj, outputstream);
    }
}

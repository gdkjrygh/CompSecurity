// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.f;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a

public class d
    implements f
{

    private final f a;
    private final f b;
    private String c;

    public d(f f1, f f2)
    {
        a = f1;
        b = f2;
    }

    public String a()
    {
        if (c == null)
        {
            c = (new StringBuilder()).append(a.a()).append(b.a()).toString();
        }
        return c;
    }

    public boolean a(j j1, OutputStream outputstream)
    {
        j1 = (a)j1.b();
        j j2 = j1.b();
        if (j2 != null)
        {
            return a.a(j2, outputstream);
        } else
        {
            return b.a(j1.c(), outputstream);
        }
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((j)obj, outputstream);
    }
}

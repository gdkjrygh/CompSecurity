// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.x;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a

public final class f
    implements com.bumptech.glide.load.f
{

    private final com.bumptech.glide.load.f a;
    private final com.bumptech.glide.load.f b;
    private String c;

    public f(com.bumptech.glide.load.f f1, com.bumptech.glide.load.f f2)
    {
        a = f1;
        b = f2;
    }

    public final String a()
    {
        if (c == null)
        {
            c = (new StringBuilder()).append(a.a()).append(b.a()).toString();
        }
        return c;
    }

    public final boolean a(Object obj, OutputStream outputstream)
    {
        obj = (a)((x)obj).b();
        x x1 = ((a) (obj)).b();
        if (x1 != null)
        {
            return a.a(x1, outputstream);
        } else
        {
            return b.a(((a) (obj)).c(), outputstream);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import com.bumptech.glide.load.b;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.c:
//            j

public final class k
    implements b
{

    private final b a;
    private final b b;
    private String c;

    public k(b b1, b b2)
    {
        a = b1;
        b = b2;
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
        obj = (j)obj;
        if (((j) (obj)).a() != null)
        {
            return a.a(((j) (obj)).a(), outputstream);
        } else
        {
            return b.a(((j) (obj)).b(), outputstream);
        }
    }
}

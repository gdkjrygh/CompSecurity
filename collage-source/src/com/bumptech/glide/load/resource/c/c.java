// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import com.bumptech.glide.e.b;
import com.bumptech.glide.load.b.o;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            i, j

public class c
    implements b
{

    private final i a;
    private final j b;
    private final o c = new o();
    private final com.bumptech.glide.load.resource.b.c d;

    public c(Context context, com.bumptech.glide.load.engine.a.c c1)
    {
        a = new i(context, c1);
        d = new com.bumptech.glide.load.resource.b.c(a);
        b = new j(c1);
    }

    public e a()
    {
        return d;
    }

    public e b()
    {
        return a;
    }

    public com.bumptech.glide.load.b c()
    {
        return c;
    }

    public f d()
    {
        return b;
    }
}

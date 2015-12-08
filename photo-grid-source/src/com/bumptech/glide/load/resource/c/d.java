// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import com.bumptech.glide.f.b;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.c.v;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.b.c;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            o, r

public final class d
    implements b
{

    private final o a;
    private final r b;
    private final v c = new v();
    private final c d;

    public d(Context context, e e)
    {
        a = new o(context, e);
        d = new c(a);
        b = new r(e);
    }

    public final com.bumptech.glide.load.e a()
    {
        return d;
    }

    public final com.bumptech.glide.load.e b()
    {
        return a;
    }

    public final com.bumptech.glide.load.b c()
    {
        return c;
    }

    public final f d()
    {
        return b;
    }
}

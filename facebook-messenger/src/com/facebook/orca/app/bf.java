// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.c.j;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class bf extends d
{

    final h a;

    private bf(h h)
    {
        a = h;
        super();
    }

    bf(h h, i i)
    {
        this(h);
    }

    public g a()
    {
        return new g((Context)e().a(android/content/Context), (j)a(com/facebook/c/j));
    }

    public Object b()
    {
        return a();
    }
}

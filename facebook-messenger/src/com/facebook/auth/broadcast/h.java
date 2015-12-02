// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Context;
import com.facebook.base.j;
import com.facebook.c.l;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.broadcast:
//            l, d, e

class h extends d
{

    final com.facebook.auth.broadcast.d a;

    private h(com.facebook.auth.broadcast.d d1)
    {
        a = d1;
        super();
    }

    h(com.facebook.auth.broadcast.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.auth.broadcast.l a()
    {
        return new com.facebook.auth.broadcast.l((Context)a(android/content/Context), (j)a(com/facebook/base/j), (com.facebook.config.a.d)a(com/facebook/config/a/d), (l)a(com/facebook/c/l));
    }

    public Object b()
    {
        return a();
    }
}

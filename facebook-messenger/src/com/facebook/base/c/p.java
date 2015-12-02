// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import com.facebook.base.broadcast.n;
import com.facebook.base.j;
import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class p extends d
{

    final com.facebook.base.c.a a;

    private p(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    p(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public com.facebook.base.broadcast.j a()
    {
        return new n((Context)a(android/content/Context), ((a)a(com/facebook/config/a/a)).j().getPermission());
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.zero.b.a;
import com.facebook.zero.b.c;

// Referenced classes of package com.facebook.zero:
//            c, d

class o extends d
{

    final com.facebook.zero.c a;

    private o(com.facebook.zero.c c1)
    {
        a = c1;
        super();
    }

    o(com.facebook.zero.c c1, com.facebook.zero.d d1)
    {
        this(c1);
    }

    public a a()
    {
        return new a((Context)a(android/content/Context), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (c)a(com/facebook/zero/b/c));
    }

    public Object b()
    {
        return a();
    }
}

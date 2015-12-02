// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import com.facebook.common.executors.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.debug.fps:
//            a, k, d, e

class g extends d
{

    final com.facebook.debug.fps.d a;

    private g(com.facebook.debug.fps.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.debug.fps.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.debug.fps.a a()
    {
        return new com.facebook.debug.fps.a(d(com/facebook/debug/fps/k), (a)a(com/facebook/common/executors/a));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.common.time.a;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.f.r;
import com.facebook.orca.j.c;

// Referenced classes of package com.facebook.orca.photos.b:
//            k, o, p

class v extends d
{

    final o a;

    private v(o o)
    {
        a = o;
        super();
    }

    v(o o, p p)
    {
        this(o);
    }

    public com.facebook.orca.photos.b.k a()
    {
        return new com.facebook.orca.photos.b.k((k)a(com/facebook/fbservice/ops/k), (c)a(com/facebook/orca/j/c), (a)a(com/facebook/common/time/a), (r)a(com/facebook/orca/f/r));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.common.w.q;
import com.facebook.inject.d;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import com.facebook.zero.d.a;
import com.facebook.zero.rewrite.f;

// Referenced classes of package com.facebook.zero:
//            c, d

class w extends d
{

    final c a;

    private w(c c)
    {
        a = c;
        super();
    }

    w(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public f a()
    {
        return new f((a)a(com/facebook/zero/d/a), b(com/facebook/common/w/q, com/facebook/zero/annotations/IsUserCurrentlyZeroRated));
    }

    public Object b()
    {
        return a();
    }
}

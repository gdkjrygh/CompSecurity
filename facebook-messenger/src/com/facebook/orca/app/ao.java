// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.location.r;
import com.facebook.orca.k.b;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ao extends d
{

    final h a;

    private ao(h h)
    {
        a = h;
        super();
    }

    ao(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((r)a(com/facebook/location/r), (com.facebook.location.d)a(com/facebook/location/d));
    }

    public Object b()
    {
        return a();
    }
}

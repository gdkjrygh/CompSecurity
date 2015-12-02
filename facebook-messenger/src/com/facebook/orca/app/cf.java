// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.o;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class cf extends d
{

    final h a;

    private cf(h h)
    {
        a = h;
        super();
    }

    cf(h h, i i)
    {
        this(h);
    }

    public o a()
    {
        return new o((g)a(com/facebook/orca/app/g), (k)a(com/facebook/fbservice/ops/k), (ad)a(com/facebook/orca/f/ad));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.e.h;
import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.g;
import com.facebook.orca.f.k;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class o extends d
{

    final com.facebook.orca.app.h a;

    private o(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    o(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public g a()
    {
        return new g((ad)a(com/facebook/orca/f/ad), (k)a(com/facebook/orca/f/k), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}

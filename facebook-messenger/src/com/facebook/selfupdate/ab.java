// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import com.facebook.analytics.av;
import com.facebook.common.e.h;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.selfupdate:
//            o, u, v

class ab extends d
{

    final u a;

    private ab(u u)
    {
        a = u;
        super();
    }

    ab(u u, v v)
    {
        this(u);
    }

    public o a()
    {
        return new o((av)a(com/facebook/analytics/av), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}

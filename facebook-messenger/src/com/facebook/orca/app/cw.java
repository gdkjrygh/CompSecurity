// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.f.k;
import com.facebook.orca.threadlist.bf;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cw extends d
{

    final h a;

    private cw(h h)
    {
        a = h;
        super();
    }

    cw(h h, i i)
    {
        this(h);
    }

    public bf a()
    {
        return new bf((k)a(com/facebook/orca/f/k), (com.facebook.fbservice.ops.k)a(com/facebook/fbservice/ops/k), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

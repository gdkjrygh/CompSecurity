// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.module.b;
import com.facebook.common.e.h;
import com.facebook.device_id.l;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            f, g

class m extends d
{

    final f a;

    private m(f f)
    {
        a = f;
        super();
    }

    m(f f, g g)
    {
        this(f);
    }

    public b a()
    {
        return new b((h)a(com/facebook/common/e/h), (l)a(com/facebook/device_id/l));
    }

    public Object b()
    {
        return a();
    }
}

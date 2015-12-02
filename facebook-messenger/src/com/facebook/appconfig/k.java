// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.appconfig:
//            o, f, g

class k extends d
{

    final f a;

    private k(f f)
    {
        a = f;
        super();
    }

    k(f f, g g)
    {
        this(f);
    }

    public o a()
    {
        return new o((a)a(com/facebook/config/a/a), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

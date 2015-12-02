// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import com.facebook.base.broadcast.a;
import com.facebook.common.hardware.q;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.common.v:
//            d, k, l

class o extends d
{

    final k a;

    private o(k k)
    {
        a = k;
        super();
    }

    o(k k, l l)
    {
        this(k);
    }

    public com.facebook.common.v.d a()
    {
        return new com.facebook.common.v.d((a)a(com/facebook/base/broadcast/a), (q)a(com/facebook/common/hardware/q), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

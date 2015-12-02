// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.a;
import com.facebook.orca.protocol.methods.ad;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class f extends d
{

    final com.facebook.orca.protocol.d a;

    private f(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    f(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public a a()
    {
        return new a((ad)a(com/facebook/orca/protocol/methods/ad));
    }

    public Object b()
    {
        return a();
    }
}

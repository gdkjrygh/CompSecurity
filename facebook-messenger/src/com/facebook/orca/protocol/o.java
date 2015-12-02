// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.n;
import com.facebook.orca.protocol.methods.p;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class o extends d
{

    final com.facebook.orca.protocol.d a;

    private o(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    o(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public n a()
    {
        return new n((p)a(com/facebook/orca/protocol/methods/p));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.k;
import com.facebook.orca.protocol.methods.p;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class m extends d
{

    final com.facebook.orca.protocol.d a;

    private m(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    m(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public k a()
    {
        return new k((p)a(com/facebook/orca/protocol/methods/p));
    }

    public Object b()
    {
        return a();
    }
}

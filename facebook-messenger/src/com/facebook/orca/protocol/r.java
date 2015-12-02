// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.p;
import com.facebook.orca.protocol.methods.s;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class r extends d
{

    final com.facebook.orca.protocol.d a;

    private r(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    r(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public s a()
    {
        return new s((p)a(com/facebook/orca/protocol/methods/p));
    }

    public Object b()
    {
        return a();
    }
}

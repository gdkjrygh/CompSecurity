// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.j;
import com.facebook.orca.protocol.methods.p;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class k extends d
{

    final com.facebook.orca.protocol.d a;

    private k(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    k(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public j a()
    {
        return new j((p)a(com/facebook/orca/protocol/methods/p));
    }

    public Object b()
    {
        return a();
    }
}

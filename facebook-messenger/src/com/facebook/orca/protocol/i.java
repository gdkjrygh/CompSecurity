// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.ad;
import com.facebook.orca.protocol.methods.an;
import com.facebook.orca.protocol.methods.e;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class i extends d
{

    final com.facebook.orca.protocol.d a;

    private i(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    i(com.facebook.orca.protocol.d d1, com.facebook.orca.protocol.e e1)
    {
        this(d1);
    }

    public e a()
    {
        return new e((ad)a(com/facebook/orca/protocol/methods/ad), (an)a(com/facebook/orca/protocol/methods/an));
    }

    public Object b()
    {
        return a();
    }
}

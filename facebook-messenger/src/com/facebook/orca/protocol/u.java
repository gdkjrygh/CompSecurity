// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.k.a;
import com.facebook.orca.protocol.methods.aa;
import com.facebook.orca.protocol.methods.ba;
import com.facebook.orca.protocol.methods.bb;
import com.facebook.orca.protocol.methods.c;
import com.facebook.orca.protocol.methods.x;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class u extends d
{

    final com.facebook.orca.protocol.d a;

    private u(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    u(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public x a()
    {
        return new x((aa)a(com/facebook/orca/protocol/methods/aa), (ba)a(com/facebook/orca/protocol/methods/ba), (c)a(com/facebook/orca/protocol/methods/c), (a)a(com/facebook/orca/k/a), (bb)a(com/facebook/orca/protocol/methods/bb));
    }

    public Object b()
    {
        return a();
    }
}

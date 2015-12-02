// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.auth.protocol.j;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.bc;
import com.facebook.orca.protocol.methods.p;
import com.facebook.orca.protocol.methods.x;
import com.facebook.user.ac;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class q extends d
{

    final com.facebook.orca.protocol.d a;

    private q(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    q(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public p a()
    {
        return new p((bc)a(com/facebook/orca/protocol/methods/bc), (j)a(com/facebook/auth/protocol/j), (ac)a(com/facebook/user/ac), (x)a(com/facebook/orca/protocol/methods/x), b(com/facebook/auth/viewercontext/ViewerContext));
    }

    public Object b()
    {
        return a();
    }
}

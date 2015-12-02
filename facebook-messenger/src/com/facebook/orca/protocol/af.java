// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.aa;
import com.facebook.orca.protocol.methods.bc;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class af extends d
{

    final com.facebook.orca.protocol.d a;

    private af(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    af(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public bc a()
    {
        return new bc((aa)a(com/facebook/orca/protocol/methods/aa), b(com/facebook/auth/viewercontext/ViewerContext));
    }

    public Object b()
    {
        return a();
    }
}

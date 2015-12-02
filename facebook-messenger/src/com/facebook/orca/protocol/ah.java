// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.be;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class ah extends d
{

    final com.facebook.orca.protocol.d a;

    private ah(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    ah(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public be a()
    {
        return new be((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}

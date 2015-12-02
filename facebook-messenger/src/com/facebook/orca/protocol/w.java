// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.af;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class w extends d
{

    final com.facebook.orca.protocol.d a;

    private w(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    w(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public af a()
    {
        return new af(b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId));
    }

    public Object b()
    {
        return a();
    }
}

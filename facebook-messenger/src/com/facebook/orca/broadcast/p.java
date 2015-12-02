// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment

class p
    implements Function
{

    final ComposeBroadcastFragment a;

    p(ComposeBroadcastFragment composebroadcastfragment)
    {
        a = composebroadcastfragment;
        super();
    }

    public String a(UserWithIdentifier userwithidentifier)
    {
        return userwithidentifier.a().h();
    }

    public Object apply(Object obj)
    {
        return a((UserWithIdentifier)obj);
    }
}

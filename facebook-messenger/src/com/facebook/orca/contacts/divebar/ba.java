// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.user.User;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ay

class ba
    implements Function
{

    final ay a;

    ba(ay ay)
    {
        a = ay;
        super();
    }

    public String a(User user)
    {
        return user.e();
    }

    public Object apply(Object obj)
    {
        return a((User)obj);
    }
}

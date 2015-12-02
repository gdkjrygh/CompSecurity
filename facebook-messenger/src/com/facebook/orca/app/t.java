// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.location.r;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.af;
import com.facebook.orca.f.k;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class t extends d
{

    final h a;

    private t(h h)
    {
        a = h;
        super();
    }

    t(h h, i i)
    {
        this(h);
    }

    public k a()
    {
        return new k(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (ad)a(com/facebook/orca/f/ad), (r)a(com/facebook/location/r), (af)a(com/facebook/orca/f/af));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.threads.l;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bi extends d
{

    final h a;

    private bi(h h)
    {
        a = h;
        super();
    }

    bi(h h, i i)
    {
        this(h);
    }

    public l a()
    {
        return new l(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

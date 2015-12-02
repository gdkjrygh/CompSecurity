// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.orca.threads.r;
import com.facebook.orca.threads.x;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class de extends d
{

    final h a;

    private de(h h)
    {
        a = h;
        super();
    }

    de(h h, i i)
    {
        this(h);
    }

    public x a()
    {
        return new x(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (r)a(com/facebook/orca/threads/r));
    }

    public Object b()
    {
        return a();
    }
}

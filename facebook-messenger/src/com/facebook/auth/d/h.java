// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.user.User;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class h extends d
{

    final b a;

    private h(b b1)
    {
        a = b1;
        super();
    }

    h(b b1, c c)
    {
        this(b1);
    }

    public String a()
    {
        User user = (User)a(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser);
        if (user != null)
        {
            return user.b();
        } else
        {
            return null;
        }
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.user.User;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class i extends d
{

    final b a;

    private i(b b1)
    {
        a = b1;
        super();
    }

    i(b b1, c c)
    {
        this(b1);
    }

    public UserKey a()
    {
        User user = (User)a(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser);
        if (user != null)
        {
            return user.c();
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

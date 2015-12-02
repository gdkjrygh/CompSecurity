// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.auth.b.b;
import com.facebook.auth.b.d;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.c;
import com.facebook.user.User;

// Referenced classes of package com.facebook.auth.d:
//            b, t, s

public class q extends c
{

    public q()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new com.facebook.auth.d.b())));
        a(com/facebook/auth/b/d).a(new t(null)).a();
        a(com/facebook/auth/b/a).b(com/facebook/auth/b/d);
        a(com/facebook/auth/b/b).b(com/facebook/auth/b/d);
        a(com/facebook/user/User).a(com/facebook/auth/annotations/LoggedInUser).a(new s(null));
    }
}

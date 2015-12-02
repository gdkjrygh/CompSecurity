// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;
import com.facebook.orca.f.n;
import com.facebook.orca.g.e;
import com.facebook.orca.j.c;
import com.facebook.orca.threads.a;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bx extends d
{

    final h a;

    private bx(h h)
    {
        a = h;
        super();
    }

    bx(h h, i i)
    {
        this(h);
    }

    public n a()
    {
        return new n(e(com/facebook/auth/viewercontext/ViewerContext), b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (a)a(com/facebook/orca/threads/a), (com.facebook.common.time.a)a(com/facebook/orca/g/e), (c)a(com/facebook/orca/j/c));
    }

    public Object b()
    {
        return a();
    }
}

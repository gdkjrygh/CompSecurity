// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.ViewerContextUserKey;
import com.facebook.inject.d;
import com.facebook.orca.threads.q;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class db extends d
{

    final h a;

    private db(h h)
    {
        a = h;
        super();
    }

    db(h h, i i)
    {
        this(h);
    }

    public q a()
    {
        return new q(e(com/facebook/user/UserKey, com/facebook/auth/annotations/ViewerContextUserKey));
    }

    public Object b()
    {
        return a();
    }
}

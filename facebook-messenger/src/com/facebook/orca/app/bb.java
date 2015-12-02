// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.ViewerContextUserKey;
import com.facebook.inject.d;
import com.facebook.orca.threadview.k;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bb extends d
{

    final h a;

    private bb(h h)
    {
        a = h;
        super();
    }

    bb(h h, i i)
    {
        this(h);
    }

    public k a()
    {
        return new k(e(com/facebook/user/UserKey, com/facebook/auth/annotations/ViewerContextUserKey));
    }

    public Object b()
    {
        return a();
    }
}

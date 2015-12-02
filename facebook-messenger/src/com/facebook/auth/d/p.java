// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;
import com.facebook.user.UserKey;
import com.facebook.user.n;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class p extends d
{

    final b a;

    private p(b b1)
    {
        a = b1;
        super();
    }

    p(b b1, c c)
    {
        this(b1);
    }

    public UserKey a()
    {
        ViewerContext viewercontext = (ViewerContext)a(com/facebook/auth/viewercontext/ViewerContext);
        if (viewercontext != null)
        {
            return new UserKey(n.FACEBOOK, viewercontext.a());
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

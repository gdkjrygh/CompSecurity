// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.b.a;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class k extends d
{

    final b a;

    private k(b b1)
    {
        a = b1;
        super();
    }

    k(b b1, c c)
    {
        this(b1);
    }

    public UserTokenCredentials a()
    {
        ViewerContext viewercontext = ((a)a(com/facebook/auth/b/a)).a();
        if (viewercontext != null)
        {
            return new UserTokenCredentials(viewercontext.a(), viewercontext.b());
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.b.a;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            ap, aq

class au extends d
{

    final ap a;

    private au(ap ap)
    {
        a = ap;
        super();
    }

    au(ap ap, aq aq)
    {
        this(ap);
    }

    public String a()
    {
        ViewerContext viewercontext = ((a)a(com/facebook/auth/b/a)).a();
        if (viewercontext != null)
        {
            return viewercontext.b();
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.auth.viewercontext.e;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class n extends d
{

    final b a;

    private n(b b1)
    {
        a = b1;
        super();
    }

    n(b b1, c c)
    {
        this(b1);
    }

    public ViewerContext a()
    {
        return ((e)a(com/facebook/auth/viewercontext/e)).c();
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.b.b;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.threads.g;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class az extends d
{

    final h a;

    private az(h h)
    {
        a = h;
        super();
    }

    az(h h, i i)
    {
        this(h);
    }

    public g a()
    {
        return new g((b)a(com/facebook/auth/b/b), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), b(com/facebook/auth/viewercontext/ViewerContext));
    }

    public Object b()
    {
        return a();
    }
}

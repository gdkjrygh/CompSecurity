// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.b;

import android.content.Context;
import com.facebook.auth.viewercontext.e;
import com.facebook.common.executors.a;
import com.facebook.fbservice.ops.p;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.fbservice.b:
//            a, b

class g extends d
{

    final com.facebook.fbservice.b.a a;

    private g(com.facebook.fbservice.b.a a1)
    {
        a = a1;
        super();
    }

    g(com.facebook.fbservice.b.a a1, b b1)
    {
        this(a1);
    }

    public p a()
    {
        return new p((Context)a(android/content/Context), (com.facebook.fbservice.service.p)a(com/facebook/fbservice/service/p), (a)a(com/facebook/common/executors/a), (e)a(com/facebook/auth/viewercontext/e), (com.facebook.common.process.d)a(com/facebook/common/process/d));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.b;

import android.content.Context;
import com.facebook.fbservice.a.a;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.service.p;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.fbservice.b:
//            a, b

class h extends d
{

    final com.facebook.fbservice.b.a a;

    private h(com.facebook.fbservice.b.a a1)
    {
        a = a1;
        super();
    }

    h(com.facebook.fbservice.b.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((p)a(com/facebook/fbservice/service/p), (k)a(com/facebook/fbservice/ops/k), (Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}

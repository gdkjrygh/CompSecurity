// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.auth.b.b;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.app.dt;
import com.facebook.orca.sms.a.a;

// Referenced classes of package com.facebook.orca.sms:
//            ah, ai

class ak extends d
{

    final ah a;

    private ak(ah ah)
    {
        a = ah;
        super();
    }

    ak(ah ah, ai ai)
    {
        this(ah);
    }

    public a a()
    {
        return new a((b)a(com/facebook/auth/b/b), (k)e().a(com/facebook/fbservice/ops/k), b(com/facebook/orca/app/dt));
    }

    public Object b()
    {
        return a();
    }
}

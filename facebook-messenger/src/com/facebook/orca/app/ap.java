// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.prefs.b;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ap extends d
{

    final h a;

    private ap(h h)
    {
        a = h;
        super();
    }

    ap(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((com.facebook.auth.b.b)a(com/facebook/auth/b/b), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)a(com/facebook/fbservice/ops/k));
    }

    public Object b()
    {
        return a();
    }
}

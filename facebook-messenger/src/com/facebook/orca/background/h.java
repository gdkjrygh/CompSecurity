// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.support.v4.a.e;
import com.facebook.auth.b.b;
import com.facebook.common.time.a;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.background:
//            a, f, g

class h extends d
{

    final f a;

    private h(f f)
    {
        a = f;
        super();
    }

    h(f f, g g)
    {
        this(f);
    }

    public com.facebook.orca.background.a a()
    {
        return new com.facebook.orca.background.a((b)a(com/facebook/auth/b/b), (com.facebook.orca.g.b)a(com/facebook/orca/g/b), (k)e().a(com/facebook/fbservice/ops/k), (e)a(android/support/v4/a/e), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

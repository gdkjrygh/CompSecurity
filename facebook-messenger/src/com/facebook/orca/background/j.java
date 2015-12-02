// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.support.v4.a.e;
import com.facebook.auth.b.b;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.f.k;

// Referenced classes of package com.facebook.orca.background:
//            d, f, g

class j extends d
{

    final f a;

    private j(f f)
    {
        a = f;
        super();
    }

    j(f f, g g)
    {
        this(f);
    }

    public com.facebook.orca.background.d a()
    {
        return new com.facebook.orca.background.d((b)a(com/facebook/auth/b/b), b(com/facebook/orca/f/k), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k), (e)a(android/support/v4/a/e), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

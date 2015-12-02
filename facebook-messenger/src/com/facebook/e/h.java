// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import com.facebook.base.c;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.e.a.e;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;

// Referenced classes of package com.facebook.e:
//            r, n, c, m, 
//            p, q, l, b, 
//            j, s, o, k

public class h extends b
{

    public h()
    {
    }

    protected void a()
    {
        a(com/facebook/e/r).a(new n(this, null));
        a(com/facebook/e/c).a(new m(this, null)).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/e/c);
        a(com/facebook/e/a/e).a(new p(this, null)).a();
        a(com/facebook/e/a/h).a(new q(this, null)).a();
        b(com/facebook/e/a/g).a(new l(this, null)).a();
        a(com/facebook/e/b).a(new j(this, null)).a();
        a(com/facebook/e/s).a(new o(this, null)).a();
        a(com/facebook/base/activity/c).a(new k(null)).a();
        b(com/facebook/base/activity/g).b(com/facebook/base/activity/c);
    }
}

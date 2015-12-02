// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.base.IsBetaBuild;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.random.InsecureRandom;
import com.facebook.common.w.q;
import com.facebook.inject.d;
import java.util.Random;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.common.e:
//            i, d, e, h

class f extends d
{

    final com.facebook.common.e.d a;

    private f(com.facebook.common.e.d d1)
    {
        a = d1;
        super();
    }

    f(com.facebook.common.e.d d1, e e)
    {
        this(d1);
    }

    public h a()
    {
        return new i(b(com/facebook/common/w/q, com/facebook/auth/annotations/IsMeUserAnEmployee), b(java/lang/Boolean, com/facebook/base/IsBetaBuild), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService), (Random)a(java/util/Random, com/facebook/common/random/InsecureRandom), i.a);
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.base.a.k;
import com.facebook.base.c;
import com.facebook.common.executors.a;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class y extends d
{

    final com.facebook.base.c.a a;

    private y(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    y(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public k a()
    {
        return new k((a)a(com/facebook/common/executors/a), c(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread), c(com/facebook/base/d, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread), c(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread), c(com/facebook/base/d, com/facebook/common/init/NeedsLowPriorityInitOnUiThread), c(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread), c(com/facebook/base/d, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import android.support.v4.a.e;
import com.facebook.common.v.a;
import com.facebook.common.v.f;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.backgroundtasks:
//            e, c, d, AreBackgroundTasksEnabled, 
//            f, g

class i extends d
{

    final com.facebook.backgroundtasks.f a;

    private i(com.facebook.backgroundtasks.f f1)
    {
        a = f1;
        super();
    }

    i(com.facebook.backgroundtasks.f f1, g g)
    {
        this(f1);
    }

    public com.facebook.backgroundtasks.e a()
    {
        return new com.facebook.backgroundtasks.e((f)a(com/facebook/common/v/f), (a)a(com/facebook/common/v/a), (e)a(android/support/v4/a/e), c(com/facebook/backgroundtasks/c), (com.facebook.backgroundtasks.d)a(com/facebook/backgroundtasks/d), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), ((Boolean)a(java/lang/Boolean, com/facebook/backgroundtasks/AreBackgroundTasksEnabled)).booleanValue(), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}

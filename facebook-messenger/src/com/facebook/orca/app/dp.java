// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.abtest.qe.c;
import com.facebook.common.executors.ForUiThread;
import com.facebook.inject.d;
import com.facebook.orca.contacts.divebar.bs;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dp extends d
{

    final h a;

    private dp(h h)
    {
        a = h;
        super();
    }

    dp(h h, i i)
    {
        this(h);
    }

    public bs a()
    {
        return new bs((c)a(com/facebook/abtest/qe/c), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}

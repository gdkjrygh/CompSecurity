// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.executors.ForUiThread;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.broadcast:
//            m, d, e

class g extends d
{

    final com.facebook.auth.broadcast.d a;

    private g(com.facebook.auth.broadcast.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.auth.broadcast.d d1, e e)
    {
        this(d1);
    }

    public m a()
    {
        return new m((Context)a(android/content/Context), (Handler)a(android/os/Handler, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}

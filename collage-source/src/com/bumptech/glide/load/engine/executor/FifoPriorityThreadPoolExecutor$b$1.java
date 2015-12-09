// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//            FifoPriorityThreadPoolExecutor

static final class nit> extends nit>
{

    protected void a(Throwable throwable)
    {
        if (Log.isLoggable("PriorityExecutor", 6))
        {
            Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
        }
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}

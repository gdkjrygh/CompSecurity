// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.b.c:
//            e

final class f extends e
{

    f(String s)
    {
        super(s, 1, (byte)0);
    }

    protected final void a(Throwable throwable)
    {
        if (Log.isLoggable("PriorityExecutor", 6))
        {
            Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
        }
    }
}

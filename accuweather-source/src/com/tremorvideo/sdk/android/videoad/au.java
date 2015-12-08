// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, aq

class au
    implements Thread.UncaughtExceptionHandler
{

    final aq a;

    au(aq aq1)
    {
        a = aq1;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        ct.a(throwable.getStackTrace());
        ct.d(throwable.getMessage());
        aq.b(a).finish();
    }
}

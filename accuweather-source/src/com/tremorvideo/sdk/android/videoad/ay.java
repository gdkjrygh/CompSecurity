// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ax

class ay
    implements Thread.UncaughtExceptionHandler
{

    final ax a;

    ay(ax ax1)
    {
        a = ax1;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        ct.a(throwable.getStackTrace());
        ct.d(throwable.getMessage());
        a.a.finish();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, al

class ap
    implements Thread.UncaughtExceptionHandler
{

    final al a;

    ap(al al1)
    {
        a = al1;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        ct.a(throwable.getStackTrace());
        ct.d(throwable.getMessage());
        al.b(a).finish();
        GoogleAdapterCalls.onAdFinished();
    }
}

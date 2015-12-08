// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, dw

class dx
    implements Thread.UncaughtExceptionHandler
{

    final dw a;

    dx(dw dw)
    {
        a = dw;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        ct.a(throwable);
    }
}

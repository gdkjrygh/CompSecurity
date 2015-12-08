// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;


// Referenced classes of package com.skype.android.concurrent:
//            ListenableCompletableFuture, FutureListener

final class a
    implements Runnable
{

    final FutureListener a;
    final ListenableCompletableFuture b;

    public final void run()
    {
        ListenableCompletableFuture.access$000(b, a);
    }

    (ListenableCompletableFuture listenablecompletablefuture, FutureListener futurelistener)
    {
        b = listenablecompletablefuture;
        a = futurelistener;
        super();
    }
}

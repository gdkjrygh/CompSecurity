// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;

// Referenced classes of package com.spotify.cosmos.android:
//            DeferredResolver, ResolverException

class ceiver
    implements ateObserver
{

    final DeferredResolver this$0;
    final ceiver val$receiver;
    final Request val$request;

    public void onConnected()
    {
        resolve(val$request, val$receiver);
    }

    public void onConnectionFailed(Error error)
    {
        val$receiver.sendOnError(new ResolverException(error.name()));
    }

    ceiver()
    {
        this$0 = final_deferredresolver;
        val$request = request1;
        val$receiver = ceiver.this;
        super();
    }
}

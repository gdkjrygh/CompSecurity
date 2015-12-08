// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class val.controller
    implements Runnable
{

    final eationCallback val$callback;
    final LikeActionController val$controller;

    public final void run()
    {
        val$callback.onComplete(val$controller);
    }

    eationCallback()
    {
        val$callback = eationcallback;
        val$controller = likeactioncontroller;
        super();
    }
}

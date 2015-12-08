// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

final class val.error
    implements Runnable
{

    final eationCallback val$callback;
    final LikeActionController val$controller;
    final FacebookException val$error;

    public void run()
    {
        val$callback.onComplete(val$controller, val$error);
    }

    eationCallback()
    {
        val$callback = eationcallback;
        val$controller = likeactioncontroller;
        val$error = facebookexception;
        super();
    }
}

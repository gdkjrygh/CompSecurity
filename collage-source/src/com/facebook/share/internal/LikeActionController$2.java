// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

static final class val.controllerToRefresh
    implements Runnable
{

    final LikeActionController val$controllerToRefresh;

    public void run()
    {
        LikeActionController.access$200(val$controllerToRefresh);
    }

    (LikeActionController likeactioncontroller)
    {
        val$controllerToRefresh = likeactioncontroller;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.cosmos.android:
//            RemoteNativeRouter

class allback extends allback
{

    final RemoteNativeRouter this$0;

    public int getId()
    {
        return -1;
    }

    public void onError(Throwable throwable)
    {
    }

    public boolean onResolved(Response response)
    {
        return false;
    }

    public allback()
    {
        this$0 = RemoteNativeRouter.this;
        super(RemoteNativeRouter.this, null, null);
    }
}

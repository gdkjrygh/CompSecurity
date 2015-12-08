// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.cosmos.android:
//            RemoteNativeRouter

class <init> extends k
{

    final RemoteNativeRouter this$0;

    public boolean onResolved(Response response)
    {
        if (super.onResolved(response))
        {
            unsubscribe(getId());
        }
        return false;
    }

    private k(k k)
    {
        this$0 = RemoteNativeRouter.this;
        super(RemoteNativeRouter.this, k, null);
    }

    k(k k, k k1)
    {
        this(k);
    }
}

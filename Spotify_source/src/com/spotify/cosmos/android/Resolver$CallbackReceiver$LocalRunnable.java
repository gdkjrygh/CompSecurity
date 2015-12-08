// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Response;

class mResponse
    implements Runnable
{

    private final Response mResponse;
    final mResponse this$0;

    public void run()
    {
        mResponse.this.mResponse(mResponse);
    }

    public (Response response)
    {
        this$0 = this._cls0.this;
        super();
        mResponse = response;
    }
}

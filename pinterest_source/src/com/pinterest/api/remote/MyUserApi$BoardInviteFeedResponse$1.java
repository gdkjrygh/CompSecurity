// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class a extends BackgroundTask
{

    final PinterestJsonObject a;
    final b b;
    private Feed c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
    }

    public void run()
    {
        c = new BoardInviteFeed(a, cess._mth100(b));
    }

    ( , PinterestJsonObject pinterestjsonobject)
    {
        b = ;
        a = pinterestjsonobject;
        super();
    }
}

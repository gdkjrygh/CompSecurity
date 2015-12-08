// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.model.CommentFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Collections;

class a extends BackgroundTask
{

    final PinterestJsonObject a;
    final c b;
    private Feed c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
    }

    public void run()
    {
        c = new CommentFeed(b.tPinUid(), a, cess._mth1100(b));
        Collections.reverse(c.getItems());
        c.updateIds();
    }

    A(A a1, PinterestJsonObject pinterestjsonobject)
    {
        b = a1;
        a = pinterestjsonobject;
        super();
    }
}

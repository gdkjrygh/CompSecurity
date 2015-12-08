// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.google.gson.JsonPrimitive;
import com.pinterest.api.model.PinFeed;
import com.pinterest.base.StopWatch;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.remote:
//            PinApi

class a extends BackgroundTask
{

    final String a;
    final c b;
    private PinFeed c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
    }

    public void run()
    {
        c = PinFeed.parseJson(a, cess._mth400(b));
        if (b.HomeFeed)
        {
            StopWatch.get().putAuxData("ttlnhf", "ttlnhf_streaming_applied", new JsonPrimitive(new Boolean(true)));
            StopWatch.get().complete("ttlnhf");
        }
        PinApi.a(c);
    }

    ( , String s)
    {
        b = ;
        a = s;
        super();
    }
}

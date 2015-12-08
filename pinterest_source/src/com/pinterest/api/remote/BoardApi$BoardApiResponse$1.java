// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class b extends BackgroundTask
{

    public Board a;
    final ApiResponse b;
    final b c;

    public void onFinish()
    {
        c.Success(a);
    }

    public void run()
    {
        a = Board.make((PinterestJsonObject)b.getData(), true).();
    }

    ( , ApiResponse apiresponse)
    {
        c = ;
        b = apiresponse;
        super();
    }
}

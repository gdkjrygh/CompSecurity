// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class b extends BackgroundTask
{

    public User a;
    final ApiResponse b;
    final a c;

    public void onFinish()
    {
        c.Success(a);
    }

    public void run()
    {
        a = User.make((PinterestJsonObject)b.getData(), false);
        ModelHelper.setUser(a);
        ModelHelper.setPartner(a.getPartner());
    }

    ( , ApiResponse apiresponse)
    {
        c = ;
        b = apiresponse;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class a extends BackgroundTask
{

    final ApiResponse a;
    final a b;
    private ShopCollectionItem c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
    }

    public void run()
    {
        c = ShopCollectionItem.make((PinterestJsonObject)a.getData());
    }

    ( , ApiResponse apiresponse)
    {
        b = ;
        a = apiresponse;
        super();
    }
}

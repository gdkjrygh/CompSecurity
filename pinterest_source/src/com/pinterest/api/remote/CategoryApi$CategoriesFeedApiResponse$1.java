// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.api.model.CategoryFeed;
import com.pinterest.api.model.Hero;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class a extends BackgroundTask
{

    final PinterestJsonObject a;
    final b b;
    private CategoryFeed c;
    private Hero d;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c, d);
    }

    public void run()
    {
        if (CommerceHelper.isCommerceEnabled() && a.f("hero"))
        {
            d = (Hero)a.c("hero").a(com/pinterest/api/model/Hero);
        }
        c = new CategoryFeed(a, cess._mth000(b), cess._mth100(b));
    }

    ( , PinterestJsonObject pinterestjsonobject)
    {
        b = ;
        a = pinterestjsonobject;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.api.RequestParams;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;

public class Batch
{

    private PinterestJsonArray requests;

    public Batch()
    {
        requests = new PinterestJsonArray();
    }

    public void add(PinterestJsonObject pinterestjsonobject)
    {
        requests.a(pinterestjsonobject);
    }

    public RequestParams toRequestParam()
    {
        String s = requests.toString().replace("\\\\", "");
        RequestParams requestparams = new RequestParams();
        requestparams.a("requests", s);
        return requestparams;
    }
}

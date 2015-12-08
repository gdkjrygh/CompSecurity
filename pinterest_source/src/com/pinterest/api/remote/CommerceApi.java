// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.google.common.base.Strings;
import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class CommerceApi extends BaseApi
{

    public static final String a = (new StringBuilder("feeds/commerce/?fields=")).append(ApiFields.a()).append("&page_size=").append(Device.getPageSizeString()).toString();

    public static void a(BaseApiResponseHandler baseapiresponsehandler)
    {
        Batch batch = new Batch();
        BatchRequest batchrequest = new BatchRequest("GET", "/v3/feeds/commerce/");
        batchrequest.setParams("fields", new String[] {
            ApiFields.a()
        });
        batchrequest.setParams("page_size", new String[] {
            Device.getPageSizeString()
        });
        BatchRequest batchrequest1 = new BatchRequest("GET", "/v3/shop/sections/");
        batchrequest1.setParams("fields", new String[] {
            "shopsection.id,shopsection.description,shopsection.collections(),shopsection.title,shopsection.layout,shopsection.total_count,shopsection.display_count,shopcollection.cover_image_url,shopcollection.description,shopcollection.layout,shopcollection.layout_has_border,shopcollection.domain,shopcollection.type,shopcollection.object_id,shopcollection.label_text,shopcollection.title,shopcollection.action_text,shopcollection.layout_params"
        });
        batch.add(batchrequest1.toRequest());
        batch.add(batchrequest.toRequest());
        c("batch/", batch.toRequestParam(), baseapiresponsehandler, "shopspace");
    }

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        b(baseapiresponsehandler, s, null);
    }

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s, String s1)
    {
        a(String.format("shop/collections/%s/%s/", new Object[] {
            s, s1
        }), baseapiresponsehandler, "shopspace_collection");
    }

    public static void b(BaseApiResponseHandler baseapiresponsehandler, String s, String s1)
    {
        RequestParams requestparams = new RequestParams();
        if (!Strings.isNullOrEmpty(s1))
        {
            requestparams.a("bookmark", s1);
        }
        a(String.format("shop/sections/%s/collections/", new Object[] {
            s
        }), requestparams, baseapiresponsehandler, "shopspace_section");
    }

}

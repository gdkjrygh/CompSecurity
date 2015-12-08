// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.base.Device;
import com.pinterest.developer.DeveloperHelper;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.Experience;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class DynamicGridApi extends BaseApi
{

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("add_fields", ApiFields.J);
        requestparams.a("page_size", Device.getFirstRequestPageSizeString());
        requestparams.a("device_info", AppUtils.getMaxHeapSize());
        requestparams.a("item_count", 0);
        requestparams.a("dynamic_grid_stories", 2);
        if (DeveloperHelper.c())
        {
            requestparams.a("override_reasons", "ALL");
        }
        if (EducationHelper.l())
        {
            HashMap hashmap = new HashMap();
            hashmap.put(Integer.valueOf(Experience.ANDROID_COMMERCE_HOME_FEED_ED.getValue()), Boolean.valueOf(true));
            requestparams.a("experience_flag_map", (new PinterestJsonObject(hashmap)).toString());
        }
        a("feeds/home/", requestparams, baseapiresponsehandler, s);
    }
}

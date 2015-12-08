// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.base.Device;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.MccMnc;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class CategoryApi extends BaseApi
{

    public static void a(CategoriesFeedApiResponse categoriesfeedapiresponse, String s)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("add_fields", "category.images[45x,200x]");
        treemap.put("category_types", "main,commerce");
        treemap.put("browsable_only", "True");
        a("categories/android/", ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (categoriesfeedapiresponse)), s);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        s = String.format("feeds/%s/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.b());
        treemap.put("page_size", Device.getPageSizeString());
        treemap.put("device_info", AppUtils.getMaxHeapSize());
        MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
        treemap.put("mcc", String.valueOf(mccmnc.a));
        treemap.put("mnc", String.valueOf(mccmnc.b));
        a(s, ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, Map map)
    {
        s = String.format("feeds/%s/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("page_size", "40");
        MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
        treemap.put("mcc", String.valueOf(mccmnc.a));
        treemap.put("mnc", String.valueOf(mccmnc.b));
        treemap.put("join", "board,pinner,via_pinner");
        treemap.put("add_fields", "pin.board,pin.pinner,pin.via_pinner");
        try
        {
            ApiHttpClient.signedCall(s, "GET", treemap, pinfeedapiresponse, map, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.error(s, "exception occurred", new Object[0]);
        }
    }
}

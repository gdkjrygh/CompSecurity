// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiClient;
import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import com.pinterest.base.Device;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class BoardApi extends BaseApi
{

    private static RequestParams a(String s, String s1, String s2, Boolean boolean1, String s3, Boolean boolean2)
    {
        RequestParams requestparams = new RequestParams();
        if (s != null && s.length() > 0)
        {
            requestparams.a("name", s);
        }
        if (s1 != null && s1.length() > 0)
        {
            requestparams.a("category", s1);
        }
        if (s2 != null && s2.length() > 0)
        {
            requestparams.a("description", s2);
        }
        if (boolean1 != null)
        {
            if (boolean1.booleanValue())
            {
                s = "secret";
            } else
            {
                s = "public";
            }
            requestparams.a("privacy", s);
        }
        if (s3 != null)
        {
            requestparams.a("layout", s3);
        }
        if (boolean2 != null)
        {
            requestparams.a("collaborator_invites_enabled", boolean2);
        }
        return requestparams;
    }

    public static void a(String s, int l, String s1, PinApi.PinFeedApiResponse pinfeedapiresponse, String s2)
    {
        s = String.format("boards/%s/buyable_pins/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.g());
        if (l >= 0)
        {
            treemap.put("suggested_price", String.valueOf(l));
        }
        treemap.put("currency", s1);
        treemap.put("page_size", Device.getPageSizeString());
        a(s, true, ((Map) (treemap)), ((BaseApiResponseHandler) (pinfeedapiresponse)), s2);
    }

    public static void a(String s, BoardApiResponse boardapiresponse, String s1)
    {
        a(s, true, boardapiresponse, s1);
    }

    public static void a(String s, BoardFeedApiResponse boardfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.p);
        requestparams.a("page_size", Device.getPageSizeString());
        a(String.format("boards/%s/related/board/", new Object[] {
            s
        }), requestparams, ((BaseApiResponseHandler) (boardfeedapiresponse)), s1);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        a(s, true, pinfeedapiresponse, s1);
    }

    public static void a(String s, String s1, float f1, int l, int i1, int j1, int k1, BaseApiResponseHandler baseapiresponsehandler, 
            String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("board", s);
        requestparams.a("pin_id", s1);
        requestparams.a("scale", Float.valueOf(f1));
        requestparams.a("crop_x", l);
        requestparams.a("crop_y", i1);
        requestparams.a("width", j1);
        requestparams.a("height", k1);
        a("boards/%s/cover/", s, requestparams, baseapiresponsehandler, s2);
    }

    public static void a(String s, String s1, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("emails", s1);
        b((new StringBuilder("boards/")).append(s).append("/collaborators/invite/email/").toString(), requestparams, baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("invite_code", s1);
        c((new StringBuilder("boards/")).append(s).append("/collaborators/invite/facebook/").toString(), requestparams, null, s2);
    }

    public static void a(String s, String s1, String s2, Boolean boolean1, String s3, BaseApiResponseHandler baseapiresponsehandler)
    {
        b("boards/", a(s, s1, s2, boolean1, s3, ((Boolean) (null))), baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, String s2, String s3, Boolean boolean1, String s4, Boolean boolean2, BaseApiResponseHandler baseapiresponsehandler, 
            String s5)
    {
        a("boards/%s/", s, a(s1, s2, s3, boolean1, s4, boolean2), baseapiresponsehandler, s5);
    }

    public static void a(String s, String s1, boolean flag, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("boards/%s/collaborators/%s/?ban=");
        String s3;
        if (flag)
        {
            s3 = "1";
        } else
        {
            s3 = "0";
        }
        c(String.format(stringbuilder.append(s3).toString(), new Object[] {
            s, s1
        }), baseapiresponsehandler, s2);
    }

    public static void a(String s, boolean flag, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (flag)
        {
            b("boards/%s/follow/", s, baseapiresponsehandler, s1);
            return;
        } else
        {
            j(s, baseapiresponsehandler, s1);
            return;
        }
    }

    public static void a(String s, boolean flag, BoardApiResponse boardapiresponse, String s1)
    {
        a(s, flag, boardapiresponse, s1, ApiFields.m);
    }

    public static void a(String s, boolean flag, BoardApiResponse boardapiresponse, String s1, String s2)
    {
        String s3 = s2;
        if (StringUtils.isEmpty(s2))
        {
            s3 = ApiFields.m;
        }
        s = String.format("boards/%s/", new Object[] {
            s
        });
        s2 = new TreeMap();
        s2.put("fields", s3);
        a(s, flag, ((Map) (s2)), ((BaseApiResponseHandler) (boardapiresponse)), s1);
    }

    public static void a(String s, boolean flag, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        s = String.format("boards/%s/pins/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.g());
        treemap.put("page_size", Device.getPageSizeString());
        a(s, flag, ((Map) (treemap)), ((BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, boolean flag, UserApi.UserFeedApiResponse userfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.i);
        String s2;
        if (flag)
        {
            s2 = "6";
        } else
        {
            s2 = "30";
        }
        requestparams.a("page_size", s2);
        a((new StringBuilder("boards/")).append(s).append("/collaborators/").toString(), requestparams, ((BaseApiResponseHandler) (userfeedapiresponse)), s1);
    }

    public static void b(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        s = String.format("boards/%s/pins/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.g());
        treemap.put("page_size", "15");
        a(s, false, treemap, pinfeedapiresponse, s1);
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        Batch batch = new Batch();
        BatchRequest batchrequest = new BatchRequest("GET", String.format("/v3/boards/%s/", new Object[] {
            s1
        }));
        BatchRequest batchrequest1 = new BatchRequest("GET", String.format("/v3/boards/%s/collaborators/invites/me/", new Object[] {
            s1
        }));
        BatchRequest batchrequest2 = new BatchRequest("GET", String.format("/v3/boards/%s/pins/", new Object[] {
            s1
        }));
        BatchRequest batchrequest3 = new BatchRequest("GET", "/v3/experiences/");
        batchrequest.setParams("fields", new String[] {
            ApiFields.m
        });
        batchrequest2.setParams("page_size", new String[] {
            Device.getPageSizeString()
        });
        batchrequest2.setParams("fields", new String[] {
            ApiFields.g()
        });
        batchrequest3.setParams("placement_ids", new String[] {
            s
        });
        batchrequest3.setParams("extra_context", new String[] {
            (new StringBuilder("{\"board_id\":")).append(s1).append("}").toString()
        });
        batch.add(batchrequest.toRequest());
        batch.add(batchrequest1.toRequest());
        batch.add(batchrequest2.toRequest());
        batch.add(batchrequest3.toRequest());
        c("batch/", batch.toRequestParam(), baseapiresponsehandler, s2);
    }

    public static void e(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("collaborator_ids", s1);
        c((new StringBuilder("boards/")).append(s).append("/collaborators/invite/").toString(), requestparams, baseapiresponsehandler, s2);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("add_fields", ApiFields.o);
        requestparams.a("sort", "viewer_first");
        a(String.format("boards/%s/invites/", new Object[] {
            s
        }), requestparams, baseapiresponsehandler, s1);
    }

    public static void g(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        a((new StringBuilder("boards/")).append(s).append("/collaborators/invite/facebook/").toString(), baseapiresponsehandler, s1);
    }

    public static void h(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (ApiClient.d())
        {
            ApiHttpClient.post(String.format("boards/%s/collaborators/invite/accept/", new Object[] {
                s
            }), baseapiresponsehandler, s1);
        }
    }

    public static void i(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        c("boards/%s/collaborators/invite/me/", s, baseapiresponsehandler, s1);
    }

    public static void j(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        c("boards/%s/follow/", s, baseapiresponsehandler, s1);
    }

    public static void k(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        c("boards/%s/", s, baseapiresponsehandler, s1);
    }
}

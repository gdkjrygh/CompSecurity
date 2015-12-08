// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.net.Uri;
import android.text.TextUtils;
import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Device;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.kit.utils.PStringUtils;
import com.pinterest.schemas.experiences.Experience;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi, FeedApiResponseHandler

public class InterestsApi extends BaseApi
{

    public static void a(ApiResponseHandler apiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("add_fields", StringUtils.join(new String[] {
            ApiFields.t
        }));
        requestparams.a("long_request", "true");
        a("interests/explore/l1_l2/", requestparams, ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), null);
    }

    public static void a(ApiResponseHandler apiresponsehandler, String s)
    {
        a("orientation/status/", ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), s);
    }

    public static void a(Interest interest, boolean flag, String s, String s1, Boolean boolean1, ApiResponseHandler apiresponsehandler, String s2)
    {
        interest = String.format("users/me/interests/favorited/%s/", new Object[] {
            interest.getUid()
        });
        RequestParams requestparams = new RequestParams();
        if (s != null)
        {
            requestparams.a("referrer", s);
        }
        if (s1 != null)
        {
            requestparams.a("recommendation_source", s1);
        }
        if (boolean1 != null)
        {
            requestparams.a("alter_homefeed", boolean1);
        }
        if (flag)
        {
            b(interest, requestparams, apiresponsehandler, s2);
            return;
        } else
        {
            c(interest, apiresponsehandler, s2);
            return;
        }
    }

    public static void a(String s, int i, FeedApiResponseHandler feedapiresponsehandler, String s1)
    {
        a(s, i, ApiFields.u, feedapiresponsehandler, s1);
    }

    public static void a(String s, int i, InterestsFeedApiResponse interestsfeedapiresponse, String s1)
    {
        a(s, i, ApiFields.r, interestsfeedapiresponse, s1);
    }

    public static void a(String s, int i, String s1, FeedApiResponseHandler feedapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", s1);
        if (i > 0)
        {
            requestparams.a("limit", String.valueOf(i));
        } else
        {
            requestparams.a("limit", String.valueOf(Device.getPageSize()));
        }
        a(String.format("users/%s/interests/favorited/", new Object[] {
            s
        }), requestparams, ((com.pinterest.api.BaseApiResponseHandler) (feedapiresponsehandler)), s2);
    }

    public static void a(String s, int i, String s1, InterestsFeedApiResponse interestsfeedapiresponse, String s2)
    {
        s = Uri.encode(s);
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", s1);
        if (i > 0)
        {
            requestparams.a("limit", String.valueOf(i));
        } else
        {
            requestparams.a("limit", String.valueOf(Device.getPageSize()));
        }
        a((new StringBuilder("interests/")).append(s).append("/related/").toString(), requestparams, ((com.pinterest.api.BaseApiResponseHandler) (interestsfeedapiresponse)), s2);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler)
    {
        a(String.format("users/me/interests/%s/is_followed/", new Object[] {
            Uri.encode(s)
        }), ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), null);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.r);
        a(String.format("interests/collections/%s/", new Object[] {
            s
        }), requestparams, ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), s1);
    }

    public static void a(String s, InterestApiResponseHandler interestapiresponsehandler, String s1)
    {
        a(s, interestapiresponsehandler, ApiFields.r, s1);
    }

    public static void a(String s, InterestApiResponseHandler interestapiresponsehandler, String s1, String s2)
    {
        TreeMap treemap = new TreeMap();
        s = String.format("interests/%s/", new Object[] {
            s
        });
        treemap.put("fields", s1);
        treemap.put("page_size", Device.getPageSizeString());
        a(s, ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (interestapiresponsehandler)), s2);
    }

    public static void a(String s, InterestsFeedApiResponse interestsfeedapiresponse, String s1)
    {
        b(s, ApiFields.r, null, interestsfeedapiresponse, s1);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        TreeMap treemap = new TreeMap();
        s = String.format("interests/%s/feed/", new Object[] {
            s
        });
        treemap.put("fields", ApiFields.b());
        treemap.put("page_size", Device.getPageSizeString());
        a(s, ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, String s1, ApiResponseHandler apiresponsehandler, String s2)
    {
        b(String.format("users/%s/interests/removed/%s/", new Object[] {
            s, s1
        }), apiresponsehandler, s2);
    }

    public static void a(String s, String s1, Integer integer, InterestsFeedApiResponse interestsfeedapiresponse, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", s1);
        requestparams.a("blend_type", s);
        if (integer != null)
        {
            requestparams.a("limit", integer);
        }
        if (!TextUtils.isEmpty(null))
        {
            requestparams.a("last_viewed_board", null);
        }
        if (!TextUtils.isEmpty(null))
        {
            requestparams.a("last_viewed_interest", null);
        }
        a("users/me/interests/", requestparams, ((com.pinterest.api.BaseApiResponseHandler) (interestsfeedapiresponse)), s2);
    }

    public static void a(String s, String s1, String s2, String s3)
    {
        b(String.format("interests/%s/pin/%s/%s/", new Object[] {
            s, s1, s2
        }), null, s3);
    }

    public static void a(ArrayList arraylist, ApiResponseHandler apiresponsehandler, String s)
    {
        Object obj = new ArrayList(arraylist.size());
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ((List) (obj)).add(((Interest)arraylist.next()).getUid())) { }
        arraylist = new RequestParams();
        arraylist.a("interests", PStringUtils.concatStringArray(((List) (obj)), ","));
        obj = Experiences.a(Experiences.b);
        if (obj != null && ((ExperienceValue) (obj)).b == Experience.ANDROID_NUX_REBUILD_FEED.getValue())
        {
            arraylist.a("redo_homefeed", Boolean.valueOf(true));
        }
        c("orientation/signal/", arraylist, apiresponsehandler, s);
    }

    public static void b(ApiResponseHandler apiresponsehandler, String s)
    {
        c("orientation/interest_nux/", apiresponsehandler, s);
    }

    public static void b(String s, String s1, Integer integer, InterestsFeedApiResponse interestsfeedapiresponse, String s2)
    {
        a(s, s1, integer, interestsfeedapiresponse, s2);
    }
}

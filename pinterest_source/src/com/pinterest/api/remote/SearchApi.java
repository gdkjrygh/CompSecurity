// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.net.Uri;
import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.PStringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi, FeedApiResponseHandler

public class SearchApi extends BaseApi
{

    public static final String a = Resources.string(0x7f07072b);
    public static final String b = Resources.string(0x7f07072c);
    public static final String c = Resources.string(0x7f07073a);
    private static final String d = Resources.string(0x7f07073b);
    private static final String e = Resources.string(0x7f070730);
    private static final String f = Resources.string(0x7f070700);
    private static final String g = Resources.string(0x7f0706fe);
    private static final String h = Resources.string(0x7f0706ff);
    private static final String i = Resources.string(0x7f070729);
    private static final String j = Resources.string(0x7f07072a);
    private static final String k = Resources.string(0x7f070739);
    private static final List l = Arrays.asList(new String[] {
        "facebook_pinner", "mutual_follow", "follower", "twitter_pinner", "google_pinner", "yahoo_pinner", "gplus_pinner", "address_book_pinner", "second_degree_follower"
    });
    private static final List m = Arrays.asList(new String[] {
        "google_non_pinner", "yahoo_non_pinner"
    });
    private static final List n = Arrays.asList(new String[] {
        "board_follower"
    });

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        c("search/recent/", baseapiresponsehandler, s);
    }

    private static void a(RequestParams requestparams)
    {
        requestparams.a("asterix", Boolean.valueOf(true));
        requestparams.a("fields", ApiFields.d());
        requestparams.a("page_size", Device.getPageSizeString());
    }

    public static void a(String s)
    {
        a("search/typeahead/prepare/", ((BaseApiResponseHandler) (null)), s);
    }

    public static void a(String s, InterestsApi.InterestsFeedApiResponse interestsfeedapiresponse)
    {
        a(s, ApiFields.r, ((Integer) (null)), ((String) (null)), ((FeedApiResponseHandler) (interestsfeedapiresponse)), null);
    }

    public static void a(String s, PinApi.GuidedPinFeedApiResponse guidedpinfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s);
        a(requestparams);
        a("search/user_pins/me/", requestparams, ((BaseApiResponseHandler) (guidedpinfeedapiresponse)), s1);
    }

    public static void a(String s, Scope scope, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        String s2;
        RequestParams requestparams;
        requestparams = new RequestParams();
        s2 = "user.tag, user.website_url, user.location, user.domain_verified, user.verified_identity";
        _cls1.a[scope.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 98
    //                   2 108
    //                   3 156
    //                   4 162
    //                   5 178
    //                   6 188;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        scope = "board, board_suggestion, facebook_non_pinner, facebook_pinner, followee, mutual_follow, owner_and_commenter, pin_suggestion, twitter_non_pinner, twitter_pinner, recent_queries";
_L9:
        requestparams.a("q", s);
        requestparams.a("tags", scope);
        requestparams.a("add_fields", s2);
        a("search/typeahead/", requestparams, baseapiresponsehandler, s1);
        return;
_L2:
        scope = "geocoded_places";
        s2 = "";
        continue; /* Loop/switch isn't completed */
_L3:
        scope = new ArrayList();
        scope.addAll(l);
        scope.addAll(m);
        scope = PStringUtils.concatStringArray(scope, ",");
        requestparams.a("num_people", e);
        continue; /* Loop/switch isn't completed */
_L4:
        scope = "recent_queries";
        continue; /* Loop/switch isn't completed */
_L5:
        scope = "facebook_pinner, second_degree_follower, second_degree_followee, mutual_follow, owner_and_commenter, pin_suggestion, twitter_pinner";
        requestparams.a("num_people", d);
        continue; /* Loop/switch isn't completed */
_L6:
        scope = "board";
        s2 = "";
        continue; /* Loop/switch isn't completed */
_L7:
        scope = "facebook_pinner";
        s2 = (new StringBuilder()).append("user.tag, user.website_url, user.location, user.domain_verified, user.verified_identity").append(", user.followed_by_me").toString();
        requestparams.a("num_people", e);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(String s, UserApi.UserFeedApiResponse userfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s);
        requestparams.a("fields", ApiFields.i);
        requestparams.a("page_size", Device.getPageSizeString());
        a("search/users/", requestparams, ((BaseApiResponseHandler) (userfeedapiresponse)), s1);
    }

    public static void a(String s, String s1, ApiResponseHandler apiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("tags", "followee,mutual_follow,owner_and_commenter");
        requestparams.a("q", s);
        if (ModelHelper.isValid(s1))
        {
            requestparams.a("pin", String.valueOf(s1));
        }
        a("search/typeahead/", requestparams, ((BaseApiResponseHandler) (apiresponsehandler)), null);
    }

    public static void a(String s, String s1, PinApi.PinFeedApiResponse pinfeedapiresponse, String s2)
    {
        s = String.format("search/user_pins/%s/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s1);
        requestparams.a("fields", ApiFields.b());
        requestparams.a("page_size", Device.getPageSizeString());
        requestparams.a("topic_based", Boolean.valueOf(true));
        a(s, requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s2);
    }

    public static void a(String s, String s1, Integer integer, String s2, FeedApiResponseHandler feedapiresponsehandler, String s3)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s);
        requestparams.a("fields", s1);
        requestparams.a("active_only", Boolean.valueOf(true));
        s = integer;
        if (integer == null)
        {
            s = Device.getPageSizeString();
        }
        requestparams.a("page_size", s);
        if (s2 != null)
        {
            requestparams.a("caller", s2);
        }
        a("search/interests/", requestparams, ((BaseApiResponseHandler) (feedapiresponsehandler)), s3);
    }

    public static void a(String s, String s1, String s2)
    {
        s = String.format("search/%s/hide/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s1);
        b(s, requestparams, null, s2);
    }

    public static void a(String s, String s1, String s2, PinApi.PinFeedApiResponse pinfeedapiresponse, String s3)
    {
        s = String.format("search/user_pins/%s/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s2);
        requestparams.a("board", s1);
        requestparams.a("fields", ApiFields.b());
        requestparams.a("page_size", Device.getPageSizeString());
        requestparams.a("topic_based", Boolean.valueOf(true));
        a(s, requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s3);
    }

    public static void a(String s, boolean flag, BoardApi.GuidedBoardFeedApiResponse guidedboardfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s);
        requestparams.a("fields", ApiFields.l);
        requestparams.a("page_size", Device.getPageSizeString());
        if (flag)
        {
            s = "search/me/boards/";
        } else
        {
            s = "search/boards/";
        }
        a(s, requestparams, ((BaseApiResponseHandler) (guidedboardfeedapiresponse)), s1);
    }

    public static void a(Map map, List list, Map map1, List list1, PinApi.GuidedPinFeedApiResponse guidedpinfeedapiresponse, String s)
    {
        map = new RequestParams(map);
        a(((RequestParams) (map)));
        map.a("term_meta[]", StringUtils.join(list, ","));
        if (map1 != null)
        {
            for (list = map1.entrySet().iterator(); list.hasNext(); map.a((String)map1.getKey(), (String)map1.getValue()))
            {
                map1 = (java.util.Map.Entry)list.next();
            }

        }
        if (list1 != null && list1.size() > 0)
        {
            list = new StringBuilder();
            for (map1 = list1.iterator(); map1.hasNext(); list.append(String.format("%s:%s,", new Object[] {
    list1.getType(), list1.getTypeValueOrOption()
})))
            {
                list1 = (SearchFilter)map1.next();
            }

            map.a("filters", list.toString());
        }
        a("search/pins/", ((RequestParams) (map)), ((BaseApiResponseHandler) (guidedpinfeedapiresponse)), s);
    }

    public static void b(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("num_trending_queries", c);
        a("search/trending_queries/", requestparams, baseapiresponsehandler, s);
    }

    public static void b(String s, Scope scope, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams;
        requestparams = new RequestParams();
        requestparams.a("q", s);
        if (Experiments.s())
        {
            String s2;
            if (Device.isTablet())
            {
                s2 = j;
            } else
            {
                s2 = i;
            }
            requestparams.a("num_boards", s2);
            requestparams.a("num_people", s2);
            if (Device.isTablet())
            {
                s2 = b;
            } else
            {
                s2 = a;
            }
            requestparams.a("num_autocompletes", s2);
        } else
        {
            requestparams.a("num_boards", g);
            requestparams.a("num_people", f);
            requestparams.a("num_autocompletes", h);
        }
        requestparams.a("num_recent_queries", k);
        requestparams.a("add_fields", "user.follower_count,user.pin_count,board.owner(),board.pin_count,user.verified_identity");
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (scope != Scope.d) goto _L4; else goto _L3
_L3:
        requestparams.a("recent_queries_tags", "recent_pin_searches,recent_user_searches,recent_board_searches");
_L2:
        a("search/autocomplete/", requestparams, baseapiresponsehandler, s1);
        return;
_L4:
        if (scope == Scope.e)
        {
            requestparams.a("recent_queries_tags", "recent_personal_searches");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        s = Uri.encode(s);
        String s3 = (new StringBuilder("search/recent/?query=")).append(s).toString();
        s = s3;
        if (StringUtils.isNotEmpty(s1))
        {
            s = (new StringBuilder()).append(s3).append("&vertical=").append(s1).toString();
        }
        c(s, baseapiresponsehandler, s2);
    }

    public static void e(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("q", s);
        requestparams.a("board", s1);
        s = new ArrayList();
        s.addAll(l);
        s.addAll(n);
        requestparams.a("tags", PStringUtils.concatStringArray(s, ","));
        a("search/typeahead/", requestparams, baseapiresponsehandler, s2);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        String s2 = "search/recent/";
        if (StringUtils.isNotEmpty(s))
        {
            s2 = (new StringBuilder()).append("search/recent/").append("?vertical=").append(s).toString();
        }
        c(s2, baseapiresponsehandler, s1);
    }

    public static void f(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        if (StringUtils.isNotEmpty(s))
        {
            requestparams.a("country", s);
        }
        if (StringUtils.isNotEmpty(s1))
        {
            requestparams.a("version", s1);
        }
        a("search/typeahead/cache", requestparams, baseapiresponsehandler, s2);
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Scope.values().length];
            try
            {
                a[Scope.g.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[Scope.f.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Scope.d.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[Scope.b.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Scope.c.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Scope.h.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Scope.a.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Scope extends Enum
    {

        public static final Scope a;
        public static final Scope b;
        public static final Scope c;
        public static final Scope d;
        public static final Scope e;
        public static final Scope f;
        public static final Scope g;
        public static final Scope h;
        public static final Scope i;
        private static final Scope j[];

        public static Scope valueOf(String s)
        {
            return (Scope)Enum.valueOf(com/pinterest/api/remote/SearchApi$Scope, s);
        }

        public static Scope[] values()
        {
            return (Scope[])j.clone();
        }

        static 
        {
            a = new Scope("ALL", 0);
            b = new Scope("TYPEAHEAD", 1);
            c = new Scope("TYPEAHEAD_MY_BOARD", 2);
            d = new Scope("RECENT_QUERIES", 3);
            e = new Scope("RECENT_MY_QUERIES", 4);
            f = new Scope("PEOPLE_PICKER", 5);
            g = new Scope("PLACES", 6);
            h = new Scope("INVITE_FRIENDS", 7);
            i = new Scope("BOARD_COLLABORATORS", 8);
            j = (new Scope[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private Scope(String s, int i1)
        {
            super(s, i1);
        }
    }

}

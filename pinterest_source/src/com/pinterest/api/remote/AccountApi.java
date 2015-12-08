// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.net.Uri;
import com.pinterest.analytics.FunnelActions;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.activity.events.SocialShareEvent;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.EventType;
import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi, AnalyticsApi

public class AccountApi extends BaseApi
{

    public static void a()
    {
        b("logout/", null, null);
    }

    public static void a(Uri uri, BaseApiResponseHandler baseapiresponsehandler)
    {
        if (uri == null)
        {
            return;
        }
        Object obj = Uri.parse(uri.getQueryParameter("next"));
        uri = ((Uri) (obj)).getQueryParameter("token");
        String s = ((Uri) (obj)).getQueryParameter("expiration");
        String s1 = ((Uri) (obj)).getQueryParameter("user_id");
        if (StringUtils.isNotEmpty(uri) && StringUtils.isNotEmpty(s) && StringUtils.isNotEmpty(s1))
        {
            obj = new TreeMap();
            ((Map) (obj)).put("token", uri);
            ((Map) (obj)).put("expiration", s);
            ((Map) (obj)).put("user_id", s1);
            ApiHttpClient.signedCall("login/secure/", "POST", ((Map) (obj)), new LoginResponseHandler(baseapiresponsehandler, (byte)0), null, null);
            return;
        } else
        {
            baseapiresponsehandler.onFailure(new InvalidParameterException(((Uri) (obj)).toString()), "");
            return;
        }
    }

    public static void a(LoginParams loginparams, LoginApiResponse loginapiresponse)
    {
        String s;
        TreeMap treemap;
        s = "";
        treemap = new TreeMap();
        AnalyticsApi.a("login_attempt");
        Pinalytics.a(EventType.USER_LOGIN_ATTEMPT, null);
        loginparams.a();
        JVM INSTR tableswitch 0 5: default 68
    //                   0 101
    //                   1 120
    //                   2 151
    //                   3 241
    //                   4 196
    //                   5 310;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        loginparams = s;
_L9:
        ApiHttpClient.signedCall(String.format("login/%s", new Object[] {
            loginparams
        }), "POST", treemap, new LoginResponseHandler(loginapiresponse, (byte)0), null, null);
        return;
_L2:
        treemap.put("login_token", loginparams.a);
        loginparams = "token/";
        continue; /* Loop/switch isn't completed */
_L3:
        treemap.put("username_or_email", loginparams.b);
        treemap.put("password", loginparams.e);
        loginparams = s;
        continue; /* Loop/switch isn't completed */
_L4:
        treemap.put("twitter_id", loginparams.i);
        treemap.put("twitter_token", loginparams.f);
        treemap.put("twitter_token_secret", loginparams.g);
        loginparams = "twitter/";
        continue; /* Loop/switch isn't completed */
_L6:
        treemap.put("rakuten_id", loginparams.j);
        treemap.put("rakuten_token", loginparams.f);
        treemap.put("rakuten_refresh_token", loginparams.h);
        loginparams = "rakuten/";
        continue; /* Loop/switch isn't completed */
_L5:
        treemap.put("facebook_id", loginparams.m);
        treemap.put("facebook_token", loginparams.n);
        if (ModelHelper.isValid(loginparams.o))
        {
            treemap.put("facebook_scope", loginparams.o);
        } else
        {
            treemap.put("facebook_scope", "");
        }
        loginparams = "facebook/";
        continue; /* Loop/switch isn't completed */
_L7:
        treemap.put("gplus_id_token", loginparams.l);
        loginparams = "gplus/";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(SignupParams signupparams, BaseApiResponseHandler baseapiresponsehandler)
    {
        String s;
        String s1;
        TreeMap treemap;
        s1 = "";
        treemap = new TreeMap();
        treemap.put("first_name", signupparams.q);
        if (StringUtils.isNotEmpty(signupparams.r))
        {
            treemap.put("last_name", signupparams.r);
        }
        treemap.put("gender", signupparams.s);
        treemap.put("locale", Locale.getDefault().toString());
        if (StringUtils.isNotEmpty(signupparams.d))
        {
            treemap.put("phone_number", signupparams.d);
        }
        if (StringUtils.isNotEmpty(signupparams.v))
        {
            treemap.put("access_token", signupparams.v);
        }
        if (StringUtils.isNotEmpty(signupparams.c))
        {
            treemap.put("email", signupparams.c);
        }
        if (signupparams.b != null)
        {
            treemap.put("username", signupparams.b);
        }
        if (signupparams.e != null)
        {
            treemap.put("password", signupparams.e);
        }
        if (signupparams.u != null)
        {
            treemap.put("invite_code", signupparams.u);
        }
        if (signupparams.t != null)
        {
            treemap.put("custom_gender", signupparams.t);
        }
        if (signupparams.x != null)
        {
            treemap.put("visited_pages", signupparams.x);
        }
        AnalyticsApi.a(FunnelActions.a(signupparams.a()));
        s = s1;
        signupparams.a();
        JVM INSTR tableswitch 1 8: default 320
    //                   1 516
    //                   2 420
    //                   3 347
    //                   4 468
    //                   5 399
    //                   6 322
    //                   7 523
    //                   8 530;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L1:
        s = s1;
_L11:
        ApiHttpClient.signedCall(String.format("register/%s", new Object[] {
            s
        }), "POST", treemap, baseapiresponsehandler, null, null);
        return;
_L4:
        treemap.put("facebook_id", signupparams.m);
        treemap.put("facebook_token", signupparams.n);
        treemap.put("facebook_timeline_enabled", a(signupparams.p));
        s = "facebook/";
        continue; /* Loop/switch isn't completed */
_L6:
        treemap.put("one_time_code", signupparams.k);
        s = "gplus/";
        continue; /* Loop/switch isn't completed */
_L3:
        treemap.put("twitter_id", signupparams.i);
        treemap.put("twitter_token", signupparams.f);
        treemap.put("twitter_token_secret", signupparams.g);
        s = "twitter/";
        continue; /* Loop/switch isn't completed */
_L5:
        treemap.put("rakuten_id", signupparams.j);
        treemap.put("rakuten_token", signupparams.f);
        treemap.put("rakuten_refresh_token", signupparams.h);
        s = "rakuten/";
        continue; /* Loop/switch isn't completed */
_L2:
        s = "email/";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "phone_number/";
        continue; /* Loop/switch isn't completed */
_L9:
        treemap.put("signup_method", "passwordless");
        s = "passwordless/";
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static void a(SocialShareEvent socialshareevent, boolean flag)
    {
        String s = String.format("log/facebook/feed_share/%s/%s/%s", new Object[] {
            socialshareevent.getStrType(), socialshareevent.id, socialshareevent.fbRef
        });
        socialshareevent = s;
        if (!flag)
        {
            socialshareevent = (new StringBuilder()).append(s).append("?completed=0").toString();
        }
        b(socialshareevent, null, null);
    }

    public static void a(String s)
    {
        b(String.format("log/facebook/clickthrough/%s", new Object[] {
            s
        }), null, null);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler)
    {
        b("users/devices/%s/", s, apiresponsehandler, null);
    }

    public static void a(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("email", s);
        ApiHttpClient.signedCall("register/exists/", "GET", treemap, baseapiresponsehandler, null, null);
    }

    public static void a(String s, String s1, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("old", s);
        requestparams.a("new", s1);
        requestparams.a("new_confirm", s1);
        c("users/password/", requestparams, baseapiresponsehandler, null);
    }

    public static void a(Map map, BaseApiResponseHandler baseapiresponsehandler)
    {
        ApiHttpClient.signedCall("users/password_reset/", "POST", map, baseapiresponsehandler, null, null);
    }

    public static String b()
    {
        String s1 = MyUser.getUid();
        String s = s1;
        if (s1 == null)
        {
            s = "0";
        }
        s1 = RandomStringUtils.randomAlphanumeric(20);
        return (new StringBuilder()).append(s).append(":").append(s1).toString();
    }

    public static void b(String s)
    {
        a(String.format("invite_code/%s/", new Object[] {
            s
        }), null, new _cls1(), null);
    }

    public static void b(String s, ApiResponseHandler apiresponsehandler)
    {
        c("users/devices/%s/", s, apiresponsehandler, null);
    }

    public static void b(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("email", s);
        ApiHttpClient.signedCall("login/email/suggestions/", "GET", treemap, baseapiresponsehandler, null, null);
    }

    public static void c()
    {
        c("address_book/%s/", ApplicationInfo.getInstallId(), null, null);
    }

    public static void c(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("username_or_email", s);
        try
        {
            ApiHttpClient.signedCall(String.format("users/forgot_password/", new Object[0]), "POST", treemap, baseapiresponsehandler, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.error(s, "exception occurred", new Object[0]);
        }
    }

    public static void d(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("contacts", s);
        a("address_book/%s/", ApplicationInfo.getInstallId(), requestparams, baseapiresponsehandler, null);
    }

    private class LoginResponseHandler extends BaseApiResponseHandler
    {

        private BaseApiResponseHandler a;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (a != null)
            {
                a.onFailure(throwable, apiresponse);
            }
            a = null;
        }

        public final void onFinish()
        {
            if (a != null)
            {
                a.onFinish();
            }
        }

        public final void onStart()
        {
            if (a != null)
            {
                a.onStart();
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            try
            {
                if (apiresponse.getData() != null)
                {
                    ApiClient.a(((PinterestJsonObject)apiresponse.getData()).a("access_token", ""));
                }
            }
            catch (Exception exception) { }
            if (a != null)
            {
                a.onSuccess(apiresponse);
            }
            a = null;
        }

        private LoginResponseHandler(BaseApiResponseHandler baseapiresponsehandler)
        {
            a = baseapiresponsehandler;
        }

        LoginResponseHandler(BaseApiResponseHandler baseapiresponsehandler, byte byte0)
        {
            this(baseapiresponsehandler);
        }
    }


    private class LoginParams
    {

        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public boolean p;

        public final int a()
        {
            if (i != null)
            {
                return 2;
            }
            if (j != null)
            {
                return 4;
            }
            if (m != null || o != null)
            {
                return 3;
            }
            if (k != null || l != null)
            {
                return 5;
            }
            if (a != null)
            {
                return 0;
            }
            if (d != null)
            {
                return 7;
            }
            return c == null || e != null ? 1 : 8;
        }

        public LoginParams()
        {
            p = false;
        }
    }


    private class SignupParams extends SocialConnectParams
    {
        private class SocialConnectParams extends LoginParams
        {

            public String y;
            public String z;

            public SocialConnectParams()
            {
            }
        }


        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
        public String v;
        public int w;
        public String x;

        public SignupParams()
        {
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (apiresponse.getCode() == 820)
            {
                Events.post(new InviteCodeValidationResult(false));
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (!(apiresponse instanceof PinterestJsonObject))
            {
                return;
            }
            boolean flag;
            if (!((PinterestJsonObject)apiresponse).a("is_accepted", Boolean.valueOf(false)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Events.post(new InviteCodeValidationResult(flag));
        }

        _cls1()
        {
        }

        private class InviteCodeValidationResult
        {

            private boolean a;

            public final boolean a()
            {
                return a;
            }

            public InviteCodeValidationResult(boolean flag)
            {
                a = flag;
            }
        }

    }

}

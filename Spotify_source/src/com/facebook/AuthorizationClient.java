// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import aod;
import aoe;
import aof;
import aoo;
import aou;
import aov;
import aoz;
import apc;
import com.facebook.model.GraphUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AppEventsLogger, Request, HttpMethod, FacebookException, 
//            SessionLoginBehavior, AccessToken, Session

public class AuthorizationClient
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    transient Context a;
    transient aof b;
    transient aoe c;
    AuthHandler currentHandler;
    transient aod d;
    private transient boolean e;
    private transient AppEventsLogger f;
    List handlersToTry;
    Map loggingExtras;
    AuthorizationRequest pendingRequest;

    AuthorizationClient()
    {
    }

    static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", s);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    static void a(AuthorizationClient authorizationclient)
    {
        if (authorizationclient.d != null)
        {
            authorizationclient.d.b();
        }
    }

    static void a(AuthorizationClient authorizationclient, String s, String s1)
    {
        authorizationclient = AppEventsLogger.a(authorizationclient.a, s);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", s1);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", s);
        authorizationclient.b("fb_dialogs_web_login_dialog_complete", bundle);
    }

    private void a(String s, String s1, String s2, String s3, Map map)
    {
        if (pendingRequest != null) goto _L2; else goto _L1
_L1:
        s1 = a("");
        class Result.Code extends Enum
        {

            public static final Result.Code a;
            public static final Result.Code b;
            public static final Result.Code c;
            private static final Result.Code d[];
            final String loggingValue;

            public static Result.Code valueOf(String s4)
            {
                return (Result.Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s4);
            }

            public static Result.Code[] values()
            {
                return (Result.Code[])d.clone();
            }

            static 
            {
                a = new Result.Code("SUCCESS", 0, "success");
                b = new Result.Code("CANCEL", 1, "cancel");
                c = new Result.Code("ERROR", 2, "error");
                d = (new Result.Code[] {
                    a, b, c
                });
            }

            private Result.Code(String s, int i, String s1)
            {
                super(s, i);
                loggingValue = s1;
            }
        }

        s1.putString("2_result", Result.Code.c.loggingValue);
        s1.putString("5_error_message", "Unexpected call to logAuthorizationMethodComplete with null pendingRequest.");
_L4:
        s1.putString("3_method", s);
        s1.putLong("1_timestamp_ms", System.currentTimeMillis());
        f().b("fb_mobile_login_method_complete", s1);
        return;
_L2:
        Bundle bundle = a(pendingRequest.authId);
        if (s1 != null)
        {
            bundle.putString("2_result", s1);
        }
        if (s2 != null)
        {
            bundle.putString("5_error_message", s2);
        }
        if (s3 != null)
        {
            bundle.putString("4_error_code", s3);
        }
        s1 = bundle;
        if (map != null)
        {
            s1 = bundle;
            if (!map.isEmpty())
            {
                bundle.putString("6_extras", (new JSONObject(map)).toString());
                s1 = bundle;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(String s, String s1, boolean flag)
    {
        if (loggingExtras == null)
        {
            loggingExtras = new HashMap();
        }
        String s2 = s1;
        if (loggingExtras.containsKey(s))
        {
            s2 = s1;
            if (flag)
            {
                s2 = (new StringBuilder()).append((String)loggingExtras.get(s)).append(",").append(s1).toString();
            }
        }
        loggingExtras.put(s, s2);
    }

    private static Request b(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id");
        bundle.putString("access_token", s);
        return new Request(null, "me", bundle, HttpMethod.a, null);
    }

    static void b(AuthorizationClient authorizationclient)
    {
        authorizationclient.g();
    }

    static String c()
    {
        return h();
    }

    private boolean d()
    {
        if (e)
        {
            return true;
        }
        if (a.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            String s = a.getString(0x7f0805fa);
            String s1 = a.getString(0x7f0805f9);
            b(Result.a(pendingRequest, s, s1));
            return false;
        } else
        {
            e = true;
            return true;
        }
    }

    private boolean e()
    {
        if (currentHandler.c() && !d())
        {
            a("no_internet_permission", "1", false);
            return false;
        }
        boolean flag = currentHandler.a(pendingRequest);
        if (flag)
        {
            String s = currentHandler.a();
            Bundle bundle = a(pendingRequest.authId);
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("3_method", s);
            f().b("fb_mobile_login_method_start", bundle);
            return flag;
        } else
        {
            a("not_tried", currentHandler.a(), true);
            return flag;
        }
    }

    private AppEventsLogger f()
    {
        if (f == null || !f.a.applicationId.equals(pendingRequest.applicationId))
        {
            f = AppEventsLogger.a(a, pendingRequest.applicationId);
        }
        return f;
    }

    private void g()
    {
        if (d != null)
        {
            d.a();
        }
    }

    private static String h()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    final void a()
    {
        if (currentHandler != null)
        {
            a(currentHandler.a(), "skipped", null, null, currentHandler.methodLoggingExtras);
        }
_L4:
        if (handlersToTry == null || handlersToTry.isEmpty()) goto _L2; else goto _L1
_L1:
        currentHandler = (AuthHandler)handlersToTry.remove(0);
        if (!e()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (pendingRequest != null)
        {
            b(Result.a(pendingRequest, "Login attempt failed.", null));
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    final void a(AuthorizationRequest authorizationrequest)
    {
        boolean flag;
        if (pendingRequest != null && currentHandler != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (pendingRequest == null || currentHandler == null)
            {
                throw new FacebookException("Attempted to continue authorization without a pending request.");
            }
            if (currentHandler.b())
            {
                currentHandler.d();
                e();
            }
        } else
        if (authorizationrequest != null)
        {
            if (pendingRequest != null)
            {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            if (!authorizationrequest.a() || d())
            {
                pendingRequest = authorizationrequest;
                ArrayList arraylist = new ArrayList();
                SessionLoginBehavior sessionloginbehavior = authorizationrequest.loginBehavior;
                if (sessionloginbehavior.allowsKatanaAuth)
                {
                    if (!authorizationrequest.isLegacy)
                    {
                        arraylist.add(new GetTokenAuthHandler());
                    }
                    arraylist.add(new KatanaProxyAuthHandler());
                }
                if (sessionloginbehavior.allowsWebViewAuth)
                {
                    arraylist.add(new WebViewAuthHandler());
                }
                handlersToTry = arraylist;
                a();
                return;
            }
        }
    }

    final void a(Result result)
    {
        if (result.token != null && pendingRequest.a())
        {
            if (result.token == null)
            {
                throw new FacebookException("Can't validate without a token");
            } else
            {
                ArrayList arraylist = new ArrayList();
                ArrayList arraylist1 = new ArrayList();
                ArrayList arraylist2 = new ArrayList();
                Object obj2 = result.token.token;
                Object obj3 = new aoo(arraylist) {

                    private ArrayList a;

                    public final void a(aoz aoz1)
                    {
                        try
                        {
                            aoz1 = (GraphUser)aoz1.a(com/facebook/model/GraphUser);
                        }
                        // Misplaced declaration of an exception variable
                        catch (aoz aoz1)
                        {
                            return;
                        }
                        if (aoz1 == null)
                        {
                            break MISSING_BLOCK_LABEL_28;
                        }
                        a.add(aoz1.getId());
                    }

            
            {
                a = arraylist;
                super();
            }
                };
                Object obj1 = pendingRequest.previousAccessToken;
                Object obj = b(((String) (obj1)));
                obj.d = ((aoo) (obj3));
                obj2 = b(((String) (obj2)));
                obj2.d = ((aoo) (obj3));
                obj3 = new Bundle();
                ((Bundle) (obj3)).putString("access_token", ((String) (obj1)));
                obj1 = new Request(null, "me/permissions", ((Bundle) (obj3)), HttpMethod.a, null);
                obj1.d = new aoo(arraylist1, arraylist2) {

                    private ArrayList a;
                    private ArrayList b;

                    public final void a(aoz aoz)
                    {
                        try
                        {
                            aoz = Session.a(aoz);
                        }
                        // Misplaced declaration of an exception variable
                        catch (aoz aoz)
                        {
                            return;
                        }
                        if (aoz == null)
                        {
                            break MISSING_BLOCK_LABEL_33;
                        }
                        a.addAll(((apc) (aoz)).a);
                        b.addAll(((apc) (aoz)).b);
                    }

            
            {
                a = arraylist;
                b = arraylist1;
                super();
            }
                };
                obj = new aou(new Request[] {
                    obj, obj2, obj1
                });
                obj.e = pendingRequest.applicationId;
                ((aou) (obj)).a(new aov(arraylist, result, arraylist1, arraylist2) {

                    private ArrayList a;
                    private Result b;
                    private ArrayList c;
                    private ArrayList d;
                    private AuthorizationClient e;

                    public final void a()
                    {
                        Object obj4;
                        if (a.size() != 2 || a.get(0) == null || a.get(1) == null || !((String)a.get(0)).equals(a.get(1)))
                        {
                            break MISSING_BLOCK_LABEL_105;
                        }
                        obj4 = AccessToken.a(b.token, c, d);
                        obj4 = Result.a(e.pendingRequest, ((AccessToken) (obj4)));
_L1:
                        e.b(((Result) (obj4)));
                        AuthorizationClient.a(e);
                        return;
                        obj4 = Result.a(e.pendingRequest, "User logged in as different Facebook user.", null);
                          goto _L1
                        Object obj5;
                        obj5;
                        e.b(Result.a(e.pendingRequest, "Caught exception", ((Exception) (obj5)).getMessage()));
                        AuthorizationClient.a(e);
                        return;
                        obj5;
                        AuthorizationClient.a(e);
                        throw obj5;
                    }

            
            {
                e = AuthorizationClient.this;
                a = arraylist;
                b = result;
                c = arraylist1;
                d = arraylist2;
                super();
            }
                });
                g();
                Request.b(((aou) (obj)));
                return;
            }
        } else
        {
            b(result);
            return;
        }
    }

    final boolean a(int i, int j, Intent intent)
    {
        if (i == pendingRequest.requestCode)
        {
            return currentHandler.a(j, intent);
        } else
        {
            return false;
        }
    }

    final aof b()
    {
        if (b != null)
        {
            return b;
        }
        if (pendingRequest != null)
        {
            return new aof() {

                private AuthorizationClient a;

                public final Activity a()
                {
                    return a.pendingRequest.a.a();
                }

                public final void a(Intent intent, int i)
                {
                    a.pendingRequest.a.a(intent, i);
                }

            
            {
                a = AuthorizationClient.this;
                super();
            }
            };
        } else
        {
            return null;
        }
    }

    final void b(Result result)
    {
        if (currentHandler != null)
        {
            String s = currentHandler.a();
            Map map = currentHandler.methodLoggingExtras;
            a(s, result.code.loggingValue, result.errorMessage, result.errorCode, map);
        }
        if (loggingExtras != null)
        {
            result.loggingExtras = loggingExtras;
        }
        handlersToTry = null;
        currentHandler = null;
        pendingRequest = null;
        loggingExtras = null;
        if (c != null)
        {
            c.a(result);
        }
    }

    // Unreferenced inner class com/facebook/AuthorizationClient$1

/* anonymous class */
    final class _cls1
        implements aof
    {

        private Activity a;

        public final Activity a()
        {
            return a;
        }

        public final void a(Intent intent, int i)
        {
            a.startActivityForResult(intent, i);
        }

            
            {
                a = activity;
                super();
            }
    }


    private class AuthorizationRequest
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final transient aof a;
        final String applicationId;
        final String authId;
        final SessionDefaultAudience defaultAudience;
        boolean isLegacy;
        boolean isRerequest;
        final SessionLoginBehavior loginBehavior;
        List permissions;
        final String previousAccessToken;
        final int requestCode;

        final boolean a()
        {
            return previousAccessToken != null && !isLegacy;
        }

        AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
                aof aof, String s2)
        {
            isLegacy = false;
            isRerequest = false;
            loginBehavior = sessionloginbehavior;
            requestCode = i;
            isLegacy = flag;
            permissions = list;
            defaultAudience = sessiondefaultaudience;
            applicationId = s;
            previousAccessToken = s1;
            a = aof;
            authId = s2;
        }
    }


    private class Result
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final Code code;
        final String errorCode;
        final String errorMessage;
        Map loggingExtras;
        final AuthorizationRequest request;
        final AccessToken token;

        static Result a(AuthorizationRequest authorizationrequest, AccessToken accesstoken)
        {
            return new Result(authorizationrequest, Code.a, accesstoken, null, null);
        }

        static Result a(AuthorizationRequest authorizationrequest, String s)
        {
            return new Result(authorizationrequest, Code.b, null, s, null);
        }

        static Result a(AuthorizationRequest authorizationrequest, String s, String s1)
        {
            return a(authorizationrequest, s, s1, null);
        }

        static Result a(AuthorizationRequest authorizationrequest, String s, String s1, String s2)
        {
            s = TextUtils.join(": ", arp.b(new String[] {
                s, s1
            }));
            return new Result(authorizationrequest, Code.c, null, s, s2);
        }

        private Result(AuthorizationRequest authorizationrequest, Code code1, AccessToken accesstoken, String s, String s1)
        {
            request = authorizationrequest;
            token = accesstoken;
            errorMessage = s;
            code = code1;
            errorCode = s1;
        }
    }


    private class AuthHandler
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        Map methodLoggingExtras;
        final AuthorizationClient this$0;

        abstract String a();

        protected final void a(String s, Object obj)
        {
            if (methodLoggingExtras == null)
            {
                methodLoggingExtras = new HashMap();
            }
            Map map = methodLoggingExtras;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = obj.toString();
            }
            map.put(s, obj);
        }

        boolean a(int i, Intent intent)
        {
            return false;
        }

        abstract boolean a(AuthorizationRequest authorizationrequest);

        boolean b()
        {
            return false;
        }

        boolean c()
        {
            return false;
        }

        void d()
        {
        }

        AuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class GetTokenAuthHandler extends AuthHandler
    {

        private static final long serialVersionUID = 1L;
        private transient aoi a;
        final AuthorizationClient this$0;

        final String a()
        {
            return "get_token";
        }

        final void a(AuthorizationRequest authorizationrequest, Bundle bundle)
        {
            a = null;
            AuthorizationClient.a(AuthorizationClient.this);
            if (bundle != null)
            {
                ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                Object obj = authorizationrequest.permissions;
                if (arraylist != null && (obj == null || arraylist.containsAll(((Collection) (obj)))))
                {
                    authorizationrequest = AccessToken.a(bundle, AccessTokenSource.d);
                    authorizationrequest = Result.a(pendingRequest, authorizationrequest);
                    AuthorizationClient.this.a(authorizationrequest);
                    return;
                }
                bundle = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    if (!arraylist.contains(s))
                    {
                        bundle.add(s);
                    }
                } while (true);
                if (!bundle.isEmpty())
                {
                    a("new_permissions", TextUtils.join(",", bundle));
                }
                authorizationrequest.permissions = bundle;
            }
            AuthorizationClient.this.a();
        }

        final boolean a(AuthorizationRequest authorizationrequest)
        {
            a = new aoi(AuthorizationClient.this.a, authorizationrequest.applicationId);
            if (!a.a())
            {
                return false;
            } else
            {
                AuthorizationClient.b(AuthorizationClient.this);
                authorizationrequest = new arj(authorizationrequest) {

                    private AuthorizationRequest a;
                    private GetTokenAuthHandler b;

                    public final void a(Bundle bundle)
                    {
                        b.a(a, bundle);
                    }

                
                {
                    b = GetTokenAuthHandler.this;
                    a = authorizationrequest;
                    super();
                }
                };
                a.b = authorizationrequest;
                return true;
            }
        }

        final boolean b()
        {
            return a == null;
        }

        final void d()
        {
            if (a != null)
            {
                a.c = false;
                a = null;
            }
        }

        GetTokenAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class KatanaProxyAuthHandler extends KatanaAuthHandler
    {
        private class KatanaAuthHandler extends AuthHandler
        {

            private static final long serialVersionUID = 1L;
            final AuthorizationClient this$0;

            protected final boolean a(Intent intent, int i)
            {
                if (intent == null)
                {
                    return false;
                }
                try
                {
                    b().a(intent, i);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    return false;
                }
                return true;
            }

            KatanaAuthHandler()
            {
                this$0 = AuthorizationClient.this;
                super();
            }
        }


        private static final long serialVersionUID = 1L;
        private String applicationId;
        final AuthorizationClient this$0;

        final String a()
        {
            return "katana_proxy_auth";
        }

        final boolean a(int i, Intent intent)
        {
            if (intent == null)
            {
                intent = Result.a(pendingRequest, "Operation canceled");
            } else
            if (i == 0)
            {
                intent = Result.a(pendingRequest, intent.getStringExtra("error"));
            } else
            if (i != -1)
            {
                intent = Result.a(pendingRequest, "Unexpected resultCode from authorization.", null);
            } else
            {
                Bundle bundle = intent.getExtras();
                String s = bundle.getString("error");
                intent = s;
                if (s == null)
                {
                    intent = bundle.getString("error_type");
                }
                String s2 = bundle.getString("error_code");
                String s1 = bundle.getString("error_message");
                s = s1;
                if (s1 == null)
                {
                    s = bundle.getString("error_description");
                }
                s1 = bundle.getString("e2e");
                if (!arp.a(s1))
                {
                    AuthorizationClient.a(AuthorizationClient.this, applicationId, s1);
                }
                if (intent == null && s2 == null && s == null)
                {
                    intent = AccessToken.a(pendingRequest.permissions, bundle, AccessTokenSource.b);
                    intent = Result.a(pendingRequest, intent);
                } else
                if (ark.a.contains(intent))
                {
                    intent = null;
                } else
                if (ark.b.contains(intent))
                {
                    intent = Result.a(pendingRequest, null);
                } else
                {
                    intent = Result.a(pendingRequest, intent, s, s2);
                }
            }
            if (intent != null)
            {
                AuthorizationClient.this.a(intent);
            } else
            {
                AuthorizationClient.this.a();
            }
            return true;
        }

        final boolean a(AuthorizationRequest authorizationrequest)
        {
            applicationId = authorizationrequest.applicationId;
            String s = AuthorizationClient.c();
            Intent intent = arc.a(AuthorizationClient.this.a, authorizationrequest.applicationId, authorizationrequest.permissions, s, authorizationrequest.isRerequest, authorizationrequest.defaultAudience);
            a("e2e", s);
            return a(intent, authorizationrequest.requestCode);
        }

        KatanaProxyAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class WebViewAuthHandler extends AuthHandler
    {

        private static final long serialVersionUID = 1L;
        private transient ash a;
        String applicationId;
        String e2e;
        final AuthorizationClient this$0;

        final String a()
        {
            return "web_view";
        }

        final boolean a(AuthorizationRequest authorizationrequest)
        {
            applicationId = authorizationrequest.applicationId;
            Object obj = new Bundle();
            if (!arp.a(authorizationrequest.permissions))
            {
                String s = TextUtils.join(",", authorizationrequest.permissions);
                ((Bundle) (obj)).putString("scope", s);
                a("scope", s);
            }
            ((Bundle) (obj)).putString("default_audience", authorizationrequest.defaultAudience.nativeProtocolAudience);
            Object obj1 = authorizationrequest.previousAccessToken;
            if (!arp.a(((String) (obj1))) && ((String) (obj1)).equals(AuthorizationClient.this.b().a().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))
            {
                ((Bundle) (obj)).putString("access_token", ((String) (obj1)));
                a("access_token", "1");
            } else
            {
                arp.b(AuthorizationClient.this.a);
                a("access_token", "0");
            }
            obj1 = new asl(authorizationrequest) {

                private AuthorizationRequest a;
                private WebViewAuthHandler b;

                public final void a(Bundle bundle, FacebookException facebookexception)
                {
                    WebViewAuthHandler webviewauthhandler = b;
                    Object obj2 = a;
                    if (bundle != null)
                    {
                        if (bundle.containsKey("e2e"))
                        {
                            webviewauthhandler.e2e = bundle.getString("e2e");
                        }
                        bundle = AccessToken.a(((AuthorizationRequest) (obj2)).permissions, bundle, AccessTokenSource.e);
                        facebookexception = Result.a(webviewauthhandler._fld0.pendingRequest, bundle);
                        CookieSyncManager.createInstance(webviewauthhandler._fld0.a).sync();
                        bundle = ((AccessToken) (bundle)).token;
                        obj2 = webviewauthhandler._fld0.b().a().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit();
                        ((android.content.SharedPreferences.Editor) (obj2)).putString("TOKEN", bundle);
                        bundle = facebookexception;
                        if (!((android.content.SharedPreferences.Editor) (obj2)).commit())
                        {
                            arp.b("Facebook-AuthorizationClient", "Could not update saved web view auth handler token.");
                            bundle = facebookexception;
                        }
                    } else
                    if (facebookexception instanceof FacebookOperationCanceledException)
                    {
                        bundle = Result.a(webviewauthhandler._fld0.pendingRequest, "User canceled log in.");
                    } else
                    {
                        webviewauthhandler.e2e = null;
                        bundle = facebookexception.getMessage();
                        if (facebookexception instanceof FacebookServiceException)
                        {
                            facebookexception = ((FacebookServiceException)facebookexception).error;
                            bundle = String.format("%d", new Object[] {
                                Integer.valueOf(((FacebookRequestError) (facebookexception)).b)
                            });
                            facebookexception = facebookexception.toString();
                        } else
                        {
                            facebookexception = bundle;
                            bundle = null;
                        }
                        bundle = Result.a(webviewauthhandler._fld0.pendingRequest, null, facebookexception, bundle);
                    }
                    if (!arp.a(webviewauthhandler.e2e))
                    {
                        AuthorizationClient.a(webviewauthhandler._fld0, webviewauthhandler.applicationId, webviewauthhandler.e2e);
                    }
                    webviewauthhandler._fld0.a(bundle);
                }

                
                {
                    b = WebViewAuthHandler.this;
                    a = authorizationrequest;
                    super();
                }
            };
            e2e = AuthorizationClient.c();
            a("e2e", e2e);
            obj = new aoc(AuthorizationClient.this.b().a(), applicationId, ((Bundle) (obj)));
            obj.a = e2e;
            obj.b = authorizationrequest.isRerequest;
            obj.f = ((asl) (obj1));
            a = ((asi)obj).a();
            a.show();
            return true;
        }

        final boolean b()
        {
            return true;
        }

        final boolean c()
        {
            return true;
        }

        final void d()
        {
            if (a != null)
            {
                a.b = null;
                a.dismiss();
                a = null;
            }
        }

        WebViewAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }

}

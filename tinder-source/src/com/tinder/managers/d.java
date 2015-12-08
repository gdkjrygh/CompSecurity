// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.crashlytics.android.Crashlytics;
import com.facebook.AccessToken;
import com.tinder.activities.ActivityLogin;
import com.tinder.d.a;
import com.tinder.d.b;
import com.tinder.e.ar;
import com.tinder.e.aw;
import com.tinder.e.e;
import com.tinder.e.k;
import com.tinder.e.m;
import com.tinder.e.n;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventLoggedIn;
import com.tinder.f.ak;
import com.tinder.model.ClientConfig;
import com.tinder.model.GlobalConfig;
import com.tinder.model.InstagramAuthError;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.ProductGroup;
import com.tinder.model.RateCardConfig;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.parse.UserParse;
import com.tinder.parse.f;
import com.tinder.parse.g;
import com.tinder.parse.i;
import com.tinder.utils.DateUtils;
import com.tinder.utils.Tinteg;
import com.tinder.utils.t;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ae, ManagerApp, ab, z, 
//            a, f, y, i

public final class d
    implements b
{

    public static final Object a = new Object();
    public static String b;
    private static boolean d;
    private static UserMeta e;
    public com.tinder.a.f c;
    private boolean f;
    private ae g;
    private UserParse h;
    private z i;
    private c j;
    private a k;

    public d(ae ae1, UserParse userparse, z z1, c c1, com.tinder.a.f f1, a a1)
    {
        g = ae1;
        h = userparse;
        i = z1;
        j = c1;
        c = f1;
        k = a1;
        b = com.tinder.managers.ae.a.getString("TOKEN_TINDER", null);
        f = com.tinder.managers.ae.a.getBoolean("IS_LOGGED_IN", false);
        if (AccessToken.a() != null)
        {
            Tinteg.alt = AccessToken.a().d;
            Tinteg.ali = AccessToken.a().h;
        }
    }

    static com.tinder.a.f a(d d1)
    {
        return d1.c;
    }

    static void a(d d1, int l)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(Integer.valueOf(0), Integer.valueOf(10000));
        if (l <= 0)
        {
            (new Handler()).postDelayed(d1. new Runnable(l) {

                final int a;
                final d b;

                public final void run()
                {
                    d.d(b).a(new aw(this) {

                        final _cls9 a;

                        public final void onProfileLoaded(User user)
                        {
                            if (user.getInstagramDataSet() == null) goto _L2; else goto _L1
_L1:
                            String s;
                            if (TextUtils.equals("null", user.getInstagramDataSet().lastFetchTime))
                            {
                                s = "";
                            } else
                            {
                                s = user.getInstagramDataSet().lastFetchTime;
                            }
                            if (!TextUtils.isEmpty(s)) goto _L3; else goto _L2
_L2:
                            com.tinder.managers.d.a(a.b, a.a + 1);
_L5:
                            return;
_L3:
                            String s1;
                            if (TextUtils.equals("null", user.getInstagramDataSet().lastFetchTime))
                            {
                                s1 = "";
                            } else
                            {
                                s1 = user.getInstagramDataSet().lastFetchTime;
                            }
                            String.format("retryInstagramPhotos lastfetchTime[%s]", new Object[] {
                                s1
                            });
                            if (d.h() != null)
                            {
                                d.h().instagramDataSet = user.getInstagramDataSet();
                                return;
                            }
                            if (true) goto _L5; else goto _L4
_L4:
                        }

            
            {
                a = _pcls9;
                super();
            }
                    });
                }

            
            {
                b = d.this;
                a = l;
                super();
            }
            }, ((Integer)hashmap.get(Integer.valueOf(l))).intValue());
        }
    }

    static void a(d d1, int l, n n1)
    {
        d1.a(l, n1);
    }

    static void a(d d1, e e1, int l)
    {
        d1.a(e1, l);
    }

    static void a(d d1, JSONObject jsonobject)
    {
        Object obj;
        List list;
        UserMeta usermeta;
        Object obj1;
        JSONArray jsonarray;
        int l;
        list = null;
        UserParse.a(jsonobject.optJSONArray("purchases"));
        usermeta = new UserMeta();
        obj1 = jsonobject.optJSONObject("globals");
        if (obj1 == null)
        {
            obj = null;
        } else
        {
            obj = new GlobalConfig();
            obj.updatesInterval = ((JSONObject) (obj1)).optInt("updates_interval");
            obj.recsInterval = ((JSONObject) (obj1)).optInt("recs_interval");
            obj.sparksEnabled = ((JSONObject) (obj1)).optBoolean("tinder_sparks", true);
            obj.plusEnabled = ((JSONObject) (obj1)).optBoolean("plus", true);
            obj.appboyEnabled = ((JSONObject) (obj1)).optBoolean("appboy", ae.r());
            obj.fetchConnections = ((JSONObject) (obj1)).optBoolean("fetch_connections");
            obj.rateApp = ((JSONObject) (obj1)).optBoolean("rate_app", true);
            obj.adSwipeLimit = ((JSONObject) (obj1)).optInt("ad_swipe_interval", 0);
            obj.superLikeEnabled = ((JSONObject) (obj1)).optBoolean("super_like");
            obj.blendEnabled = ((JSONObject) (obj1)).optBoolean("recs_blend");
            obj.moments = ((JSONObject) (obj1)).optBoolean("moments");
            (new StringBuilder("setGlobals plus ? ")).append(((GlobalConfig) (obj)).plusEnabled);
            (new StringBuilder("setGlobals isSuperlikeEnabled:")).append(((GlobalConfig) (obj)).superLikeEnabled);
            com.tinder.managers.a.a(((GlobalConfig) (obj)).plusEnabled);
            boolean flag = ((GlobalConfig) (obj)).plusEnabled;
            com.tinder.managers.ae.b.putBoolean("KEY_TINDER_PLUS_ENABLED", flag);
            com.tinder.managers.ae.b.commit();
            flag = ((GlobalConfig) (obj)).fetchConnections;
            com.tinder.managers.ae.b.putBoolean("FETCH_CONNECTIONS", flag);
            com.tinder.managers.ae.b.commit();
            flag = ((GlobalConfig) (obj)).appboyEnabled;
            com.tinder.managers.ae.b.putBoolean("KEY_APPBOY_ENABLED", flag);
            com.tinder.managers.ae.b.commit();
            flag = ((GlobalConfig) (obj)).superLikeEnabled;
            com.tinder.managers.ae.b.putBoolean("KEY_SUPERLIKE_ENABLED", flag);
            com.tinder.managers.ae.b.commit();
            flag = ((GlobalConfig) (obj)).moments;
            com.tinder.managers.ae.b.putBoolean("moments enabled", flag).commit();
            flag = ((GlobalConfig) (obj)).blendEnabled;
            com.tinder.managers.ae.b.putBoolean("KEY_BLEND_ENABLED", flag).commit();
        }
        usermeta.globalConfig = ((GlobalConfig) (obj));
        obj = jsonobject.optJSONArray("tutorials");
        if (obj != null)
        {
            obj = com.tinder.parse.i.a(((JSONArray) (obj)));
            if (((List) (obj)).contains("super_like_action"))
            {
                com.tinder.managers.ae.a(false);
            }
            ((List) (obj)).contains("profile_verified");
            usermeta.tutorials = ((List) (obj));
        }
        obj = jsonobject.optJSONObject("rating");
        if (obj != null)
        {
            usermeta.likesPercentRemaining = ((JSONObject) (obj)).optInt("likes_remaining", 100);
            usermeta.millisRateLimitedUntil = ((JSONObject) (obj)).optLong("rate_limited_until");
            (new StringBuilder("meta rating ")).append(obj);
            (new StringBuilder("meta set likes ")).append(usermeta.likesPercentRemaining);
            obj = com.tinder.parse.g.a(((JSONObject) (obj)));
            usermeta.superlikeStatus = ((SuperlikeStatus) (obj));
            ManagerApp.h().p().i = ((SuperlikeStatus) (obj));
            ((SuperlikeStatus) (obj)).toString();
        }
        usermeta.reportNotifications = UserParse.c(jsonobject);
        obj = jsonobject.optJSONObject("user");
        if (obj != null)
        {
            try
            {
                d1.i.a(true, ((JSONObject) (obj)));
                usermeta.instagramDataSet = com.tinder.parse.d.a(((JSONObject) (obj)));
                d1.h.a(d1.k, ((JSONObject) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.b(((Exception) (obj)).toString());
            }
        }
        obj = jsonobject.optJSONObject("travel");
        if (obj != null && d1.i.b() != null)
        {
            d1.h.a(d1.i.b(), ((JSONObject) (obj)));
        }
        obj1 = com.tinder.parse.f.a(jsonobject.optJSONArray("groups"));
        usermeta.groups = ((List) (obj1));
        if (!((List) (obj1)).isEmpty())
        {
            obj = new ArrayList(((List) (obj1)).size());
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((ProductGroup)((Iterator) (obj1)).next()).key)) { }
            obj1 = new SparksEvent("TinderPlus.SkuOffered");
            ((SparksEvent) (obj1)).put("skus", obj);
            ((SparksEvent) (obj1)).put("locale", t.b());
            com.tinder.managers.a.a(((SparksEvent) (obj1)));
        }
        jsonobject = jsonobject.optJSONObject("client_resources");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_933;
        }
        jsonobject = jsonobject.optJSONObject("rate_card");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_933;
        }
        obj1 = new ClientConfig();
        jsonarray = jsonobject.optJSONArray("carousel");
        jsonobject = list;
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_920;
        }
        obj = new RateCardConfig();
        list = ((RateCardConfig) (obj)).carousel;
        l = 0;
_L2:
        if (l >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_913;
        }
        jsonobject = jsonarray.optJSONObject(l);
        if (jsonobject == null)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonobject.getString("slug");
_L3:
        list.add(jsonobject);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        if (jsonarray.optString(l) == null)
        {
            break MISSING_BLOCK_LABEL_908;
        }
        jsonobject = jsonarray.getString(l);
          goto _L3
        jsonobject;
        v.a("Failed to parse carousel order from meta response", jsonobject);
        jsonobject = null;
          goto _L3
        obj.carousel = list;
        jsonobject = ((JSONObject) (obj));
        ((ClientConfig) (obj1)).setRateCard(jsonobject);
        usermeta.clientConfig = ((ClientConfig) (obj1));
        e = usermeta;
        d1.j.d(new EventGlobalsLoaded(usermeta.globalConfig, usermeta));
        return;
    }

    public static void a(String s)
    {
        b = s;
        com.tinder.managers.ae.b.putString("TOKEN_TINDER", s);
        com.tinder.managers.ae.b.commit();
        if (s == null)
        {
            Tinteg.alt = null;
            Tinteg.ali = null;
            return;
        } else
        {
            Tinteg.alt = AccessToken.a().d;
            Tinteg.ali = AccessToken.a().h;
            return;
        }
    }

    public static boolean a()
    {
        return d;
    }

    static a b(d d1)
    {
        return d1.k;
    }

    public static String b()
    {
        return b;
    }

    static String b(String s)
    {
        b = s;
        return s;
    }

    static boolean b(boolean flag)
    {
        d = flag;
        return flag;
    }

    static ae c(d d1)
    {
        return d1.g;
    }

    public static UserMeta c()
    {
        return e;
    }

    static z d(d d1)
    {
        return d1.i;
    }

    static UserParse e(d d1)
    {
        return d1.h;
    }

    static c f(d d1)
    {
        return d1.j;
    }

    static String g()
    {
        return b;
    }

    static UserMeta h()
    {
        return e;
    }

    public final void a(int l, k k1)
    {
        k.g();
        SparksEvent sparksevent = new SparksEvent("Account.InstagramDisconnect");
        sparksevent.put("instagramName", com.tinder.managers.ae.v());
        sparksevent.put("from", Integer.valueOf(l));
        com.tinder.managers.a.a(sparksevent);
        k1 = new com.tinder.a.d(1, c.K, new JSONObject(), new com.android.volley.i.b(k1) {

            final k a;
            final d b;

            public final void a(Object obj)
            {
                obj = new SparksEvent("Account.InstagramLogoutSuccess");
                com.tinder.managers.d.c(b);
                ((SparksEvent) (obj)).put("instagramName", com.tinder.managers.ae.v());
                com.tinder.managers.a.a(((SparksEvent) (obj)));
                a.a();
                com.tinder.managers.d.c(b);
                com.tinder.managers.ae.a("");
                d.h().instagramDataSet = new InstagramDataSet();
                com.tinder.managers.d.c(b);
                ae.w();
            }

            
            {
                b = d.this;
                a = k1;
                super();
            }
        }, new com.android.volley.i.a(k1) {

            final k a;
            final d b;

            public final void a(VolleyError volleyerror)
            {
                SparksEvent sparksevent1 = new SparksEvent("Account.InstagramLogoutFail");
                com.tinder.managers.d.c(b);
                sparksevent1.put("instagramName", com.tinder.managers.ae.v());
                com.tinder.managers.a.a(sparksevent1);
                v.b((new StringBuilder("LogoutInstagram onErrorResponse: ")).append(volleyerror).toString());
                a.b();
            }

            
            {
                b = d.this;
                a = k1;
                super();
            }
        }, b);
        com.tinder.managers.ManagerApp.b().a(k1);
    }

    public final void a(int l, n n1)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder("retrying login with ")).append(l).append("left.");
        if (l != 0) goto _L2; else goto _L1
_L1:
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        n1.b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m m1;
        m1 = new m(n1, l) {

            final n a;
            final int b;
            final d c;

            public final void onTinderLoginFailure()
            {
                com.tinder.managers.d.a(c, b - 1, a);
            }

            public final void onTinderLoginFailureAccessDenied()
            {
            }

            public final void onTinderLoginSuccess()
            {
                if (a != null)
                {
                    a.a();
                }
            }

            public final void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
            {
                (new StringBuilder("isBanned=")).append(flag).append(", isAgeVerificationNeeded=").append(flag1).append(", isGenderVerificationNeeded=").append(flag2);
            }

            
            {
                c = d.this;
                a = n1;
                b = l;
                super();
            }
        };
        if (AccessToken.a() != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        n1 = null;
_L5:
        a(m1, ((String) (n1)), false);
        if (true) goto _L4; else goto _L3
_L3:
        n1;
        throw n1;
        n1 = AccessToken.a().d;
          goto _L5
    }

    public final void a(e e1, int l)
    {
        e1 = new com.tinder.a.d(3, c.j, null, new com.android.volley.i.b(e1) {

            final e a;
            final d b;

            public final void a(Object obj)
            {
                obj = DateUtils.b().format(Long.valueOf(System.currentTimeMillis()));
                com.tinder.managers.d.b(b).c(((String) (obj)));
                com.tinder.managers.d.b(true);
                com.facebook.login.d.a();
                com.facebook.login.d.b();
                b.a(false);
                ManagerApp.d().j();
                if (a != null)
                {
                    a.c();
                }
                com.tinder.managers.d.b(false);
            }

            
            {
                b = d.this;
                a = e1;
                super();
            }
        }, new com.android.volley.i.a(l, e1) {

            final int a;
            final e b;
            final d c;

            public final void a(VolleyError volleyerror)
            {
                if (volleyerror != null)
                {
                    Crashlytics.a(volleyerror.toString());
                    v.b(volleyerror.toString());
                }
                if (a > 0 && volleyerror != null)
                {
                    c.a(volleyerror.getMessage(), new n(this) {

                        final _cls15 a;

                        public final void a()
                        {
                            com.tinder.managers.d.a(a.c, a.b, a.a - 1);
                        }

                        public final void b()
                        {
                            com.tinder.managers.d.a(a.c, a.b, a.a - 1);
                        }

                        public final void c()
                        {
                            com.tinder.managers.d.a(a.c, a.b, a.a - 1);
                        }

            
            {
                a = _pcls15;
                super();
            }
                    });
                    return;
                } else
                {
                    b.d();
                    return;
                }
            }

            
            {
                c = d.this;
                a = l;
                b = e1;
                super();
            }
        }, b);
        com.tinder.managers.ManagerApp.b().a(e1);
    }

    public final void a(m m1, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        JSONObject jsonobject;
        if (AccessToken.a() == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        jsonobject = new JSONObject();
        Tinteg.alt = AccessToken.a().d;
        Tinteg.ali = AccessToken.a().h;
        jsonobject.put("facebook_token", s);
        jsonobject.put("facebook_id", AccessToken.a().h);
        jsonobject.put("locale", t.a());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        jsonobject.put("force_refresh", true);
_L1:
        m1 = new com.tinder.a.d(1, c.g, jsonobject, new com.android.volley.i.b(m1) {

            final m a;
            final d b;

            public final void a(Object obj)
            {
                boolean flag1;
                flag1 = true;
                obj = (JSONObject)obj;
                (new StringBuilder("response=")).append(obj);
                Object obj1;
                Object obj3;
                Object obj4;
                if (((JSONObject) (obj)).isNull("user"))
                {
                    break MISSING_BLOCK_LABEL_365;
                }
                obj1 = ((JSONObject) (obj)).getJSONObject("user");
                com.tinder.managers.d.c(b);
                obj3 = com.tinder.managers.ae.f();
                obj4 = ((JSONObject) (obj1)).optString("create_date", "");
                if (obj3 == null)
                {
                    break MISSING_BLOCK_LABEL_137;
                }
                if (!((String) (obj3)).isEmpty() && !((String) (obj3)).equals(obj4))
                {
                    b.d();
                    obj = new Intent(com.tinder.managers.ManagerApp.c(), com/tinder/activities/ActivityLogin);
                    ((Intent) (obj)).setFlags(0x10008000);
                    obj1 = new Bundle();
                    ((Bundle) (obj1)).putString("extra_show_intro", "");
                    ((Intent) (obj)).putExtras(((Bundle) (obj1)));
                    com.tinder.managers.ManagerApp.c().startActivity(((Intent) (obj)));
                    return;
                }
                com.tinder.managers.d.c(b);
                com.tinder.managers.ae.b.putString("ACCOUNT CREATED DATE", ((String) (obj4)));
                com.tinder.managers.ae.b.commit();
                obj3 = new com.tinder.b.n();
                obj4 = d.d(b);
                boolean flag2;
                boolean flag3;
                if (((com.tinder.b.n) (obj3)).c())
                {
                    flag1 = false;
                }
                obj3 = ((z) (obj4)).a(flag1, ((JSONObject) (obj1)));
                if (d.d(b).b() != null)
                {
                    com.tinder.managers.d.e(b).a(d.d(b).b(), ((JSONObject) (obj1)));
                }
                flag1 = ((z.a) (obj3)).e;
                flag2 = ((z.a) (obj3)).f;
                flag3 = ((z.a) (obj3)).g;
                if (((JSONObject) (obj)).getString("token") == null)
                {
                    break MISSING_BLOCK_LABEL_380;
                }
                com.tinder.managers.d.b(((JSONObject) (obj)).getString("token"));
                (new StringBuilder("Tinder token found! = ")).append(com.tinder.managers.d.g());
                com.tinder.managers.d.a(com.tinder.managers.d.g());
                if (flag1 || flag2 || flag3)
                {
                    try
                    {
                        b.a(false);
                        a.onVerificationNeeded(flag1, flag2, flag3);
                        d.d(b).a();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        v.a("Failed to parse and setup user object for login", ((Throwable) (obj)));
                    }
                    a.onTinderLoginFailure();
                    return;
                }
                break MISSING_BLOCK_LABEL_395;
                v.b("user not found in response");
                a.onTinderLoginFailure();
                return;
                v.b("Tinder token not found in response");
                a.onTinderLoginFailure();
                return;
                b.a(true);
                Object obj2 = ManagerApp.h().f();
                obj = String.format(((y) (obj2)).d.B, new Object[] {
                    t.a()
                });
                obj2 = new y._cls1(((y) (obj2)));
                ManagerApp.h().g();
                obj = new com.tinder.a.d(0, ((String) (obj)), null, ((com.android.volley.i.b) (obj2)), null, com.tinder.managers.d.b());
                obj.j = new com.android.volley.c(5000, 0, 1.0F);
                com.tinder.managers.ManagerApp.b().a(((Request) (obj)));
                ManagerApp.h().h().a(true);
                com.tinder.managers.d.f(b).c(new EventLoggedIn());
                a.onTinderLoginSuccess();
                d.d(b).a();
                return;
            }

            
            {
                b = d.this;
                a = m1;
                super();
            }
        }, new com.android.volley.i.a(m1) {

            final m a;
            final d b;

            public final void a(VolleyError volleyerror)
            {
                String s1 = com.tinder.managers.d.a(b).g;
                if (volleyerror.a == null)
                {
                    break MISSING_BLOCK_LABEL_97;
                }
                volleyerror = (new JSONObject(new String(volleyerror.a.b, "utf-8"))).getString("error");
                if (volleyerror == null)
                {
                    break MISSING_BLOCK_LABEL_70;
                }
                if (volleyerror.equalsIgnoreCase("Access Denied"))
                {
                    a.onTinderLoginFailureAccessDenied();
                    return;
                }
                try
                {
                    a.onTinderLoginFailure();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (VolleyError volleyerror)
                {
                    v.a("Failed to login to Tinder", volleyerror);
                }
                a.onTinderLoginFailure();
                return;
                a.onTinderLoginFailure();
                return;
            }

            
            {
                b = d.this;
                a = m1;
                super();
            }
        }, b);
        m1.a("Facebook-ID", AccessToken.a().h);
        m1.j = new com.android.volley.c(60000, 0, 1.0F);
        flag = (new com.tinder.b.n()).c();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        s = Tinteg.tintegS(com/tinder/managers/ManagerApp, m1);
        m1.a("app-session", s);
        if (s.length() <= 2)
        {
            Crashlytics.a(new IllegalStateException(s));
        }
_L2:
        com.tinder.managers.ManagerApp.b().a(m1);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        v.a("Failed to build json for facebook token", s);
          goto _L1
        m1;
        throw m1;
        s;
        v.b(s.toString());
          goto _L2
        v.b("Facebook token null, not logging in");
        m1.onTinderLoginFailure();
          goto _L3
    }

    public final void a(String s, ar ar)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("phone_number", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.a("Failed to create phone number json", s);
        }
        s = new com.tinder.a.d(1, c.s, jsonobject, new com.android.volley.i.b(ar) {

            final ar a;
            final d b;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("response=")).append(obj);
                try
                {
                    a.a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.b(((Exception) (obj)).toString());
                }
                a.b();
            }

            
            {
                b = d.this;
                a = ar1;
                super();
            }
        }, new com.android.volley.i.a(ar) {

            final ar a;
            final d b;

            public final void a(VolleyError volleyerror)
            {
                volleyerror = com.tinder.managers.d.a(b).s;
                a.b();
            }

            
            {
                b = d.this;
                a = ar1;
                super();
            }
        }, b);
        com.tinder.managers.ManagerApp.b().a(s);
    }

    public final void a(String s, com.tinder.e.i l)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("code", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.b(s.getMessage());
        }
        s = new com.tinder.a.d(1, c.J, jsonobject, new com.android.volley.i.b(l, jsonobject) {

            final com.tinder.e.i a;
            final JSONObject b;
            final d c;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("response=")).append(obj);
                InstagramDataSet instagramdataset = com.tinder.parse.d.a(((JSONObject) (obj)));
                String s1 = instagramdataset.username;
                if (!TextUtils.isEmpty(s1))
                {
                    com.tinder.managers.d.b(c).f();
                    obj = new SparksEvent("Account.InstagramLoginSuccess");
                    ((SparksEvent) (obj)).put("instagramName", s1);
                    com.tinder.managers.a.a(((SparksEvent) (obj)));
                    if (TextUtils.equals("null", instagramdataset.lastFetchTime))
                    {
                        obj = "";
                    } else
                    {
                        obj = instagramdataset.lastFetchTime;
                    }
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        com.tinder.managers.d.a(c, 0);
                    }
                    com.tinder.managers.d.c(c);
                    com.tinder.managers.ae.a(s1);
                    com.tinder.managers.d.c(c);
                    ae.w();
                    if (d.h() != null)
                    {
                        d.h().instagramDataSet = instagramdataset;
                    }
                    a.a(instagramdataset);
                    return;
                } else
                {
                    v.b("authInstagram failure: no username");
                    obj = b;
                    obj = new InstagramAuthError(((JSONObject) (obj)).optInt("status"), ((JSONObject) (obj)).optString("error"));
                    a.a(((InstagramAuthError) (obj)));
                    return;
                }
            }

            
            {
                c = d.this;
                a = l;
                b = jsonobject;
                super();
            }
        }, new com.android.volley.i.a(l) {

            final com.tinder.e.i a;
            final d b;

            public final void a(VolleyError volleyerror)
            {
                (new StringBuilder("failure: ")).append(volleyerror.getMessage());
                int i1 = -1;
                if (volleyerror.a != null)
                {
                    i1 = volleyerror.a.a;
                }
                volleyerror = new InstagramAuthError(i1, volleyerror.getMessage());
                a.a(volleyerror);
            }

            
            {
                b = d.this;
                a = l;
                super();
            }
        }, b);
        com.tinder.managers.ManagerApp.b().a(s);
    }

    public final void a(String s, n n1)
    {
        if (s != null)
        {
            if (s.contains("No authentication challenges found") || s.contains("Received authentication challenge is null") || s.contains("java.io.EOFException") || s.contains("401"))
            {
                a(1, n1);
                return;
            }
            s.contains("java.io.EOFException");
        }
        n1.c();
    }

    public final void a(boolean flag)
    {
        f = flag;
        flag = f;
        com.tinder.managers.ae.b.putBoolean("IS_LOGGED_IN", flag);
        com.tinder.managers.ae.b.commit();
    }

    public final void d()
    {
        synchronized (a)
        {
            (new AsyncTask() {

                final d a;

                private static transient Void a()
                {
                    ManagerApp.d().j();
                    com.facebook.login.d.a();
                    com.facebook.login.d.b();
                    return null;
                }

                protected final Object doInBackground(Object aobj[])
                {
                    return a();
                }

                protected final void onPostExecute(Object obj1)
                {
                    a.a(false);
                    com.tinder.managers.d.b(false);
                }

                protected final void onPreExecute()
                {
                    com.tinder.managers.d.b(true);
                }

            
            {
                a = d.this;
                super();
            }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        com.tinder.a.d d1 = new com.tinder.a.d(0, c.F, null, new com.android.volley.i.b() {

            final com.android.volley.i.b a = null;
            final d b;

            public final volatile void a(Object obj)
            {
                obj = (JSONObject)obj;
                if (a != null)
                {
                    a.a(obj);
                }
                com.tinder.managers.d.a(b, ((JSONObject) (obj)));
            }

            
            {
                b = d.this;
                super();
            }
        }, new com.android.volley.i.a() {

            final com.android.volley.i.a a = null;
            final d b;

            public final void a(VolleyError volleyerror)
            {
                if (a != null)
                {
                    a.a(volleyerror);
                }
                v.b(v.a(volleyerror));
                if (volleyerror != null && volleyerror.a != null && volleyerror.a.a == 401)
                {
                    b.a(volleyerror.getMessage(), new n(this) {

                        final _cls17 a;

                        public final void a()
                        {
                            a.b.e();
                        }

                        public final void b()
                        {
                        }

                        public final void c()
                        {
                        }

            
            {
                a = _pcls17;
                super();
            }
                    });
                }
            }

            
            {
                b = d.this;
                super();
            }
        }, b);
        d1.j = new com.android.volley.c();
        com.tinder.managers.ManagerApp.b().a(d1);
    }

    public final boolean f()
    {
label0:
        {
            (new StringBuilder("tinder token = ")).append(b);
            StringBuilder stringbuilder = new StringBuilder("facebook token = ");
            ManagerApp.h().e();
            stringbuilder.append(com.tinder.managers.f.a());
            (new StringBuilder("profile = ")).append(i.b());
            if (b != null)
            {
                ManagerApp.h().e();
                if (com.tinder.managers.f.a() != null && i.b() != null)
                {
                    break label0;
                }
            }
            f = false;
        }
        return f;
    }


    // Unreferenced inner class com/tinder/managers/d$11

/* anonymous class */
    public final class _cls11
        implements com.android.volley.i.b
    {

        final ar a;
        final d b;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("response=")).append(obj);
            try
            {
                a.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.b(((Exception) (obj)).toString());
            }
            a.b();
        }

            public 
            {
                b = d.this;
                a = ar1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/d$12

/* anonymous class */
    public final class _cls12
        implements com.android.volley.i.a
    {

        final ar a;
        final d b;

        public final void a(VolleyError volleyerror)
        {
            v.b((new StringBuilder()).append(volleyerror.getMessage()).append(", ").append(volleyerror).toString());
            a.b();
        }

            public 
            {
                b = d.this;
                a = ar1;
                super();
            }
    }

}

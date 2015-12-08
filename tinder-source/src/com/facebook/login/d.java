// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.f;
import com.facebook.g;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.n;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginBehavior, DefaultAudience, c, f, 
//            LoginClient, b, e

public class d
{
    private static final class a
        implements com.facebook.login.f
    {

        private final Activity a;

        public final Activity a()
        {
            return a;
        }

        public final void a(Intent intent, int i)
        {
            a.startActivityForResult(intent, i);
        }

        a(Activity activity)
        {
            n.a(activity, "activity");
            a = activity;
        }
    }

    private static final class b
        implements com.facebook.login.f
    {

        private final Fragment a;

        public final Activity a()
        {
            return a.getActivity();
        }

        public final void a(Intent intent, int i)
        {
            a.startActivityForResult(intent, i);
        }

        b(Fragment fragment)
        {
            n.a(fragment, "fragment");
            a = fragment;
        }
    }


    private static final Set c = Collections.unmodifiableSet(new LoginManager._cls2());
    private static volatile d d;
    public LoginBehavior a;
    public DefaultAudience b;
    private LoginClient.Request e;
    private HashMap f;
    private c g;

    d()
    {
        a = LoginBehavior.a;
        b = DefaultAudience.c;
        n.b();
    }

    public static d a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/facebook/login/d;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new d();
        }
        com/facebook/login/d;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        com/facebook/login/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(LoginClient.Result.Code code, Map map, Exception exception)
    {
        c c1;
        Object obj;
        if (g == null)
        {
            return;
        }
        if (e == null)
        {
            g.a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", "");
            return;
        }
        c1 = g;
        obj = e.e;
        HashMap hashmap = f;
        obj = com.facebook.login.c.a(((String) (obj)));
        if (code != null)
        {
            ((Bundle) (obj)).putString("2_result", code.d);
        }
        if (exception != null && exception.getMessage() != null)
        {
            ((Bundle) (obj)).putString("5_error_message", exception.getMessage());
        }
        code = null;
        if (!hashmap.isEmpty())
        {
            code = new JSONObject(hashmap);
        }
        exception = code;
        if (map == null) goto _L2; else goto _L1
_L1:
        if (code == null)
        {
            code = new JSONObject();
        }
        for (map = map.entrySet().iterator(); map.hasNext(); code.put((String)exception.getKey(), exception.getValue()))
        {
            exception = (java.util.Map.Entry)map.next();
        }

          goto _L3
        map;
        exception = code;
_L2:
        if (exception != null)
        {
            ((Bundle) (obj)).putString("6_extras", exception.toString());
        }
        c1.a.b("fb_mobile_login_complete", ((Bundle) (obj)));
        return;
_L3:
        exception = code;
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void a(com.facebook.login.f f1, LoginClient.Request request)
        throws FacebookException
    {
        Object obj1;
        e = request;
        f = new HashMap();
        obj1 = f1.a();
        if (obj1 != null && e != null) goto _L2; else goto _L1
_L1:
        c c1 = null;
_L5:
        g = c1;
        if (g != null && e != null)
        {
            c1 = g;
            obj1 = e;
            Object obj = com.facebook.login.c.a(((LoginClient.Request) (obj1)).e);
            boolean flag;
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("login_behavior", ((LoginClient.Request) (obj1)).a.toString());
                jsonobject.put("request_code", LoginClient.a());
                jsonobject.put("permissions", TextUtils.join(",", ((LoginClient.Request) (obj1)).b));
                jsonobject.put("default_audience", ((LoginClient.Request) (obj1)).c.toString());
                jsonobject.put("isReauthorize", ((LoginClient.Request) (obj1)).f);
                if (c1.c != null)
                {
                    jsonobject.put("facebookVersion", c1.c);
                }
                ((Bundle) (obj)).putString("6_extras", jsonobject.toString());
            }
            catch (JSONException jsonexception) { }
            c1.a.b("fb_mobile_login_start", ((Bundle) (obj)));
        }
        CallbackManagerImpl.a(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.a.a(), new com.facebook.internal.CallbackManagerImpl.a() {

            final d a;

            public final boolean a(int i, Intent intent)
            {
                return a.a(i, intent, null);
            }

            
            {
                a = d.this;
                super();
            }
        });
        flag = b(f1, request);
        request = f;
        if (flag)
        {
            f1 = "1";
        } else
        {
            f1 = "0";
        }
        request.put("try_login_activity", f1);
        if (!flag)
        {
            f1 = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(LoginClient.Result.Code.c, ((Map) (null)), ((Exception) (f1)));
            e = null;
            throw f1;
        } else
        {
            return;
        }
_L2:
        obj = g;
        if (obj == null) goto _L4; else goto _L3
_L3:
        c1 = ((c) (obj));
        if (((c) (obj)).b.equals(e.d)) goto _L5; else goto _L4
_L4:
        c1 = new c(((Context) (obj1)), e.d);
          goto _L5
    }

    private static void a(Collection collection)
    {
        if (collection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)collection.next();
        } while (!a(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
            s
        }));
    }

    static boolean a(String s)
    {
        return s != null && (s.startsWith("publish") || s.startsWith("manage") || c.contains(s));
    }

    public static void b()
    {
        AccessToken.a(null);
        Profile.a(null);
    }

    private static void b(Collection collection)
    {
        if (collection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)collection.next();
        } while (a(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] {
            s
        }));
    }

    private static boolean b(com.facebook.login.f f1, LoginClient.Request request)
    {
        Intent intent = new Intent();
        intent.setClass(com.facebook.g.g(), com/facebook/FacebookActivity);
        intent.setAction(request.a.toString());
        intent.putExtras(com.facebook.login.b.a(request));
        boolean flag;
        if (com.facebook.g.g().getPackageManager().resolveActivity(intent, 0) == null)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return false;
        }
        try
        {
            f1.a(intent, LoginClient.a());
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.login.f f1)
        {
            return false;
        }
        return true;
    }

    private LoginClient.Request c(Collection collection)
    {
        LoginBehavior loginbehavior = a;
        boolean flag;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        collection = new LoginClient.Request(loginbehavior, Collections.unmodifiableSet(collection), b, com.facebook.g.j(), UUID.randomUUID().toString());
        if (AccessToken.a() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        collection.f = flag;
        return collection;
    }

    public final void a(Activity activity, Collection collection)
    {
        a(collection);
        collection = c(collection);
        a(((com.facebook.login.f) (new a(activity))), ((LoginClient.Request) (collection)));
    }

    public final void a(Fragment fragment, Collection collection)
    {
        a(collection);
        collection = c(collection);
        a(((com.facebook.login.f) (new b(fragment))), ((LoginClient.Request) (collection)));
    }

    public final void a(com.facebook.d d1, f f1)
    {
        if (!(d1 instanceof CallbackManagerImpl))
        {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            d1 = (CallbackManagerImpl)d1;
            int i = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.a.a();
            f1 = new com.facebook.internal.CallbackManagerImpl.a(f1) {

                final f a;
                final d b;

                public final boolean a(int j, Intent intent)
                {
                    return b.a(j, intent, a);
                }

            
            {
                b = d.this;
                a = f1;
                super();
            }
            };
            n.a(f1, "callback");
            ((CallbackManagerImpl) (d1)).a.put(Integer.valueOf(i), f1);
            return;
        }
    }

    final boolean a(int i, Intent intent, f f1)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (e == null)
        {
            return false;
        }
        Object obj = LoginClient.Result.Code.c;
        if (intent != null)
        {
            Object obj1 = (LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            Object obj2;
            if (obj1 != null)
            {
                obj2 = ((LoginClient.Result) (obj1)).a;
                Object obj3;
                Object obj5;
                if (i == -1)
                {
                    if (((LoginClient.Result) (obj1)).a == LoginClient.Result.Code.a)
                    {
                        intent = ((LoginClient.Result) (obj1)).b;
                        obj = null;
                        i = ((flag) ? 1 : 0);
                    } else
                    {
                        obj = new FacebookAuthorizationException(((LoginClient.Result) (obj1)).c);
                        intent = null;
                        i = ((flag) ? 1 : 0);
                    }
                } else
                if (i == 0)
                {
                    i = 1;
                    intent = null;
                    obj = null;
                } else
                {
                    intent = null;
                    obj = null;
                    i = ((flag) ? 1 : 0);
                }
                obj3 = ((LoginClient.Result) (obj1)).f;
                obj1 = obj;
                obj = intent;
                intent = ((Intent) (obj2));
                obj2 = obj3;
            } else
            {
                obj2 = null;
                Object obj4 = null;
                obj1 = null;
                i = ((flag1) ? 1 : 0);
                intent = ((Intent) (obj));
                obj = obj4;
            }
            obj3 = obj2;
            obj5 = obj1;
            obj2 = intent;
            obj1 = obj3;
            intent = ((Intent) (obj5));
        } else
        if (i == 0)
        {
            obj2 = LoginClient.Result.Code.b;
            obj1 = null;
            obj = null;
            intent = null;
            i = 1;
        } else
        {
            obj3 = null;
            intent = null;
            i = 0;
            obj1 = null;
            obj2 = obj;
            obj = obj3;
        }
        obj3 = intent;
        if (intent == null)
        {
            obj3 = intent;
            if (obj == null)
            {
                obj3 = intent;
                if (i == 0)
                {
                    obj3 = new FacebookException("Unexpected call to LoginManager.onActivityResult");
                }
            }
        }
        a(((LoginClient.Result.Code) (obj2)), ((Map) (obj1)), ((Exception) (obj3)));
        if (obj != null)
        {
            AccessToken.a(((AccessToken) (obj)));
            Profile.b();
        }
        if (f1 == null) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            obj1 = e;
            obj2 = ((LoginClient.Request) (obj1)).b;
            intent = new HashSet(((AccessToken) (obj)).b);
            if (((LoginClient.Request) (obj1)).f)
            {
                intent.retainAll(((Collection) (obj2)));
            }
            obj1 = new HashSet(((Collection) (obj2)));
            ((Set) (obj1)).removeAll(intent);
            intent = new e(((AccessToken) (obj)), intent, ((Set) (obj1)));
        } else
        {
            intent = null;
        }
        if (i == 0 && (intent == null || ((e) (intent)).b.size() != 0)) goto _L4; else goto _L3
_L3:
        f1.a();
_L2:
        e = null;
        g = null;
        return true;
_L4:
        if (obj3 != null)
        {
            f1.a(((FacebookException) (obj3)));
        } else
        if (obj != null)
        {
            f1.a(intent);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void b(Activity activity, Collection collection)
    {
        b(collection);
        collection = c(collection);
        a(new a(activity), collection);
    }

    public final void b(Fragment fragment, Collection collection)
    {
        b(collection);
        collection = c(collection);
        a(new b(fragment), collection);
    }


    // Unreferenced inner class com/facebook/login/LoginManager$2

/* anonymous class */
    static final class LoginManager._cls2 extends HashSet
    {

            
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
    }

}

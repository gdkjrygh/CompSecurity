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
import com.facebook.Profile;
import com.facebook.a.a;
import com.facebook.internal.Y;
import com.facebook.internal.m;
import com.facebook.k;
import com.facebook.n;
import com.facebook.p;
import com.facebook.s;
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
//            q, g, a, n, 
//            t, LoginClient, r, k, 
//            s

public class o
{
    private static final class a
        implements t
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
            Y.a(activity, "activity");
            a = activity;
        }
    }

    private static final class b
        implements t
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
            Y.a(fragment, "fragment");
            a = fragment;
        }
    }


    private static final Set c = Collections.unmodifiableSet(new q());
    private static volatile o d;
    public g a;
    public com.facebook.login.a b;
    private LoginClient.Request e;
    private HashMap f;
    private com.facebook.login.n g;

    o()
    {
        a = com.facebook.login.g.a;
        b = com.facebook.login.a.c;
        Y.b();
    }

    public static o a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/facebook/login/o;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new o();
        }
        com/facebook/login/o;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        com/facebook/login/o;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(LoginClient.Result.a a1, Map map, Exception exception)
    {
        com.facebook.login.n n1;
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
        n1 = g;
        obj = e.e;
        HashMap hashmap = f;
        obj = com.facebook.login.n.a(((String) (obj)));
        if (a1 != null)
        {
            ((Bundle) (obj)).putString("2_result", a1.d);
        }
        if (exception != null && exception.getMessage() != null)
        {
            ((Bundle) (obj)).putString("5_error_message", exception.getMessage());
        }
        a1 = null;
        if (!hashmap.isEmpty())
        {
            a1 = new JSONObject(hashmap);
        }
        exception = a1;
        if (map == null) goto _L2; else goto _L1
_L1:
        if (a1 == null)
        {
            a1 = new JSONObject();
        }
        for (map = map.entrySet().iterator(); map.hasNext(); a1.put((String)exception.getKey(), exception.getValue()))
        {
            exception = (java.util.Map.Entry)map.next();
        }

          goto _L3
        map;
        exception = a1;
_L2:
        if (exception != null)
        {
            ((Bundle) (obj)).putString("6_extras", exception.toString());
        }
        n1.a.a("fb_mobile_login_complete", ((Bundle) (obj)), true);
        return;
_L3:
        exception = a1;
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void a(t t1, LoginClient.Request request)
        throws p
    {
        Object obj1;
        e = request;
        f = new HashMap();
        obj1 = t1.a();
        if (obj1 != null && e != null) goto _L2; else goto _L1
_L1:
        com.facebook.login.n n1 = null;
_L5:
        g = n1;
        if (g != null && e != null)
        {
            n1 = g;
            obj1 = e;
            Object obj = com.facebook.login.n.a(((LoginClient.Request) (obj1)).e);
            boolean flag;
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("login_behavior", ((LoginClient.Request) (obj1)).a.toString());
                jsonobject.put("request_code", com.facebook.login.LoginClient.a());
                jsonobject.put("permissions", TextUtils.join(",", ((LoginClient.Request) (obj1)).b));
                jsonobject.put("default_audience", ((LoginClient.Request) (obj1)).c.toString());
                jsonobject.put("isReauthorize", ((LoginClient.Request) (obj1)).f);
                ((Bundle) (obj)).putString("6_extras", jsonobject.toString());
            }
            catch (JSONException jsonexception) { }
            n1.a.a("fb_mobile_login_start", ((Bundle) (obj)), true);
        }
        m.a(com.facebook.internal.m.b.a.a(), new r(this));
        flag = b(t1, request);
        request = f;
        if (flag)
        {
            t1 = "1";
        } else
        {
            t1 = "0";
        }
        request.put("try_login_activity", t1);
        if (!flag)
        {
            t1 = new p("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(LoginClient.Result.a.c, ((Map) (null)), ((Exception) (t1)));
            e = null;
            throw t1;
        } else
        {
            return;
        }
_L2:
        obj = g;
        if (obj == null) goto _L4; else goto _L3
_L3:
        n1 = ((com.facebook.login.n) (obj));
        if (((com.facebook.login.n) (obj)).b.equals(e.d)) goto _L5; else goto _L4
_L4:
        n1 = new com.facebook.login.n(((Context) (obj1)), e.d);
          goto _L5
    }

    private static void a(Collection collection)
    {
        if (collection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (String)collection.next();
        } while (!a(s1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new p(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
            s1
        }));
    }

    static boolean a(String s1)
    {
        return s1 != null && (s1.startsWith("publish") || s1.startsWith("manage") || c.contains(s1));
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
        String s1;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (String)collection.next();
        } while (a(s1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new p(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] {
            s1
        }));
    }

    private static boolean b(t t1, LoginClient.Request request)
    {
        Intent intent = new Intent();
        intent.setClass(s.f(), com/facebook/FacebookActivity);
        intent.setAction(request.a.toString());
        intent.putExtras(com.facebook.login.k.a(request));
        boolean flag;
        if (s.f().getPackageManager().resolveActivity(intent, 0) == null)
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
            t1.a(intent, com.facebook.login.LoginClient.a());
        }
        // Misplaced declaration of an exception variable
        catch (t t1)
        {
            return false;
        }
        return true;
    }

    private LoginClient.Request c(Collection collection)
    {
        g g1 = a;
        boolean flag;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        collection = new LoginClient.Request(g1, Collections.unmodifiableSet(collection), b, s.h(), UUID.randomUUID().toString());
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
        a(((t) (new a(activity))), ((LoginClient.Request) (collection)));
    }

    public final void a(Fragment fragment, Collection collection)
    {
        a(collection);
        collection = c(collection);
        a(((t) (new b(fragment))), ((LoginClient.Request) (collection)));
    }

    final boolean a(int i, Intent intent, n n1)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (e == null)
        {
            return false;
        }
        Object obj = LoginClient.Result.a.c;
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
                    if (((LoginClient.Result) (obj1)).a == com.facebook.login.LoginClient.Result.a.a)
                    {
                        intent = ((LoginClient.Result) (obj1)).b;
                        obj = null;
                        i = ((flag) ? 1 : 0);
                    } else
                    {
                        obj = new k(((LoginClient.Result) (obj1)).c);
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
            obj2 = LoginClient.Result.a.b;
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
                    obj3 = new p("Unexpected call to LoginManager.onActivityResult");
                }
            }
        }
        a(((LoginClient.Result.a) (obj2)), ((Map) (obj1)), ((Exception) (obj3)));
        if (obj != null)
        {
            AccessToken.a(((AccessToken) (obj)));
            Profile.b();
        }
        if (n1 == null) goto _L2; else goto _L1
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
            intent = new com.facebook.login.s(((AccessToken) (obj)), intent, ((Set) (obj1)));
        } else
        {
            intent = null;
        }
        if (i == 0 && (intent == null || ((com.facebook.login.s) (intent)).b.size() != 0)) goto _L4; else goto _L3
_L3:
        n1.onCancel();
_L2:
        e = null;
        g = null;
        return true;
_L4:
        if (obj3 != null)
        {
            n1.onError(((p) (obj3)));
        } else
        if (obj != null)
        {
            n1.onSuccess(intent);
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

}

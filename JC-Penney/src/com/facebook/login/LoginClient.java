// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import com.facebook.AccessToken;
import com.facebook.b.al;
import com.facebook.b.p;
import com.facebook.bc;
import com.facebook.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            h, LoginMethodHandler, m, q, 
//            g, GetTokenLoginMethodHandler, KatanaProxyLoginMethodHandler, WebViewLoginMethodHandler, 
//            j, i

class LoginClient
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    LoginMethodHandler a[];
    int b;
    Fragment c;
    j d;
    i e;
    boolean f;
    Request g;
    Map h;
    private q i;

    public LoginClient(Parcel parcel)
    {
        b = -1;
        Parcelable aparcelable[] = parcel.readParcelableArray(com/facebook/login/LoginMethodHandler.getClassLoader());
        a = new LoginMethodHandler[aparcelable.length];
        for (int i1 = 0; i1 < aparcelable.length; i1++)
        {
            a[i1] = (LoginMethodHandler)aparcelable[i1];
            a[i1].a(this);
        }

        b = parcel.readInt();
        g = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        h = al.a(parcel);
    }

    public LoginClient(Fragment fragment)
    {
        b = -1;
        c = fragment;
    }

    private void a(String s, Result result, Map map)
    {
        a(s, result.a.a(), result.c, result.d, map);
    }

    private void a(String s, String s1, String s2, String s3, Map map)
    {
        if (g == null)
        {
            o().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        } else
        {
            o().a(g.e(), s, s1, s2, s3, map);
            return;
        }
    }

    private void a(String s, String s1, boolean flag)
    {
        if (h == null)
        {
            h = new HashMap();
        }
        String s2 = s1;
        if (h.containsKey(s))
        {
            s2 = s1;
            if (flag)
            {
                s2 = (new StringBuilder()).append((String)h.get(s)).append(",").append(s1).toString();
            }
        }
        h.put(s, s2);
    }

    private LoginMethodHandler[] c(Request request)
    {
        ArrayList arraylist = new ArrayList();
        request = request.b();
        if (request.a())
        {
            arraylist.add(new GetTokenLoginMethodHandler(this));
            arraylist.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (request.b())
        {
            arraylist.add(new WebViewLoginMethodHandler(this));
        }
        request = new LoginMethodHandler[arraylist.size()];
        arraylist.toArray(request);
        return request;
    }

    public static int d()
    {
        return p.a.a();
    }

    private void d(Result result)
    {
        if (d != null)
        {
            d.a(result);
        }
    }

    static String l()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    private LoginMethodHandler m()
    {
        if (b >= 0)
        {
            return a[b];
        } else
        {
            return null;
        }
    }

    private void n()
    {
        b(Result.a(g, "Login attempt failed.", null));
    }

    private q o()
    {
        if (i == null || !i.a().equals(g.d()))
        {
            i = new q(b(), g.d());
        }
        return i;
    }

    int a(String s)
    {
        return b().checkCallingOrSelfPermission(s);
    }

    public Fragment a()
    {
        return c;
    }

    void a(Fragment fragment)
    {
        if (c != null)
        {
            throw new m("Can't set fragment once it is already set.");
        } else
        {
            c = fragment;
            return;
        }
    }

    void a(Request request)
    {
        if (!e())
        {
            b(request);
        }
    }

    void a(Result result)
    {
        if (result.b != null && AccessToken.a() != null)
        {
            c(result);
            return;
        } else
        {
            b(result);
            return;
        }
    }

    void a(i i1)
    {
        e = i1;
    }

    void a(j j1)
    {
        d = j1;
    }

    public boolean a(int i1, int j1, Intent intent)
    {
        if (g != null)
        {
            return m().a(i1, j1, intent);
        } else
        {
            return false;
        }
    }

    ac b()
    {
        return c.i();
    }

    void b(Request request)
    {
        if (request != null)
        {
            if (g != null)
            {
                throw new m("Attempted to authorize while a request is pending.");
            }
            if (AccessToken.a() == null || g())
            {
                g = request;
                a = c(request);
                h();
                return;
            }
        }
    }

    void b(Result result)
    {
        LoginMethodHandler loginmethodhandler = m();
        if (loginmethodhandler != null)
        {
            a(loginmethodhandler.a(), result, loginmethodhandler.a);
        }
        if (h != null)
        {
            result.f = h;
        }
        a = null;
        b = -1;
        g = null;
        h = null;
        d(result);
    }

    public Request c()
    {
        return g;
    }

    void c(Result result)
    {
        AccessToken accesstoken;
        AccessToken accesstoken1;
        if (result.b == null)
        {
            throw new m("Can't validate without a token");
        }
        accesstoken = AccessToken.a();
        accesstoken1 = result.b;
        if (accesstoken == null || accesstoken1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (!accesstoken.i().equals(accesstoken1.i()))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        result = Result.a(g, result.b);
_L1:
        b(result);
        return;
        try
        {
            result = Result.a(g, "User logged in as different Facebook user.", null);
        }
        // Misplaced declaration of an exception variable
        catch (Result result)
        {
            b(Result.a(g, "Caught exception", result.getMessage()));
            return;
        }
          goto _L1
    }

    public int describeContents()
    {
        return 0;
    }

    boolean e()
    {
        return g != null && b >= 0;
    }

    void f()
    {
        if (b >= 0)
        {
            m().b();
        }
    }

    boolean g()
    {
        if (f)
        {
            return true;
        }
        if (a("android.permission.INTERNET") != 0)
        {
            Object obj = b();
            String s = ((Activity) (obj)).getString(bc.com_facebook_internet_permission_error_title);
            obj = ((Activity) (obj)).getString(bc.com_facebook_internet_permission_error_message);
            b(Result.a(g, s, ((String) (obj))));
            return false;
        } else
        {
            f = true;
            return true;
        }
    }

    void h()
    {
        if (b >= 0)
        {
            a(m().a(), "skipped", null, null, m().a);
        }
_L4:
        if (a == null || b >= a.length - 1) goto _L2; else goto _L1
_L1:
        b = b + 1;
        if (!i()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (g != null)
        {
            n();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    boolean i()
    {
        LoginMethodHandler loginmethodhandler = m();
        if (loginmethodhandler.c() && !g())
        {
            a("no_internet_permission", "1", false);
            return false;
        }
        boolean flag = loginmethodhandler.a(g);
        if (flag)
        {
            o().a(g.e(), loginmethodhandler.a());
            return flag;
        } else
        {
            a("not_tried", loginmethodhandler.a(), true);
            return flag;
        }
    }

    void j()
    {
        if (e != null)
        {
            e.a();
        }
    }

    void k()
    {
        if (e != null)
        {
            e.b();
        }
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeParcelableArray(a, i1);
        parcel.writeInt(b);
        parcel.writeParcelable(g, i1);
        al.a(parcel, h);
    }


    private class Request
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new k();
        private final g a;
        private Set b;
        private final a c;
        private final String d;
        private final String e;
        private boolean f;

        Set a()
        {
            return b;
        }

        void a(Set set)
        {
            ar.a(set, "permissions");
            b = set;
        }

        g b()
        {
            return a;
        }

        a c()
        {
            return c;
        }

        String d()
        {
            return d;
        }

        public int describeContents()
        {
            return 0;
        }

        String e()
        {
            return e;
        }

        boolean f()
        {
            return f;
        }

        boolean g()
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                if (r.a((String)iterator.next()))
                {
                    return true;
                }
            }

            return false;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            Object obj = null;
            String s;
            if (a != null)
            {
                s = a.name();
            } else
            {
                s = null;
            }
            parcel.writeString(s);
            parcel.writeStringList(new ArrayList(b));
            s = obj;
            if (c != null)
            {
                s = c.name();
            }
            parcel.writeString(s);
            parcel.writeString(d);
            parcel.writeString(e);
            if (f)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
        }


        private Request(Parcel parcel)
        {
            Object obj1 = null;
            super();
            f = false;
            Object obj = parcel.readString();
            String s;
            boolean flag;
            if (obj != null)
            {
                obj = com.facebook.login.g.valueOf(((String) (obj)));
            } else
            {
                obj = null;
            }
            a = ((g) (obj));
            obj = new ArrayList();
            parcel.readStringList(((java.util.List) (obj)));
            b = new HashSet(((java.util.Collection) (obj)));
            s = parcel.readString();
            obj = obj1;
            if (s != null)
            {
                obj = com.facebook.login.a.valueOf(s);
            }
            c = ((a) (obj));
            d = parcel.readString();
            e = parcel.readString();
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
        }

        Request(Parcel parcel, h h1)
        {
            this(parcel);
        }
    }


    private class Result
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new l();
        final com.facebook.login.m a;
        final AccessToken b;
        final String c;
        final String d;
        final Request e;
        public Map f;

        static Result a(Request request, AccessToken accesstoken)
        {
            return new Result(request, m.a, accesstoken, null, null);
        }

        static Result a(Request request, String s)
        {
            return new Result(request, m.b, null, s, null);
        }

        static Result a(Request request, String s, String s1)
        {
            return a(request, s, s1, null);
        }

        static Result a(Request request, String s, String s1, String s2)
        {
            s = TextUtils.join(": ", al.b(new String[] {
                s, s1
            }));
            return new Result(request, m.c, null, s, s2);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a.name());
            parcel.writeParcelable(b, i1);
            parcel.writeString(c);
            parcel.writeString(d);
            parcel.writeParcelable(e, i1);
            al.a(parcel, f);
        }


        private Result(Parcel parcel)
        {
            a = com.facebook.login.m.valueOf(parcel.readString());
            b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
            c = parcel.readString();
            d = parcel.readString();
            e = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
            f = al.a(parcel);
        }

        Result(Parcel parcel, h h1)
        {
            this(parcel);
        }

        Result(Request request, com.facebook.login.m m1, AccessToken accesstoken, String s, String s1)
        {
            ar.a(m1, "code");
            e = request;
            b = accesstoken;
            c = s;
            a = m1;
            d = s1;
        }
    }

}

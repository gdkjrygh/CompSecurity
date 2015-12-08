// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.ay;
import com.facebook.internal.aw;
import com.facebook.internal.m;
import com.facebook.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            h, LoginMethodHandler, q, g, 
//            GetTokenLoginMethodHandler, KatanaProxyLoginMethodHandler, WebViewLoginMethodHandler, m, 
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
        for (int k = 0; k < aparcelable.length; k++)
        {
            a[k] = (LoginMethodHandler)aparcelable[k];
            a[k].a(this);
        }

        b = parcel.readInt();
        g = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        h = aw.a(parcel);
    }

    public LoginClient(Fragment fragment)
    {
        b = -1;
        c = fragment;
    }

    public static int a()
    {
        return m.a.a();
    }

    private void a(String s, String s1, String s2, String s3, Map map)
    {
        if (g == null)
        {
            h().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        } else
        {
            h().a(g.e(), s, s1, s2, s3, map);
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

    static String e()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    private LoginMethodHandler f()
    {
        if (b >= 0)
        {
            return a[b];
        } else
        {
            return null;
        }
    }

    private boolean g()
    {
        if (f)
        {
            return true;
        }
        if (c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            Object obj = c.getActivity();
            String s = ((Activity) (obj)).getString(ay.b);
            obj = ((Activity) (obj)).getString(ay.a);
            b(Result.a(g, s, ((String) (obj))));
            return false;
        } else
        {
            f = true;
            return true;
        }
    }

    private q h()
    {
        if (i == null || !i.a().equals(g.d()))
        {
            i = new q(c.getActivity(), g.d());
        }
        return i;
    }

    final void a(Request request)
    {
        boolean flag;
        if (g != null && b >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && request != null)
        {
            if (g != null)
            {
                throw new l("Attempted to authorize while a request is pending.");
            }
            if (AccessToken.a() == null || g())
            {
                g = request;
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
                a = request;
                c();
            }
        }
    }

    final void a(Result result)
    {
        AccessToken accesstoken;
        AccessToken accesstoken1;
        if (result.b == null || AccessToken.a() == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (result.b == null)
        {
            throw new l("Can't validate without a token");
        }
        accesstoken = AccessToken.a();
        accesstoken1 = result.b;
        if (accesstoken == null || accesstoken1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (!accesstoken.g().equals(accesstoken1.g()))
        {
            break MISSING_BLOCK_LABEL_80;
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
        b(result);
        return;
    }

    public final boolean a(int k, Intent intent)
    {
        if (g != null)
        {
            return f().a(k, intent);
        } else
        {
            return false;
        }
    }

    final void b()
    {
        if (b >= 0)
        {
            f().b();
        }
    }

    final void b(Result result)
    {
        Object obj = f();
        if (obj != null)
        {
            String s = ((LoginMethodHandler) (obj)).a();
            obj = ((LoginMethodHandler) (obj)).a;
            a(s, result.a.a(), result.c, result.d, ((Map) (obj)));
        }
        if (h != null)
        {
            result.f = h;
        }
        a = null;
        b = -1;
        g = null;
        h = null;
        if (d != null)
        {
            d.a(result);
        }
    }

    final void c()
    {
        if (b >= 0)
        {
            a(f().a(), "skipped", null, null, f().a);
        }
_L4:
        if (a == null || b >= a.length - 1) goto _L2; else goto _L1
_L1:
        b = b + 1;
        LoginMethodHandler loginmethodhandler = f();
        boolean flag;
        if (loginmethodhandler.c() && !g())
        {
            a("no_internet_permission", "1", false);
            flag = false;
        } else
        {
            flag = loginmethodhandler.a(g);
            if (flag)
            {
                h().a(g.e(), loginmethodhandler.a());
            } else
            {
                a("not_tried", loginmethodhandler.a(), true);
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (g != null)
        {
            b(Result.a(g, "Login attempt failed.", null));
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    final void d()
    {
        if (e != null)
        {
            e.a();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeParcelableArray(a, k);
        parcel.writeInt(b);
        parcel.writeParcelable(g, k);
        aw.a(parcel, h);
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

        final Set a()
        {
            return b;
        }

        final void a(Set set)
        {
            bc.a(set, "permissions");
            b = set;
        }

        final g b()
        {
            return a;
        }

        final a c()
        {
            return c;
        }

        final String d()
        {
            return d;
        }

        public int describeContents()
        {
            return 0;
        }

        final String e()
        {
            return e;
        }

        final boolean f()
        {
            return f;
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

        Request(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }


    private class Result
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new com.facebook.login.l();
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
            s = TextUtils.join(": ", aw.b(new String[] {
                s, s1
            }));
            return new Result(request, m.c, null, s, s2);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            parcel.writeString(a.name());
            parcel.writeParcelable(b, k);
            parcel.writeString(c);
            parcel.writeString(d);
            parcel.writeParcelable(e, k);
            aw.a(parcel, f);
        }


        private Result(Parcel parcel)
        {
            a = m.valueOf(parcel.readString());
            b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
            c = parcel.readString();
            d = parcel.readString();
            e = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
            f = aw.a(parcel);
        }

        Result(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        private Result(Request request, com.facebook.login.m m1, AccessToken accesstoken, String s, String s1)
        {
            bc.a(m1, "code");
            e = request;
            b = accesstoken;
            c = s;
            a = m1;
            d = s1;
        }
    }

}

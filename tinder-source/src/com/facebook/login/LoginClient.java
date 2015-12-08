// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.m;
import com.facebook.internal.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, c, LoginBehavior, DefaultAudience

class LoginClient
    implements Parcelable
{
    public static class Request
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Request(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int j)
            {
                return new Request[j];
            }

        };
        final LoginBehavior a;
        Set b;
        final DefaultAudience c;
        final String d;
        final String e;
        boolean f;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int j)
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
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeByte((byte)j);
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
                obj = LoginBehavior.valueOf(((String) (obj)));
            } else
            {
                obj = null;
            }
            a = ((LoginBehavior) (obj));
            obj = new ArrayList();
            parcel.readStringList(((java.util.List) (obj)));
            b = new HashSet(((java.util.Collection) (obj)));
            s = parcel.readString();
            obj = obj1;
            if (s != null)
            {
                obj = DefaultAudience.valueOf(s);
            }
            c = ((DefaultAudience) (obj));
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

        Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
        {
            f = false;
            a = loginbehavior;
            if (set == null)
            {
                set = new HashSet();
            }
            b = set;
            c = defaultaudience;
            d = s;
            e = s1;
        }
    }

    public static class Result
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Result(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int j)
            {
                return new Result[j];
            }

        };
        final Code a;
        final AccessToken b;
        final String c;
        final String d;
        final Request e;
        public Map f;

        static Result a(Request request, AccessToken accesstoken)
        {
            return new Result(request, Code.a, accesstoken, null, null);
        }

        static Result a(Request request, String s)
        {
            return new Result(request, Code.b, null, s, null);
        }

        static Result a(Request request, String s, String s1)
        {
            return a(request, s, s1, null);
        }

        static Result a(Request request, String s, String s1, String s2)
        {
            s = TextUtils.join(": ", m.b(new String[] {
                s, s1
            }));
            return new Result(request, Code.c, null, s, s2);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            parcel.writeString(a.name());
            parcel.writeParcelable(b, j);
            parcel.writeString(c);
            parcel.writeString(d);
            parcel.writeParcelable(e, j);
            m.a(parcel, f);
        }


        private Result(Parcel parcel)
        {
            a = Code.valueOf(parcel.readString());
            b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
            c = parcel.readString();
            d = parcel.readString();
            e = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
            f = m.a(parcel);
        }

        Result(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        private Result(Request request, Code code, AccessToken accesstoken, String s, String s1)
        {
            n.a(code, "code");
            e = request;
            b = accesstoken;
            c = s;
            a = code;
            d = s1;
        }
    }

    static final class Result.Code extends Enum
    {

        public static final Result.Code a;
        public static final Result.Code b;
        public static final Result.Code c;
        private static final Result.Code e[];
        final String d;

        public static Result.Code valueOf(String s)
        {
            return (Result.Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
        }

        public static Result.Code[] values()
        {
            return (Result.Code[])e.clone();
        }

        static 
        {
            a = new Result.Code("SUCCESS", 0, "success");
            b = new Result.Code("CANCEL", 1, "cancel");
            c = new Result.Code("ERROR", 2, "error");
            e = (new Result.Code[] {
                a, b, c
            });
        }

        private Result.Code(String s, int j, String s1)
        {
            super(s, j);
            d = s1;
        }
    }

    static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface b
    {

        public abstract void a(Result result);
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new LoginClient(parcel);
        }

        public final volatile Object[] newArray(int j)
        {
            return new LoginClient[j];
        }

    };
    LoginMethodHandler a[];
    int b;
    Fragment c;
    b d;
    a e;
    boolean f;
    Request g;
    Map h;
    private c i;

    public LoginClient(Parcel parcel)
    {
        b = -1;
        Parcelable aparcelable[] = parcel.readParcelableArray(com/facebook/login/LoginMethodHandler.getClassLoader());
        a = new LoginMethodHandler[aparcelable.length];
        for (int j = 0; j < aparcelable.length; j++)
        {
            a[j] = (LoginMethodHandler)aparcelable[j];
            a[j].a(this);
        }

        b = parcel.readInt();
        g = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        h = m.a(parcel);
    }

    public LoginClient(Fragment fragment)
    {
        b = -1;
        c = fragment;
    }

    public static int a()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.a.a();
    }

    private void a(String s, String s1, String s2, String s3, Map map)
    {
        if (g == null)
        {
            g().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        }
        c c1 = g();
        Bundle bundle = com.facebook.login.c.a(g.e);
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
        if (map != null && !map.isEmpty())
        {
            bundle.putString("6_extras", (new JSONObject(map)).toString());
        }
        bundle.putString("3_method", s);
        c1.a.b("fb_mobile_login_method_complete", bundle);
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

    static String f()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    private c g()
    {
        if (i == null || !i.b.equals(g.d))
        {
            i = new c(c.getActivity(), g.d);
        }
        return i;
    }

    final void a(Result result)
    {
        AccessToken accesstoken;
        AccessToken accesstoken1;
        if (result.b == null || AccessToken.a() == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (result.b == null)
        {
            throw new FacebookException("Can't validate without a token");
        }
        accesstoken = AccessToken.a();
        accesstoken1 = result.b;
        if (accesstoken == null || accesstoken1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (!accesstoken.h.equals(accesstoken1.h))
        {
            break MISSING_BLOCK_LABEL_79;
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

    final LoginMethodHandler b()
    {
        if (b >= 0)
        {
            return a[b];
        } else
        {
            return null;
        }
    }

    final void b(Result result)
    {
        Object obj = b();
        if (obj != null)
        {
            String s = ((LoginMethodHandler) (obj)).a();
            obj = ((LoginMethodHandler) (obj)).a;
            a(s, result.a.d, result.c, result.d, ((Map) (obj)));
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

    final boolean c()
    {
        if (f)
        {
            return true;
        }
        if (c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            Object obj = c.getActivity();
            String s = ((Activity) (obj)).getString(com.facebook.p.e.com_facebook_internet_permission_error_title);
            obj = ((Activity) (obj)).getString(com.facebook.p.e.com_facebook_internet_permission_error_message);
            b(Result.a(g, s, ((String) (obj))));
            return false;
        } else
        {
            f = true;
            return true;
        }
    }

    final void d()
    {
        if (b >= 0)
        {
            a(b().a(), "skipped", null, null, b().a);
        }
_L4:
        if (a == null || b >= a.length - 1) goto _L2; else goto _L1
_L1:
        b = b + 1;
        Object obj1 = b();
        boolean flag;
        if (((LoginMethodHandler) (obj1)).c() && !c())
        {
            a("no_internet_permission", "1", false);
            flag = false;
        } else
        {
            flag = ((LoginMethodHandler) (obj1)).a(g);
            if (flag)
            {
                c c1 = g();
                Object obj = g.e;
                obj1 = ((LoginMethodHandler) (obj1)).a();
                obj = com.facebook.login.c.a(((String) (obj)));
                ((Bundle) (obj)).putString("3_method", ((String) (obj1)));
                c1.a.b("fb_mobile_login_method_start", ((Bundle) (obj)));
            } else
            {
                a("not_tried", ((LoginMethodHandler) (obj1)).a(), true);
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

    public int describeContents()
    {
        return 0;
    }

    final void e()
    {
        if (e != null)
        {
            e.a();
        }
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeParcelableArray(a, j);
        parcel.writeInt(b);
        parcel.writeParcelable(g, j);
        m.a(parcel, h);
    }

}

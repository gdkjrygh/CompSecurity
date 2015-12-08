// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.e;
import com.facebook.internal.m;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookServiceException, FacebookException, g

public final class FacebookRequestError
{
    public static final class Category extends Enum
    {

        public static final Category a;
        public static final Category b;
        public static final Category c;
        private static final Category d[];

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])d.clone();
        }

        static 
        {
            a = new Category("LOGIN_RECOVERABLE", 0);
            b = new Category("OTHER", 1);
            c = new Category("TRANSIENT", 2);
            d = (new Category[] {
                a, b, c
            });
        }

        private Category(String s, int i1)
        {
            super(s, i1);
        }
    }

    private static final class a
    {

        final int a;
        final int b;

        private a()
        {
            a = 200;
            b = 299;
        }

        a(byte byte0)
        {
            this();
        }
    }


    static final a a = new a((byte)0);
    final int b;
    public final int c;
    final String d;
    public final FacebookException e;
    private final Category f;
    private final int g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final JSONObject l;
    private final JSONObject m;
    private final Object n;
    private final HttpURLConnection o;

    private FacebookRequestError(int i1, int j1, int k1, String s, String s1, String s2, String s3, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, FacebookException facebookexception)
    {
        b = i1;
        c = j1;
        g = k1;
        d = s;
        h = s1;
        m = jsonobject;
        l = jsonobject1;
        n = obj;
        o = httpurlconnection;
        i = s2;
        j = s3;
        i1 = 0;
        if (facebookexception != null)
        {
            e = facebookexception;
            i1 = 1;
        } else
        {
            e = new FacebookServiceException(this, s1);
        }
        s1 = b();
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            s = Category.c;
        } else
        {
label0:
            {
                if (((e) (s1)).a == null || !((e) (s1)).a.containsKey(Integer.valueOf(j1)))
                {
                    break label0;
                }
                s = (Set)((e) (s1)).a.get(Integer.valueOf(j1));
                if (s != null && !s.contains(Integer.valueOf(k1)))
                {
                    break label0;
                }
                s = Category.b;
            }
        }
_L7:
        f = s;
        s = f;
        com.facebook.internal.e._cls1.a[s.ordinal()];
        JVM INSTR tableswitch 1 3: default 148
    //                   1 396
    //                   2 406
    //                   3 416;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_416;
_L3:
        s = null;
_L10:
        k = s;
        return;
label1:
        {
            if (((e) (s1)).c == null || !((e) (s1)).c.containsKey(Integer.valueOf(j1)))
            {
                break label1;
            }
            s = (Set)((e) (s1)).c.get(Integer.valueOf(j1));
            if (s != null && !s.contains(Integer.valueOf(k1)))
            {
                break label1;
            }
            s = Category.a;
        }
          goto _L7
        if (((e) (s1)).b == null || !((e) (s1)).b.containsKey(Integer.valueOf(j1))) goto _L2; else goto _L8
_L8:
        s = (Set)((e) (s1)).b.get(Integer.valueOf(j1));
        if (s != null && !s.contains(Integer.valueOf(k1))) goto _L2; else goto _L9
_L9:
        s = Category.c;
          goto _L7
_L2:
        s = Category.b;
          goto _L7
_L4:
        s = ((e) (s1)).d;
          goto _L10
_L5:
        s = ((e) (s1)).f;
          goto _L10
        s = ((e) (s1)).e;
          goto _L10
    }

    public FacebookRequestError(int i1, String s, String s1)
    {
        this(-1, i1, -1, s, s1, null, null, false, null, null, null, null, null);
    }

    FacebookRequestError(HttpURLConnection httpurlconnection, Exception exception)
    {
        if (exception instanceof FacebookException)
        {
            exception = (FacebookException)exception;
        } else
        {
            exception = new FacebookException(exception);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpurlconnection, ((FacebookException) (exception)));
    }

    static FacebookRequestError a(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
    {
        if (!jsonobject.has("code")) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k1;
        k1 = jsonobject.getInt("code");
        obj1 = com.facebook.internal.m.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!(obj1 instanceof JSONObject)) goto _L4; else goto _L5
_L5:
        JSONObject jsonobject2 = (JSONObject)obj1;
        String s;
        JSONObject jsonobject1;
        Object obj3;
        boolean flag;
        int i1;
        int j1;
        boolean flag2;
        obj1 = null;
        s = null;
        jsonobject1 = null;
        obj3 = null;
        flag2 = false;
        i1 = 0;
        j1 = 0;
        flag = false;
        if (!jsonobject2.has("error")) goto _L7; else goto _L6
_L6:
        Object obj2;
        String s1;
        boolean flag1;
        jsonobject1 = (JSONObject)com.facebook.internal.m.a(jsonobject2, "error", null);
        obj1 = jsonobject1.optString("type", null);
        s = jsonobject1.optString("message", null);
        i1 = jsonobject1.optInt("code", -1);
        j1 = jsonobject1.optInt("error_subcode", -1);
        obj2 = jsonobject1.optString("error_user_msg", null);
        s1 = jsonobject1.optString("error_user_title", null);
        flag1 = jsonobject1.optBoolean("is_transient", false);
        flag = true;
_L10:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        return new FacebookRequestError(k1, i1, j1, ((String) (obj1)), s, s1, ((String) (obj2)), flag1, jsonobject2, jsonobject, obj, httpurlconnection, null);
_L7:
        if (jsonobject2.has("error_code") || jsonobject2.has("error_msg")) goto _L9; else goto _L8
_L8:
        s1 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (!jsonobject2.has("error_reason"))
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        obj1 = jsonobject2.optString("error_reason", null);
        s = jsonobject2.optString("error_msg", null);
        i1 = jsonobject2.optInt("error_code", -1);
        j1 = jsonobject2.optInt("error_subcode", -1);
        flag = true;
        s1 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (true) goto _L10; else goto _L4
_L4:
        obj1 = a;
        if (((a) (obj1)).a <= k1 && k1 <= ((a) (obj1)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L11
_L11:
        if (!jsonobject.has("body"))
        {
            break MISSING_BLOCK_LABEL_378;
        }
        obj1 = (JSONObject)com.facebook.internal.m.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
_L12:
        jsonobject = new FacebookRequestError(k1, -1, -1, null, null, null, null, false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection, null);
        return jsonobject;
        jsonobject;
_L2:
        return null;
        obj1 = null;
          goto _L12
    }

    private static e b()
    {
        com/facebook/FacebookRequestError;
        JVM INSTR monitorenter ;
        Object obj = com.facebook.internal.m.c(com.facebook.g.j());
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = com.facebook.internal.e.a();
_L4:
        com/facebook/FacebookRequestError;
        JVM INSTR monitorexit ;
        return ((e) (obj));
_L2:
        obj = ((com.facebook.internal.m.b) (obj)).d;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        if (h != null)
        {
            return h;
        } else
        {
            return e.getLocalizedMessage();
        }
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(b).append(", errorCode: ").append(c).append(", errorType: ").append(d).append(", errorMessage: ").append(a()).append("}").toString();
    }

}

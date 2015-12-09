// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aoh;
import arp;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookServiceException, FacebookException

public final class FacebookRequestError
{

    private static final aoh f = new aoh(200, 299, (byte)0);
    private static final aoh g = new aoh(200, 299, (byte)0);
    private static final aoh h = new aoh(400, 499, (byte)0);
    private static final aoh i = new aoh(500, 599, (byte)0);
    final int a;
    public final int b;
    final String c;
    public final JSONObject d;
    public final FacebookException e;
    private final String j;

    private FacebookRequestError(int k, int l, int i1, String s, String s1, String s2, JSONObject jsonobject)
    {
        this(k, l, i1, s, s1, s2, jsonobject, null);
    }

    private FacebookRequestError(int k, int l, int i1, String s, String s1, String s2, JSONObject jsonobject, 
            FacebookException facebookexception)
    {
        a = k;
        b = l;
        c = s;
        j = s1;
        d = jsonobject;
        boolean flag;
        if (facebookexception != null)
        {
            e = facebookexception;
            flag = true;
        } else
        {
            e = new FacebookServiceException(this, s1);
            flag = false;
        }
        s = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        s = Category.h;
_L5:
        if (s2 != null)
        {
            s2.length();
        }
        return;
_L2:
        if (l != 1 && l != 2) goto _L4; else goto _L3
_L3:
        s = Category.d;
_L6:
        if (s == null)
        {
            if (h.a(k))
            {
                s = Category.g;
            } else
            if (i.a(k))
            {
                s = Category.d;
            } else
            {
                s = Category.f;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (l == 4 || l == 17)
        {
            s = Category.e;
        } else
        if (l == 10 || f.a(l))
        {
            s = Category.c;
        } else
        if (l == 102 || l == 190)
        {
            if (i1 == 459 || i1 == 464)
            {
                s = Category.a;
            } else
            {
                s = Category.b;
            }
        }
          goto _L6
    }

    public FacebookRequestError(int k, String s, String s1)
    {
        this(-1, k, -1, s, s1, null, null, null);
    }

    public FacebookRequestError(Exception exception)
    {
        if (exception instanceof FacebookException)
        {
            exception = (FacebookException)exception;
        } else
        {
            exception = new FacebookException(exception);
        }
        this(-1, -1, -1, null, null, null, null, ((FacebookException) (exception)));
    }

    public static FacebookRequestError a(JSONObject jsonobject)
    {
        int l = 0;
        if (!jsonobject.has("code")) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        i1 = jsonobject.getInt("code");
        obj = arp.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof JSONObject)) goto _L4; else goto _L5
_L5:
        Object obj1 = (JSONObject)obj;
        if (!((JSONObject) (obj1)).has("error")) goto _L7; else goto _L6
_L6:
        String s;
        int k;
        JSONObject jsonobject1 = (JSONObject)arp.a(((JSONObject) (obj1)), "error", null);
        obj = jsonobject1.optString("type", null);
        s = jsonobject1.optString("message", null);
        k = jsonobject1.optInt("code", -1);
        l = jsonobject1.optInt("error_subcode", -1);
        obj1 = jsonobject1.optString("error_user_msg", null);
        jsonobject1.optString("error_user_title", null);
        jsonobject1.optBoolean("is_transient", false);
        boolean flag = true;
_L13:
        if (!flag) goto _L4; else goto _L8
_L8:
        return new FacebookRequestError(i1, k, l, ((String) (obj)), s, ((String) (obj1)), jsonobject);
_L7:
        if (!((JSONObject) (obj1)).has("error_code") && !((JSONObject) (obj1)).has("error_msg") && !((JSONObject) (obj1)).has("error_reason")) goto _L10; else goto _L9
_L9:
        obj = ((JSONObject) (obj1)).optString("error_reason", null);
        s = ((JSONObject) (obj1)).optString("error_msg", null);
        k = ((JSONObject) (obj1)).optInt("error_code", -1);
        l = ((JSONObject) (obj1)).optInt("error_subcode", -1);
        flag = true;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
_L4:
        if (g.a(i1)) goto _L2; else goto _L11
_L11:
        if (jsonobject.has("body"))
        {
            arp.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        }
        jsonobject = new FacebookRequestError(i1, -1, -1, null, null, null, jsonobject);
        return jsonobject;
        jsonobject;
_L2:
        return null;
_L10:
        flag = false;
        k = 0;
        obj1 = null;
        s = null;
        obj = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final String a()
    {
        if (j != null)
        {
            return j;
        } else
        {
            return e.getLocalizedMessage();
        }
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(a).append(", errorCode: ").append(b).append(", errorType: ").append(c).append(", errorMessage: ").append(a()).append("}").toString();
    }


    private class Category extends Enum
    {

        public static final Category a;
        public static final Category b;
        public static final Category c;
        public static final Category d;
        public static final Category e;
        public static final Category f;
        public static final Category g;
        public static final Category h;
        private static final Category i[];

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])i.clone();
        }

        static 
        {
            a = new Category("AUTHENTICATION_RETRY", 0);
            b = new Category("AUTHENTICATION_REOPEN_SESSION", 1);
            c = new Category("PERMISSION", 2);
            d = new Category("SERVER", 3);
            e = new Category("THROTTLING", 4);
            f = new Category("OTHER", 5);
            g = new Category("BAD_REQUEST", 6);
            h = new Category("CLIENT", 7);
            i = (new Category[] {
                a, b, c, d, e, f, g, h
            });
        }

        private Category(String s, int k)
        {
            super(s, k);
        }
    }

}

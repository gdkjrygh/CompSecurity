// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.U;
import com.facebook.internal.t;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            w, p, s

public final class r
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }

    private static final class b
    {

        final int a;
        final int b;

        private b()
        {
            a = 200;
            b = 299;
        }

        b(byte byte0)
        {
            this();
        }
    }


    static final b a = new b((byte)0);
    final int b;
    public final int c;
    final String d;
    public final JSONObject e;
    public final p f;
    private final int g;
    private final int h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final JSONObject m;
    private final Object n;
    private final HttpURLConnection o;

    private r(int i1, int j1, int k1, String s1, String s2, String s3, String s4, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, p p1)
    {
        b = i1;
        c = j1;
        h = k1;
        d = s1;
        i = s2;
        m = jsonobject;
        e = jsonobject1;
        n = obj;
        o = httpurlconnection;
        j = s3;
        k = s4;
        i1 = 0;
        if (p1 != null)
        {
            f = p1;
            i1 = 1;
        } else
        {
            f = new w(this, s2);
        }
        s1 = b();
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            i1 = a.c;
        } else
        {
label0:
            {
                if (((t) (s1)).a == null || !((t) (s1)).a.containsKey(Integer.valueOf(j1)))
                {
                    break label0;
                }
                s2 = (Set)((t) (s1)).a.get(Integer.valueOf(j1));
                if (s2 != null && !s2.contains(Integer.valueOf(k1)))
                {
                    break label0;
                }
                i1 = a.b;
            }
        }
_L7:
        g = i1;
        i1 = g;
        com.facebook.internal.t._cls1.a[i1 - 1];
        JVM INSTR tableswitch 1 3: default 144
    //                   1 388
    //                   2 398
    //                   3 408;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_408;
_L3:
        s1 = null;
_L10:
        l = s1;
        return;
label1:
        {
            if (((t) (s1)).c == null || !((t) (s1)).c.containsKey(Integer.valueOf(j1)))
            {
                break label1;
            }
            s2 = (Set)((t) (s1)).c.get(Integer.valueOf(j1));
            if (s2 != null && !s2.contains(Integer.valueOf(k1)))
            {
                break label1;
            }
            i1 = a.a;
        }
          goto _L7
        if (((t) (s1)).b == null || !((t) (s1)).b.containsKey(Integer.valueOf(j1))) goto _L2; else goto _L8
_L8:
        s2 = (Set)((t) (s1)).b.get(Integer.valueOf(j1));
        if (s2 != null && !s2.contains(Integer.valueOf(k1))) goto _L2; else goto _L9
_L9:
        i1 = a.c;
          goto _L7
_L2:
        i1 = a.b;
          goto _L7
_L4:
        s1 = ((t) (s1)).d;
          goto _L10
_L5:
        s1 = ((t) (s1)).f;
          goto _L10
        s1 = ((t) (s1)).e;
          goto _L10
    }

    public r(int i1, String s1, String s2)
    {
        this(-1, i1, -1, s1, s2, null, null, false, null, null, null, null, null);
    }

    r(HttpURLConnection httpurlconnection, Exception exception)
    {
        if (exception instanceof p)
        {
            exception = (p)exception;
        } else
        {
            exception = new p(exception);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpurlconnection, ((p) (exception)));
    }

    static r a(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
    {
        if (!jsonobject.has("code")) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k1;
        k1 = jsonobject.getInt("code");
        obj1 = U.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!(obj1 instanceof JSONObject)) goto _L4; else goto _L5
_L5:
        JSONObject jsonobject2 = (JSONObject)obj1;
        String s1;
        JSONObject jsonobject1;
        Object obj3;
        boolean flag;
        int i1;
        int j1;
        boolean flag2;
        obj1 = null;
        s1 = null;
        jsonobject1 = null;
        obj3 = null;
        flag2 = false;
        i1 = 0;
        j1 = 0;
        flag = false;
        if (!jsonobject2.has("error")) goto _L7; else goto _L6
_L6:
        Object obj2;
        String s2;
        boolean flag1;
        jsonobject1 = (JSONObject)U.a(jsonobject2, "error", null);
        obj1 = jsonobject1.optString("type", null);
        s1 = jsonobject1.optString("message", null);
        i1 = jsonobject1.optInt("code", -1);
        j1 = jsonobject1.optInt("error_subcode", -1);
        obj2 = jsonobject1.optString("error_user_msg", null);
        s2 = jsonobject1.optString("error_user_title", null);
        flag1 = jsonobject1.optBoolean("is_transient", false);
        flag = true;
_L10:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        return new r(k1, i1, j1, ((String) (obj1)), s1, s2, ((String) (obj2)), flag1, jsonobject2, jsonobject, obj, httpurlconnection, null);
_L7:
        if (jsonobject2.has("error_code") || jsonobject2.has("error_msg")) goto _L9; else goto _L8
_L8:
        s2 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (!jsonobject2.has("error_reason"))
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        obj1 = jsonobject2.optString("error_reason", null);
        s1 = jsonobject2.optString("error_msg", null);
        i1 = jsonobject2.optInt("error_code", -1);
        j1 = jsonobject2.optInt("error_subcode", -1);
        flag = true;
        s2 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (true) goto _L10; else goto _L4
_L4:
        obj1 = a;
        if (((b) (obj1)).a <= k1 && k1 <= ((b) (obj1)).b)
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
        obj1 = (JSONObject)U.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
_L12:
        jsonobject = new r(k1, -1, -1, null, null, null, null, false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection, null);
        return jsonobject;
        jsonobject;
_L2:
        return null;
        obj1 = null;
          goto _L12
    }

    private static t b()
    {
        com/facebook/r;
        JVM INSTR monitorenter ;
        Object obj = U.e(s.h());
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = t.a();
_L4:
        com/facebook/r;
        JVM INSTR monitorexit ;
        return ((t) (obj));
_L2:
        obj = ((com.facebook.internal.U.b) (obj)).e;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        if (i != null)
        {
            return i;
        } else
        {
            return f.getLocalizedMessage();
        }
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(b).append(", errorCode: ").append(c).append(", errorType: ").append(d).append(", errorMessage: ").append(a()).append("}").toString();
    }

}

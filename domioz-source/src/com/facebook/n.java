// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.aw;
import com.facebook.internal.ba;
import com.facebook.internal.s;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            p, o, v, l, 
//            q

public final class n
{

    static final p a = new p((byte)0);
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final JSONObject k;
    private final JSONObject l;
    private final Object m;
    private final HttpURLConnection n;
    private final l o;

    private n(int i1, int j1, int k1, String s1, String s2, String s3, String s4, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, l l1)
    {
        c = i1;
        d = j1;
        e = k1;
        f = s1;
        g = s2;
        l = jsonobject;
        k = jsonobject1;
        m = obj;
        n = httpurlconnection;
        h = s3;
        i = s4;
        i1 = 0;
        if (l1 != null)
        {
            o = l1;
            i1 = 1;
        } else
        {
            o = new v(this, s2);
        }
        s1 = g();
        if (i1 != 0)
        {
            i1 = o.b;
        } else
        {
            i1 = s1.a(j1, k1, flag);
        }
        b = i1;
        j = s1.a(b);
    }

    public n(int i1, String s1, String s2)
    {
        this(-1, i1, -1, s1, s2, null, null, false, null, null, null, null, null);
    }

    n(HttpURLConnection httpurlconnection, Exception exception)
    {
        if (exception instanceof l)
        {
            exception = (l)exception;
        } else
        {
            exception = new l(exception);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpurlconnection, ((l) (exception)));
    }

    static n a(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
    {
        if (!jsonobject.has("code")) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k1;
        k1 = jsonobject.getInt("code");
        obj1 = aw.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
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
        jsonobject1 = (JSONObject)aw.a(jsonobject2, "error", null);
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
        return new n(k1, i1, j1, ((String) (obj1)), s1, s2, ((String) (obj2)), flag1, jsonobject2, jsonobject, obj, httpurlconnection, null);
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
        if (a.a(k1)) goto _L2; else goto _L11
_L11:
        if (!jsonobject.has("body"))
        {
            break MISSING_BLOCK_LABEL_353;
        }
        obj1 = (JSONObject)aw.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
_L12:
        jsonobject = new n(k1, -1, -1, null, null, null, null, false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection, null);
        return jsonobject;
        jsonobject;
_L2:
        return null;
        obj1 = null;
          goto _L12
    }

    private static s g()
    {
        com/facebook/n;
        JVM INSTR monitorenter ;
        Object obj = aw.d(q.h());
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = s.a();
_L4:
        com/facebook/n;
        JVM INSTR monitorexit ;
        return ((s) (obj));
_L2:
        obj = ((ba) (obj)).c();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int a()
    {
        return c;
    }

    public final int b()
    {
        return d;
    }

    public final String c()
    {
        return f;
    }

    public final String d()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return o.getLocalizedMessage();
        }
    }

    public final JSONObject e()
    {
        return k;
    }

    public final l f()
    {
        return o;
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(c).append(", errorCode: ").append(d).append(", errorType: ").append(f).append(", errorMessage: ").append(d()).append("}").toString();
    }

}

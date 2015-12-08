// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.i;
import com.google.gson.stream.JsonReader;
import com.tinder.utils.t;
import com.tinder.utils.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.tinder.a:
//            f

public abstract class e extends Request
{

    protected final com.android.volley.i.b m;
    private final Map n = new HashMap(6);

    public e(String s, String s1, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        super(1, s, a1);
        m = b;
        n.put("User-Agent", f.a);
        n.put("os-version", f.ab);
        n.put("app-version", f.ac);
        n.put("platform", "android");
        n.put("Accept-Language", t.a());
        if (s1 != null)
        {
            n.put("X-Auth-Token", s1);
        }
    }

    protected final i a(NetworkResponse networkresponse)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        Object obj = new ByteArrayInputStream(networkresponse.b);
        Object obj3;
        try
        {
            obj = new JsonReader(new InputStreamReader(((java.io.InputStream) (obj)), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            v.a("Failed to decode response data as UTF-8", unsupportedencodingexception);
            unsupportedencodingexception = null;
        }
        obj2 = a(((JsonReader) (obj)));
        obj3 = null;
        obj1 = obj2;
        obj2 = obj3;
_L2:
        if (obj != null)
        {
            try
            {
                ((JsonReader) (obj)).close();
            }
            catch (IOException ioexception)
            {
                v.a("Failed to close reader.", ioexception);
            }
        }
        if (obj1 == null)
        {
            if (obj2 != null)
            {
                return i.a(new VolleyError(((Throwable) (obj2))));
            } else
            {
                return i.a(new VolleyError("Unknown error"));
            }
        } else
        {
            return i.a(obj1, com.android.volley.a.e.a(networkresponse));
        }
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract Object a(JsonReader jsonreader)
        throws Exception;

    protected final void a(Object obj)
    {
        m.a(obj);
    }

    public final Map d()
        throws AuthFailureError
    {
        return n;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.i;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.a:
//            j, e

public class h extends j
{

    public h(String s, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        super(0, s, null, b, a1);
    }

    public h(String s, JSONObject jsonobject, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.toString();
        }
        super(2, s, jsonobject, b, a1);
    }

    protected final i a(NetworkResponse networkresponse)
    {
        try
        {
            networkresponse = i.a(new JSONArray(new String(networkresponse.b, e.a(networkresponse.c, "utf-8"))), e.a(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return i.a(new ParseError(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return i.a(new ParseError(networkresponse));
        }
        return networkresponse;
    }
}

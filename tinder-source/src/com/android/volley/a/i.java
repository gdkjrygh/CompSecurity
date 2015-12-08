// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.a:
//            j, e

public class i extends j
{

    public i(int k, String s, JSONObject jsonobject, com.android.volley.b b, com.android.volley.a a1)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.toString();
        }
        super(k, s, jsonobject, b, a1);
    }

    public i(String s, com.android.volley.b b, com.android.volley.a a1)
    {
        this(0, s, null, b, a1);
    }

    protected final com.android.volley.i a(NetworkResponse networkresponse)
    {
        try
        {
            networkresponse = com.android.volley.i.a(new JSONObject(new String(networkresponse.b, e.a(networkresponse.c, "utf-8"))), e.a(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return com.android.volley.i.a(new ParseError(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return com.android.volley.i.a(new ParseError(networkresponse));
        }
        return networkresponse;
    }
}

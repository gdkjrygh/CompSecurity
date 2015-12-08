// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import com.microsoft.advertising.android.a.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.advertising.android:
//            af, i

final class bq
{

    private final int a = 10;
    private final int b = 16;
    private final int c = 128;
    private JSONObject d;
    private JSONArray e;

    public bq()
    {
        d = new JSONObject();
        e = new JSONArray();
        try
        {
            d.put("opts", e);
            return;
        }
        catch (JSONException jsonexception)
        {
            af.a(jsonexception);
        }
    }

    private boolean b(String s, String s1)
    {
        int j;
        int k;
        k = e.length();
        j = 0;
_L2:
        if (j >= k)
        {
            return false;
        }
        if (!e.getJSONObject(j).getString("name").equals(s))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", s);
        jsonobject.put("type", "text");
        jsonobject.put("value", s1);
        e.put(j, jsonobject);
        return true;
        Exception exception;
        exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Map a()
    {
        HashMap hashmap;
        int j;
        hashmap = new HashMap();
        j = 0;
        do
        {
            if (j >= e.length())
            {
                return hashmap;
            }
            try
            {
                JSONObject jsonobject = (JSONObject)e.get(j);
                hashmap.put((String)jsonobject.opt("name"), (String)jsonobject.opt("value"));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                return hashmap;
            }
            j++;
        } while (true);
    }

    public final void a(String s)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        int j = 0;
        do
        {
            if (j >= e.length())
            {
                d.remove("opts");
                d.put("opts", jsonarray);
                e = jsonarray;
                return;
            }
            JSONObject jsonobject = (JSONObject)e.get(j);
            if (!s.equals((String)jsonobject.opt("name")))
            {
                jsonarray.put(jsonobject);
            }
            j++;
        } while (true);
    }

    public final void a(String s, String s1)
        throws i, JSONException
    {
        if (TextUtils.isEmpty(s) || s.trim().isEmpty())
        {
            throw new i(e.d, "optionName is null or empty");
        }
        if (TextUtils.isEmpty(s1) || s1.trim().isEmpty())
        {
            throw new i(e.d, "optionValue is null or empty");
        }
        if (b(s, s1))
        {
            return;
        }
        if (e.length() >= 10)
        {
            throw new i(e.d, "Renderer options property bag is full. Cannot add new option.");
        }
        if (s.length() > 16)
        {
            throw new i(e.d, "Renderer option name length exceeds limit of 16");
        }
        if (s1.length() > 128)
        {
            throw new i(e.d, "Renderer option value length exceeds limit of 128");
        } else
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("name", s);
            jsonobject.put("type", "text");
            jsonobject.put("value", s1);
            e.put(jsonobject);
            return;
        }
    }

    public final String b()
    {
        return d.toString();
    }

    public final boolean c()
    {
        return e.length() > 0;
    }
}

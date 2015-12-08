// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.chromium.net:
//            CronetEngine

public static class a
{

    final JSONObject a = new JSONObject();
    final Context b;

    private a a(String s, long l)
    {
        try
        {
            a.put(s, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    private String b()
    {
        return a.optString("STORAGE_PATH");
    }

    final String a()
    {
        return a.optString("USER_AGENT");
    }

    public final a a(int i, long l)
    {
        if (i == 3 || i == 2)
        {
            if (b().isEmpty())
            {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else
        if (!b().isEmpty())
        {
            throw new IllegalArgumentException("Storage path must be empty");
        }
        boolean flag;
        if (i == 0 || i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a("LOAD_DISABLE_CACHE", flag);
        a("HTTP_CACHE_MAX_SIZE", l);
        switch (i)
        {
        default:
            return this;

        case 0: // '\0'
            return a("HTTP_CACHE", "HTTP_CACHE_DISABLED");

        case 2: // '\002'
        case 3: // '\003'
            return a("HTTP_CACHE", "HTTP_CACHE_DISK");

        case 1: // '\001'
            return a("HTTP_CACHE", "HTTP_CACHE_MEMORY");
        }
    }

    public final a a(String s)
    {
        if (s.contains("/"))
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal QUIC Hint Host: ")).append(s).toString());
        }
        JSONArray jsonarray;
        Object obj;
        try
        {
            obj = a.optJSONArray("QUIC_HINTS");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        jsonarray = ((JSONArray) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        jsonarray = new JSONArray();
        a.put("QUIC_HINTS", jsonarray);
        obj = new JSONObject();
        ((JSONObject) (obj)).put("QUIC_HINT_HOST", s);
        ((JSONObject) (obj)).put("QUIC_HINT_PORT", 443);
        ((JSONObject) (obj)).put("QUIC_HINT_ALT_PORT", 443);
        jsonarray.put(obj);
        return this;
    }

    public final a a(String s, String s1)
    {
        try
        {
            a.put(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final a a(String s, boolean flag)
    {
        try
        {
            a.put(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public String toString()
    {
        return a.toString();
    }

    public (Context context)
    {
        b = context;
        a("ENABLE_LEGACY_MODE", false);
        a("ENABLE_QUIC", false);
        a("ENABLE_SPDY", true);
        a("ENABLE_SDCH", false);
        a(0, 0L);
    }
}

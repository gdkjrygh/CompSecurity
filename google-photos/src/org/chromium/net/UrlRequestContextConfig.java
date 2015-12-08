// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;

public class UrlRequestContextConfig
{

    final JSONObject a = new JSONObject();

    public UrlRequestContextConfig()
    {
        a("ENABLE_LEGACY_MODE", false);
        a("ENABLE_QUIC", false);
        a("ENABLE_SPDY", true);
        a("ENABLE_SDCH", false);
        a(0, 0L);
    }

    private UrlRequestContextConfig a(String s, long l)
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

    public final String a()
    {
        return a.optString("USER_AGENT");
    }

    public final UrlRequestContextConfig a(int i, long l)
    {
        if (!a.optString("STORAGE_PATH").isEmpty())
        {
            throw new IllegalArgumentException("Storage path must be empty");
        } else
        {
            a("LOAD_DISABLE_CACHE", true);
            a("HTTP_CACHE_MAX_SIZE", l);
            return a("HTTP_CACHE", "HTTP_CACHE_DISABLED");
        }
    }

    UrlRequestContextConfig a(String s, String s1)
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

    public UrlRequestContextConfig a(String s, boolean flag)
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

    final boolean b()
    {
        return a.optBoolean("ENABLE_LEGACY_MODE");
    }

    public String toString()
    {
        return a.toString();
    }
}

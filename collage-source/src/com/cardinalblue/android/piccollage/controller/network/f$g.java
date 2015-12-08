// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.network:
//            f

public static class b extends b
{

    private final int a;
    private final boolean b;

    public static b a(String s)
    {
        try
        {
            s = (new JSONObject(s)).getJSONObject("error");
            s = new <init>(s.getString("message"), s.getBoolean("refresh_access_token"), s.getString("provider"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private int b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ("cb".equalsIgnoreCase(s))
            {
                return 0;
            }
            if ("facebook".equalsIgnoreCase(s))
            {
                return 1;
            }
            if ("twitter".equalsIgnoreCase(s))
            {
                return 2;
            }
            if ("tumblr".equalsIgnoreCase(s))
            {
                return 4;
            }
        }
        return -1;
    }

    public boolean a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }

    public (String s, boolean flag, String s1)
    {
        super(s);
        b = flag;
        a = b(s1);
    }
}

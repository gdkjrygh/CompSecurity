// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.b;

import org.a.d.f;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.b:
//            c

public class a
    implements org.a.c.a
{

    public a()
    {
    }

    public f a(String s)
    {
        org.a.f.a.a(s, "Cannot extract a token from a null or empty String");
        try
        {
            s = new JSONObject(s);
            long l = System.currentTimeMillis();
            long l1 = s.getInt("expires_in") * 1000;
            s = new c(s.getString("access_token"), s.getString("refresh_token"), l + l1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new org.a.b.a(s.getMessage(), s);
        }
        return s;
    }
}

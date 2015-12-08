// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.g;
import com.android.volley.i;
import com.android.volley.m;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//            k, e

public class j extends k
{

    public j(int l, String s, com.android.volley.m.b b, com.android.volley.m.a a1)
    {
        super(l, s, null, b, a1);
    }

    protected m a(g g1)
    {
        try
        {
            g1 = m.a(new JSONObject(new String(g1.b, e.a(g1.c, "utf-8"))), e.a(g1));
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            return m.a(new i(g1));
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            return m.a(new i(g1));
        }
        return g1;
    }
}

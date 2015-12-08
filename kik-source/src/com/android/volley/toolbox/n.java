// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.r;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.android.volley.toolbox:
//            p, f

public class n extends p
{

    public n(String s, com.android.volley.r.b b, com.android.volley.r.a a1)
    {
        super(s, b, a1);
    }

    protected r a(k k1)
    {
        try
        {
            k1 = r.a(new JSONArray(new String(k1.b, f.a(k1.c))), f.a(k1));
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            return r.a(new m(k1));
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            return r.a(new m(k1));
        }
        return k1;
    }
}

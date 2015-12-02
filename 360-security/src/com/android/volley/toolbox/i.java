// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.ParseError;
import com.android.volley.k;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//            j, d

public class i extends j
{

    public i(int l, String s, String s1, com.android.volley.k.b b, com.android.volley.k.a a1)
    {
        super(l, s, s1, b, a1);
    }

    protected k a(com.android.volley.i l)
    {
        try
        {
            l = k.a(new JSONObject(new String(l.b, d.a(l.c))), d.a(l));
        }
        // Misplaced declaration of an exception variable
        catch (com.android.volley.i l)
        {
            return k.a(new ParseError(l));
        }
        // Misplaced declaration of an exception variable
        catch (com.android.volley.i l)
        {
            return k.a(new ParseError(l));
        }
        return l;
    }
}

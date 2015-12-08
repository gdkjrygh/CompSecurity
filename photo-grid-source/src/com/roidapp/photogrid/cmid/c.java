// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cmid;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cmid:
//            a

public final class c
{

    final a a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    public c(a a1, String s)
    {
        a = a1;
        super();
        try
        {
            a1 = new JSONObject(s);
            b = a1.optString("regist_sid");
            c = a1.optString("regist_sid_sig");
            d = a1.optString("third_sid");
            e = a1.optString("third_sid_sig");
            f = a1.optString("login_sid");
            g = a1.optString("login_sid_sig");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
        }
    }

    public final String a()
    {
        return d;
    }

    public final String b()
    {
        return e;
    }

    public final String c()
    {
        return f;
    }

    public final String d()
    {
        return g;
    }
}

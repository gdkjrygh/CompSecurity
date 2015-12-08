// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cmid;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cmid:
//            a

public final class b
{

    final a a;
    private String b;
    private String c;

    public b(a a1, String s)
    {
        a = a1;
        super();
        try
        {
            a1 = new JSONObject(s);
            c = a1.optString("sid");
            b = a1.optString("sso_token");
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
        return c;
    }
}

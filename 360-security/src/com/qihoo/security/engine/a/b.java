// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import java.util.ArrayList;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.engine.a:
//            a

public class b
{

    public final a a;
    private final String b;
    private String c;
    private final int d;
    private final ArrayList e;
    private final ArrayList f;

    b(String s, String s1, int i, a a1, ArrayList arraylist, ArrayList arraylist1)
    {
        b = s;
        c = s1;
        d = i;
        a = a1;
        e = arraylist;
        f = arraylist1;
    }

    public static b a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        try
        {
            jsonobject = new b(jsonobject.getString("name"), jsonobject.getString("des"), jsonobject.getInt("ris"), com.qihoo.security.engine.a.a.a(jsonobject.getJSONArray("fbs")), null, null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    public static boolean a(int i, int j)
    {
        return (j & i) != 0;
    }

    public int a()
    {
        return d;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }
}

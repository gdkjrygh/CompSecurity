// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.a.a.a.a.d;
import com.a.a.a.a.g;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            aa

public static final class 
{

    public static JSONObject a(g g1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("receipt", g1.e.a);
            jsonobject.put("signature", g1.e.b);
            String.format("Translated subscription purchase to JSON: [%s]", new Object[] {
                jsonobject.toString()
            });
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            g1.getMessage();
            return jsonobject;
        }
        return jsonobject;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            go

final class fm
{

    fm()
    {
    }

    public static boolean a(JSONObject jsonobject)
    {
        return go.a(jsonobject, "Response.request.failed", null) != null;
    }

    public static String b(JSONObject jsonobject)
    {
        return go.a(jsonobject, "Response.request.failed", "Request failed");
    }

    public static boolean c(JSONObject jsonobject)
    {
        jsonobject = go.a(jsonobject, "Response.request.failed", null);
        return jsonobject != null && jsonobject.matches(".*Exception.*session.*expired.*");
    }
}

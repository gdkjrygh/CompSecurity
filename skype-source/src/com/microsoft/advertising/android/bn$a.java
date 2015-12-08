// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.advertising.android:
//            bn, av

private static final class d
{

    public static int a = 0;
    public static int b = -1;
    private final int c;
    private final String d;

    public static d a(JSONObject jsonobject)
    {
        String s;
        int j;
        j = b;
        s = "Failed to parse error code";
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        int i = j;
        if (!jsonobject.has("err"))
        {
            return null;
        }
        i = j;
        jsonobject = jsonobject.getJSONObject("err");
        if (jsonobject == null) goto _L2; else goto _L3
_L3:
        i = j;
        j = jsonobject.getInt("c");
        i = j;
        jsonobject = jsonobject.getString("m");
        i = j;
_L4:
        return new <init>(i, jsonobject);
        jsonobject;
        av.c("PolymorphicAdBuilder", jsonobject.toString());
        jsonobject = s;
        if (true) goto _L4; else goto _L2
_L2:
        return null;
    }

    public final int a()
    {
        return c;
    }

    public final String toString()
    {
        return String.format(Locale.ENGLISH, "Code=%d message=%s", new Object[] {
            Integer.valueOf(c), d
        });
    }


    private (int i, String s)
    {
        c = i;
        d = s;
    }
}

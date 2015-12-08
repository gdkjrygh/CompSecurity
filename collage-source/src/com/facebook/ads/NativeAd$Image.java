// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import org.json.JSONObject;

// Referenced classes of package com.facebook.ads:
//            NativeAd

public static class c
{

    private final String a;
    private final int b;
    private final int c;

    public static c fromJSONObject(JSONObject jsonobject)
    {
        String s;
        if (jsonobject != null)
        {
            if ((s = jsonobject.optString("url")) != null)
            {
                return new <init>(s, jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
            }
        }
        return null;
    }

    public int getHeight()
    {
        return c;
    }

    public String getUrl()
    {
        return a;
    }

    public int getWidth()
    {
        return b;
    }

    private (String s, int i, int j)
    {
        a = s;
        b = i;
        c = j;
    }
}

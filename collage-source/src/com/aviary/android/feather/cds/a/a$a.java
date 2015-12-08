// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            a

public static class c
{

    final String a;
    final String b;
    final byte c[];

    public static c a(JSONObject jsonobject)
        throws JSONException
    {
        return new <init>(jsonobject.getString("identifier"), jsonobject.getString("displayName"), jsonobject.optJSONObject("options"));
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public byte[] c()
    {
        return c;
    }

    public String toString()
    {
        if (c != null)
        {
            return (new StringBuilder()).append("{").append(a).append(", ").append(b).append(", ").append(c).append("}").toString();
        } else
        {
            return (new StringBuilder()).append("{").append(a).append(", ").append(b).append("}").toString();
        }
    }

    (String s, String s1, JSONObject jsonobject)
    {
        a = s;
        b = s1;
        if (jsonobject != null)
        {
            c = jsonobject.toString().getBytes();
            return;
        } else
        {
            c = null;
            return;
        }
    }
}

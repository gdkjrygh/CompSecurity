// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            c

public static class b
{

    final String a;
    final String b;

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ManifestPackItem{ identifier: ").append(a).append(", versionKey: ").append(b).append("}").toString();
    }

    public (JSONObject jsonobject, boolean flag)
        throws JSONException
    {
        a = jsonobject.getString("identifier");
        if (flag)
        {
            b = jsonobject.getString("versionKey");
            return;
        } else
        {
            b = jsonobject.optString("versionKey");
            return;
        }
    }
}

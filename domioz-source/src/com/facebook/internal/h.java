// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            j

final class h
    implements j
{

    h()
    {
    }

    public final void a(Bundle bundle, String s, Object obj)
    {
        throw new IllegalArgumentException("Unexpected type from JSON");
    }

    public final void a(JSONObject jsonobject, String s, Object obj)
    {
        JSONArray jsonarray = new JSONArray();
        obj = (String[])obj;
        int k = obj.length;
        for (int i = 0; i < k; i++)
        {
            jsonarray.put(obj[i]);
        }

        jsonobject.put(s, jsonarray);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import kik.a.d.x;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kik.android.stickers:
//            a

public final class b
{

    public static x a(JSONObject jsonobject)
    {
        String s;
        String s1;
        String s2;
        ArrayList arraylist;
        if (jsonobject == null)
        {
            return null;
        }
        s1 = jsonobject.optString("title");
        s = jsonobject.optString("icon");
        s2 = jsonobject.optString("storeLink");
        arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("stickers");
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                kik.a.d.w w = com.kik.android.stickers.a.a(jsonobject.optJSONObject(i));
                if (w != null)
                {
                    arraylist.add(w);
                }
            }

        }
        new URL(s);
        jsonobject = s;
_L2:
        return new x(s1, jsonobject, s2, new ArrayList(arraylist));
        jsonobject;
        jsonobject = "";
        if (true) goto _L2; else goto _L1
_L1:
    }
}

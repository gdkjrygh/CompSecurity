// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            au

public final class ao
{

    public final String eP;
    public final List eQ;
    public final String eR;
    public final String eS;
    public final List eT;

    public ao(JSONObject jsonobject)
        throws JSONException
    {
        eP = jsonobject.getString("id");
        JSONArray jsonarray = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(jsonarray.getString(i));
        }

        eQ = Collections.unmodifiableList(arraylist);
        eR = jsonobject.optString("allocation_id", null);
        eT = au.a(jsonobject, "imp_urls");
        jsonobject = jsonobject.optJSONObject("data");
        if (jsonobject != null)
        {
            jsonobject = jsonobject.toString();
        } else
        {
            jsonobject = null;
        }
        eS = jsonobject;
    }
}

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
//            bo

public final class bi
{

    public final String mW;
    public final String mX;
    public final List mY;
    public final String mZ;
    public final List na;
    public final String nb;

    public bi(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        super();
        mX = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            arraylist.add(((JSONArray) (obj)).getString(i));
        }

        mY = Collections.unmodifiableList(arraylist);
        mZ = jsonobject.optString("allocation_id", null);
        na = bo.a(jsonobject, "imp_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        mW = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        }
        nb = jsonobject;
    }
}

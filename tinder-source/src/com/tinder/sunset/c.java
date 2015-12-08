// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.support.v4.g.g;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.sunset:
//            SunsetMoment

public final class c
{

    public static g a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        String s;
        String s1;
        String s2;
        JSONObject jsonobject1;
        int i;
        long l;
        try
        {
            s = jsonobject.optString("last_activity_date");
            jsonobject = jsonobject.getJSONArray("moments");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            v.b(jsonobject.toString());
            return null;
        }
        i = 0;
        if (i >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonobject.getJSONObject(i);
        s1 = jsonobject1.optString("_id");
        s2 = jsonobject1.optString("created_by");
        l = DateUtils.a(jsonobject1.optString("date"));
        jsonobject1 = jsonobject1.optJSONObject("media").getJSONObject("processedFiles");
        arraylist.add(new SunsetMoment(s1, s2, l, jsonobject1.optString("large"), jsonobject1.optString("medium"), jsonobject1.optString("orig")));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_25;
_L1:
        jsonobject = new g(s, arraylist);
        return jsonobject;
    }
}

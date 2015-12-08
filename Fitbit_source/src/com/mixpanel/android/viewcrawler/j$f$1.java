// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import com.mixpanel.android.mpmetrics.o;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            j

class a
    implements o
{

    final JSONObject a;
    final a b;

    public JSONObject a(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("$experiments", a);
        }
        catch (JSONException jsonexception)
        {
            Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    ( , JSONObject jsonobject)
    {
        b = ;
        a = jsonobject;
        super();
    }
}

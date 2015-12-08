// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.h;
import com.mixpanel.android.mpmetrics.o;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            j

private static class a
{

    private final h a;

    public void a(Set set)
    {
        if (set.size() == 0)
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            int i;
            int k;
            for (set = set.iterator(); set.hasNext(); jsonobject.put(Integer.toString(i), k))
            {
                Object obj = (Pair)set.next();
                i = ((Integer)((Pair) (obj)).first).intValue();
                k = ((Integer)((Pair) (obj)).second).intValue();
                obj = new JSONObject();
                ((JSONObject) (obj)).put("$experiment_id", i);
                ((JSONObject) (obj)).put("$variant_id", k);
                a.a("$experiment_started", ((JSONObject) (obj)));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", set);
        }
        a.e().a("$experiments", jsonobject);
        a.a(new o(jsonobject) {

            final JSONObject a;
            final j.f b;

            public JSONObject a(JSONObject jsonobject1)
            {
                try
                {
                    jsonobject1.put("$experiments", a);
                }
                catch (JSONException jsonexception)
                {
                    Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
                    return jsonobject1;
                }
                return jsonobject1;
            }

            
            {
                b = j.f.this;
                a = jsonobject;
                super();
            }
        });
    }

    public _cls1.a(h h1)
    {
        a = h1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aea
{

    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public aea(JSONObject jsonobject)
    {
        Object obj1 = null;
        super();
        b = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int j = 0; j < ((JSONArray) (obj)).length(); j++)
        {
            arraylist.add(((JSONArray) (obj)).getString(j));
        }

        c = Collections.unmodifiableList(arraylist);
        d = jsonobject.optString("allocation_id", null);
        ot.o();
        f = aeh.a(jsonobject, "clickurl");
        ot.o();
        g = aeh.a(jsonobject, "imp_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        a = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        } else
        {
            jsonobject = null;
        }
        h = jsonobject;
        if (obj != null && !((JSONObject) (obj)).isNull("equivalent_ad_network_id"))
        {
            i = ((JSONObject) (obj)).optString("equivalent_ad_network_id", b);
        } else
        {
            i = b;
        }
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).optString("class_name");
        }
        e = jsonobject;
    }
}

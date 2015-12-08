// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dc;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.dc:
//            a

public class e
{

    private a a;
    private List b;

    public e(JSONObject jsonobject)
        throws JSONException
    {
        a = null;
        b = null;
        a = new a(jsonobject.getJSONObject("aLaCartePurchasedProduct"));
        jsonobject = jsonobject.optJSONArray("aLaCarteActiveBenefits");
        if (jsonobject != null)
        {
            b = new ArrayList();
            for (int i = 0; i < jsonobject.length(); i++)
            {
                b.add(new a(jsonobject.getJSONObject(i)));
            }

        }
    }

    public e(a a1, List list)
    {
        a = null;
        b = null;
        a = a1;
        b = list;
    }

    public a a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }
}

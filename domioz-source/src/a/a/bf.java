// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import org.json.JSONObject;

// Referenced classes of package a.a:
//            bo, bq, az

public final class bf
{

    public final bo a;
    public final bq b;

    public bf(JSONObject jsonobject, az az)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("extras");
        if (jsonobject1 != null)
        {
            a = new bo(jsonobject1, az);
        } else
        {
            a = null;
        }
        jsonobject = jsonobject.optJSONObject("result");
        if (jsonobject != null)
        {
            b = new bq(jsonobject);
            return;
        } else
        {
            b = null;
            return;
        }
    }
}

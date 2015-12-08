// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ct, cv, cd

public final class ck
{

    public final ct a;
    public final cv b;

    public ck(JSONObject jsonobject, cd cd)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("extras");
        if (jsonobject1 != null)
        {
            a = new ct(jsonobject1, cd);
        } else
        {
            a = null;
        }
        jsonobject = jsonobject.optJSONObject("result");
        if (jsonobject != null)
        {
            b = new cv(jsonobject);
            return;
        } else
        {
            b = null;
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cn, cp, bx

public final class ce
{

    public final cn a;
    public final cp b;

    public ce(JSONObject jsonobject, bx bx)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("extras");
        if (jsonobject1 != null)
        {
            a = new cn(jsonobject1, bx);
        } else
        {
            a = null;
        }
        jsonobject = jsonobject.optJSONObject("result");
        if (jsonobject != null)
        {
            b = new cp(jsonobject);
            return;
        } else
        {
            b = null;
            return;
        }
    }
}

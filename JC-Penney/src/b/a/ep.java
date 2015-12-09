// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            dl, o, eo, eu

public final class ep
{

    public static eo a(o o1)
    {
        JSONObject jsonobject;
        Object obj;
        jsonobject = null;
        obj = o1.a(dl.i.a(), dl.i.b());
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            eu.b();
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = ((JSONObject) (obj));
_L4:
        if (jsonobject != null)
        {
            flag = jsonobject.optBoolean("optOutStatusSet", false);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag = jsonobject.optBoolean("optOutStatus", false);
        } else
        {
            flag = o1.c(dl.l.a(), dl.l.b());
        }
        return new eo(flag);
_L2:
        jsonobject = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

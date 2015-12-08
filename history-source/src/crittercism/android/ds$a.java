// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ds, cq, ax, dx

public static final class 
{

    public static ds a(ax ax1)
    {
        JSONObject jsonobject;
        Object obj;
        jsonobject = null;
        obj = ax1.a(cq.i.a(), cq.i.b());
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            dx.b();
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
            flag = ax1.c(cq.l.a(), cq.l.b());
        }
        return new ds(flag);
_L2:
        jsonobject = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

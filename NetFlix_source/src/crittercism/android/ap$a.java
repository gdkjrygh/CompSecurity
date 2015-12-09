// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ap, ae, h

public static final class 
{

    public static ap a(h h1)
    {
        JSONObject jsonobject;
        Object obj;
        jsonobject = null;
        obj = h1.a(ae.f.a(), ae.f.b(), null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new JSONObject(((String) (obj)));
        jsonobject = ((JSONObject) (obj));
_L4:
        boolean flag;
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
            flag = h1.b(ae.k.a(), ae.k.b());
        }
        return new ap(flag, (byte)0);
_L2:
        jsonobject = null;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ()
    {
    }
}

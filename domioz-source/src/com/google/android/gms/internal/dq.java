// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fj

public final class dq
{

    public dq()
    {
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new JSONObject(s)).getString("developerPayload");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            fj.e("Fail to parse purchase data");
            return null;
        }
        return s;
    }
}

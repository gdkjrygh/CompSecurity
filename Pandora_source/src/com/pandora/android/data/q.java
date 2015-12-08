// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import org.json.JSONObject;

// Referenced classes of package com.pandora.android.data:
//            p

public class q
    implements p
{

    private final String a;
    private final String b;
    private final String c;

    public q(JSONObject jsonobject)
    {
        a = jsonobject.optString("baseUrlKey");
        b = jsonobject.optString("remainingUrl");
        c = jsonobject.optString("limitAdTrackingReplacementString");
    }

    public String o()
    {
        return a;
    }

    public String p()
    {
        return b;
    }

    public String q()
    {
        return c;
    }
}

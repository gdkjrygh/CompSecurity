// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import org.json.JSONObject;

// Referenced classes of package com.tinder.a:
//            d

public final class g extends d
{

    private com.android.volley.Request.Priority m;

    public g(com.android.volley.Request.Priority priority, int j, String s, JSONObject jsonobject, com.android.volley.i.b b, com.android.volley.i.a a, String s1)
    {
        super(j, s, jsonobject, b, a, s1);
        m = priority;
    }

    public final com.android.volley.Request.Priority i()
    {
        if (m == null)
        {
            return super.i();
        } else
        {
            return m;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ev

public final class aa
{

    private final String lo;
    private final JSONObject lp;
    private final String lq;
    private final String lr;

    public aa(String s, ev ev1, String s1, JSONObject jsonobject)
    {
        lr = ev1.sw;
        lp = jsonobject;
        lq = s;
        lo = s1;
    }

    public String ar()
    {
        return lo;
    }

    public String as()
    {
        return lr;
    }

    public JSONObject at()
    {
        return lp;
    }

    public String au()
    {
        return lq;
    }
}

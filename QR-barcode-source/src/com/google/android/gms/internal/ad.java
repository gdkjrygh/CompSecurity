// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gt

public final class ad
{

    private final String ms;
    private final JSONObject mt;
    private final String mu;
    private final String mv;

    public ad(String s, gt gt1, String s1, JSONObject jsonobject)
    {
        mv = gt1.wD;
        mt = jsonobject;
        mu = s;
        ms = s1;
    }

    public String aA()
    {
        return mv;
    }

    public JSONObject aB()
    {
        return mt;
    }

    public String aC()
    {
        return mu;
    }

    public String az()
    {
        return ms;
    }
}

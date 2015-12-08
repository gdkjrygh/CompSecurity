// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gs

public final class ad
{

    private final String mD;
    private final JSONObject mE;
    private final String mF;
    private final String mG;

    public ad(String s, gs gs1, String s1, JSONObject jsonobject)
    {
        mG = gs1.wS;
        mE = jsonobject;
        mF = s;
        mD = s1;
    }

    public String aE()
    {
        return mD;
    }

    public String aF()
    {
        return mG;
    }

    public JSONObject aG()
    {
        return mE;
    }

    public String aH()
    {
        return mF;
    }
}

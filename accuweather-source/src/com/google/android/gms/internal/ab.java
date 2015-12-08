// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ew

public final class ab
{

    private final String lm;
    private final JSONObject ln;
    private final String lo;
    private final String lp;

    public ab(String s, ew ew1, String s1, JSONObject jsonobject)
    {
        lp = ew1.st;
        ln = jsonobject;
        lo = s;
        lm = s1;
    }

    public String am()
    {
        return lm;
    }

    public String an()
    {
        return lp;
    }

    public JSONObject ao()
    {
        return ln;
    }

    public String ap()
    {
        return lo;
    }
}

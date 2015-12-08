// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dx

public final class z
{

    private final String le;
    private final JSONObject lf;
    private final String lg;
    private final String lh;

    public z(String s, dx dx1, String s1, JSONObject jsonobject)
    {
        lh = dx1.rq;
        lf = jsonobject;
        lg = s;
        le = s1;
    }

    public String al()
    {
        return le;
    }

    public String am()
    {
        return lh;
    }

    public JSONObject an()
    {
        return lf;
    }

    public String ao()
    {
        return lg;
    }
}

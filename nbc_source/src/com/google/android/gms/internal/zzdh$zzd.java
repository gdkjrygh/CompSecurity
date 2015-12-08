// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzdh

static class zzvj
{

    private final String zzvj;
    private final String zzwl;
    private final int zzws;
    private final List zzwt;

    public String getBody()
    {
        return zzvj;
    }

    public int getResponseCode()
    {
        return zzws;
    }

    public String zzdJ()
    {
        return zzwl;
    }

    public Iterable zzdO()
    {
        return zzwt;
    }

    public (String s, int i, List list, String s1)
    {
        zzwl = s;
        zzws = i;
        if (list == null)
        {
            zzwt = new ArrayList();
        } else
        {
            zzwt = list;
        }
        zzvj = s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
import p.bq.i;

public final class CustomEventExtras
    implements i
{

    private final HashMap zzDM = new HashMap();

    public CustomEventExtras()
    {
    }

    public Object getExtra(String s)
    {
        return zzDM.get(s);
    }

    public void setExtra(String s, Object obj)
    {
        zzDM.put(s, obj);
    }
}

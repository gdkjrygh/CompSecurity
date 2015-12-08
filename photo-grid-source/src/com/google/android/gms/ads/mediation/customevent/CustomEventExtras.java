// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
    implements NetworkExtras
{

    private final HashMap a = new HashMap();

    public CustomEventExtras()
    {
    }

    public final Object getExtra(String s)
    {
        return a.get(s);
    }

    public final void setExtra(String s, Object obj)
    {
        a.put(s, obj);
    }
}

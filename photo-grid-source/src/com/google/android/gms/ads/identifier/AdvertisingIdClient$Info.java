// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


public final class zzon
{

    private final String zzom;
    private final boolean zzon;

    public final String getId()
    {
        return zzom;
    }

    public final boolean isLimitAdTrackingEnabled()
    {
        return zzon;
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(zzom).append("}").append(zzon).toString();
    }

    public (String s, boolean flag)
    {
        zzom = s;
        zzon = flag;
    }
}

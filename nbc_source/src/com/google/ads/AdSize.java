// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class AdSize
{

    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    private final com.google.android.gms.ads.AdSize zzaK;

    private AdSize(int i, int j, String s)
    {
        this(new com.google.android.gms.ads.AdSize(i, j));
    }

    public AdSize(com.google.android.gms.ads.AdSize adsize)
    {
        zzaK = adsize;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof AdSize))
        {
            return false;
        } else
        {
            obj = (AdSize)obj;
            return zzaK.equals(((AdSize) (obj)).zzaK);
        }
    }

    public int getHeight()
    {
        return zzaK.getHeight();
    }

    public int getWidth()
    {
        return zzaK.getWidth();
    }

    public int hashCode()
    {
        return zzaK.hashCode();
    }

    public String toString()
    {
        return zzaK.toString();
    }

}

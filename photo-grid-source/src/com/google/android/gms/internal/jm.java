// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class jm
    implements NativeMediationAdRequest
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final NativeAdOptionsParcel g;
    private final List h;

    public jm(Date date, int i, Set set, Location location, boolean flag, int j, NativeAdOptionsParcel nativeadoptionsparcel, 
            List list)
    {
        a = date;
        b = i;
        c = set;
        e = location;
        d = flag;
        f = j;
        g = nativeadoptionsparcel;
        h = list;
    }

    public final Date getBirthday()
    {
        return a;
    }

    public final int getGender()
    {
        return b;
    }

    public final Set getKeywords()
    {
        return c;
    }

    public final Location getLocation()
    {
        return e;
    }

    public final NativeAdOptions getNativeAdOptions()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return (new com.google.android.gms.ads.formats.NativeAdOptions.Builder()).setReturnUrlsForImageAssets(g.zzwR).setImageOrientation(g.zzwS).setRequestMultipleImages(g.zzwT).build();
        }
    }

    public final boolean isAppInstallAdRequested()
    {
        return h != null && h.contains("2");
    }

    public final boolean isContentAdRequested()
    {
        return h != null && h.contains("1");
    }

    public final boolean isTesting()
    {
        return d;
    }

    public final int taggedForChildDirectedTreatment()
    {
        return f;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            NativeAdMapper

public abstract class NativeAppInstallAdMapper extends NativeAdMapper
{

    private com.google.android.gms.ads.formats.NativeAd.Image zzKJ;
    private String zzwo;
    private List zzwp;
    private String zzwq;
    private String zzws;
    private double zzwt;
    private String zzwu;
    private String zzwv;

    public NativeAppInstallAdMapper()
    {
    }

    public final String getBody()
    {
        return zzwq;
    }

    public final String getCallToAction()
    {
        return zzws;
    }

    public final String getHeadline()
    {
        return zzwo;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
    {
        return zzKJ;
    }

    public final List getImages()
    {
        return zzwp;
    }

    public final String getPrice()
    {
        return zzwv;
    }

    public final double getStarRating()
    {
        return zzwt;
    }

    public final String getStore()
    {
        return zzwu;
    }

    public final void setBody(String s)
    {
        zzwq = s;
    }

    public final void setCallToAction(String s)
    {
        zzws = s;
    }

    public final void setHeadline(String s)
    {
        zzwo = s;
    }

    public final void setIcon(com.google.android.gms.ads.formats.NativeAd.Image image)
    {
        zzKJ = image;
    }

    public final void setImages(List list)
    {
        zzwp = list;
    }

    public final void setPrice(String s)
    {
        zzwv = s;
    }

    public final void setStarRating(double d)
    {
        zzwt = d;
    }

    public final void setStore(String s)
    {
        zzwu = s;
    }
}

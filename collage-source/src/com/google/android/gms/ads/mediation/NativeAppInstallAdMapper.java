// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            NativeAdMapper

public abstract class NativeAppInstallAdMapper extends NativeAdMapper
{

    private com.google.android.gms.ads.formats.NativeAd.Image zzJE;
    private String zzvK;
    private List zzvL;
    private String zzvM;
    private String zzvO;
    private double zzvP;
    private String zzvQ;
    private String zzvR;

    public NativeAppInstallAdMapper()
    {
    }

    public final String getBody()
    {
        return zzvM;
    }

    public final String getCallToAction()
    {
        return zzvO;
    }

    public final String getHeadline()
    {
        return zzvK;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
    {
        return zzJE;
    }

    public final List getImages()
    {
        return zzvL;
    }

    public final String getPrice()
    {
        return zzvR;
    }

    public final double getStarRating()
    {
        return zzvP;
    }

    public final String getStore()
    {
        return zzvQ;
    }

    public final void setBody(String s)
    {
        zzvM = s;
    }

    public final void setCallToAction(String s)
    {
        zzvO = s;
    }

    public final void setHeadline(String s)
    {
        zzvK = s;
    }

    public final void setIcon(com.google.android.gms.ads.formats.NativeAd.Image image)
    {
        zzJE = image;
    }

    public final void setImages(List list)
    {
        zzvL = list;
    }

    public final void setPrice(String s)
    {
        zzvR = s;
    }

    public final void setStarRating(double d)
    {
        zzvP = d;
    }

    public final void setStore(String s)
    {
        zzvQ = s;
    }
}

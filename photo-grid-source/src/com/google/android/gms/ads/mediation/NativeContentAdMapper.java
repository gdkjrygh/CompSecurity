// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            NativeAdMapper

public abstract class NativeContentAdMapper extends NativeAdMapper
{

    private com.google.android.gms.ads.formats.NativeAd.Image zzKK;
    private String zzwo;
    private List zzwp;
    private String zzwq;
    private String zzws;
    private String zzwz;

    public NativeContentAdMapper()
    {
    }

    public final String getAdvertiser()
    {
        return zzwz;
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

    public final List getImages()
    {
        return zzwp;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getLogo()
    {
        return zzKK;
    }

    public final void setAdvertiser(String s)
    {
        zzwz = s;
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

    public final void setImages(List list)
    {
        zzwp = list;
    }

    public final void setLogo(com.google.android.gms.ads.formats.NativeAd.Image image)
    {
        zzKK = image;
    }
}

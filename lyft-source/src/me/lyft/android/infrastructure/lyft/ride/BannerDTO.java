// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;


// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            BannerItemDTO

public class BannerDTO
{

    public final BannerItemDTO bannerItem;
    public final String rideType;

    public BannerDTO(String s, BannerItemDTO banneritemdto)
    {
        rideType = s;
        bannerItem = banneritemdto;
    }
}

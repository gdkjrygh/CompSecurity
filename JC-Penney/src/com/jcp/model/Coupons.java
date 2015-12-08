// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


// Referenced classes of package com.jcp.model:
//            Offers

public class Coupons
{

    private String code;
    private String detailDesktopURL;
    private String detailMobileURL;
    private String detailTabletURL;
    private String detailTitle;
    private String group;
    private String inStore;
    private String inStoreOnlineOnly;
    private String name;
    private String offSiteDate;
    private Offers offers[];
    private String onSiteDate;
    private String onlineOnly;
    private String shopDesktopURL;
    private String shopMobileURL;
    private String shopTabletURL;
    private String shopTitle;
    private String validTill;

    public Coupons()
    {
    }

    public String getCode()
    {
        if (code != null)
        {
            return code;
        } else
        {
            return "";
        }
    }

    public String getDetailDesktopURL()
    {
        return detailDesktopURL;
    }

    public String getDetailMobileURL()
    {
        return detailMobileURL;
    }

    public String getDetailTabletURL()
    {
        return detailTabletURL;
    }

    public String getDetailTitle()
    {
        return detailTitle;
    }

    public String getGroup()
    {
        return group;
    }

    public String getInStore()
    {
        return inStore;
    }

    public String getInStoreOnlineOnly()
    {
        return inStoreOnlineOnly;
    }

    public String getName()
    {
        return name;
    }

    public String getOffSiteDate()
    {
        return offSiteDate;
    }

    public Offers[] getOffers()
    {
        return offers;
    }

    public String getOnSiteDate()
    {
        return onSiteDate;
    }

    public String getOnlineOnly()
    {
        return onlineOnly;
    }

    public String getShopDesktopURL()
    {
        return shopDesktopURL;
    }

    public String getShopMobileURL()
    {
        return shopMobileURL;
    }

    public String getShopTabletURL()
    {
        return shopTabletURL;
    }

    public String getShopTitle()
    {
        return shopTitle;
    }

    public String getValidTill()
    {
        if (validTill != null)
        {
            return validTill;
        } else
        {
            return "";
        }
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setDetailDesktopURL(String s)
    {
        detailDesktopURL = s;
    }

    public void setDetailMobileURL(String s)
    {
        detailMobileURL = s;
    }

    public void setDetailTabletURL(String s)
    {
        detailTabletURL = s;
    }

    public void setDetailTitle(String s)
    {
        detailTitle = s;
    }

    public void setGroup(String s)
    {
        group = s;
    }

    public void setInStore(String s)
    {
        inStore = s;
    }

    public void setInStoreOnlineOnly(String s)
    {
        inStoreOnlineOnly = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOffSiteDate(String s)
    {
        offSiteDate = s;
    }

    public void setOffers(Offers aoffers[])
    {
        offers = aoffers;
    }

    public void setOnSiteDate(String s)
    {
        onSiteDate = s;
    }

    public void setOnlineOnly(String s)
    {
        onlineOnly = s;
    }

    public void setShopDesktopURL(String s)
    {
        shopDesktopURL = s;
    }

    public void setShopMobileURL(String s)
    {
        shopMobileURL = s;
    }

    public void setShopTabletURL(String s)
    {
        shopTabletURL = s;
    }

    public void setShopTitle(String s)
    {
        shopTitle = s;
    }

    public void setValidTill(String s)
    {
        validTill = s;
    }
}

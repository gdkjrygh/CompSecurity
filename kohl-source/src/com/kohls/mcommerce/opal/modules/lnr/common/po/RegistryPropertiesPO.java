// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.po;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.common.po:
//            AutogenratedPropertiesPO

public class RegistryPropertiesPO
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private boolean alertChange;
    private boolean alertPurchase;
    private String babyGender;
    private String channel;
    private String city;
    private String customEventType;
    private String dashboard;
    private String eventLocation;
    private boolean externalChannelRef;
    private boolean externalChannelRefBump;
    private String externalChannelSid;
    private String locationId;
    private String message;
    private boolean monthlynews;
    private boolean news;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerRole;
    private String partnerFirstName;
    private String partnerLastName;
    private String partnerRole;
    private AutogenratedPropertiesPO properties;
    private String regtype;
    private int regtypeId;
    private boolean shareWChannel;
    private String state;
    private boolean viewPurchased;

    public RegistryPropertiesPO()
    {
    }

    public String getBabyGender()
    {
        return babyGender;
    }

    public String getChannel()
    {
        return channel;
    }

    public String getCity()
    {
        return city;
    }

    public String getCustomEventType()
    {
        return customEventType;
    }

    public String getDashboard()
    {
        return dashboard;
    }

    public String getEventLocation()
    {
        return eventLocation;
    }

    public String getExternalChannelSid()
    {
        return externalChannelSid;
    }

    public String getLocationId()
    {
        return locationId;
    }

    public String getMessage()
    {
        return message;
    }

    public String getOwnerFirstName()
    {
        return ownerFirstName;
    }

    public String getOwnerLastName()
    {
        return ownerLastName;
    }

    public String getOwnerRole()
    {
        return ownerRole;
    }

    public String getPartnerFirstName()
    {
        return partnerFirstName;
    }

    public String getPartnerLastName()
    {
        return partnerLastName;
    }

    public String getPartnerRole()
    {
        return partnerRole;
    }

    public AutogenratedPropertiesPO getProperties()
    {
        return properties;
    }

    public String getRegtype()
    {
        return regtype;
    }

    public int getRegtypeId()
    {
        return regtypeId;
    }

    public String getState()
    {
        return state;
    }

    public boolean isAlertChange()
    {
        return alertChange;
    }

    public boolean isAlertPurchase()
    {
        return alertPurchase;
    }

    public boolean isExternalChannelRef()
    {
        return externalChannelRef;
    }

    public boolean isExternalChannelRefBump()
    {
        return externalChannelRefBump;
    }

    public boolean isMonthlynews()
    {
        return monthlynews;
    }

    public boolean isNews()
    {
        return news;
    }

    public boolean isShareWChannel()
    {
        return shareWChannel;
    }

    public boolean isViewPurchased()
    {
        return viewPurchased;
    }

    public void setAlertChange(boolean flag)
    {
        alertChange = flag;
    }

    public void setAlertPurchase(boolean flag)
    {
        alertPurchase = flag;
    }

    public void setBabyGender(String s)
    {
        babyGender = s;
    }

    public void setChannel(String s)
    {
        channel = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCustomEventType(String s)
    {
        customEventType = s;
    }

    public void setDashboard(String s)
    {
        dashboard = s;
    }

    public void setEventLocation(String s)
    {
        eventLocation = s;
    }

    public void setExternalChannelRef(boolean flag)
    {
        externalChannelRef = flag;
    }

    public void setExternalChannelRefBump(boolean flag)
    {
        externalChannelRefBump = flag;
    }

    public void setExternalChannelSid(String s)
    {
        externalChannelSid = s;
    }

    public void setLocationId(String s)
    {
        locationId = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setMonthlynews(boolean flag)
    {
        monthlynews = flag;
    }

    public void setNews(boolean flag)
    {
        news = flag;
    }

    public void setOwnerFirstName(String s)
    {
        ownerFirstName = s;
    }

    public void setOwnerLastName(String s)
    {
        ownerLastName = s;
    }

    public void setOwnerRole(String s)
    {
        ownerRole = s;
    }

    public void setPartnerFirstName(String s)
    {
        partnerFirstName = s;
    }

    public void setPartnerLastName(String s)
    {
        partnerLastName = s;
    }

    public void setPartnerRole(String s)
    {
        partnerRole = s;
    }

    public void setProperties(AutogenratedPropertiesPO autogenratedpropertiespo)
    {
        properties = autogenratedpropertiespo;
    }

    public void setRegtype(String s)
    {
        regtype = s;
    }

    public void setRegtypeId(int i)
    {
        regtypeId = i;
    }

    public void setShareWChannel(boolean flag)
    {
        shareWChannel = flag;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setViewPurchased(boolean flag)
    {
        viewPurchased = flag;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/modules/lnr/common/po/RegistryPropertiesPO$DashboardPO
    /* block-local class not found */
    class DashboardPO {}

}

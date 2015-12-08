// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.po;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.common.po:
//            LoggedInUser, RegistryPropertiesPO, ShipmentAddressPO

public class RegistryPO
    implements Serializable
{
    public class RProperties
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private RegistryPropertiesPO properties;
        private ShipmentAddressPO shipmentAddress;
        final RegistryPO this$0;

        public RegistryPropertiesPO getProperties()
        {
            return properties;
        }

        public ShipmentAddressPO getShipmentAddress()
        {
            return shipmentAddress;
        }

        public void setProperties(RegistryPropertiesPO registrypropertiespo)
        {
            properties = registrypropertiespo;
        }

        public void setShipmentAddress(ShipmentAddressPO shipmentaddresspo)
        {
            shipmentAddress = shipmentaddresspo;
        }

        public RProperties()
        {
            this$0 = RegistryPO.this;
            super();
        }

        public RProperties(ShipmentAddressPO shipmentaddresspo, RegistryPropertiesPO registrypropertiespo)
        {
            this$0 = RegistryPO.this;
            super();
            properties = registrypropertiespo;
            shipmentAddress = shipmentaddresspo;
        }
    }


    private static final long serialVersionUID = 1L;
    float budget;
    String eventDate;
    boolean isPublic;
    private LoggedInUser loggedInUser;
    String promoCode;
    String registryName;
    private RProperties registryProperties;

    public RegistryPO()
    {
    }

    public float getBudget()
    {
        return budget;
    }

    public String getEventDate()
    {
        return eventDate;
    }

    public LoggedInUser getLoggedInUser()
    {
        return loggedInUser;
    }

    public String getPromoCode()
    {
        return promoCode;
    }

    public String getRegistryName()
    {
        return registryName;
    }

    public RProperties getRegistryProperties()
    {
        return registryProperties;
    }

    public boolean isPublic()
    {
        return isPublic;
    }

    public void setBudget(float f)
    {
        budget = f;
    }

    public void setEventDate(String s)
    {
        eventDate = s;
    }

    public void setLoggedInUser(LoggedInUser loggedinuser)
    {
        loggedInUser = loggedinuser;
    }

    public void setPromoCode(String s)
    {
        promoCode = s;
    }

    public void setPublic(boolean flag)
    {
        isPublic = flag;
    }

    public void setRegistryName(String s)
    {
        registryName = s;
    }

    public void setRegistryProperties(RProperties rproperties)
    {
        registryProperties = rproperties;
    }
}

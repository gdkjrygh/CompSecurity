// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.po;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.common.po:
//            RegistryPO, RegistryPropertiesPO, ShipmentAddressPO

public class shipmentAddress
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

    public ()
    {
        this$0 = RegistryPO.this;
        super();
    }

    public this._cls0(ShipmentAddressPO shipmentaddresspo, RegistryPropertiesPO registrypropertiespo)
    {
        this$0 = RegistryPO.this;
        super();
        properties = registrypropertiespo;
        shipmentAddress = shipmentaddresspo;
    }
}

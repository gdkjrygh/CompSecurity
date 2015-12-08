// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.model:
//            MetadataObject

public abstract class SourceAwareMetadataObject extends MetadataObject
{
    public static final class Fields
    {

        public static final String DELIVERY_TYPE = "deliveryType";

        public Fields()
        {
        }
    }


    public SourceAwareMetadataObject(Map map)
    {
        super(map);
    }

    protected final void a(DeliveryType deliverytype)
    {
        if (deliverytype == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("deliveryTypeRequired"));
        } else
        {
            a.put("deliveryType", deliverytype);
            return;
        }
    }

    public DeliveryType getDeliveryType()
    {
        Object obj = a.get("deliveryType");
        if (obj != null && (obj instanceof DeliveryType))
        {
            return (DeliveryType)obj;
        } else
        {
            return DeliveryType.UNKNOWN;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class AddressSerializer
    implements ae
{

    public AddressSerializer()
    {
    }

    public w serialize(LabsAddress labsaddress, Type type, ad ad)
    {
        ad = new z();
        if (StringHelper.isNotEmpty(labsaddress.getStreet()))
        {
            ad.a("Street", labsaddress.getStreet());
        }
        if (StringHelper.isNotEmpty(labsaddress.getUnitType()))
        {
            ad.a("UnitType", labsaddress.getUnitType());
        }
        if (StringHelper.isNotEmpty(labsaddress.getUnitNumber()))
        {
            ad.a("UnitNumber", labsaddress.getUnitNumber());
        }
        if (StringHelper.isNotEmpty(labsaddress.getAddressType()))
        {
            ad.a("AddressType", labsaddress.getAddressType());
        }
        if (StringHelper.isNotEmpty(labsaddress.getLine2()))
        {
            ad.a("AddressLine2", labsaddress.getLine2());
        }
        if (StringHelper.isNotEmpty(labsaddress.getLine3()))
        {
            ad.a("AddressLine3", labsaddress.getLine3());
        }
        if (StringHelper.isNotEmpty(labsaddress.getLine4()))
        {
            ad.a("AddressLine4", labsaddress.getLine4());
        }
        if (StringHelper.isNotEmpty(labsaddress.getCity()))
        {
            ad.a("City", labsaddress.getCity());
        }
        if (StringHelper.isNotEmpty(labsaddress.getRegion()))
        {
            ad.a("Region", labsaddress.getRegion());
        }
        if (StringHelper.isNotEmpty(labsaddress.getPostalCode()))
        {
            ad.a("PostalCode", labsaddress.getPostalCode());
        }
        if (StringHelper.isNotEmpty(labsaddress.getBuildingId()))
        {
            ad.a("BuildingID", labsaddress.getBuildingId());
        }
        if (StringHelper.isNotEmpty(labsaddress.getOrganizationName()))
        {
            ad.a("OrganizationName", labsaddress.getOrganizationName());
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (StringHelper.isEmpty(labsaddress.getDeliveryInstructions()))
        {
            type = " ";
        } else
        {
            type = labsaddress.getDeliveryInstructions();
        }
        type = stringbuilder.append(type);
        if (labsaddress.getOrganizationName().equals(""))
        {
            labsaddress = "";
        } else
        {
            labsaddress = (new StringBuilder(";")).append(labsaddress.getOrganizationName()).toString();
        }
        labsaddress = type.append(labsaddress).toString();
        if (StringHelper.isNotEmpty(labsaddress))
        {
            ad.a("DeliveryInstructions", labsaddress);
        }
        return ad;
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((LabsAddress)obj, type, ad);
    }
}

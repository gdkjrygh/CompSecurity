// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class AddressDeserializer
    implements v
{

    public AddressDeserializer()
    {
    }

    public LabsAddress deserialize(w w1, Type type, u u)
    {
        type = new LabsAddress();
        w1 = (z)w1;
        if (w1.a("Street"))
        {
            type.setStreet(w1.b("Street").c());
        }
        if (w1.a("StreetNumber"))
        {
            type.setStreetNumber(w1.b("StreetNumber").c());
        }
        if (w1.a("UnitType"))
        {
            type.setUnitType(w1.b("UnitType").c());
        }
        if (w1.a("UnitNumber"))
        {
            type.setUnitNumber(w1.b("UnitNumber").c());
        }
        if (!w1.a("AddressType")) goto _L2; else goto _L1
_L1:
        type.setAddressType(w1.b("AddressType").c());
_L4:
        if (w1.a("AddressLine2"))
        {
            type.setLine2(w1.b("AddressLine2").c());
        }
        if (w1.a("AddressLine3"))
        {
            type.setLine3(w1.b("AddressLine3").c());
        }
        if (w1.a("AddressLine4"))
        {
            type.setLine4(w1.b("AddressLine4").c());
        }
        if (w1.a("City"))
        {
            type.setCity(w1.b("City").c());
        }
        if (w1.a("Region"))
        {
            type.setRegion(w1.b("Region").c());
        }
        if (w1.a("PostalCode"))
        {
            type.setPostalCode(w1.b("PostalCode").c());
        }
        if (w1.a("BuildingID"))
        {
            type.setBuildingId(w1.b("BuildingID").c());
        }
        if (w1.a("CampusID"))
        {
            type.setCampusId(w1.b("CampusID").c());
        }
        if (w1.a("OrganizationName"))
        {
            type.setOrganizationName(w1.b("OrganizationName").c());
        }
        if (w1.a("DeliveryInstructions"))
        {
            type.setDeliveryInstructions(w1.b("DeliveryInstructions").c());
        }
        return type;
_L2:
        if (w1.a("Type"))
        {
            type.setAddressType(w1.b("Type").c());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}

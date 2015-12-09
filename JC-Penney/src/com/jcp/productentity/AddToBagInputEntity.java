// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddToBagInputEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String id;
    private List mAttributesList;
    private String ppId;
    private String productType;
    private int quantity;
    private String serviceAgreementId;
    private String vDataType;

    public AddToBagInputEntity()
    {
        mAttributesList = new ArrayList();
    }

    public String getId()
    {
        return id;
    }

    public String getPpId()
    {
        return ppId;
    }

    public String getProductType()
    {
        return productType;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getServiceAgreementId()
    {
        return serviceAgreementId;
    }

    public List getmAttributesList()
    {
        return mAttributesList;
    }

    public String getvDataType()
    {
        return vDataType;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setPpId(String s)
    {
        ppId = s;
    }

    public void setProductType(String s)
    {
        productType = s;
    }

    public void setQuantity(Integer integer)
    {
        quantity = integer.intValue();
    }

    public void setServiceAgreementId(String s)
    {
        serviceAgreementId = s;
    }

    public void setmAttributesList(List list)
    {
        mAttributesList = list;
    }

    public void setvDataType(String s)
    {
        vDataType = s;
    }
}

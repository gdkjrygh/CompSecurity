// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

public final class Address extends GenericJson
{

    private List addressLines;
    private String name;
    private String phoneNumber;

    public Address()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public Address clone()
    {
        return (Address)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getAddressLines()
    {
        return addressLines;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Address set(String s, Object obj)
    {
        return (Address)super.set(s, obj);
    }

    public Address setAddressLines(List list)
    {
        addressLines = list;
        return this;
    }

    public Address setName(String s)
    {
        name = s;
        return this;
    }

    public Address setPhoneNumber(String s)
    {
        phoneNumber = s;
        return this;
    }
}

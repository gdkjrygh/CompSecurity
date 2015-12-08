// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

// Referenced classes of package com.jcp.model.trackorder:
//            Address, Options

public class Shipping
    implements Serializable
{

    private Address address;
    private String holiday;
    private Options options[];

    public Shipping()
    {
    }

    public Address getAddress()
    {
        return address;
    }

    public String getHoliday()
    {
        return holiday;
    }

    public Options[] getOptions()
    {
        return options;
    }
}

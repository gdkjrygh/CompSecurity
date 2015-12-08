// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            StoreLocatorVO

public class this._cls2
    implements Serializable
{
    public class Location
        implements Serializable
    {

        private static final long serialVersionUID = 16L;
        private String latitude;
        private String longitude;
        final StoreLocatorVO.Payload.Store.Address this$3;

        public double getLatitude()
        {
            return Double.parseDouble(latitude);
        }

        public double getLongitude()
        {
            return Double.parseDouble(longitude);
        }

        public void setLatitude(String s)
        {
            latitude = s;
        }

        public void setLongitude(String s)
        {
            longitude = s;
        }

        public Location()
        {
            this$3 = StoreLocatorVO.Payload.Store.Address.this;
            super();
        }
    }


    private static final long serialVersionUID = 15L;
    private String addr1;
    private String addr2;
    private String city;
    private Location location;
    private String postalCode;
    private String state;
    final Location this$2;

    public String getAddr1()
    {
        return addr1;
    }

    public String getAddr2()
    {
        return addr2;
    }

    public String getCity()
    {
        return city;
    }

    public Location getLocation()
    {
        return location;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getState()
    {
        return state;
    }

    public void setAddr1(String s)
    {
        addr1 = s;
    }

    public void setAddr2(String s)
    {
        addr2 = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setLocation(Location location1)
    {
        location = location1;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public Location.this._cls3()
    {
        this$2 = this._cls2.this;
        super();
    }
}

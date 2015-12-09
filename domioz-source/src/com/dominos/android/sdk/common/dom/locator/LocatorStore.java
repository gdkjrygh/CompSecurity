// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Util;
import com.google.b.ac;
import com.google.b.w;
import com.google.b.z;
import java.util.Map;
import org.a.a.a.a.b;
import org.a.a.a.a.c;
import org.a.a.a.a.f;

public class LocatorStore
{

    private final String addressDescription;
    private final String carryoutHoursDescription;
    private final String deliveryHoursDescription;
    private final Double distance;
    private final boolean isCarryoutAvailable;
    private final boolean isDeliveryAvailable;
    private final boolean isDeliveryStore;
    private final boolean isOnline;
    private final boolean isOpen;
    private final String locationInfo;
    private final String phone;
    private final String storeId;

    private LocatorStore(String s, String s1, String s2, String s3, Double double1, String s4, String s5, 
            boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        storeId = Util.notEmpty(s);
        addressDescription = (String)Util.notNull(s1);
        locationInfo = (String)Util.notNull(s2);
        phone = (String)Util.notNull(s3);
        distance = double1;
        carryoutHoursDescription = (String)Util.notNull(s4);
        deliveryHoursDescription = (String)Util.notNull(s5);
        isCarryoutAvailable = flag;
        isDeliveryAvailable = flag1;
        isOpen = flag2;
        isOnline = flag3;
        isDeliveryStore = flag4;
    }

    LocatorStore(String s, String s1, String s2, String s3, Double double1, String s4, String s5, 
            boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, _cls1 _pcls1)
    {
        this(s, s1, s2, s3, double1, s4, s5, flag, flag1, flag2, flag3, flag4);
    }

    public static LocatorStore from(z z1)
    {
        boolean flag4 = true;
        boolean flag3 = false;
        Object obj;
        Object obj1;
        Object obj2;
        z z2;
        String s;
        Builder builder;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (z1.a("LocationInfo") && (z1.b("LocationInfo") instanceof ac))
        {
            obj = z1.b("LocationInfo").c();
        } else
        {
            obj = "";
        }
        s = StringHelper.defaultString(((String) (obj)));
        if (z1.a("AddressDescription"))
        {
            obj = z1.b("AddressDescription").c();
        } else
        {
            obj = "";
        }
        obj1 = obj;
        if (s.length() > 0)
        {
            obj1 = obj;
            if (((String) (obj)).endsWith(s))
            {
                obj1 = ((String) (obj)).substring(0, ((String) (obj)).length() - (s.length() + 1));
            }
        }
        obj2 = z1.d("ServiceHoursDescription");
        obj = obj2;
        if (obj2 == null)
        {
            obj = new z();
        }
        z2 = z1.d("ServiceIsOpen");
        if (z1.a("IsOnlineNow"))
        {
            flag = z1.b("IsOnlineNow").g();
        } else
        {
            flag = false;
        }
        if (z1.a("IsDeliveryStore"))
        {
            flag1 = z1.b("IsDeliveryStore").g();
        } else
        {
            flag1 = false;
        }
        builder = new Builder();
        if (z1.a("StoreID"))
        {
            obj2 = z1.b("StoreID").c();
        } else
        {
            obj2 = "";
        }
        obj2 = builder.setStoreId(((String) (obj2))).setAddressDescription(((String) (obj1))).setLocationInfo(s);
        if (z1.a("Phone"))
        {
            obj1 = z1.b("Phone").c();
        } else
        {
            obj1 = "";
        }
        obj2 = ((Builder) (obj2)).setPhone(((String) (obj1)));
        if (z1.a("MaxDistance") && (z1.b("MaxDistance") instanceof ac))
        {
            obj1 = Double.valueOf(z1.b("MaxDistance").d());
        } else
        {
            obj1 = null;
        }
        obj2 = ((Builder) (obj2)).setDistance(((Double) (obj1)));
        if (((z) (obj)).a("Carryout"))
        {
            obj1 = ((z) (obj)).b("Carryout").c();
        } else
        {
            obj1 = "";
        }
        obj1 = ((Builder) (obj2)).setCarryoutHoursDescription(((String) (obj1)));
        if (((z) (obj)).a("Delivery"))
        {
            obj = ((z) (obj)).b("Delivery").c();
        } else
        {
            obj = "";
        }
        obj = ((Builder) (obj1)).setDeliveryHoursDescription(((String) (obj)));
        if (z2.a("Carryout") && z2.b("Carryout").g() && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj = ((Builder) (obj)).setCarryoutAvailable(flag2);
        if (z2.a("Delivery") && z2.b("Delivery").g() && flag && flag1)
        {
            flag2 = flag4;
        } else
        {
            flag2 = false;
        }
        obj = ((Builder) (obj)).setDeliveryAvailable(flag2);
        flag2 = flag3;
        if (z1.a("IsOpen"))
        {
            flag2 = z1.b("IsOpen").g();
        }
        return ((Builder) (obj)).setOpen(flag2).setOnline(flag).setDeliveryStore(flag1).build();
    }

    public static LocatorStore from(Map map)
    {
        boolean flag1 = true;
        MapNode mapnode = new MapNode(map);
        String s1 = StringHelper.defaultString(mapnode.getText("LocationInfo", ""));
        String s = mapnode.getText("AddressDescription", "");
        map = s;
        if (s1.length() > 0)
        {
            map = s;
            if (s.endsWith(s1))
            {
                map = s.substring(0, s.length() - (s1.length() + 1));
            }
        }
        map = (new Builder()).setStoreId(mapnode.getText("StoreID")).setAddressDescription(map).setLocationInfo(s1).setPhone(mapnode.getText("Phone", "")).setDistance(mapnode.getDbl("MaxDistance", null)).setCarryoutHoursDescription(mapnode.get("ServiceHoursDescription").getText("Carryout", "")).setDeliveryHoursDescription(mapnode.get("ServiceHoursDescription").getText("Delivery", ""));
        boolean flag;
        if (mapnode.get("ServiceIsOpen").getBool("Carryout", Boolean.valueOf(false)).booleanValue() && mapnode.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        map = map.setCarryoutAvailable(flag);
        if (mapnode.get("ServiceIsOpen").getBool("Delivery", Boolean.valueOf(false)).booleanValue() && mapnode.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue() && mapnode.getBool("IsDeliveryStore", Boolean.valueOf(false)).booleanValue())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return map.setDeliveryAvailable(flag).setOpen(mapnode.getBool("IsOpen", Boolean.valueOf(false)).booleanValue()).setOnline(mapnode.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue()).setDeliveryStore(mapnode.getBool("IsDeliveryStore", Boolean.valueOf(false)).booleanValue()).build();
    }

    public boolean equals(Object obj)
    {
        return b.a(this, obj);
    }

    public String getAddressDescription()
    {
        return addressDescription;
    }

    public String getCarryoutHoursDescription()
    {
        return carryoutHoursDescription;
    }

    public String getDeliveryHoursDescription()
    {
        return deliveryHoursDescription;
    }

    public Double getDistance()
    {
        return distance;
    }

    public String getLocationInfo()
    {
        return locationInfo;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public int hashCode()
    {
        return c.a(this);
    }

    public boolean isCarryoutAvailable()
    {
        return isCarryoutAvailable;
    }

    public boolean isDeliveryAvailable()
    {
        return isDeliveryAvailable;
    }

    public boolean isDeliveryStore()
    {
        return isDeliveryStore;
    }

    public boolean isOnline()
    {
        return isOnline;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public String toString()
    {
        return f.a(this);
    }

    private class Builder
    {

        private String addressDescription;
        private String carryoutHoursDescription;
        private String deliveryHoursDescription;
        private Double distance;
        private boolean isCarryoutAvailable;
        private boolean isDeliveryAvailable;
        private boolean isDeliveryStore;
        private boolean isOnline;
        private boolean isOpen;
        private String locationInfo;
        private String phone;
        private String storeId;

        public LocatorStore build()
        {
            return new LocatorStore(storeId, addressDescription, locationInfo, phone, distance, carryoutHoursDescription, deliveryHoursDescription, isCarryoutAvailable, isDeliveryAvailable, isOpen, isOnline, isDeliveryStore, null);
        }

        public Builder setAddressDescription(String s)
        {
            addressDescription = s;
            return this;
        }

        public Builder setCarryoutAvailable(boolean flag)
        {
            isCarryoutAvailable = flag;
            return this;
        }

        public Builder setCarryoutHoursDescription(String s)
        {
            carryoutHoursDescription = s;
            return this;
        }

        public Builder setDeliveryAvailable(boolean flag)
        {
            isDeliveryAvailable = flag;
            return this;
        }

        public Builder setDeliveryHoursDescription(String s)
        {
            deliveryHoursDescription = s;
            return this;
        }

        public Builder setDeliveryStore(boolean flag)
        {
            isDeliveryStore = flag;
            return this;
        }

        public Builder setDistance(Double double1)
        {
            distance = double1;
            return this;
        }

        public Builder setLocationInfo(String s)
        {
            locationInfo = s;
            return this;
        }

        public Builder setOnline(boolean flag)
        {
            isOnline = flag;
            return this;
        }

        public Builder setOpen(boolean flag)
        {
            isOpen = flag;
            return this;
        }

        public Builder setPhone(String s)
        {
            phone = s;
            return this;
        }

        public Builder setStoreId(String s)
        {
            storeId = s;
            return this;
        }

        public Builder()
        {
            addressDescription = "";
            carryoutHoursDescription = "";
            deliveryHoursDescription = "";
            locationInfo = "";
            phone = "";
            storeId = "";
        }
    }

}

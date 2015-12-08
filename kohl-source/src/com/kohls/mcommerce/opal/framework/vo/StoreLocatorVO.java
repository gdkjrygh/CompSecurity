// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.iface.QuantityViewState;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            IValueObject

public class StoreLocatorVO
    implements IValueObject
{
    public class Payload
        implements Serializable
    {

        private static final long serialVersionUID = 9L;
        private List stores;
        final StoreLocatorVO this$0;

        public List getStores()
        {
            return stores;
        }

        public void setStores(List list)
        {
            stores = list;
        }

        public Payload()
        {
            this$0 = StoreLocatorVO.this;
            super();
        }
    }

    public class Payload.Store
        implements Serializable, QuantityViewState
    {

        private static final long serialVersionUID = 10L;
        private Address address;
        private String allocatedStock;
        private String availability;
        private String availableStock;
        private String channel;
        private ContactInfo contactInfo[];
        private String distanceFromOrigin;
        private String errorMess;
        private boolean isBopusEligible;
        private boolean isBopusEligibleStore;
        private int mSelectedQty;
        private StoreHour storeHours;
        private String storeName;
        private String storeNum;
        final Payload this$1;

        public Address getAddress()
        {
            return address;
        }

        public String getAllocatedStock()
        {
            return allocatedStock;
        }

        public String getAvailability()
        {
            return availability;
        }

        public String getAvailableStock()
        {
            return availableStock;
        }

        public String getChannel()
        {
            return channel;
        }

        public ContactInfo[] getContactInfo()
        {
            return contactInfo;
        }

        public String getDistanceFromOrigin()
        {
            return distanceFromOrigin;
        }

        public String getErrorMess()
        {
            return errorMess;
        }

        public int getProductQty()
        {
            if (mSelectedQty < 1)
            {
                mSelectedQty = 1;
            }
            return mSelectedQty;
        }

        public StoreHour getStoreHours()
        {
            return storeHours;
        }

        public String getStoreName()
        {
            return storeName;
        }

        public String getStoreNum()
        {
            return storeNum;
        }

        public boolean isBopusEligible()
        {
            return isBopusEligible;
        }

        public boolean isBopusEligibleStore()
        {
            return isBopusEligibleStore;
        }

        public void setAddress(Address address1)
        {
            address = address1;
        }

        public void setAllocatedStock(String s)
        {
            allocatedStock = s;
        }

        public void setAvailability(String s)
        {
            availability = s;
        }

        public void setAvailableStock(String s)
        {
            availableStock = s;
        }

        public void setBopusEligible(boolean flag)
        {
            isBopusEligible = flag;
        }

        public void setBopusEligibleStore(boolean flag)
        {
            isBopusEligibleStore = flag;
        }

        public void setChannel(String s)
        {
            channel = s;
        }

        public void setContactInfo(ContactInfo acontactinfo[])
        {
            contactInfo = acontactinfo;
        }

        public void setDistanceFromOrigin(String s)
        {
            distanceFromOrigin = s;
        }

        public void setErrorMess(String s)
        {
            errorMess = s;
        }

        public void setProductQty(int i)
        {
            if (i < 1)
            {
                mSelectedQty = 1;
                return;
            } else
            {
                mSelectedQty = i;
                return;
            }
        }

        public void setStoreHours(StoreHour storehour)
        {
            storeHours = storehour;
        }

        public void setStoreName(String s)
        {
            storeName = s;
        }

        public void setStoreNum(String s)
        {
            storeNum = s;
        }

        public Payload.Store()
        {
            this$1 = Payload.this;
            super();
        }
    }

    public class Payload.Store.Address
        implements Serializable
    {

        private static final long serialVersionUID = 15L;
        private String addr1;
        private String addr2;
        private String city;
        private Location location;
        private String postalCode;
        private String state;
        final Payload.Store this$2;

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

        public Payload.Store.Address()
        {
            this$2 = Payload.Store.this;
            super();
        }
    }

    public class Payload.Store.Address.Location
        implements Serializable
    {

        private static final long serialVersionUID = 16L;
        private String latitude;
        private String longitude;
        final Payload.Store.Address this$3;

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

        public Payload.Store.Address.Location()
        {
            this$3 = Payload.Store.Address.this;
            super();
        }
    }

    public class Payload.Store.ContactInfo
        implements Serializable
    {

        private static final long serialVersionUID = 12L;
        final Payload.Store this$2;
        private String type;
        private String value;

        public String getType()
        {
            return type;
        }

        public String getValue()
        {
            return value;
        }

        public void setType(String s)
        {
            type = s;
        }

        public void setValue(String s)
        {
            value = s;
        }

        public Payload.Store.ContactInfo()
        {
            this$2 = Payload.Store.this;
            super();
        }
    }

    public class Payload.Store.StoreHour
        implements Serializable
    {

        private static final long serialVersionUID = 11L;
        private List days;
        private HashMap operationHours;
        final Payload.Store this$2;

        public List getDays()
        {
            return days;
        }

        public HashMap getHoursOfOperation()
        {
            return operationHours;
        }

        public void setDays(List list)
        {
            days = list;
        }

        public void setHoursofOperation()
        {
            operationHours = new HashMap();
            for (int i = 0; i < getDays().size(); i++)
            {
        /* block-local class not found */
        class Day {}

                Day day = (Day)getDays().get(i);
                if (day != null && UtilityMethods.getShortDayName(day.getDayName()) != null)
                {
                    StringBuilder stringbuilder = new StringBuilder();
        /* block-local class not found */
        class Day.Hour {}

                    operationHours.put(day.getDayName().toLowerCase(), stringbuilder.append(" ").append(day.getHoursofOperation().getOpenTimes()).append(" - ").append(day.getHoursofOperation().getCloseTimes()).toString());
                }
            }

        }

        public Payload.Store.StoreHour()
        {
            this$2 = Payload.Store.this;
            super();
        }
    }


    private static final long serialVersionUID = 1L;
    private List errors;
    private Payload payload;

    public StoreLocatorVO()
    {
    }

    public List getErrors()
    {
        return errors;
    }

    public Payload getPayload()
    {
        return payload;
    }

    public void setErrors(List list)
    {
        errors = list;
    }

    public void setPayload(Payload payload1)
    {
        payload = payload1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;
import java.util.List;

public class ProfileInfo
{
    public static class Address
        implements Serializable
    {

        private static final long serialVersionUID = 0xed5eb3139dbe03bfL;
        private String ID;
        private String addr1;
        private String addr2;
        private String city;
        private String countryCode;
        private String county;
        private String firstName;
        private String lastName;
        private Location location;
        private String phoneNumber;
        private String postalCode;
        private boolean preferredAddr;
        private String state;

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

        public String getCountryCode()
        {
            return countryCode;
        }

        public String getCounty()
        {
            return county;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getID()
        {
            return ID;
        }

        public String getLastName()
        {
            return lastName;
        }

        public Location getLocation()
        {
            return location;
        }

        public String getPhoneNumber()
        {
            return phoneNumber;
        }

        public String getPostalCode()
        {
            return postalCode;
        }

        public boolean getPreferredAddr()
        {
            return preferredAddr;
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

        public void setCountryCode(String s)
        {
            countryCode = s;
        }

        public void setCounty(String s)
        {
            county = s;
        }

        public void setFirstName(String s)
        {
            firstName = s;
        }

        public void setID(String s)
        {
            ID = s;
        }

        public void setLastName(String s)
        {
            lastName = s;
        }

        public void setLocation(Location location1)
        {
            location = location1;
        }

        public void setPhoneNumber(String s)
        {
            phoneNumber = s;
        }

        public void setPostalCode(String s)
        {
            postalCode = s;
        }

        public void setPreferredAddr(boolean flag)
        {
            preferredAddr = flag;
        }

        public void setState(String s)
        {
            state = s;
        }

        public Address()
        {
        }
    }


    private Address billAddress;
    private CustomerName customerName;
    private String email;
    private String id;
    private boolean isEligibleForExpeditedCheckout;
    private String loyaltyId;
    private List paymentTypes;
    private Phone phone;
    private Preferences preferences;
    private List shipAddresses;
    private String status;
    private String updateShipAddressId;

    public ProfileInfo()
    {
    }

    public Address getBillAddress()
    {
        return billAddress;
    }

    public CustomerName getCustomerName()
    {
        return customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getId()
    {
        return id;
    }

    public String getLoyaltyId()
    {
        return loyaltyId;
    }

    public List getPaymentTypes()
    {
        return paymentTypes;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public Preferences getPreferences()
    {
        return preferences;
    }

    public List getShipAddresses()
    {
        return shipAddresses;
    }

    public String getStatus()
    {
        return status;
    }

    public String getUpdateShipAddressId()
    {
        return updateShipAddressId;
    }

    public boolean isEligibleForExpeditedCheckout()
    {
        return isEligibleForExpeditedCheckout;
    }

    public void setBillAddress(Address address)
    {
        billAddress = address;
    }

    public void setCustomerName(CustomerName customername)
    {
        customerName = customername;
    }

    public void setEligibleForExpeditedCheckout(boolean flag)
    {
        isEligibleForExpeditedCheckout = flag;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLoyaltyId(String s)
    {
        loyaltyId = s;
    }

    public void setPaymentTypes(List list)
    {
        paymentTypes = list;
    }

    public void setPhone(Phone phone1)
    {
        phone = phone1;
    }

    public void setPreferences(Preferences preferences1)
    {
        preferences = preferences1;
    }

    public void setShipAddresses(List list)
    {
        shipAddresses = list;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setUpdateShipAddressId(String s)
    {
        updateShipAddressId = s;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$Address$Location
    /* block-local class not found */
    class Address.Location {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$CustomerName
    /* block-local class not found */
    class CustomerName {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$PaymentTypes
    /* block-local class not found */
    class PaymentTypes {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$Phone
    /* block-local class not found */
    class Phone {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$Preferences
    /* block-local class not found */
    class Preferences {}

}

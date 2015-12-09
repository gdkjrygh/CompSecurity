// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.dominos.App;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressType
{

    public static AddressType TYPE_APARTMENT;
    public static AddressType TYPE_BUSINESS;
    public static AddressType TYPE_CAMPUS_BASE;
    public static AddressType TYPE_DORMITORY;
    public static AddressType TYPE_HOTEL;
    public static AddressType TYPE_HOUSE;
    public static AddressType TYPE_OTHER;
    private static final Resources resources;
    private Drawable mIcon;
    private String mId;
    private String mName;

    public AddressType(String s, String s1, Drawable drawable)
    {
        mName = s;
        mId = s1;
        mIcon = drawable;
    }

    public static AddressType getAddressType(String s)
    {
        if (s.equalsIgnoreCase(TYPE_HOUSE.getId()))
        {
            return TYPE_HOUSE;
        }
        if (s.equalsIgnoreCase(TYPE_APARTMENT.getId()))
        {
            return TYPE_APARTMENT;
        }
        if (s.equalsIgnoreCase(TYPE_CAMPUS_BASE.getId()))
        {
            return TYPE_CAMPUS_BASE;
        }
        if (s.equalsIgnoreCase(TYPE_BUSINESS.getId()))
        {
            return TYPE_BUSINESS;
        }
        if (s.equalsIgnoreCase(TYPE_HOTEL.getId()))
        {
            return TYPE_HOTEL;
        }
        if (s.equalsIgnoreCase(TYPE_DORMITORY.getId()))
        {
            return TYPE_DORMITORY;
        } else
        {
            return TYPE_OTHER;
        }
    }

    public static List getAddressTypeList()
    {
        return new ArrayList(Arrays.asList(new AddressType[] {
            TYPE_HOUSE, TYPE_APARTMENT, TYPE_CAMPUS_BASE, TYPE_HOTEL, TYPE_BUSINESS, TYPE_DORMITORY, TYPE_OTHER
        }));
    }

    public static int getUnitCopy(String s)
    {
        return !s.equalsIgnoreCase(TYPE_HOUSE.getId()) && !s.equalsIgnoreCase(TYPE_APARTMENT.getId()) && !s.equalsIgnoreCase(TYPE_BUSINESS.getId()) ? 0x7f080284 : 0x7f0802f1;
    }

    public static void resetForLangSwitch()
    {
        TYPE_HOUSE = new AddressType(resources.getString(0x7f08038e), "House", resources.getDrawable(0x7f0200ff));
        TYPE_APARTMENT = new AddressType(resources.getString(0x7f080062), "Apartment", resources.getDrawable(0x7f02003f));
        TYPE_CAMPUS_BASE = new AddressType(resources.getString(0x7f080079), "Campus", resources.getDrawable(0x7f02008e));
        TYPE_BUSINESS = new AddressType(resources.getString(0x7f080075), "Business", resources.getDrawable(0x7f02008d));
        TYPE_HOTEL = new AddressType(resources.getString(0x7f080170), "Hotel", resources.getDrawable(0x7f0200fe));
        TYPE_DORMITORY = new AddressType(resources.getString(0x7f080102), "Dormitory", resources.getDrawable(0x7f0200e0));
        TYPE_OTHER = new AddressType(resources.getString(0x7f080219), "Other", resources.getDrawable(0x7f020175));
    }

    public Drawable getIcon()
    {
        return mIcon;
    }

    public String getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public String toString()
    {
        return mName;
    }

    static 
    {
        resources = App.getInstance().getApplicationContext().getResources();
        TYPE_HOUSE = new AddressType(resources.getString(0x7f08038e), "House", resources.getDrawable(0x7f0200ff));
        TYPE_APARTMENT = new AddressType(resources.getString(0x7f080062), "Apartment", resources.getDrawable(0x7f02003f));
        TYPE_CAMPUS_BASE = new AddressType(resources.getString(0x7f080079), "Campus", resources.getDrawable(0x7f02008e));
        TYPE_BUSINESS = new AddressType(resources.getString(0x7f080075), "Business", resources.getDrawable(0x7f02008d));
        TYPE_HOTEL = new AddressType(resources.getString(0x7f080170), "Hotel", resources.getDrawable(0x7f0200fe));
        TYPE_DORMITORY = new AddressType(resources.getString(0x7f080102), "Dormitory", resources.getDrawable(0x7f0200e0));
        TYPE_OTHER = new AddressType(resources.getString(0x7f080219), "Other", resources.getDrawable(0x7f020175));
    }
}

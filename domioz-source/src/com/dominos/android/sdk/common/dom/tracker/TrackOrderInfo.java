// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;


public class TrackOrderInfo
{

    private String alternatePhone;
    private String alternatePhoneExtension;
    private String phone;
    private String phoneExtension;

    public TrackOrderInfo()
    {
    }

    public String getAlternatePhone()
    {
        return alternatePhone;
    }

    public String getAlternatePhoneExtension()
    {
        return alternatePhoneExtension;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPhoneExtension()
    {
        return phoneExtension;
    }

    public void setAlternatePhone(String s)
    {
        alternatePhone = s;
    }

    public void setAlternatePhoneExtension(String s)
    {
        alternatePhoneExtension = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setPhoneExtension(String s)
    {
        phoneExtension = s;
    }
}

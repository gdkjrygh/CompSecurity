// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MATEvent
    implements Serializable
{

    private static final long serialVersionUID = 0x964d2225f8b7e5f0L;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String contentId;
    private String contentType;
    private String currencyCode;
    private Date date1;
    private Date date2;
    private String deviceForm;
    private int eventId;
    private List eventItems;
    private String eventName;
    private int level;
    private int quantity;
    private double rating;
    private String receiptData;
    private String receiptSignature;
    private String refId;
    private double revenue;
    private String searchString;

    public MATEvent(String s1)
    {
        eventName = s1;
    }

    public MATEvent a(String s1)
    {
        contentId = s1;
        return this;
    }

    public String a()
    {
        return eventName;
    }

    public int b()
    {
        return eventId;
    }

    public MATEvent b(String s1)
    {
        attribute1 = s1;
        return this;
    }

    public double c()
    {
        return revenue;
    }

    public MATEvent c(String s1)
    {
        attribute2 = s1;
        return this;
    }

    public MATEvent d(String s1)
    {
        attribute3 = s1;
        return this;
    }

    public String d()
    {
        return currencyCode;
    }

    public MATEvent e(String s1)
    {
        attribute4 = s1;
        return this;
    }

    public String e()
    {
        return refId;
    }

    public List f()
    {
        return eventItems;
    }

    public String g()
    {
        return receiptData;
    }

    public String h()
    {
        return receiptSignature;
    }

    public String i()
    {
        return contentType;
    }

    public String j()
    {
        return contentId;
    }

    public int k()
    {
        return level;
    }

    public int l()
    {
        return quantity;
    }

    public String m()
    {
        return searchString;
    }

    public double n()
    {
        return rating;
    }

    public Date o()
    {
        return date1;
    }

    public Date p()
    {
        return date2;
    }

    public String q()
    {
        return attribute1;
    }

    public String r()
    {
        return attribute2;
    }

    public String s()
    {
        return attribute3;
    }

    public String t()
    {
        return attribute4;
    }

    public String u()
    {
        return attribute5;
    }

    public String v()
    {
        return deviceForm;
    }
}

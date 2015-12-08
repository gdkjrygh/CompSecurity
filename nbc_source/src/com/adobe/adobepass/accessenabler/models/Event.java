// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;


public class Event
{

    public static final int EVENT_AUTHN_DETECTION = 0;
    public static final int EVENT_AUTHZ_DETECTION = 1;
    public static final int EVENT_MVPD_SELECTION = 2;
    private String errorCode;
    private String errorDetail;
    private int type;

    public Event(int i)
    {
        type = i;
    }

    public Event(int i, String s, String s1)
    {
        type = i;
        errorCode = s;
        errorDetail = s1;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorDetail()
    {
        return errorDetail;
    }

    public int getType()
    {
        return type;
    }

    public void setErrorCode(String s)
    {
        errorCode = s;
    }

    public void setErrorDetail(String s)
    {
        errorDetail = s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class JCPStorePickupSettings
{

    private String cutoffTime;
    private String enabled;
    private String smsAlerts;

    public JCPStorePickupSettings()
    {
    }

    public String getCutoffTime()
    {
        return cutoffTime;
    }

    public String getEnabled()
    {
        return enabled;
    }

    public String getSmsAlerts()
    {
        return smsAlerts;
    }

    public void setCutoffTime(String s)
    {
        cutoffTime = s;
    }

    public void setEnabled(String s)
    {
        enabled = s;
    }

    public void setSmsAlerts(String s)
    {
        smsAlerts = s;
    }
}

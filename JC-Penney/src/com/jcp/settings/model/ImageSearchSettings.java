// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


public class ImageSearchSettings
{

    private String baseUrl;
    private Boolean enabled;

    public ImageSearchSettings()
    {
        enabled = Boolean.valueOf(false);
        baseUrl = null;
    }

    public String getBaseUrl()
    {
        return baseUrl;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setBaseUrl(String s)
    {
        baseUrl = s;
    }

    public void setEnabled(Boolean boolean1)
    {
        enabled = boolean1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;


public class PreauthorizationCacheEntry
{

    private String id;
    private boolean isAuthorized;

    public PreauthorizationCacheEntry(String s, boolean flag)
    {
        isAuthorized = flag;
        id = s;
    }

    public String getId()
    {
        return id;
    }

    public boolean isAuthorized()
    {
        return isAuthorized;
    }

    public void setAuthorized(boolean flag)
    {
        isAuthorized = flag;
    }

    public void setId(String s)
    {
        id = s;
    }
}

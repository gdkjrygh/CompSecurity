// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import java.io.Serializable;

public class MetadataStatus
    implements Serializable
{

    private boolean encrypted;
    private String simpleResult;
    private Object userMetadataResult;

    public MetadataStatus()
    {
        this(null, null, false);
    }

    public MetadataStatus(Object obj, boolean flag)
    {
        this(null, obj, flag);
    }

    public MetadataStatus(String s)
    {
        this(s, null, false);
    }

    private MetadataStatus(String s, Object obj, boolean flag)
    {
        simpleResult = s;
        userMetadataResult = obj;
        encrypted = flag;
    }

    public String getSimpleResult()
    {
        return simpleResult;
    }

    public Object getUserMetadataResult()
    {
        return userMetadataResult;
    }

    public boolean isEncrypted()
    {
        return encrypted;
    }

    public String toString()
    {
        if (simpleResult != null || userMetadataResult != null)
        {
            if (simpleResult != null)
            {
                return simpleResult;
            }
            if (userMetadataResult != null)
            {
                return (new StringBuilder()).append("Value: ").append(userMetadataResult).append(" | Encrypted: ").append(encrypted).toString();
            }
        }
        return null;
    }
}

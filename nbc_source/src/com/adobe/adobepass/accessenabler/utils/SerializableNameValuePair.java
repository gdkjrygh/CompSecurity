// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import java.io.Serializable;

public class SerializableNameValuePair
    implements Serializable
{

    private String name;
    private String value;

    public SerializableNameValuePair(String s, String s1)
    {
        name = s;
        value = s1;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public class Device
{

    private String id;
    private String label;

    public Device(String s, String s1)
    {
        id = s;
        label = s1;
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public String toString()
    {
        return (new StringBuilder("Device{id=")).append(id).append(", label=").append(label).append("}").toString();
    }
}

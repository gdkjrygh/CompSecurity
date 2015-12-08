// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public class MediaPublishOptions
{

    private int nativeWidth;
    private String windowId;

    public MediaPublishOptions()
    {
        windowId = "";
        nativeWidth = 0;
    }

    public int getNativeWidth()
    {
        return nativeWidth;
    }

    public String getWindowId()
    {
        return windowId;
    }

    public void setNativeWidth(int i)
    {
        nativeWidth = i;
    }

    public void setWindowId(String s)
    {
        windowId = s;
    }

    public String toString()
    {
        return (new StringBuilder("MediaPublishOptions{windowId=")).append(windowId).append(", nativeWidth=").append(nativeWidth).append("}").toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.media;


public class MediaFile
{

    public static final String DELIVERY_PROGRESSIVE = "progressive";
    public static final String DELIVERY_STREAMING = "streaming";
    public String apiFramework;
    public int bitrate;
    public String delivery;
    public int height;
    public String id;
    public boolean maintainAspectRatio;
    public String mimeType;
    public boolean scalable;
    public String source;
    public int width;

    public MediaFile()
    {
        bitrate = 0;
        width = 0;
        height = 0;
    }
}

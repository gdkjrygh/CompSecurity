// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.info;


public class Profile
{

    private final int _bitrate;
    private final int _height;
    private final int _width;

    public Profile(int i, int j, int k)
    {
        _bitrate = i;
        _width = j;
        _height = k;
    }

    public int getBitrate()
    {
        return _bitrate;
    }

    public int getHeight()
    {
        return _height;
    }

    public int getWidth()
    {
        return _width;
    }
}

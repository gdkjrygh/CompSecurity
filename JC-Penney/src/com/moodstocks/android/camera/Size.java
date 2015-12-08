// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;


public class Size
{

    public int height;
    public int width;

    protected Size()
    {
        width = -1;
        height = -1;
    }

    protected Size(int i, int j)
    {
        width = i;
        height = j;
    }

    protected Size(android.hardware.Camera.Size size)
    {
        width = size.width;
        height = size.height;
    }

    protected Size clone()
    {
        return new Size(width, height);
    }

    protected volatile Object clone()
    {
        return clone();
    }

    protected boolean isSet()
    {
        return width >= 0 && height >= 0;
    }
}

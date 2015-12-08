// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;


public class ImageSize
{

    private static final String SEPARATOR = "x";
    private static final int TO_STRING_MAX_LENGHT = 9;
    private final int height;
    private final int width;

    public ImageSize(int i, int j)
    {
        width = i;
        height = j;
    }

    public ImageSize(int i, int j, int k)
    {
        if (k % 180 == 0)
        {
            width = i;
            height = j;
            return;
        } else
        {
            width = j;
            height = i;
            return;
        }
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public ImageSize scale(float f)
    {
        return new ImageSize((int)((float)width * f), (int)((float)height * f));
    }

    public ImageSize scaleDown(int i)
    {
        return new ImageSize(width / i, height / i);
    }

    public String toString()
    {
        return (new StringBuilder(9)).append(width).append("x").append(height).toString();
    }
}

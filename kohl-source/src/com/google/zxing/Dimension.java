// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


public final class Dimension
{

    private final int height;
    private final int width;

    public Dimension(int i, int j)
    {
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            width = i;
            height = j;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Dimension)
        {
            obj = (Dimension)obj;
            flag = flag1;
            if (width == ((Dimension) (obj)).width)
            {
                flag = flag1;
                if (height == ((Dimension) (obj)).height)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int hashCode()
    {
        return width * 32713 + height;
    }

    public String toString()
    {
        return (new StringBuilder()).append(width).append("x").append(height).toString();
    }
}

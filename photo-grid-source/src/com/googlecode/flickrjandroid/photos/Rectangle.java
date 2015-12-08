// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import java.io.Serializable;

public class Rectangle
    implements Serializable
{

    public int height;
    public int width;
    public int x;
    public int y;

    public Rectangle()
    {
    }

    public Rectangle(int i, int j, int k, int l)
    {
        x = i;
        y = j;
        width = k;
        height = l;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof Rectangle))
            {
                return false;
            }
            obj = (Rectangle)obj;
            if (height != ((Rectangle) (obj)).height)
            {
                return false;
            }
            if (width != ((Rectangle) (obj)).width)
            {
                return false;
            }
            if (x != ((Rectangle) (obj)).x)
            {
                return false;
            }
            if (y != ((Rectangle) (obj)).y)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int hashCode()
    {
        return (((height + 31) * 31 + width) * 31 + x) * 31 + y;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setWidth(int i)
    {
        width = i;
    }

    public void setX(int i)
    {
        x = i;
    }

    public void setY(int i)
    {
        y = i;
    }
}

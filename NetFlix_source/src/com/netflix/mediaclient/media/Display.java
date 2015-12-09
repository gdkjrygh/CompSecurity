// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;


public class Display
{

    private int height;
    private int width;
    private int x;
    private int y;

    public Display(int i, int j, int k, int l)
    {
        width = i;
        height = j;
        x = k;
        y = l;
    }

    public static boolean isDisplayUpdated(Display display, int i, int j, int k, int l)
    {
        while (display == null || j != display.height || k != display.x || l != display.y || i != display.width) 
        {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof Display))
            {
                return false;
            }
            obj = (Display)obj;
            if (height != ((Display) (obj)).height)
            {
                return false;
            }
            if (x != ((Display) (obj)).x)
            {
                return false;
            }
            if (y != ((Display) (obj)).y)
            {
                return false;
            }
            if (width != ((Display) (obj)).width)
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
        return (((height + 31) * 31 + x) * 31 + y) * 31 + width;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Display [height=").append(height).append(", width=").append(width).append(", x=").append(x).append(", y=").append(y).append("]").toString();
    }
}

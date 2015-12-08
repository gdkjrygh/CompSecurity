// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;

import java.io.Serializable;
import java.util.regex.Pattern;

public class Resolution
    implements Serializable, Comparable
{

    private static final Pattern SPLIT_REGEX = Pattern.compile("x");
    private static final long serialVersionUID = 0x45c2fd9048afe2L;
    private final int height;
    private final int width;

    public Resolution(int i, int j)
    {
        width = i;
        height = j;
    }

    public Resolution(String s)
    {
        s = SPLIT_REGEX.split(s);
        width = Integer.parseInt(s[0]);
        height = Integer.parseInt(s[1]);
    }

    public int compareTo(Resolution resolution)
    {
        if (width <= resolution.width)
        {
            if (width < resolution.width)
            {
                return -1;
            }
            if (height <= resolution.height)
            {
                return height >= resolution.height ? 0 : -1;
            }
        }
        return 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Resolution)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Resolution)obj;
            if (width != ((Resolution) (obj)).width || height != ((Resolution) (obj)).height)
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

    public int hashCode()
    {
        return (height + 31) * 31 + width;
    }

    public String toString()
    {
        return (new StringBuilder()).append(width).append("x").append(height).toString();
    }

}

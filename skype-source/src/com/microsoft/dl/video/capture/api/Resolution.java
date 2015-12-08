// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Serializable;
import java.util.regex.Pattern;

public class Resolution
    implements Serializable, Comparable
{

    private static final Pattern a = Pattern.compile("x");
    private final int b;
    private final int c;

    public Resolution(int i, int j)
    {
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            b = i;
            c = j;
            return;
        }
    }

    public Resolution(String s)
    {
        s = a.split(s);
        b = Integer.parseInt(s[0]);
        c = Integer.parseInt(s[1]);
        if (b < 0 || c < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public final int compareTo(Resolution resolution)
    {
        if (b <= resolution.b)
        {
            if (b < resolution.b)
            {
                return -1;
            }
            if (c <= resolution.c)
            {
                return c >= resolution.c ? 0 : -1;
            }
        }
        return 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Resolution)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Resolution)obj;
            if (b != ((Resolution) (obj)).b || c != ((Resolution) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        return c;
    }

    public final int getNumPixels()
    {
        return b * c;
    }

    public final int getWidth()
    {
        return b;
    }

    public final int hashCode()
    {
        return (c + 31) * 31 + b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append("x").append(c).toString();
    }

}

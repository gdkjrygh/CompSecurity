// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Serializable;
import java.util.regex.Pattern;

public class FpsRange
    implements Serializable, Comparable
{

    private static final Pattern a = Pattern.compile("-");
    private final int b;
    private final int c;

    public FpsRange(int i, int j)
    {
        if (i > j)
        {
            throw new IllegalArgumentException((new StringBuilder("min=")).append(i).append(", max=").append(j).toString());
        } else
        {
            b = i;
            c = j;
            return;
        }
    }

    public FpsRange(String s)
    {
        s = a.split(s);
        b = Integer.parseInt(s[0]);
        c = Integer.parseInt(s[1]);
        if (b > c)
        {
            throw new IllegalArgumentException((new StringBuilder("min=")).append(b).append(", max=").append(c).toString());
        } else
        {
            return;
        }
    }

    public final int compareTo(FpsRange fpsrange)
    {
        int i = b - fpsrange.b;
        int j = c - fpsrange.c;
        if (i >= 0)
        {
            if (i > 0)
            {
                return 1;
            }
            if (j >= 0)
            {
                return j <= 0 ? 0 : 1;
            }
        }
        return -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((FpsRange)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FpsRange)obj;
            if (c != ((FpsRange) (obj)).c || b != ((FpsRange) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int getMax()
    {
        return c;
    }

    public final int getMin()
    {
        return b;
    }

    public final int hashCode()
    {
        return (c + 31) * 31 + b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append((float)b / 1000F).append("-").append((float)c / 1000F).toString();
    }

}

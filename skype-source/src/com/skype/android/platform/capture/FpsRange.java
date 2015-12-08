// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

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
        b = i;
        c = j;
    }

    public FpsRange(String s)
    {
        s = a.split(s);
        b = Integer.parseInt(s[0]);
        c = Integer.parseInt(s[1]);
    }

    public final int a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public volatile int compareTo(Object obj)
    {
        obj = (FpsRange)obj;
        int i = b - ((FpsRange) (obj)).b;
        int j = c - ((FpsRange) (obj)).c;
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

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return (c + 31) * 31 + b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append((float)b / 1000F).append("-").append((float)c / 1000F).toString();
    }

}

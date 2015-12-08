// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264;


public class CharCache
{

    private char cache[];
    private int pos;

    public CharCache(int i)
    {
        cache = new char[i];
    }

    public void append(char c)
    {
        if (pos < cache.length - 1)
        {
            cache[pos] = c;
            pos = pos + 1;
        }
    }

    public void append(String s)
    {
        s = s.toCharArray();
        int j = cache.length - pos;
        int i = j;
        if (s.length < j)
        {
            i = s.length;
        }
        System.arraycopy(s, 0, cache, pos, i);
        pos = i + pos;
    }

    public void clear()
    {
        pos = 0;
    }

    public int length()
    {
        return pos;
    }

    public String toString()
    {
        return new String(cache, 0, pos);
    }
}

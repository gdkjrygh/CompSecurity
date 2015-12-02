// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.d;

import com.qihoo.security.engine.FileInfo;

public class b
{

    public final int a;
    public final int b;
    public FileInfo c;

    public b(int i, int j)
    {
        a = i;
        b = j;
    }

    public FileInfo a(int i)
    {
        if (i == 0)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return c.toString();
    }
}

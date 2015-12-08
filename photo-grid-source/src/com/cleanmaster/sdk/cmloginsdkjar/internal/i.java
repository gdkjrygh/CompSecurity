// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.File;

final class i
    implements Comparable
{

    private final File a;
    private final long b;

    i(File file)
    {
        a = file;
        b = file.lastModified();
    }

    private int a(i j)
    {
        if (b < j.b)
        {
            return -1;
        }
        if (b > j.b)
        {
            return 1;
        } else
        {
            return a.compareTo(j.a);
        }
    }

    final File a()
    {
        return a;
    }

    final long b()
    {
        return b;
    }

    public final int compareTo(Object obj)
    {
        return a((i)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof i) && a((i)obj) == 0;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + (int)(b % 0x7fffffffL);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

final class ah
    implements Comparable
{

    private final File a;
    private final long b;

    ah(File file)
    {
        a = file;
        b = file.lastModified();
    }

    private int a(ah ah1)
    {
        if (b < ah1.b)
        {
            return -1;
        }
        if (b > ah1.b)
        {
            return 1;
        } else
        {
            return a.compareTo(ah1.a);
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
        return a((ah)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ah) && a((ah)obj) == 0;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + (int)(b % 0x7fffffffL);
    }
}

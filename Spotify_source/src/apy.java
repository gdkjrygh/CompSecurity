// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

final class apy
    implements Comparable
{

    final File a;
    final long b;

    apy(File file)
    {
        a = file;
        b = file.lastModified();
    }

    private int a(apy apy1)
    {
        if (b < apy1.b)
        {
            return -1;
        }
        if (b > apy1.b)
        {
            return 1;
        } else
        {
            return a.compareTo(apy1.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((apy)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof apy) && a((apy)obj) == 0;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + (int)(b % 0x7fffffffL);
    }
}

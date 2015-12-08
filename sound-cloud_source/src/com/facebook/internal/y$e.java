// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//            y

private static final class b
    implements Comparable
{

    final File a;
    final long b;

    private int a(b b1)
    {
        if (b < b1.b)
        {
            return -1;
        }
        if (b > b1.b)
        {
            return 1;
        } else
        {
            return a.compareTo(b1.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof a) && a((a)obj) == 0;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + (int)(b % 0x7fffffffL);
    }

    (File file)
    {
        a = file;
        b = file.lastModified();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.io.File;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            s

static final class c
    implements Comparable
{

    public final File a;
    public final String b;
    public final long c;
    boolean d;

    public final int compareTo(Object obj)
    {
        obj = (c)obj;
        if (c < ((c) (obj)).c)
        {
            return -1;
        }
        if (c > ((c) (obj)).c)
        {
            return 1;
        } else
        {
            return b.compareTo(((b) (obj)).b);
        }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (b)obj;
            return b.equals(((b) (obj)).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return b;
    }

    public (File file)
    {
        d = true;
        a = file;
        b = file.getName();
        c = file.lastModified();
    }
}

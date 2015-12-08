// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bn

public abstract class bw extends bn
    implements Set
{

    public bw()
    {
    }

    public Collection a()
    {
        return b();
    }

    public abstract Set b();

    public Object c()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return obj == this || b().equals(obj);
    }

    public int hashCode()
    {
        return b().hashCode();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cl, cj, MapMakerInternalMap

final class cn extends cl
    implements cj
{

    volatile long e;
    cj f;
    cj g;

    cn(Object obj, int i, cj cj1)
    {
        super(obj, i, cj1);
        e = 0x7fffffffffffffffL;
        f = MapMakerInternalMap.nullEntry();
        g = MapMakerInternalMap.nullEntry();
    }

    public final long getExpirationTime()
    {
        return e;
    }

    public final cj getNextExpirable()
    {
        return f;
    }

    public final cj getPreviousExpirable()
    {
        return g;
    }

    public final void setExpirationTime(long l)
    {
        e = l;
    }

    public final void setNextExpirable(cj cj1)
    {
        f = cj1;
    }

    public final void setPreviousExpirable(cj cj1)
    {
        g = cj1;
    }
}

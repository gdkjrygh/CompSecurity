// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cl, cj, MapMakerInternalMap

final class cm extends cl
    implements cj
{

    cj e;
    cj f;

    cm(Object obj, int i, cj cj1)
    {
        super(obj, i, cj1);
        e = MapMakerInternalMap.nullEntry();
        f = MapMakerInternalMap.nullEntry();
    }

    public final cj getNextEvictable()
    {
        return e;
    }

    public final cj getPreviousEvictable()
    {
        return f;
    }

    public final void setNextEvictable(cj cj1)
    {
        e = cj1;
    }

    public final void setPreviousEvictable(cj cj1)
    {
        f = cj1;
    }
}

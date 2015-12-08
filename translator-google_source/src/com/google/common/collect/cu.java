// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.collect:
//            ct, cj, MapMakerInternalMap

final class cu extends ct
    implements cj
{

    cj d;
    cj e;

    cu(ReferenceQueue referencequeue, Object obj, int i, cj cj1)
    {
        super(referencequeue, obj, i, cj1);
        d = MapMakerInternalMap.nullEntry();
        e = MapMakerInternalMap.nullEntry();
    }

    public final cj getNextEvictable()
    {
        return d;
    }

    public final cj getPreviousEvictable()
    {
        return e;
    }

    public final void setNextEvictable(cj cj1)
    {
        d = cj1;
    }

    public final void setPreviousEvictable(cj cj1)
    {
        e = cj1;
    }
}

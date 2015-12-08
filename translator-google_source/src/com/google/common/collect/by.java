// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cg, MapMakerInternalMap

final class by extends cg
{

    final MapMakerInternalMap a;

    by(MapMakerInternalMap mapmakerinternalmap)
    {
        a = mapmakerinternalmap;
        super(mapmakerinternalmap);
    }

    public final Object next()
    {
        return a();
    }
}

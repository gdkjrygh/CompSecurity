// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ao, ImmutableBiMap

class nit> extends nit>
{

    private static final long serialVersionUID = 0L;

    Object readResolve()
    {
        return createMap(new ao());
    }

    (ImmutableBiMap immutablebimap)
    {
        super(immutablebimap);
    }
}

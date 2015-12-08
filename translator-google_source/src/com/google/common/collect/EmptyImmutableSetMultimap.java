// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableSetMultimap, ImmutableMap

class EmptyImmutableSetMultimap extends ImmutableSetMultimap
{

    static final EmptyImmutableSetMultimap INSTANCE = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0L;

    private EmptyImmutableSetMultimap()
    {
        super(ImmutableMap.of(), 0, null);
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableListMultimap, ImmutableMap

class EmptyImmutableListMultimap extends ImmutableListMultimap
{

    static final EmptyImmutableListMultimap INSTANCE = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0L;

    private EmptyImmutableListMultimap()
    {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

}

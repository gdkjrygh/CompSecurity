// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, ImmutableMap

final class EmptyImmutableMultiset extends ImmutableMultiset
{

    static final EmptyImmutableMultiset INSTANCE = new EmptyImmutableMultiset();
    private static final long serialVersionUID = 0L;

    private EmptyImmutableMultiset()
    {
        super(ImmutableMap.of(), 0);
    }

    Object readResolve()
    {
        return INSTANCE;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.LinkedHashMap;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, ImmutableMultimap, Lists

private static class A extends AbstractMultimap
{

    private static final long serialVersionUID = 0L;

    Collection createCollection()
    {
        return Lists.newArrayList();
    }

    A()
    {
        super(new LinkedHashMap());
    }
}

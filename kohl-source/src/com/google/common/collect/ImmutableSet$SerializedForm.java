// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object elements[];

    Object readResolve()
    {
        return ImmutableSet.copyOf(elements);
    }

    (Object aobj[])
    {
        elements = aobj;
    }
}

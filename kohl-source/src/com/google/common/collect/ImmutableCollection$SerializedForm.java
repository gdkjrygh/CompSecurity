// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Platform

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object elements[];

    Object readResolve()
    {
        if (elements.length == 0)
        {
            return ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
        } else
        {
            return new ollection(Platform.clone(elements));
        }
    }

    ollection(Object aobj[])
    {
        elements = aobj;
    }
}

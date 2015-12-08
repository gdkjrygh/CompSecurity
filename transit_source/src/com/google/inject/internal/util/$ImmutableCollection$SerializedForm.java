// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object elements[];

    Object readResolve()
    {
        if (elements.length == 0)
        {
            return $ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
        } else
        {
            return new ollection((Object[])((Object []) (elements)).clone());
        }
    }

    ollection(Object aobj[])
    {
        elements = aobj;
    }
}

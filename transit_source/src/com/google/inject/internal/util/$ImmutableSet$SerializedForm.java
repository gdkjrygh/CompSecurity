// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableSet

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object elements[];

    Object readResolve()
    {
        return $ImmutableSet.of(elements);
    }

    (Object aobj[])
    {
        elements = aobj;
    }
}

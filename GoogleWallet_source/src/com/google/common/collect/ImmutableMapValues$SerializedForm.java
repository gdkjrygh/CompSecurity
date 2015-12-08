// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapValues, ImmutableMap

static final class map
    implements Serializable
{

    final ImmutableMap map;

    A(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }
}

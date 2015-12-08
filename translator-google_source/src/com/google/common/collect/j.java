// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            o, AbstractMapBasedMultimap, m

final class j extends o
    implements RandomAccess
{

    final AbstractMapBasedMultimap a;

    j(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj, List list, m m)
    {
        a = abstractmapbasedmultimap;
        super(abstractmapbasedmultimap, obj, list, m);
    }
}

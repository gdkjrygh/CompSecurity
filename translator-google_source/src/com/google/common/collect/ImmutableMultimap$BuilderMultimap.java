// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

class A extends AbstractMapBasedMultimap
{

    private static final long serialVersionUID = 0L;

    Collection createCollection()
    {
        return new ArrayList();
    }

    A()
    {
        super(new LinkedHashMap());
    }
}

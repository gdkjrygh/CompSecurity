// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Multisets, CollectPreconditions

static final class kNonnegative extends kNonnegative
    implements Serializable
{

    final int count;
    final Object element;

    public final int getCount()
    {
        return count;
    }

    public final Object getElement()
    {
        return element;
    }

    (Object obj, int i)
    {
        element = obj;
        count = i;
        CollectPreconditions.checkNonnegative(i, "count");
    }
}

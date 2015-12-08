// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            bl

final class bw extends AbstractQueue
{

    bw()
    {
    }

    public final Iterator iterator()
    {
        return bl.a();
    }

    public final boolean offer(Object obj)
    {
        return true;
    }

    public final Object peek()
    {
        return null;
    }

    public final Object poll()
    {
        return null;
    }

    public final int size()
    {
        return 0;
    }
}

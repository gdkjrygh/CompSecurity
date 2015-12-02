// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gg

final class bl extends AbstractQueue
{

    bl()
    {
    }

    public Iterator iterator()
    {
        return gg.a();
    }

    public boolean offer(Object obj)
    {
        return true;
    }

    public Object peek()
    {
        return null;
    }

    public Object poll()
    {
        return null;
    }

    public int size()
    {
        return 0;
    }
}

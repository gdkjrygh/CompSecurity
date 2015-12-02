// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em

public abstract class eo
{

    eo()
    {
    }

    public abstract em a();

    public eo a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); a(iterable.next())) { }
        return this;
    }

    public abstract eo a(Object obj);

    public transient eo a(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            a(aobj[i]);
        }

        return this;
    }
}

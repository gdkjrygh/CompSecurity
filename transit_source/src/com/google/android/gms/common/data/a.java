// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.dm;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public final class a
    implements Iterator
{

    private final DataBuffer jg;
    private int jh;

    public a(DataBuffer databuffer)
    {
        jg = (DataBuffer)dm.e(databuffer);
        jh = -1;
    }

    public boolean hasNext()
    {
        return jh < jg.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(jh).toString());
        } else
        {
            DataBuffer databuffer = jg;
            int i = jh + 1;
            jh = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

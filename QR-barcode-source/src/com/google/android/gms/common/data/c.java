// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class c
    implements Iterator
{

    protected final DataBuffer JV;
    protected int JW;

    public c(DataBuffer databuffer)
    {
        JV = (DataBuffer)o.i(databuffer);
        JW = -1;
    }

    public boolean hasNext()
    {
        return JW < JV.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(JW).toString());
        } else
        {
            DataBuffer databuffer = JV;
            int i = JW + 1;
            JW = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

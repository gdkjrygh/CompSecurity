// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.jx;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class c
    implements Iterator
{

    protected final DataBuffer KW;
    protected int KX;

    public c(DataBuffer databuffer)
    {
        KW = (DataBuffer)jx.i(databuffer);
        KX = -1;
    }

    public boolean hasNext()
    {
        return KX < KW.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(KX).toString());
        } else
        {
            DataBuffer databuffer = KW;
            int i = KX + 1;
            KX = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

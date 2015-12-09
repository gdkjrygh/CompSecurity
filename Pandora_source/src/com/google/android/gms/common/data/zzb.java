// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzv;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class zzb
    implements Iterator
{

    protected final DataBuffer zzRt;
    protected int zzRu;

    public zzb(DataBuffer databuffer)
    {
        zzRt = (DataBuffer)zzv.zzr(databuffer);
        zzRu = -1;
    }

    public boolean hasNext()
    {
        return zzRu < zzRt.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzRu).toString());
        } else
        {
            DataBuffer databuffer = zzRt;
            int i = zzRu + 1;
            zzRu = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            c, DataBuffer, d

public class h extends c
{

    private Object Kr;

    public h(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(JW).toString());
        }
        JW = JW + 1;
        if (JW == 0)
        {
            Kr = JV.get(0);
            if (!(Kr instanceof d))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(Kr.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((d)Kr).ap(JW);
        }
        return Kr;
    }
}

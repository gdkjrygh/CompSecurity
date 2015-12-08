// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            c, DataBuffer, d

public class h extends c
{

    private Object Lt;

    public h(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(KX).toString());
        }
        KX = KX + 1;
        if (KX == 0)
        {
            Lt = KW.get(0);
            if (!(Lt instanceof d))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(Lt.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((d)Lt).as(KX);
        }
        return Lt;
    }
}

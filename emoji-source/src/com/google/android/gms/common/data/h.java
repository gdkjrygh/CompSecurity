// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            c, DataBuffer, d

public class h extends c
{

    private Object EW;

    public h(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(EB).toString());
        }
        EB = EB + 1;
        if (EB == 0)
        {
            EW = EA.get(0);
            if (!(EW instanceof d))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(EW.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((d)EW).ac(EB);
        }
        return EW;
    }
}

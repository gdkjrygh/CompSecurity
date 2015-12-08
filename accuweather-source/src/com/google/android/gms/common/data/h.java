// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            c, DataBuffer, d

public class h extends c
{

    private Object ET;

    public h(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(Ey).toString());
        }
        Ey = Ey + 1;
        if (Ey == 0)
        {
            ET = Ex.get(0);
            if (!(ET instanceof d))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(ET.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((d)ET).ac(Ey);
        }
        return ET;
    }
}

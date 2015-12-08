// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            zzb, DataBuffer, zzc

public class zzg extends zzb
{

    private Object zzRQ;

    public zzg(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzRu).toString());
        }
        zzRu = zzRu + 1;
        if (zzRu == 0)
        {
            zzRQ = zzRt.get(0);
            if (!(zzRQ instanceof zzc))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(zzRQ.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((zzc)zzRQ).zzaB(zzRu);
        }
        return zzRQ;
    }
}

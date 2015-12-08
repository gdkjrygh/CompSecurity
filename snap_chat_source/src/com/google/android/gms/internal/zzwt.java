// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            zzxb, zzwy, zzwr

public class zzwt
{

    public final int tag;
    protected final int type;
    protected final Class zzaHC;
    protected final boolean zzaHD;

    int zzF(Object obj)
    {
        if (zzaHD)
        {
            return zzG(obj);
        } else
        {
            return zzH(obj);
        }
    }

    protected int zzG(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzH(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzH(Object obj)
    {
        int i = zzxb.zziI(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(type).toString());

        case 10: // '\n'
            return zzwr.zzb(i, (zzwy)obj);

        case 11: // '\013'
            return zzwr.zzc(i, (zzwy)obj);
        }
    }

    void zza(Object obj, zzwr zzwr1)
    {
        if (zzaHD)
        {
            zzc(obj, zzwr1);
            return;
        } else
        {
            zzb(obj, zzwr1);
            return;
        }
    }

    protected void zzb(Object obj, zzwr zzwr1)
    {
        zzwr1.zziA(tag);
        type;
        JVM INSTR tableswitch 10 11: default 107
    //                   10 73
    //                   11 98;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(type).toString());
_L2:
        try
        {
            obj = (zzwy)obj;
            int i = zzxb.zziI(tag);
            zzwr1.zzb(((zzwy) (obj)));
            zzwr1.zzC(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzwr1.zzc((zzwy)obj);
        return;
    }

    protected void zzc(Object obj, zzwr zzwr1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zzwr1);
            }
        }

    }
}

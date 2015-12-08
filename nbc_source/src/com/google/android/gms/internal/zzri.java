// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            zzrq, zzrn, zzrg

public class zzri
{

    public final int tag;
    protected final int type;
    protected final Class zzaVV;
    protected final boolean zzaVW;

    int zzQ(Object obj)
    {
        if (zzaVW)
        {
            return zzR(obj);
        } else
        {
            return zzS(obj);
        }
    }

    protected int zzR(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzS(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzS(Object obj)
    {
        int i = zzrq.zzkV(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return zzrg.zzb(i, (zzrn)obj);

        case 11: // '\013'
            return zzrg.zzc(i, (zzrn)obj);
        }
    }

    void zza(Object obj, zzrg zzrg1)
        throws IOException
    {
        if (zzaVW)
        {
            zzc(obj, zzrg1);
            return;
        } else
        {
            zzb(obj, zzrg1);
            return;
        }
    }

    protected void zzb(Object obj, zzrg zzrg1)
    {
        zzrg1.zzkN(tag);
        type;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        try
        {
            obj = (zzrn)obj;
            int i = zzrq.zzkV(tag);
            zzrg1.zzb(((zzrn) (obj)));
            zzrg1.zzC(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzrg1.zzc((zzrn)obj);
        return;
    }

    protected void zzc(Object obj, zzrg zzrg1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zzrg1);
            }
        }

    }
}

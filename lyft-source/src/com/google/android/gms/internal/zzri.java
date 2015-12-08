// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            zzrg, zzrn, zzrq

public class zzri
{

    protected final int a;
    protected final Class b;
    public final int c;
    protected final boolean d;

    int a(Object obj)
    {
        if (d)
        {
            return b(obj);
        } else
        {
            return c(obj);
        }
    }

    void a(Object obj, zzrg zzrg1)
    {
        if (d)
        {
            c(obj, zzrg1);
            return;
        } else
        {
            b(obj, zzrg1);
            return;
        }
    }

    protected int b(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + c(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected void b(Object obj, zzrg zzrg1)
    {
        zzrg1.g(c);
        a;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(a).toString());
_L2:
        try
        {
            obj = (zzrn)obj;
            int i = zzrq.b(c);
            zzrg1.a(((zzrn) (obj)));
            zzrg1.e(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzrg1.b((zzrn)obj);
        return;
    }

    protected int c(Object obj)
    {
        int i = zzrq.b(c);
        switch (a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(a).toString());

        case 10: // '\n'
            return zzrg.b(i, (zzrn)obj);

        case 11: // '\013'
            return zzrg.c(i, (zzrn)obj);
        }
    }

    protected void c(Object obj, zzrg zzrg1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                b(obj1, zzrg1);
            }
        }

    }
}

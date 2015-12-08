// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            yh, ye, xx

public final class xz
{

    protected final Class aYk;
    protected final boolean aYl;
    public final int tag;
    protected final int type;

    private int J(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + K(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    private int K(Object obj)
    {
        int i = yh.mu(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(type).toString());

        case 10: // '\n'
            return xx.b(i, (ye)obj);

        case 11: // '\013'
            return xx.c(i, (ye)obj);
        }
    }

    private void b(Object obj, xx xx1)
    {
        xx1.mm(tag);
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
            obj = (ye)obj;
            int i = yh.mu(tag);
            xx1.b(((ye) (obj)));
            xx1.G(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        xx1.c((ye)obj);
        return;
    }

    private void c(Object obj, xx xx1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                b(obj1, xx1);
            }
        }

    }

    final int I(Object obj)
    {
        if (aYl)
        {
            return J(obj);
        } else
        {
            return K(obj);
        }
    }

    final void a(Object obj, xx xx1)
        throws IOException
    {
        if (aYl)
        {
            c(obj, xx1);
            return;
        } else
        {
            b(obj, xx1);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            fg, fd, zzrx

public final class ey
{

    protected final int a;
    protected final Class b;
    public final int c;
    protected final boolean d;

    private int b(Object obj)
    {
        int i = fg.b(c);
        switch (a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(a).toString());

        case 10: // '\n'
            obj = (fd)obj;
            return zzrx.a(i) * 2 + ((fd) (obj)).e();

        case 11: // '\013'
            return zzrx.b(i, (fd)obj);
        }
    }

    private void b(Object obj, zzrx zzrx1)
    {
        zzrx1.b(c);
        a;
        JVM INSTR tableswitch 10 11: default 107
    //                   10 73
    //                   11 98;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(a).toString());
_L2:
        try
        {
            obj = (fd)obj;
            int i = fg.b(c);
            ((fd) (obj)).a(zzrx1);
            zzrx1.c(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzrx1.a((fd)obj);
        return;
    }

    final int a(Object obj)
    {
        int i = 0;
        int k;
        if (d)
        {
            int l = Array.getLength(obj);
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                k = i;
                if (Array.get(obj, j) != null)
                {
                    k = i + b(Array.get(obj, j));
                }
                j++;
                i = k;
            } while (true);
        } else
        {
            k = b(obj);
        }
        return k;
    }

    final void a(Object obj, zzrx zzrx1)
        throws IOException
    {
        if (d)
        {
            int j = Array.getLength(obj);
            for (int i = 0; i < j; i++)
            {
                Object obj1 = Array.get(obj, i);
                if (obj1 != null)
                {
                    b(obj1, zzrx1);
                }
            }

        } else
        {
            b(obj, zzrx1);
        }
    }
}

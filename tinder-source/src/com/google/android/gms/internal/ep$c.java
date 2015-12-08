// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            fd, ep, ew, fg, 
//            zzrx, fc

public static final class A extends fd
{

    public a a[];

    public final fd a(ew ew1)
        throws IOException
    {
        do
        {
            int i = ew1.a();
            switch (i)
            {
            default:
                if (fg.a(ew1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = fg.b(ew1, 10);
                A aa[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aa = new a[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aa, 0, j);
                    k = j;
                }
                for (; k < aa.length - 1; k++)
                {
                    aa[k] = new <init>();
                    ew1.a(aa[k]);
                    ew1.a();
                }

                aa[k] = new <init>();
                ew1.a(aa[k]);
                a = aa;
                break;
            }
        } while (true);
    }

    public final void a(zzrx zzrx1)
        throws IOException
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                a a1 = a[i];
                if (a1 != null)
                {
                    zzrx1.a(1, a1);
                }
            }

        }
        super.a(zzrx1);
    }

    protected final int b()
    {
        int i = super.b();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    a a1 = a[j];
                    k = i;
                    if (a1 != null)
                    {
                        k = i + zzrx.b(1, a1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (!fc.a(a, ((a) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (getClass().getName().hashCode() + 527) * 31 + fc.a(a);
    }

    public ()
    {
        a = a();
        A = -1;
    }
}

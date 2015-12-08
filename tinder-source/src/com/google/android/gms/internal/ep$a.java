// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            fd, ep, fc, ew, 
//            fg, zzrx

public static final class A extends fd
{

    private static volatile e f[];
    public e a[];
    public String b;
    public Long c;
    public Long d;
    public Integer e;

    public static A[] a()
    {
        if (f == null)
        {
            synchronized (fc.a)
            {
                if (f == null)
                {
                    f = new f[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

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
                f af[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                af = new a[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, af, 0, j);
                    k = j;
                }
                for (; k < af.length - 1; k++)
                {
                    af[k] = new <init>();
                    ew1.a(af[k]);
                    ew1.a();
                }

                af[k] = new <init>();
                ew1.a(af[k]);
                a = af;
                break;

            case 18: // '\022'
                b = ew1.d();
                break;

            case 24: // '\030'
                c = Long.valueOf(ew1.b());
                break;

            case 32: // ' '
                d = Long.valueOf(ew1.b());
                break;

            case 40: // '('
                e = Integer.valueOf(ew1.e());
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
                e e1 = a[i];
                if (e1 != null)
                {
                    zzrx1.a(1, e1);
                }
            }

        }
        if (b != null)
        {
            zzrx1.a(2, b);
        }
        if (c != null)
        {
            zzrx1.a(3, c.longValue());
        }
        if (d != null)
        {
            zzrx1.a(4, d.longValue());
        }
        if (e != null)
        {
            zzrx1.a(5, e.intValue());
        }
        super.a(zzrx1);
    }

    protected final int b()
    {
        int i = super.b();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    e e1 = a[k];
                    j = i;
                    if (e1 != null)
                    {
                        j = i + zzrx.b(1, e1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + zzrx.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + zzrx.b(3, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + zzrx.b(4, d.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i + zzrx.b(5, e.intValue());
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof e))
        {
            return false;
        }
        obj = (e)obj;
        if (!fc.a(a, ((a) (obj)).a))
        {
            return false;
        }
        if (b == null)
        {
            if (((b) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
        if (c == null)
        {
            if (((c) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((c) (obj)).c))
        {
            return false;
        }
        if (d == null)
        {
            if (((d) (obj)).d != null)
            {
                return false;
            }
        } else
        if (!d.equals(((d) (obj)).d))
        {
            return false;
        }
        if (e != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).e == null) goto _L1; else goto _L3
_L3:
        return false;
        if (e.equals(((e) (obj)).e)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int l = 0;
        int i1 = getClass().getName().hashCode();
        int j1 = fc.a(a);
        int i;
        int j;
        int k;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (e != null)
        {
            l = e.hashCode();
        }
        return (k + (j + (i + ((i1 + 527) * 31 + j1) * 31) * 31) * 31) * 31 + l;
    }

    public ()
    {
        a = a();
        b = null;
        c = null;
        d = null;
        e = null;
        A = -1;
    }
}

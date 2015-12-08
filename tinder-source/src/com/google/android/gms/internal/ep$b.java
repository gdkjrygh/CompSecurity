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

    private static volatile d e[];
    public String a;
    public String b;
    public Long c;
    public Float d;

    public static A[] a()
    {
        if (e == null)
        {
            synchronized (fc.a)
            {
                if (e == null)
                {
                    e = new e[0];
                }
            }
        }
        return e;
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
                a = ew1.d();
                break;

            case 18: // '\022'
                b = ew1.d();
                break;

            case 24: // '\030'
                c = Long.valueOf(ew1.b());
                break;

            case 37: // '%'
                d = Float.valueOf(Float.intBitsToFloat(ew1.f()));
                break;
            }
        } while (true);
    }

    public final void a(zzrx zzrx1)
        throws IOException
    {
        if (a != null)
        {
            zzrx1.a(1, a);
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
            zzrx1.a(4, d.floatValue());
        }
        super.a(zzrx1);
    }

    protected final int b()
    {
        int j = super.b();
        int i = j;
        if (a != null)
        {
            i = j + zzrx.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + zzrx.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + zzrx.b(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (zzrx.a(4) + 4);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof a))
        {
            return false;
        }
        obj = (a)obj;
        if (a == null)
        {
            if (((a) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((a) (obj)).a))
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
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((d) (obj)).d == null) goto _L1; else goto _L3
_L3:
        return false;
        if (d.equals(((d) (obj)).d)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int l = 0;
        int i1 = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.hashCode();
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + l;
    }

    public ()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        A = -1;
    }
}

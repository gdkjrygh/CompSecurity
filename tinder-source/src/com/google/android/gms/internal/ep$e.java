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
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Float e;

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

            case 8: // '\b'
                a = Long.valueOf(ew1.b());
                break;

            case 18: // '\022'
                b = ew1.d();
                break;

            case 26: // '\032'
                c = ew1.d();
                break;

            case 32: // ' '
                d = Long.valueOf(ew1.b());
                break;

            case 45: // '-'
                e = Float.valueOf(Float.intBitsToFloat(ew1.f()));
                break;
            }
        } while (true);
    }

    public final void a(zzrx zzrx1)
        throws IOException
    {
        if (a != null)
        {
            zzrx1.a(1, a.longValue());
        }
        if (b != null)
        {
            zzrx1.a(2, b);
        }
        if (c != null)
        {
            zzrx1.a(3, c);
        }
        if (d != null)
        {
            zzrx1.a(4, d.longValue());
        }
        if (e != null)
        {
            zzrx1.a(5, e.floatValue());
        }
        super.a(zzrx1);
    }

    protected final int b()
    {
        int j = super.b();
        int i = j;
        if (a != null)
        {
            i = j + zzrx.b(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + zzrx.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + zzrx.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + zzrx.b(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (zzrx.a(5) + 4);
        }
        return i;
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
        int i1 = 0;
        int j1 = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        int l;
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
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.hashCode();
        }
        if (e != null)
        {
            i1 = e.hashCode();
        }
        return (l + (k + (j + (i + (j1 + 527) * 31) * 31) * 31) * 31) * 31 + i1;
    }

    public ()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        A = -1;
    }
}

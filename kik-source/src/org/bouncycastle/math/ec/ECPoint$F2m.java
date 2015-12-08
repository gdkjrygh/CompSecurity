// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9IntegerConverter;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECPoint, ECCurve, ECFieldElement, ECConstants, 
//            i, g

public static class d extends ECPoint
{

    private static void a(ECPoint ecpoint, ECPoint ecpoint1)
    {
        if (!ecpoint.a.equals(ecpoint1.a))
        {
            throw new IllegalArgumentException("Only points on the same curve can be added or subtracted");
        } else
        {
            return;
        }
    }

    public final nit> a(nit> nit>)
    {
        if (d())
        {
            return nit>;
        }
        if (nit>.d())
        {
            return this;
        }
        nt.F2m f2m = (nt.F2m)((ECPoint) (nit>)).b;
        nit> = (nt.F2m)((ECPoint) (nit>)).c;
        if (b.equals(f2m))
        {
            if (c.equals(nit>))
            {
                return (c)h();
            } else
            {
                return (h)a.b();
            }
        } else
        {
            nit> = (nt.F2m)c.a(nit>).d(b.a(f2m));
            f2m = (nt.F2m)nit>.d().a(nit>).a(b).a(f2m).a(a.a);
            nit> = (nt.F2m)nit>.c(b.a(f2m)).a(f2m).a(c);
            return new <init>(a, f2m, nit>, d);
        }
    }

    public final ECPoint a(ECPoint ecpoint)
    {
        a(((ECPoint) (this)), ecpoint);
        return a((a)ecpoint);
    }

    public final a b(a a1)
    {
        if (a1.d())
        {
            return this;
        } else
        {
            return a((a)a1.g());
        }
    }

    public final ECPoint b(ECPoint ecpoint)
    {
        a(this, ecpoint);
        return b((b)ecpoint);
    }

    public final byte[] f()
    {
        if (d())
        {
            return new byte[1];
        }
        int j = X9IntegerConverter.a(b);
        byte abyte0[] = X9IntegerConverter.a(super.b.a(), j);
        if (d)
        {
            byte abyte1[] = new byte[j + 1];
            abyte1[0] = 2;
            if (!super.b.a().equals(ECConstants.f) && super.c.c(super.b.e()).a().testBit(0))
            {
                abyte1[0] = 3;
            }
            System.arraycopy(abyte0, 0, abyte1, 1, j);
            return abyte1;
        } else
        {
            byte abyte2[] = X9IntegerConverter.a(super.c.a(), j);
            byte abyte3[] = new byte[j + j + 1];
            abyte3[0] = 4;
            System.arraycopy(abyte0, 0, abyte3, 1, j);
            System.arraycopy(abyte2, 0, abyte3, j + 1, j);
            return abyte3;
        }
    }

    public final ECPoint g()
    {
        return new <init>(a, super.b, super.c.a(super.b), d);
    }

    public final ECPoint h()
    {
        if (d())
        {
            return this;
        }
        if (b.a().signum() == 0)
        {
            return a.b();
        } else
        {
            nt.F2m f2m1 = (nt.F2m)b.a(c.d(b));
            nt.F2m f2m = (nt.F2m)f2m1.d().a(f2m1).a(a.a);
            ECFieldElement ecfieldelement = a.a(ECConstants.g);
            f2m1 = (nt.F2m)b.d().a(f2m.c(f2m1.a(ecfieldelement)));
            return new <init>(a, f2m, f2m1, d);
        }
    }

    final void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null) goto _L2; else goto _L1
_L1:
        if (!((e)a).e()) goto _L4; else goto _L3
_L3:
        e = new i();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        e = new g();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public nt(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        this(eccurve, ecfieldelement, ecfieldelement1, false);
    }

    public nt(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
    {
        super(eccurve, ecfieldelement, ecfieldelement1);
        if (ecfieldelement != null && ecfieldelement1 == null || ecfieldelement == null && ecfieldelement1 != null)
        {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        if (ecfieldelement != null)
        {
            nt.F2m.a(b, c);
            if (eccurve != null)
            {
                nt.F2m.a(b, a.a);
            }
        }
        d = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9IntegerConverter;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECPoint, ECCurve, ECFieldElement, g

public static class d extends ECPoint
{

    public final ECPoint a(ECPoint ecpoint)
    {
        if (d())
        {
            return ecpoint;
        }
        if (ecpoint.d())
        {
            return this;
        }
        if (b.equals(ecpoint.b))
        {
            if (c.equals(ecpoint.c))
            {
                return h();
            } else
            {
                return a.b();
            }
        } else
        {
            ECFieldElement ecfieldelement = ecpoint.c.b(c).d(ecpoint.b.b(b));
            ecpoint = ecfieldelement.d().b(b).b(ecpoint.b);
            ecfieldelement = ecfieldelement.c(b.b(ecpoint)).b(c);
            return new <init>(a, ecpoint, ecfieldelement);
        }
    }

    public final ECPoint b(ECPoint ecpoint)
    {
        if (ecpoint.d())
        {
            return this;
        } else
        {
            return a(ecpoint.g());
        }
    }

    public final byte[] f()
    {
        if (d())
        {
            return new byte[1];
        }
        int j = X9IntegerConverter.a(b);
        if (d)
        {
            byte byte0;
            byte abyte0[];
            byte abyte2[];
            if (super.c.a().testBit(0))
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            abyte0 = X9IntegerConverter.a(super.b.a(), j);
            abyte2 = new byte[abyte0.length + 1];
            abyte2[0] = byte0;
            System.arraycopy(abyte0, 0, abyte2, 1, abyte0.length);
            return abyte2;
        } else
        {
            byte abyte1[] = X9IntegerConverter.a(super.b.a(), j);
            byte abyte3[] = X9IntegerConverter.a(super.c.a(), j);
            byte abyte4[] = new byte[abyte1.length + abyte3.length + 1];
            abyte4[0] = 4;
            System.arraycopy(abyte1, 0, abyte4, 1, abyte1.length);
            System.arraycopy(abyte3, 0, abyte4, abyte1.length + 1, abyte3.length);
            return abyte4;
        }
    }

    public final ECPoint g()
    {
        return new <init>(a, b, c.c(), d);
    }

    public final ECPoint h()
    {
        if (d())
        {
            return this;
        }
        if (c.a().signum() == 0)
        {
            return a.b();
        } else
        {
            ECFieldElement ecfieldelement = a.a(BigInteger.valueOf(2L));
            ECFieldElement ecfieldelement1 = a.a(BigInteger.valueOf(3L));
            ecfieldelement1 = b.d().c(ecfieldelement1).a(a.a).d(c.c(ecfieldelement));
            ecfieldelement = ecfieldelement1.d().b(b.c(ecfieldelement));
            ecfieldelement1 = ecfieldelement1.c(b.b(ecfieldelement)).b(c);
            return new <init>(a, ecfieldelement, ecfieldelement1, d);
        }
    }

    final void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public ent(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        this(eccurve, ecfieldelement, ecfieldelement1, false);
    }

    public ent(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
    {
        super(eccurve, ecfieldelement, ecfieldelement1);
        if (ecfieldelement != null && ecfieldelement1 == null || ecfieldelement == null && ecfieldelement1 != null)
        {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        } else
        {
            d = flag;
            return;
        }
    }
}

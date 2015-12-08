// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9IntegerConverter;

// Referenced classes of package org.spongycastle.math.ec:
//            ECCurve, a, b, ECFieldElement, 
//            d, ECConstants, i, g

public abstract class ECPoint
{
    public static class F2m extends ECPoint
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

        public final F2m a(F2m f2m)
        {
            if (d())
            {
                return f2m;
            }
            if (f2m.d())
            {
                return this;
            }
            ECFieldElement.F2m f2m1 = (ECFieldElement.F2m)((ECPoint) (f2m)).b;
            f2m = (ECFieldElement.F2m)((ECPoint) (f2m)).c;
            if (b.equals(f2m1))
            {
                if (c.equals(f2m))
                {
                    return (F2m)h();
                } else
                {
                    return (F2m)a.b();
                }
            } else
            {
                f2m = (ECFieldElement.F2m)c.a(f2m).d(b.a(f2m1));
                f2m1 = (ECFieldElement.F2m)f2m.d().a(f2m).a(b).a(f2m1).a(a.a);
                f2m = (ECFieldElement.F2m)f2m.c(b.a(f2m1)).a(f2m1).a(c);
                return new F2m(a, f2m1, f2m, d);
            }
        }

        public final ECPoint a(ECPoint ecpoint)
        {
            a(((ECPoint) (this)), ecpoint);
            return a((F2m)ecpoint);
        }

        public final F2m b(F2m f2m)
        {
            if (f2m.d())
            {
                return this;
            } else
            {
                return a((F2m)f2m.g());
            }
        }

        public final ECPoint b(ECPoint ecpoint)
        {
            a(this, ecpoint);
            return b((F2m)ecpoint);
        }

        public final byte[] f()
        {
            if (d())
            {
                return new byte[1];
            }
            int j = X9IntegerConverter.a(b);
            byte abyte0[] = X9IntegerConverter.a(b.a(), j);
            if (d)
            {
                byte abyte1[] = new byte[j + 1];
                abyte1[0] = 2;
                if (!b.a().equals(ECConstants.f) && c.c(b.e()).a().testBit(0))
                {
                    abyte1[0] = 3;
                }
                System.arraycopy(abyte0, 0, abyte1, 1, j);
                return abyte1;
            } else
            {
                byte abyte2[] = X9IntegerConverter.a(c.a(), j);
                byte abyte3[] = new byte[j + j + 1];
                abyte3[0] = 4;
                System.arraycopy(abyte0, 0, abyte3, 1, j);
                System.arraycopy(abyte2, 0, abyte3, j + 1, j);
                return abyte3;
            }
        }

        public final ECPoint g()
        {
            return new F2m(a, b, c.a(b), d);
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
                ECFieldElement.F2m f2m1 = (ECFieldElement.F2m)b.a(c.d(b));
                ECFieldElement.F2m f2m = (ECFieldElement.F2m)f2m1.d().a(f2m1).a(a.a);
                ECFieldElement ecfieldelement = a.a(ECConstants.g);
                f2m1 = (ECFieldElement.F2m)b.d().a(f2m.c(f2m1.a(ecfieldelement)));
                return new F2m(a, f2m, f2m1, d);
            }
        }

        final void i()
        {
            this;
            JVM INSTR monitorenter ;
            if (e != null) goto _L2; else goto _L1
_L1:
            if (!((ECCurve.F2m)a).e()) goto _L4; else goto _L3
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

        public F2m(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
        {
            this(eccurve, ecfieldelement, ecfieldelement1, false);
        }

        public F2m(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
        {
            super(eccurve, ecfieldelement, ecfieldelement1);
            if (ecfieldelement != null && ecfieldelement1 == null || ecfieldelement == null && ecfieldelement1 != null)
            {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (ecfieldelement != null)
            {
                ECFieldElement.F2m.a(b, c);
                if (eccurve != null)
                {
                    ECFieldElement.F2m.a(b, a.a);
                }
            }
            d = flag;
        }
    }

    public static class Fp extends ECPoint
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
                return new Fp(a, ecpoint, ecfieldelement);
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
                if (c.a().testBit(0))
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 2;
                }
                abyte0 = X9IntegerConverter.a(b.a(), j);
                abyte2 = new byte[abyte0.length + 1];
                abyte2[0] = byte0;
                System.arraycopy(abyte0, 0, abyte2, 1, abyte0.length);
                return abyte2;
            } else
            {
                byte abyte1[] = X9IntegerConverter.a(b.a(), j);
                byte abyte3[] = X9IntegerConverter.a(c.a(), j);
                byte abyte4[] = new byte[abyte1.length + abyte3.length + 1];
                abyte4[0] = 4;
                System.arraycopy(abyte1, 0, abyte4, 1, abyte1.length);
                System.arraycopy(abyte3, 0, abyte4, abyte1.length + 1, abyte3.length);
                return abyte4;
            }
        }

        public final ECPoint g()
        {
            return new Fp(a, b, c.c(), d);
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
                return new Fp(a, ecfieldelement, ecfieldelement1, d);
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

        public Fp(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
        {
            this(eccurve, ecfieldelement, ecfieldelement1, false);
        }

        public Fp(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
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


    private static X9IntegerConverter g = new X9IntegerConverter();
    ECCurve a;
    ECFieldElement b;
    ECFieldElement c;
    protected boolean d;
    protected a e;
    protected d f;

    protected ECPoint(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        e = null;
        f = null;
        a = eccurve;
        b = ecfieldelement;
        c = ecfieldelement1;
    }

    public final ECCurve a()
    {
        return a;
    }

    public final ECPoint a(BigInteger biginteger)
    {
        if (biginteger.signum() < 0)
        {
            throw new IllegalArgumentException("The multiplicator cannot be negative");
        }
        if (d())
        {
            return this;
        }
        if (biginteger.signum() == 0)
        {
            return a.b();
        } else
        {
            i();
            return e.a(this, biginteger, f);
        }
    }

    public abstract ECPoint a(ECPoint ecpoint);

    final void a(d d1)
    {
        f = d1;
    }

    public final ECFieldElement b()
    {
        return b;
    }

    public abstract ECPoint b(ECPoint ecpoint);

    public final ECFieldElement c()
    {
        return c;
    }

    public final boolean d()
    {
        return b == null && c == null;
    }

    public final boolean e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ECPoint))
            {
                return false;
            }
            obj = (ECPoint)obj;
            if (d())
            {
                return ((ECPoint) (obj)).d();
            }
            if (!b.equals(((ECPoint) (obj)).b) || !c.equals(((ECPoint) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public abstract byte[] f();

    public abstract ECPoint g();

    public abstract ECPoint h();

    public int hashCode()
    {
        if (d())
        {
            return 0;
        } else
        {
            return b.hashCode() ^ c.hashCode();
        }
    }

    void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}

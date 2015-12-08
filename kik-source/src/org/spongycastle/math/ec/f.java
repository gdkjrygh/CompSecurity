// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.math.ec:
//            ECConstants, k, ECCurve, ECFieldElement, 
//            ECPoint, e

final class f
{

    public static final k a[];
    public static final byte b[][];
    public static final k c[];
    public static final byte d[][];
    private static final BigInteger e;
    private static final BigInteger f;
    private static final BigInteger g;

    public static byte a(ECCurve.F2m f2m)
    {
        f2m = ((ECCurve) (f2m)).a.a();
        if (f2m.equals(ECConstants.f))
        {
            return -1;
        }
        if (f2m.equals(ECConstants.g))
        {
            return 1;
        } else
        {
            throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
        }
    }

    public static BigInteger a(byte byte0)
    {
        if (byte0 == 1)
        {
            return BigInteger.valueOf(6L);
        } else
        {
            return BigInteger.valueOf(10L);
        }
    }

    public static ECPoint.F2m a(ECPoint.F2m f2m)
    {
        if (f2m.d())
        {
            return f2m;
        } else
        {
            ECFieldElement ecfieldelement = ((ECPoint) (f2m)).b;
            ECFieldElement ecfieldelement1 = ((ECPoint) (f2m)).c;
            return new ECPoint.F2m(((ECPoint) (f2m)).a, ecfieldelement.d(), ecfieldelement1.d(), f2m.e());
        }
    }

    private static e a(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, byte byte0, int i)
    {
        int j = (i + 5) / 2 + 10;
        biginteger = biginteger1.multiply(biginteger.shiftRight((i - j - 2) + byte0));
        biginteger2 = biginteger.add(biginteger2.multiply(biginteger.shiftRight(i)));
        biginteger1 = biginteger2.shiftRight(j - 10);
        biginteger = biginteger1;
        if (biginteger2.testBit(j - 10 - 1))
        {
            biginteger = biginteger1.add(ECConstants.g);
        }
        return new e(biginteger, 10);
    }

    public static k a(BigInteger biginteger, int i, byte byte0, BigInteger abiginteger[], byte byte1)
    {
        BigInteger biginteger1;
        Object obj;
        Object obj1;
        if (byte1 == 1)
        {
            biginteger1 = abiginteger[0].add(abiginteger[1]);
        } else
        {
            biginteger1 = abiginteger[0].subtract(abiginteger[1]);
        }
        obj1 = a(byte1, i, true)[1];
        obj = a(biginteger, abiginteger[0], ((BigInteger) (obj1)), byte0, i);
        obj1 = a(biginteger, abiginteger[1], ((BigInteger) (obj1)), byte0, i);
        i = ((e) (obj)).b();
        if (((e) (obj1)).b() != i)
        {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (byte1 != 1 && byte1 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger biginteger2 = ((e) (obj)).a();
        BigInteger biginteger3 = ((e) (obj1)).a();
        e e1 = ((e) (obj)).a(biginteger2);
        obj1 = ((e) (obj1)).a(biginteger3);
        obj = e1.a(e1);
        e e2;
        e e3;
        int j;
        int l;
        if (byte1 == 1)
        {
            obj = ((e) (obj)).a(((e) (obj1)));
        } else
        {
            obj = ((e) (obj)).b(((e) (obj1)));
        }
        e3 = ((e) (obj1)).a(((e) (obj1))).a(((e) (obj1)));
        e2 = e3.a(((e) (obj1)));
        if (byte1 == 1)
        {
            obj1 = e1.b(e3);
            e1 = e1.a(e2);
        } else
        {
            obj1 = e1.a(e3);
            e1 = e1.b(e2);
        }
        l = 0;
        i = 0;
        if (((e) (obj)).b(ECConstants.g) >= 0)
        {
            if (((e) (obj1)).b(e) < 0)
            {
                i = byte1;
                j = l;
            } else
            {
                j = 1;
            }
        } else
        {
            j = l;
            if (e1.b(ECConstants.h) >= 0)
            {
                i = byte1;
                j = l;
            }
        }
        if (((e) (obj)).b(e) < 0)
        {
            if (((e) (obj1)).b(ECConstants.g) >= 0)
            {
                i = (byte)(-byte1);
                l = j;
            } else
            {
                l = -1;
            }
        } else
        {
            l = j;
            if (e1.b(f) < 0)
            {
                i = (byte)(-byte1);
                l = j;
            }
        }
        obj = new k(biginteger2.add(BigInteger.valueOf(l)), biginteger3.add(BigInteger.valueOf(i)));
        return new k(biginteger.subtract(biginteger1.multiply(((k) (obj)).a)).subtract(BigInteger.valueOf(2L).multiply(abiginteger[1]).multiply(((k) (obj)).b)), abiginteger[1].multiply(((k) (obj)).a).subtract(abiginteger[0].multiply(((k) (obj)).b)));
    }

    public static byte[] a(byte byte0, k k1, BigInteger biginteger, BigInteger biginteger1, k ak[])
    {
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        Object obj = k1.a.multiply(k1.a);
        Object obj1 = k1.a.multiply(k1.b);
        byte abyte0[] = k1.b.multiply(k1.b).shiftLeft(1);
        BigInteger biginteger2;
        int i;
        if (byte0 == 1)
        {
            obj = ((BigInteger) (obj)).add(((BigInteger) (obj1))).add(abyte0);
        } else
        if (byte0 == -1)
        {
            obj = ((BigInteger) (obj)).subtract(((BigInteger) (obj1))).add(abyte0);
        } else
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        i = ((BigInteger) (obj)).bitLength();
        if (i > 30)
        {
            i = i + 4 + 4;
        } else
        {
            i = 38;
        }
        abyte0 = new byte[i];
        biginteger2 = biginteger.shiftRight(1);
        obj = k1.a;
        k1 = k1.b;
        i = 0;
        while (!((BigInteger) (obj)).equals(ECConstants.f) || !k1.equals(ECConstants.f)) 
        {
            if (((BigInteger) (obj)).testBit(0))
            {
                obj1 = ((BigInteger) (obj)).add(k1.multiply(biginteger1)).mod(biginteger);
                byte byte1;
                boolean flag;
                byte byte2;
                if (((BigInteger) (obj1)).compareTo(biginteger2) >= 0)
                {
                    byte1 = (byte)((BigInteger) (obj1)).subtract(biginteger).intValue();
                } else
                {
                    byte1 = (byte)((BigInteger) (obj1)).intValue();
                }
                abyte0[i] = byte1;
                if (byte1 < 0)
                {
                    byte2 = (byte)(-byte1);
                    flag = false;
                } else
                {
                    byte2 = byte1;
                    flag = true;
                }
                if (flag)
                {
                    obj1 = ((BigInteger) (obj)).subtract(ak[byte2].a);
                    obj = k1.subtract(ak[byte2].b);
                    k1 = ((k) (obj1));
                } else
                {
                    obj = ((BigInteger) (obj)).add(ak[byte2].a);
                    obj1 = k1.add(ak[byte2].b);
                    k1 = ((k) (obj));
                    obj = obj1;
                }
            } else
            {
                abyte0[i] = 0;
                obj1 = obj;
                obj = k1;
                k1 = ((k) (obj1));
            }
            if (byte0 == 1)
            {
                obj = ((BigInteger) (obj)).add(k1.shiftRight(1));
            } else
            {
                obj = ((BigInteger) (obj)).subtract(k1.shiftRight(1));
            }
            k1 = k1.shiftRight(1).negate();
            i++;
        }
        return abyte0;
    }

    private static BigInteger[] a(byte byte0, int i, boolean flag)
    {
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger biginteger;
        BigInteger biginteger1;
        int j;
        if (flag)
        {
            biginteger1 = ECConstants.h;
            biginteger = BigInteger.valueOf(byte0);
        } else
        {
            biginteger1 = ECConstants.f;
            biginteger = ECConstants.g;
        }
        j = 1;
        while (j < i) 
        {
            BigInteger biginteger2;
            if (byte0 == 1)
            {
                biginteger2 = biginteger;
            } else
            {
                biginteger2 = biginteger.negate();
            }
            biginteger2 = biginteger2.subtract(biginteger1.shiftLeft(1));
            j++;
            biginteger1 = biginteger;
            biginteger = biginteger2;
        }
        return (new BigInteger[] {
            biginteger1, biginteger
        });
    }

    public static ECPoint.F2m[] a(ECPoint.F2m f2m, byte byte0)
    {
        ECPoint.F2m af2m[] = new ECPoint.F2m[16];
        af2m[1] = f2m;
        byte abyte0[][];
        int j;
        if (byte0 == 0)
        {
            abyte0 = b;
        } else
        {
            abyte0 = d;
        }
        j = abyte0.length;
        byte0 = 3;
        do
        {
            if (byte0 >= j)
            {
                break;
            }
            byte abyte1[] = abyte0[byte0];
            ECPoint.F2m f2m1 = (ECPoint.F2m)((ECCurve.F2m)((ECPoint) (f2m)).a).b();
            int i = abyte1.length - 1;
            while (i >= 0) 
            {
                ECPoint.F2m f2m2 = a(f2m1);
                if (abyte1[i] == 1)
                {
                    f2m1 = f2m2.a(f2m);
                } else
                {
                    f2m1 = f2m2;
                    if (abyte1[i] == -1)
                    {
                        f2m1 = f2m2.b(f2m);
                    }
                }
                i--;
            }
            af2m[byte0] = f2m1;
            byte0 += 2;
        } while (true);
        return af2m;
    }

    public static BigInteger[] b(ECCurve.F2m f2m)
    {
        if (!f2m.e())
        {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int i = f2m.h();
        int j = ((ECCurve) (f2m)).a.a().intValue();
        byte byte0 = f2m.f();
        int l = f2m.m().intValue();
        Object obj = a(byte0, (i + 3) - j, false);
        BigInteger abiginteger[];
        if (byte0 == 1)
        {
            f2m = ECConstants.g.subtract(obj[1]);
            obj = ECConstants.g.subtract(obj[0]);
        } else
        if (byte0 == -1)
        {
            f2m = ECConstants.g.add(obj[1]);
            obj = ECConstants.g.add(obj[0]);
        } else
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        abiginteger = new BigInteger[2];
        if (l == 2)
        {
            abiginteger[0] = f2m.shiftRight(1);
            abiginteger[1] = ((BigInteger) (obj)).shiftRight(1).negate();
            return abiginteger;
        }
        if (l == 4)
        {
            abiginteger[0] = f2m.shiftRight(2);
            abiginteger[1] = ((BigInteger) (obj)).shiftRight(2).negate();
            return abiginteger;
        } else
        {
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
    }

    static 
    {
        e = ECConstants.g.negate();
        f = ECConstants.h.negate();
        g = ECConstants.i.negate();
        a = (new k[] {
            null, new k(ECConstants.g, ECConstants.f), null, new k(g, e), null, new k(e, e), null, new k(ECConstants.g, e), null
        });
        byte abyte0[] = {
            -1, 0, 1
        };
        b = (new byte[][] {
            null, new byte[] {
                1
            }, null, abyte0, null, new byte[] {
                1, 0, 1
            }, null, new byte[] {
                -1, 0, 0, 1
            }
        });
        c = (new k[] {
            null, new k(ECConstants.g, ECConstants.f), null, new k(g, ECConstants.g), null, new k(e, ECConstants.g), null, new k(ECConstants.g, ECConstants.g), null
        });
        abyte0 = (new byte[] {
            1
        });
        byte abyte1[] = {
            -1, 0, 1
        };
        byte abyte2[] = {
            -1, 0, 0, -1
        };
        d = (new byte[][] {
            null, abyte0, null, abyte1, null, new byte[] {
                1, 0, 1
            }, null, abyte2
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;

public class GOST3410ParametersGenerator
{

    private static final BigInteger d = BigInteger.valueOf(1L);
    private static final BigInteger e = BigInteger.valueOf(2L);
    private int a;
    private int b;
    private SecureRandom c;

    public GOST3410ParametersGenerator()
    {
    }

    private int procedure_A(int i, int j, BigInteger abiginteger[], int k)
    {
        BigInteger abiginteger1[];
        int ai[];
        BigInteger biginteger2;
        BigInteger biginteger3;
        BigInteger abiginteger3[];
        int l;
        do
        {
            if (i >= 0)
            {
                l = j;
                if (i <= 0x10000)
                {
                    break;
                }
            }
            i = c.nextInt() / 32768;
        } while (true);
        for (; l < 0 || l > 0x10000 || l / 2 == 0; l = c.nextInt() / 32768 + 1) { }
        biginteger2 = new BigInteger(Integer.toString(l));
        biginteger3 = new BigInteger("19381");
        BigInteger biginteger = new BigInteger(Integer.toString(i));
        ai = new int[1];
        ai[0] = k;
        i = 0;
        for (j = 0; ai[j] >= 17; j++)
        {
            int ai1[] = new int[ai.length + 1];
            System.arraycopy(ai, 0, ai1, 0, ai.length);
            ai = new int[ai1.length];
            System.arraycopy(ai1, 0, ai, 0, ai1.length);
            ai[j + 1] = ai[j] / 2;
            i = j + 1;
        }

        abiginteger3 = new BigInteger[i + 1];
        abiginteger3[i] = new BigInteger("8003", 16);
        j = 0;
        k = i - 1;
        abiginteger1 = (new BigInteger[] {
            biginteger
        });
_L2:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = ai[k] / 16;
        Object obj = abiginteger1;
        do
        {
            BigInteger abiginteger2[] = new BigInteger[obj.length];
            System.arraycopy(obj, 0, abiginteger2, 0, obj.length);
            abiginteger1 = new BigInteger[l1 + 1];
            System.arraycopy(abiginteger2, 0, abiginteger1, 0, abiginteger2.length);
            for (int i1 = 0; i1 < l1; i1++)
            {
                abiginteger1[i1 + 1] = abiginteger1[i1].multiply(biginteger3).add(biginteger2).mod(e.pow(16));
            }

            obj = new BigInteger("0");
            for (int j1 = 0; j1 < l1; j1++)
            {
                obj = ((BigInteger) (obj)).add(abiginteger1[j1].multiply(e.pow(j1 * 16)));
            }

            abiginteger1[0] = abiginteger1[l1];
            obj = e.pow(ai[k] - 1).divide(abiginteger3[k + 1]).add(e.pow(ai[k] - 1).multiply(((BigInteger) (obj))).divide(abiginteger3[k + 1].multiply(e.pow(l1 * 16))));
            BigInteger biginteger1 = ((BigInteger) (obj));
            if (((BigInteger) (obj)).mod(e).compareTo(d) == 0)
            {
                biginteger1 = ((BigInteger) (obj)).add(d);
            }
            int k1 = 0;
            do
            {
                abiginteger3[k] = abiginteger3[k + 1].multiply(biginteger1.add(BigInteger.valueOf(k1))).add(d);
                obj = abiginteger1;
                if (abiginteger3[k].compareTo(e.pow(ai[k])) == 1)
                {
                    break;
                }
label0:
                {
                    if (e.modPow(abiginteger3[k + 1].multiply(biginteger1.add(BigInteger.valueOf(k1))), abiginteger3[k]).compareTo(d) == 0 && e.modPow(biginteger1.add(BigInteger.valueOf(k1)), abiginteger3[k]).compareTo(d) != 0)
                    {
                        k--;
                        if (k < 0)
                        {
                            abiginteger[0] = abiginteger3[0];
                            abiginteger[1] = abiginteger3[1];
                            return abiginteger1[0].intValue();
                        }
                        break label0;
                    }
                    k1 += 2;
                }
            } while (true);
        } while (true);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        return abiginteger1[0].intValue();
    }

    private long procedure_Aa(long l, long l1, BigInteger abiginteger[], int i)
    {
        BigInteger abiginteger1[];
        int ai[];
        BigInteger biginteger2;
        BigInteger biginteger3;
        BigInteger abiginteger3[];
        int k;
        int i1;
        long l2;
        do
        {
            if (l >= 0L)
            {
                l2 = l1;
                if (l <= 0x100000000L)
                {
                    break;
                }
            }
            l = c.nextInt() * 2;
        } while (true);
        for (; l2 < 0L || l2 > 0x100000000L || l2 / 2L == 0L; l2 = c.nextInt() * 2 + 1) { }
        biginteger2 = new BigInteger(Long.toString(l2));
        biginteger3 = new BigInteger("97781173");
        BigInteger biginteger = new BigInteger(Long.toString(l));
        ai = new int[1];
        ai[0] = i;
        i = 0;
        for (int j = 0; ai[j] >= 33; j++)
        {
            int ai1[] = new int[ai.length + 1];
            System.arraycopy(ai, 0, ai1, 0, ai.length);
            ai = new int[ai1.length];
            System.arraycopy(ai1, 0, ai, 0, ai1.length);
            ai[j + 1] = ai[j] / 2;
            i = j + 1;
        }

        abiginteger3 = new BigInteger[i + 1];
        abiginteger3[i] = new BigInteger("8000000B", 16);
        k = 0;
        i1 = i - 1;
        abiginteger1 = (new BigInteger[] {
            biginteger
        });
_L2:
        if (k >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        int j2 = ai[i1] / 32;
        Object obj = abiginteger1;
        do
        {
            BigInteger abiginteger2[] = new BigInteger[obj.length];
            System.arraycopy(obj, 0, abiginteger2, 0, obj.length);
            abiginteger1 = new BigInteger[j2 + 1];
            System.arraycopy(abiginteger2, 0, abiginteger1, 0, abiginteger2.length);
            for (int j1 = 0; j1 < j2; j1++)
            {
                abiginteger1[j1 + 1] = abiginteger1[j1].multiply(biginteger3).add(biginteger2).mod(e.pow(32));
            }

            obj = new BigInteger("0");
            for (int k1 = 0; k1 < j2; k1++)
            {
                obj = ((BigInteger) (obj)).add(abiginteger1[k1].multiply(e.pow(k1 * 32)));
            }

            abiginteger1[0] = abiginteger1[j2];
            obj = e.pow(ai[i1] - 1).divide(abiginteger3[i1 + 1]).add(e.pow(ai[i1] - 1).multiply(((BigInteger) (obj))).divide(abiginteger3[i1 + 1].multiply(e.pow(j2 * 32))));
            BigInteger biginteger1 = ((BigInteger) (obj));
            if (((BigInteger) (obj)).mod(e).compareTo(d) == 0)
            {
                biginteger1 = ((BigInteger) (obj)).add(d);
            }
            int i2 = 0;
            do
            {
                abiginteger3[i1] = abiginteger3[i1 + 1].multiply(biginteger1.add(BigInteger.valueOf(i2))).add(d);
                obj = abiginteger1;
                if (abiginteger3[i1].compareTo(e.pow(ai[i1])) == 1)
                {
                    break;
                }
label0:
                {
                    if (e.modPow(abiginteger3[i1 + 1].multiply(biginteger1.add(BigInteger.valueOf(i2))), abiginteger3[i1]).compareTo(d) == 0 && e.modPow(biginteger1.add(BigInteger.valueOf(i2)), abiginteger3[i1]).compareTo(d) != 0)
                    {
                        i1--;
                        if (i1 < 0)
                        {
                            abiginteger[0] = abiginteger3[0];
                            abiginteger[1] = abiginteger3[1];
                            return abiginteger1[0].longValue();
                        }
                        break label0;
                    }
                    i2 += 2;
                }
            } while (true);
        } while (true);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        return abiginteger1[0].longValue();
    }

    private void procedure_B(int i, int j, BigInteger abiginteger[])
    {
        BigInteger biginteger3;
        BigInteger biginteger4;
        BigInteger biginteger5;
        BigInteger biginteger6;
        BigInteger abiginteger2[];
        int k;
        do
        {
            if (i >= 0)
            {
                k = j;
                if (i <= 0x10000)
                {
                    break;
                }
            }
            i = c.nextInt() / 32768;
        } while (true);
        for (; k < 0 || k > 0x10000 || k / 2 == 0; k = c.nextInt() / 32768 + 1) { }
        BigInteger abiginteger1[] = new BigInteger[2];
        biginteger3 = new BigInteger(Integer.toString(k));
        biginteger4 = new BigInteger("19381");
        i = procedure_A(i, k, abiginteger1, 256);
        biginteger5 = abiginteger1[0];
        i = procedure_A(i, k, abiginteger1, 512);
        biginteger6 = abiginteger1[0];
        abiginteger2 = new BigInteger[65];
        abiginteger2[0] = new BigInteger(Integer.toString(i));
_L2:
        for (i = 0; i < 64; i++)
        {
            abiginteger2[i + 1] = abiginteger2[i].multiply(biginteger4).add(biginteger3).mod(e.pow(16));
        }

        BigInteger biginteger = new BigInteger("0");
        for (i = 0; i < 64; i++)
        {
            biginteger = biginteger.add(abiginteger2[i].multiply(e.pow(i * 16)));
        }

        abiginteger2[0] = abiginteger2[64];
        BigInteger biginteger1 = e.pow(1023).divide(biginteger5.multiply(biginteger6)).add(e.pow(1023).multiply(biginteger).divide(biginteger5.multiply(biginteger6).multiply(e.pow(1024))));
        biginteger = biginteger1;
        if (biginteger1.mod(e).compareTo(d) == 0)
        {
            biginteger = biginteger1.add(d);
        }
        i = 0;
        do
        {
            BigInteger biginteger2 = biginteger5.multiply(biginteger6).multiply(biginteger.add(BigInteger.valueOf(i))).add(d);
            if (biginteger2.compareTo(e.pow(1024)) == 1)
            {
                continue;
            }
            if (e.modPow(biginteger5.multiply(biginteger6).multiply(biginteger.add(BigInteger.valueOf(i))), biginteger2).compareTo(d) == 0 && e.modPow(biginteger5.multiply(biginteger.add(BigInteger.valueOf(i))), biginteger2).compareTo(d) != 0)
            {
                abiginteger[0] = biginteger2;
                abiginteger[1] = biginteger5;
                return;
            }
            i += 2;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void procedure_Bb(long l, long l1, BigInteger abiginteger[])
    {
        BigInteger biginteger1;
        BigInteger biginteger2;
        BigInteger biginteger3;
        BigInteger biginteger4;
        BigInteger abiginteger2[];
        for (; l < 0L || l > 0x100000000L; l = c.nextInt() * 2) { }
        for (; l1 < 0L || l1 > 0x100000000L || l1 / 2L == 0L; l1 = c.nextInt() * 2 + 1) { }
        BigInteger abiginteger1[] = new BigInteger[2];
        biginteger1 = new BigInteger(Long.toString(l1));
        biginteger2 = new BigInteger("97781173");
        l = procedure_Aa(l, l1, abiginteger1, 256);
        biginteger3 = abiginteger1[0];
        l = procedure_Aa(l, l1, abiginteger1, 512);
        biginteger4 = abiginteger1[0];
        abiginteger2 = new BigInteger[33];
        abiginteger2[0] = new BigInteger(Long.toString(l));
_L2:
        for (int i = 0; i < 32; i++)
        {
            abiginteger2[i + 1] = abiginteger2[i].multiply(biginteger2).add(biginteger1).mod(e.pow(32));
        }

        BigInteger biginteger = new BigInteger("0");
        for (int j = 0; j < 32; j++)
        {
            biginteger = biginteger.add(abiginteger2[j].multiply(e.pow(j * 32)));
        }

        abiginteger2[0] = abiginteger2[32];
        biginteger = e.pow(1023).divide(biginteger3.multiply(biginteger4)).add(e.pow(1023).multiply(biginteger).divide(biginteger3.multiply(biginteger4).multiply(e.pow(1024))));
        if (biginteger.mod(e).compareTo(d) == 0)
        {
            biginteger = biginteger.add(d);
        }
        int k = 0;
        do
        {
            BigInteger biginteger5 = biginteger3.multiply(biginteger4).multiply(biginteger.add(BigInteger.valueOf(k))).add(d);
            if (biginteger5.compareTo(e.pow(1024)) == 1)
            {
                continue;
            }
            if (e.modPow(biginteger3.multiply(biginteger4).multiply(biginteger.add(BigInteger.valueOf(k))), biginteger5).compareTo(d) == 0 && e.modPow(biginteger3.multiply(biginteger.add(BigInteger.valueOf(k))), biginteger5).compareTo(d) != 0)
            {
                abiginteger[0] = biginteger5;
                abiginteger[1] = biginteger3;
                return;
            }
            k += 2;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private BigInteger procedure_C(BigInteger biginteger, BigInteger biginteger1)
    {
        BigInteger biginteger2 = biginteger.subtract(d);
        biginteger1 = biginteger2.divide(biginteger1);
        int i = biginteger.bitLength();
        BigInteger biginteger3;
        do
        {
            do
            {
                biginteger3 = new BigInteger(i, c);
            } while (biginteger3.compareTo(d) <= 0 || biginteger3.compareTo(biginteger2) >= 0);
            biginteger3 = biginteger3.modPow(biginteger1, biginteger);
        } while (biginteger3.compareTo(d) == 0);
        return biginteger3;
    }

    public GOST3410Parameters generateParameters()
    {
        BigInteger abiginteger[] = new BigInteger[2];
        if (b != 1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = c.nextInt();
        j = c.nextInt();
        a;
        JVM INSTR lookupswitch 2: default 60
    //                   512: 70
    //                   1024: 116;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
_L4:
        procedure_A(i, j, abiginteger, 512);
_L6:
        BigInteger biginteger = abiginteger[0];
        abiginteger = abiginteger[1];
        return new GOST3410Parameters(biginteger, abiginteger, procedure_C(biginteger, abiginteger), new GOST3410ValidationParameters(i, j));
_L5:
        procedure_B(i, j, abiginteger);
        if (true) goto _L6; else goto _L2
_L2:
        long l;
        long l1;
        l = c.nextLong();
        l1 = c.nextLong();
        a;
        JVM INSTR lookupswitch 2: default 176
    //                   512: 186
    //                   1024: 234;
           goto _L7 _L8 _L9
_L7:
        throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
_L8:
        procedure_Aa(l, l1, abiginteger, 512);
_L11:
        BigInteger biginteger1 = abiginteger[0];
        abiginteger = abiginteger[1];
        return new GOST3410Parameters(biginteger1, abiginteger, procedure_C(biginteger1, abiginteger), new GOST3410ValidationParameters(l, l1));
_L9:
        procedure_Bb(l, l1, abiginteger);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        a = i;
        b = j;
        c = securerandom;
    }

}

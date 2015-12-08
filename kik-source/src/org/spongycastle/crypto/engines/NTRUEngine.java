// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.NTRUEncryptionParameters;
import org.spongycastle.crypto.params.NTRUEncryptionPrivateKeyParameters;
import org.spongycastle.crypto.params.NTRUEncryptionPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.math.ntru.polynomial.Polynomial;
import org.spongycastle.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.math.ntru.util.ArrayEncoder;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.engines:
//            IndexGenerator

public class NTRUEngine
    implements AsymmetricBlockCipher
{

    private boolean a;
    private NTRUEncryptionParameters b;
    private NTRUEncryptionPublicKeyParameters c;
    private NTRUEncryptionPrivateKeyParameters d;
    private SecureRandom e;

    public NTRUEngine()
    {
    }

    private IntegerPolynomial a(byte abyte0[], int i, int j, boolean flag)
    {
        Digest digest = b.A;
        int l = digest.b();
        byte abyte2[] = new byte[j * l];
        byte abyte1[] = abyte0;
        if (flag)
        {
            abyte1 = new byte[digest.b()];
            digest.a(abyte0, 0, abyte0.length);
            digest.a(abyte1, 0);
        }
        int k;
        for (k = 0; k < j; k++)
        {
            digest.a(abyte1, 0, abyte1.length);
            a(digest, k);
            System.arraycopy(a(digest), 0, abyte2, k * l, l);
        }

        IntegerPolynomial integerpolynomial = new IntegerPolynomial(i);
        abyte0 = abyte2;
        do
        {
            j = 0;
            for (int i1 = 0; i1 != abyte0.length;)
            {
                int k1 = abyte0[i1] & 0xff;
                int j1 = j;
                if (k1 < 243)
                {
                    j1 = k1;
                    boolean flag1 = false;
                    k1 = j;
                    for (j = ((flag1) ? 1 : 0); j < 4; j++)
                    {
                        int l1 = j1 % 3;
                        integerpolynomial.a[k1] = l1 - 1;
                        k1++;
                        if (k1 == i)
                        {
                            return integerpolynomial;
                        }
                        j1 = (j1 - l1) / 3;
                    }

                    integerpolynomial.a[k1] = j1 - 1;
                    j = k1 + 1;
                    j1 = j;
                    if (j == i)
                    {
                        return integerpolynomial;
                    }
                }
                i1++;
                j = j1;
            }

            if (j >= i)
            {
                return integerpolynomial;
            }
            digest.a(abyte1, 0, abyte1.length);
            a(digest, k);
            abyte0 = a(digest);
            k++;
        } while (true);
    }

    private Polynomial a(byte abyte0[])
    {
        abyte0 = new IndexGenerator(abyte0, b);
        if (b.z == 1)
        {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(a(((IndexGenerator) (abyte0)), b.h)), new SparseTernaryPolynomial(a(((IndexGenerator) (abyte0)), b.i)), new SparseTernaryPolynomial(a(((IndexGenerator) (abyte0)), b.j)));
        }
        int i = b.g;
        boolean flag = b.x;
        abyte0 = a(((IndexGenerator) (abyte0)), i);
        if (flag)
        {
            return new SparseTernaryPolynomial(abyte0);
        } else
        {
            return new DenseTernaryPolynomial(abyte0);
        }
    }

    private static void a(Digest digest, int i)
    {
        digest.a((byte)(i >> 24));
        digest.a((byte)(i >> 16));
        digest.a((byte)(i >> 8));
        digest.a((byte)i);
    }

    private static byte[] a(Digest digest)
    {
        byte abyte0[] = new byte[digest.b()];
        digest.a(abyte0, 0);
        return abyte0;
    }

    private static byte[] a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        if (i >= abyte0.length)
        {
            i = abyte0.length;
        }
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        return abyte1;
    }

    private static byte[] a(byte abyte0[], byte abyte1[], int i, byte abyte2[], byte abyte3[])
    {
        byte abyte4[] = new byte[abyte0.length + i + abyte2.length + abyte3.length];
        System.arraycopy(abyte0, 0, abyte4, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte4, abyte0.length, abyte1.length);
        System.arraycopy(abyte2, 0, abyte4, abyte0.length + abyte1.length, abyte2.length);
        System.arraycopy(abyte3, 0, abyte4, abyte0.length + abyte1.length + abyte2.length, abyte3.length);
        return abyte4;
    }

    private int[] a(IndexGenerator indexgenerator, int i)
    {
        int ai[] = new int[b.a];
label0:
        for (int j = -1; j <= 1; j += 2)
        {
            int k = 0;
            do
            {
                if (k >= i)
                {
                    continue label0;
                }
                int l = indexgenerator.a();
                if (ai[l] == 0)
                {
                    ai[l] = j;
                    k++;
                }
            } while (true);
        }

        return ai;
    }

    public final int a()
    {
        return b.m;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a = flag;
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                e = cipherparameters.a();
                c = (NTRUEncryptionPublicKeyParameters)cipherparameters.b();
            } else
            {
                e = new SecureRandom();
                c = (NTRUEncryptionPublicKeyParameters)cipherparameters;
            }
            b = c.b();
            return;
        } else
        {
            d = (NTRUEncryptionPrivateKeyParameters)cipherparameters;
            b = d.b();
            return;
        }
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte4[] = new byte[j];
        System.arraycopy(abyte0, i, abyte4, 0, j);
        if (a)
        {
            abyte0 = c.c;
            i = b.a;
            j = b.b;
            int k = b.m;
            int i1 = b.n;
            int k1 = b.o;
            int i2 = b.q;
            int k2 = b.r;
            int i3 = b.u;
            boolean flag = b.v;
            byte abyte1[] = b.w;
            int j3 = abyte4.length;
            if (k > 255)
            {
                throw new IllegalArgumentException("llen values bigger than 1 are not supported");
            }
            if (j3 > k)
            {
                throw new DataLengthException((new StringBuilder("Message too long: ")).append(j3).append(">").append(k).toString());
            }
            IntegerPolynomial integerpolynomial;
            IntegerPolynomial integerpolynomial2;
            do
            {
                byte abyte2[] = new byte[i1 / 8];
                e.nextBytes(abyte2);
                byte abyte5[] = new byte[(k + 1) - j3];
                byte abyte7[] = new byte[k1 / 8];
                System.arraycopy(abyte2, 0, abyte7, 0, abyte2.length);
                abyte7[abyte2.length] = (byte)j3;
                System.arraycopy(abyte4, 0, abyte7, abyte2.length + 1, abyte4.length);
                System.arraycopy(abyte5, 0, abyte7, abyte2.length + 1 + abyte4.length, abyte5.length);
                integerpolynomial2 = IntegerPolynomial.a(abyte7, i);
                integerpolynomial = a(a(abyte1, abyte4, j3, abyte2, a(abyte0.a(j), k2 / 8))).a(abyte0, j);
                IntegerPolynomial integerpolynomial4 = (IntegerPolynomial)integerpolynomial.clone();
                integerpolynomial4.b(4);
                integerpolynomial2.b(a(integerpolynomial4.a(4), i, i3, flag));
                integerpolynomial2.e();
            } while (integerpolynomial2.f(-1) < i2 || integerpolynomial2.f(0) < i2 || integerpolynomial2.f(1) < i2);
            integerpolynomial.b(integerpolynomial2);
            integerpolynomial.c(j);
            integerpolynomial.d(j);
            return integerpolynomial.a(j);
        }
        Object obj = d;
        abyte0 = ((NTRUEncryptionPrivateKeyParameters) (obj)).c;
        IntegerPolynomial integerpolynomial3 = ((NTRUEncryptionPrivateKeyParameters) (obj)).d;
        obj = ((NTRUEncryptionPrivateKeyParameters) (obj)).e;
        int j1 = b.a;
        i = b.b;
        int l2 = b.n;
        j = b.m;
        int l1 = b.q;
        int l = b.r;
        int j2 = b.u;
        boolean flag1 = b.v;
        byte abyte3[] = b.w;
        if (j > 255)
        {
            throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported");
        }
        l2 /= 8;
        IntegerPolynomial integerpolynomial1 = IntegerPolynomial.a(abyte4, j1, i);
        if (b.y)
        {
            abyte0 = abyte0.a(integerpolynomial1, b.b);
            abyte0.d();
            abyte0.b(integerpolynomial1);
        } else
        {
            abyte0 = abyte0.a(integerpolynomial1, b.b);
        }
        abyte0.e(b.b);
        abyte0.e();
        if (!b.y)
        {
            abyte0 = (new DenseTernaryPolynomial(abyte0)).a(integerpolynomial3, 3);
        }
        abyte0.e(3);
        if (abyte0.f(-1) < l1)
        {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal -1");
        }
        if (abyte0.f(0) < l1)
        {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 0");
        }
        if (abyte0.f(1) < l1)
        {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 1");
        }
        integerpolynomial1 = (IntegerPolynomial)integerpolynomial1.clone();
        integerpolynomial1.c(abyte0);
        integerpolynomial1.b(i);
        integerpolynomial3 = (IntegerPolynomial)integerpolynomial1.clone();
        integerpolynomial3.b(4);
        abyte0.c(a(integerpolynomial3.a(4), j1, j2, flag1));
        abyte0.e();
        byte abyte6[] = ArrayEncoder.a(((IntegerPolynomial) (abyte0)).a);
        byte abyte8[] = new byte[l2];
        System.arraycopy(abyte6, 0, abyte8, 0, l2);
        j1 = abyte6[l2] & 0xff;
        if (j1 > j)
        {
            throw new InvalidCipherTextException((new StringBuilder("Message too long: ")).append(j1).append(">").append(j).toString());
        }
        abyte0 = new byte[j1];
        System.arraycopy(abyte6, l2 + 1, abyte0, 0, j1);
        byte abyte9[] = new byte[abyte6.length - (l2 + 1 + j1)];
        System.arraycopy(abyte6, l2 + 1 + j1, abyte9, 0, abyte9.length);
        if (!Arrays.a(abyte9, new byte[abyte9.length]))
        {
            throw new InvalidCipherTextException("The message is not followed by zeroes");
        }
        obj = a(a(abyte3, abyte0, j1, abyte8, a(((IntegerPolynomial) (obj)).a(i), l / 8))).a(((IntegerPolynomial) (obj)));
        ((IntegerPolynomial) (obj)).b(i);
        if (!((IntegerPolynomial) (obj)).equals(integerpolynomial1))
        {
            throw new InvalidCipherTextException("Invalid message encoding");
        } else
        {
            return abyte0;
        }
    }

    public final int b()
    {
        int i = b.a;
        if (b.b == 2048)
        {
            return (i * 11 + 7) / 8;
        } else
        {
            throw new IllegalStateException("log2 not fully implemented");
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.NaccacheSternKeyParameters;
import org.spongycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

public class NaccacheSternEngine
    implements AsymmetricBlockCipher
{

    private static BigInteger e = BigInteger.valueOf(0L);
    private static BigInteger f = BigInteger.valueOf(1L);
    private boolean a;
    private NaccacheSternKeyParameters b;
    private Vector c[];
    private boolean d;

    public NaccacheSternEngine()
    {
        c = null;
        d = false;
    }

    private static BigInteger a(Vector vector, Vector vector1)
    {
        boolean flag = false;
        BigInteger biginteger1 = e;
        BigInteger biginteger = f;
        for (int i = 0; i < vector1.size(); i++)
        {
            biginteger = biginteger.multiply((BigInteger)vector1.elementAt(i));
        }

        for (int j = ((flag) ? 1 : 0); j < vector1.size(); j++)
        {
            BigInteger biginteger2 = (BigInteger)vector1.elementAt(j);
            BigInteger biginteger3 = biginteger.divide(biginteger2);
            biginteger1 = biginteger1.add(biginteger3.multiply(biginteger3.modInverse(biginteger2)).multiply((BigInteger)vector.elementAt(j)));
        }

        return biginteger1.mod(biginteger);
    }

    public final int a()
    {
        if (a)
        {
            return (b.c() + 7) / 8 - 1;
        } else
        {
            return b.d().toByteArray().length;
        }
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = ((ParametersWithRandom)cipherparameters).b();
        }
        b = (NaccacheSternKeyParameters)cipherparameters;
        if (!a)
        {
            if (d)
            {
                System.out.println("Constructing lookup Array");
            }
            NaccacheSternPrivateKeyParameters naccachesternprivatekeyparameters = (NaccacheSternPrivateKeyParameters)b;
            Vector vector = naccachesternprivatekeyparameters.f();
            c = new Vector[vector.size()];
            for (int i = 0; i < vector.size(); i++)
            {
                BigInteger biginteger = (BigInteger)vector.elementAt(i);
                int k = biginteger.intValue();
                c[i] = new Vector();
                c[i].addElement(f);
                if (d)
                {
                    System.out.println((new StringBuilder("Constructing lookup ArrayList for ")).append(k).toString());
                }
                cipherparameters = e;
                for (int j = 1; j < k; j++)
                {
                    cipherparameters = cipherparameters.add(naccachesternprivatekeyparameters.e());
                    BigInteger biginteger1 = cipherparameters.divide(biginteger);
                    c[i].addElement(naccachesternprivatekeyparameters.b().modPow(biginteger1, naccachesternprivatekeyparameters.d()));
                }

            }

        }
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        boolean flag;
label0:
        {
            flag = false;
            if (b == null)
            {
                throw new IllegalStateException("NaccacheStern engine not initialised");
            }
            if (j > a() + 1)
            {
                throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
            }
            if (!a && j < a())
            {
                throw new InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
            }
            if (i == 0)
            {
                abyte1 = abyte0;
                if (j == abyte0.length)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
        }
        abyte0 = new BigInteger(1, abyte1);
        if (d)
        {
            System.out.println((new StringBuilder("input as BigInteger: ")).append(abyte0).toString());
        }
        if (a)
        {
            byte abyte2[] = b.d().toByteArray();
            Arrays.a(abyte2, (byte)0);
            abyte0 = b.b().modPow(abyte0, b.d()).toByteArray();
            System.arraycopy(abyte0, 0, abyte2, abyte2.length - abyte0.length, abyte0.length);
            if (d)
            {
                System.out.println((new StringBuilder("Encrypted value is:  ")).append(new BigInteger(abyte2)).toString());
            }
            return abyte2;
        }
        Vector vector = new Vector();
        NaccacheSternPrivateKeyParameters naccachesternprivatekeyparameters = (NaccacheSternPrivateKeyParameters)b;
        Vector vector1 = naccachesternprivatekeyparameters.f();
        for (i = 0; i < vector1.size(); i++)
        {
            BigInteger biginteger = abyte0.modPow(naccachesternprivatekeyparameters.e().divide((BigInteger)vector1.elementAt(i)), naccachesternprivatekeyparameters.d());
            Vector vector2 = c[i];
            if (c[i].size() != ((BigInteger)vector1.elementAt(i)).intValue())
            {
                if (d)
                {
                    System.out.println((new StringBuilder("Prime is ")).append(vector1.elementAt(i)).append(", lookup table has size ").append(vector2.size()).toString());
                }
                throw new InvalidCipherTextException((new StringBuilder("Error in lookup Array for ")).append(((BigInteger)vector1.elementAt(i)).intValue()).append(": Size mismatch. Expected ArrayList with length ").append(((BigInteger)vector1.elementAt(i)).intValue()).append(" but found ArrayList of length ").append(c[i].size()).toString());
            }
            j = vector2.indexOf(biginteger);
            if (j == -1)
            {
                if (d)
                {
                    System.out.println((new StringBuilder("Actual prime is ")).append(vector1.elementAt(i)).toString());
                    System.out.println((new StringBuilder("Decrypted value is ")).append(biginteger).toString());
                    System.out.println((new StringBuilder("LookupList for ")).append(vector1.elementAt(i)).append(" with size ").append(c[i].size()).append(" is: ").toString());
                    for (j = ((flag) ? 1 : 0); j < c[i].size(); j++)
                    {
                        System.out.println(c[i].elementAt(j));
                    }

                }
                throw new InvalidCipherTextException("Lookup failed");
            }
            vector.addElement(BigInteger.valueOf(j));
        }

        return a(vector, vector1).toByteArray();
    }

    public final int b()
    {
        if (a)
        {
            return b.d().toByteArray().length;
        } else
        {
            return (b.c() + 7) / 8 - 1;
        }
    }

}

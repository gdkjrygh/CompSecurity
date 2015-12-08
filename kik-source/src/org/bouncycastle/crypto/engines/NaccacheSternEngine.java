// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

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

    private static BigInteger chineseRemainder(Vector vector, Vector vector1)
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

    public byte[] addCryptedBlocks(byte abyte0[], byte abyte1[])
    {
        if (a)
        {
            if (abyte0.length > getOutputBlockSize() || abyte1.length > getOutputBlockSize())
            {
                throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else
        if (abyte0.length > getInputBlockSize() || abyte1.length > getInputBlockSize())
        {
            throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        abyte0 = new BigInteger(1, abyte0);
        BigInteger biginteger = new BigInteger(1, abyte1);
        abyte1 = abyte0.multiply(biginteger).mod(b.getModulus());
        if (d)
        {
            System.out.println((new StringBuilder("c(m1) as BigInteger:....... ")).append(abyte0).toString());
            System.out.println((new StringBuilder("c(m2) as BigInteger:....... ")).append(biginteger).toString());
            System.out.println((new StringBuilder("c(m1)*c(m2)%n = c(m1+m2)%n: ")).append(abyte1).toString());
        }
        abyte0 = b.getModulus().toByteArray();
        Arrays.a(abyte0);
        System.arraycopy(abyte1.toByteArray(), 0, abyte0, abyte0.length - abyte1.toByteArray().length, abyte1.toByteArray().length);
        return abyte0;
    }

    public byte[] encrypt(BigInteger biginteger)
    {
        byte abyte0[] = b.getModulus().toByteArray();
        Arrays.a(abyte0);
        biginteger = b.getG().modPow(biginteger, b.getModulus()).toByteArray();
        System.arraycopy(biginteger, 0, abyte0, abyte0.length - biginteger.length, biginteger.length);
        if (d)
        {
            System.out.println((new StringBuilder("Encrypted value is:  ")).append(new BigInteger(abyte0)).toString());
        }
        return abyte0;
    }

    public int getInputBlockSize()
    {
        if (a)
        {
            return (b.getLowerSigmaBound() + 7) / 8 - 1;
        } else
        {
            return b.getModulus().toByteArray().length;
        }
    }

    public int getOutputBlockSize()
    {
        if (a)
        {
            return b.getModulus().toByteArray().length;
        } else
        {
            return (b.getLowerSigmaBound() + 7) / 8 - 1;
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        a = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = ((ParametersWithRandom)cipherparameters).getParameters();
        }
        b = (NaccacheSternKeyParameters)cipherparameters;
        if (!a)
        {
            if (d)
            {
                System.out.println("Constructing lookup Array");
            }
            NaccacheSternPrivateKeyParameters naccachesternprivatekeyparameters = (NaccacheSternPrivateKeyParameters)b;
            Vector vector = naccachesternprivatekeyparameters.getSmallPrimes();
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
                    cipherparameters = cipherparameters.add(naccachesternprivatekeyparameters.getPhi_n());
                    BigInteger biginteger1 = cipherparameters.divide(biginteger);
                    c[i].addElement(naccachesternprivatekeyparameters.getG().modPow(biginteger1, naccachesternprivatekeyparameters.getModulus()));
                }

            }

        }
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
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
            if (j > getInputBlockSize() + 1)
            {
                throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
            }
            if (!a && j < getInputBlockSize())
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
            return encrypt(abyte0);
        }
        Vector vector = new Vector();
        NaccacheSternPrivateKeyParameters naccachesternprivatekeyparameters = (NaccacheSternPrivateKeyParameters)b;
        Vector vector1 = naccachesternprivatekeyparameters.getSmallPrimes();
        for (i = 0; i < vector1.size(); i++)
        {
            BigInteger biginteger = abyte0.modPow(naccachesternprivatekeyparameters.getPhi_n().divide((BigInteger)vector1.elementAt(i)), naccachesternprivatekeyparameters.getModulus());
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

        return chineseRemainder(vector, vector1).toByteArray();
    }

    public byte[] processData(byte abyte0[])
    {
        if (d)
        {
            System.out.println();
        }
        if (abyte0.length > getInputBlockSize())
        {
            int l = getInputBlockSize();
            int i = getOutputBlockSize();
            if (d)
            {
                System.out.println((new StringBuilder("Input blocksize is:  ")).append(l).append(" bytes").toString());
                System.out.println((new StringBuilder("Output blocksize is: ")).append(i).append(" bytes").toString());
                System.out.println((new StringBuilder("Data has length:.... ")).append(abyte0.length).append(" bytes").toString());
            }
            byte abyte2[] = new byte[i * (abyte0.length / l + 1)];
            int k = 0;
            for (int j = 0; j < abyte0.length;)
            {
                byte abyte1[];
                if (j + l < abyte0.length)
                {
                    abyte1 = processBlock(abyte0, j, l);
                    j += l;
                } else
                {
                    abyte1 = processBlock(abyte0, j, abyte0.length - j);
                    j += abyte0.length - j;
                }
                if (d)
                {
                    System.out.println((new StringBuilder("new datapos is ")).append(j).toString());
                }
                if (abyte1 != null)
                {
                    System.arraycopy(abyte1, 0, abyte2, k, abyte1.length);
                    k += abyte1.length;
                } else
                {
                    if (d)
                    {
                        System.out.println("cipher returned null");
                    }
                    throw new InvalidCipherTextException("cipher returned null");
                }
            }

            abyte0 = new byte[k];
            System.arraycopy(abyte2, 0, abyte0, 0, k);
            if (d)
            {
                System.out.println((new StringBuilder("returning ")).append(abyte0.length).append(" bytes").toString());
            }
            return abyte0;
        }
        if (d)
        {
            System.out.println("data size is less then input block size, processing directly");
        }
        return processBlock(abyte0, 0, abyte0.length);
    }

    public void setDebug(boolean flag)
    {
        d = flag;
    }

}

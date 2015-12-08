// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public class MD2Digest
    implements ExtendedDigest
{

    private static final int DIGEST_LENGTH = 16;
    private static final byte S[] = {
        41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 
        84, -95, -20, -16, 6, 19, 98, -89, 5, -13, 
        -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, 
        -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 
        103, 66, 111, 24, -118, 23, -27, 18, -66, 78, 
        -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, 
        -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 
        7, 63, -108, -62, 16, -119, 11, 34, 95, 33, 
        -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, 
        -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 
        72, -91, -75, -47, -41, 94, -110, 42, -84, 86, 
        -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 
        118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 
        112, 89, 100, 113, -121, 32, -122, 91, -49, 101, 
        -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, 
        -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 
        85, 71, -93, 35, -35, 81, -81, 58, -61, 92, 
        -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, 
        -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 
        77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 
        36, -31, 123, 8, 12, -67, -79, 74, 120, -120, 
        -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 
        59, 0, 29, 57, -14, -17, -73, 14, 102, 88, 
        -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 
        49, 68, 80, -76, -113, -19, 31, 26, -37, -103, 
        -115, 51, -97, 17, -125, 20
    };
    private byte C[];
    private int COff;
    private byte M[];
    private byte X[];
    private int mOff;
    private int xOff;

    public MD2Digest()
    {
        X = new byte[48];
        M = new byte[16];
        C = new byte[16];
        reset();
    }

    public MD2Digest(MD2Digest md2digest)
    {
        X = new byte[48];
        M = new byte[16];
        C = new byte[16];
        System.arraycopy(md2digest.X, 0, X, 0, md2digest.X.length);
        xOff = md2digest.xOff;
        System.arraycopy(md2digest.M, 0, M, 0, md2digest.M.length);
        mOff = md2digest.mOff;
        System.arraycopy(md2digest.C, 0, C, 0, md2digest.C.length);
        COff = md2digest.COff;
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte byte0 = (byte)(M.length - mOff);
        for (int j = mOff; j < M.length; j++)
        {
            M[j] = byte0;
        }

        processCheckSum(M);
        processBlock(M);
        processBlock(C);
        System.arraycopy(X, xOff, abyte0, i, 16);
        reset();
        return 16;
    }

    public String getAlgorithmName()
    {
        return "MD2";
    }

    public int getByteLength()
    {
        return 16;
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock(byte abyte0[])
    {
        for (int i = 0; i < 16; i++)
        {
            X[i + 16] = abyte0[i];
            X[i + 32] = (byte)(abyte0[i] ^ X[i]);
        }

        int k = 0;
        int j = 0;
        do
        {
            int l = k;
            if (l < 18)
            {
                for (k = 0; k < 48; k++)
                {
                    abyte0 = X;
                    byte byte1 = abyte0[k];
                    byte byte0 = (byte)(S[j] ^ byte1);
                    abyte0[k] = byte0;
                    j = byte0 & 0xff;
                }

                k = l + 1;
                j = (j + l) % 256;
            } else
            {
                return;
            }
        } while (true);
    }

    protected void processCheckSum(byte abyte0[])
    {
        byte byte0 = C[15];
        for (int i = 0; i < 16; i++)
        {
            byte abyte1[] = C;
            byte byte1 = abyte1[i];
            abyte1[i] = (byte)(S[(byte0 ^ abyte0[i]) & 0xff] ^ byte1);
            byte0 = C[i];
        }

    }

    public void reset()
    {
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

        mOff = 0;
        for (int j = 0; j != M.length; j++)
        {
            M[j] = 0;
        }

        COff = 0;
        for (int k = 0; k != C.length; k++)
        {
            C[k] = 0;
        }

    }

    public void update(byte byte0)
    {
        byte abyte0[] = M;
        int i = mOff;
        mOff = i + 1;
        abyte0[i] = byte0;
        if (mOff == 16)
        {
            processCheckSum(M);
            processBlock(M);
            mOff = 0;
        }
    }

    public void update(byte abyte0[], int i, int j)
    {
_L2:
        do
        {
            int k = i;
            int i1 = j;
            if (i > 16)
            {
                System.arraycopy(abyte0, j, M, 0, 16);
                processCheckSum(M);
                processBlock(M);
                i -= 16;
                j += 16;
            } else
            {
                for (; k > 0; k--)
                {
                    update(abyte0[i1]);
                    i1++;
                }

                return;
            }
        } while (true);
        for (; mOff != 0 && j > 0; j--)
        {
            update(abyte0[i]);
            i++;
        }

        int l = i;
        i = j;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

}

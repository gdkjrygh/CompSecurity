// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

public class GOST3411Digest
    implements ExtendedDigest
{

    private static final byte C2[] = {
        0, -1, 0, -1, 0, -1, 0, -1, -1, 0, 
        -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, 
        -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 
        0, -1
    };
    private static final int DIGEST_LENGTH = 32;
    private byte C[][];
    private byte H[];
    private byte K[];
    private byte L[];
    private byte M[];
    byte S[];
    private byte Sum[];
    byte U[];
    byte V[];
    byte W[];
    byte a[];
    private long byteCount;
    private BlockCipher cipher;
    private byte sBox[];
    short wS[];
    short w_S[];
    private byte xBuf[];
    private int xBufOff;

    public GOST3411Digest()
    {
        H = new byte[32];
        L = new byte[32];
        M = new byte[32];
        Sum = new byte[32];
        C = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 32
        });
        xBuf = new byte[32];
        cipher = new GOST28147Engine();
        K = new byte[32];
        a = new byte[8];
        wS = new short[16];
        w_S = new short[16];
        S = new byte[32];
        U = new byte[32];
        V = new byte[32];
        W = new byte[32];
        sBox = GOST28147Engine.getSBox("D-A");
        cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    public GOST3411Digest(GOST3411Digest gost3411digest)
    {
        H = new byte[32];
        L = new byte[32];
        M = new byte[32];
        Sum = new byte[32];
        C = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 32
        });
        xBuf = new byte[32];
        cipher = new GOST28147Engine();
        K = new byte[32];
        a = new byte[8];
        wS = new short[16];
        w_S = new short[16];
        S = new byte[32];
        U = new byte[32];
        V = new byte[32];
        W = new byte[32];
        sBox = gost3411digest.sBox;
        cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
        System.arraycopy(gost3411digest.H, 0, H, 0, gost3411digest.H.length);
        System.arraycopy(gost3411digest.L, 0, L, 0, gost3411digest.L.length);
        System.arraycopy(gost3411digest.M, 0, M, 0, gost3411digest.M.length);
        System.arraycopy(gost3411digest.Sum, 0, Sum, 0, gost3411digest.Sum.length);
        System.arraycopy(gost3411digest.C[1], 0, C[1], 0, gost3411digest.C[1].length);
        System.arraycopy(gost3411digest.C[2], 0, C[2], 0, gost3411digest.C[2].length);
        System.arraycopy(gost3411digest.C[3], 0, C[3], 0, gost3411digest.C[3].length);
        System.arraycopy(gost3411digest.xBuf, 0, xBuf, 0, gost3411digest.xBuf.length);
        xBufOff = gost3411digest.xBufOff;
        byteCount = gost3411digest.byteCount;
    }

    public GOST3411Digest(byte abyte0[])
    {
        H = new byte[32];
        L = new byte[32];
        M = new byte[32];
        Sum = new byte[32];
        C = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 32
        });
        xBuf = new byte[32];
        cipher = new GOST28147Engine();
        K = new byte[32];
        a = new byte[8];
        wS = new short[16];
        w_S = new short[16];
        S = new byte[32];
        U = new byte[32];
        V = new byte[32];
        W = new byte[32];
        sBox = Arrays.clone(abyte0);
        cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    private byte[] A(byte abyte0[])
    {
        for (int i = 0; i < 8; i++)
        {
            a[i] = (byte)(abyte0[i] ^ abyte0[i + 8]);
        }

        System.arraycopy(abyte0, 8, abyte0, 0, 24);
        System.arraycopy(a, 0, abyte0, 24, 8);
        return abyte0;
    }

    private void E(byte abyte0[], byte abyte1[], int i, byte abyte2[], int j)
    {
        cipher.init(true, new KeyParameter(abyte0));
        cipher.processBlock(abyte2, j, abyte1, i);
    }

    private byte[] P(byte abyte0[])
    {
        for (int i = 0; i < 8; i++)
        {
            K[i * 4] = abyte0[i];
            K[i * 4 + 1] = abyte0[i + 8];
            K[i * 4 + 2] = abyte0[i + 16];
            K[i * 4 + 3] = abyte0[i + 24];
        }

        return K;
    }

    private void cpyBytesToShort(byte abyte0[], short aword0[])
    {
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            aword0[i] = (short)(abyte0[i * 2 + 1] << 8 & 0xff00 | abyte0[i * 2] & 0xff);
        }

    }

    private void cpyShortToBytes(short aword0[], byte abyte0[])
    {
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            abyte0[i * 2 + 1] = (byte)(aword0[i] >> 8);
            abyte0[i * 2] = (byte)aword0[i];
        }

    }

    private void finish()
    {
        Pack.longToLittleEndian(byteCount * 8L, L, 0);
        while (xBufOff != 0) 
        {
            update((byte)0);
        }
        processBlock(L, 0);
        processBlock(Sum, 0);
    }

    private void fw(byte abyte0[])
    {
        cpyBytesToShort(abyte0, wS);
        w_S[15] = (short)(wS[0] ^ wS[1] ^ wS[2] ^ wS[3] ^ wS[12] ^ wS[15]);
        System.arraycopy(wS, 1, w_S, 0, 15);
        cpyShortToBytes(w_S, abyte0);
    }

    private void sumByteArray(byte abyte0[])
    {
        int i = 0;
        int j = 0;
        for (; i != Sum.length; i++)
        {
            j += (Sum[i] & 0xff) + (abyte0[i] & 0xff);
            Sum[i] = (byte)j;
            j >>>= 8;
        }

    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        System.arraycopy(H, 0, abyte0, i, H.length);
        reset();
        return 32;
    }

    public String getAlgorithmName()
    {
        return "GOST3411";
    }

    public int getByteLength()
    {
        return 32;
    }

    public int getDigestSize()
    {
        return 32;
    }

    protected void processBlock(byte abyte0[], int i)
    {
        System.arraycopy(abyte0, i, M, 0, 32);
        System.arraycopy(H, 0, U, 0, 32);
        System.arraycopy(M, 0, V, 0, 32);
        for (i = 0; i < 32; i++)
        {
            W[i] = (byte)(U[i] ^ V[i]);
        }

        E(P(W), S, 0, H, 0);
        for (i = 1; i < 4; i++)
        {
            abyte0 = A(U);
            for (int j = 0; j < 32; j++)
            {
                U[j] = (byte)(abyte0[j] ^ C[i][j]);
            }

            V = A(A(V));
            for (int k = 0; k < 32; k++)
            {
                W[k] = (byte)(U[k] ^ V[k]);
            }

            E(P(W), S, i * 8, H, i * 8);
        }

        for (i = 0; i < 12; i++)
        {
            fw(S);
        }

        for (i = 0; i < 32; i++)
        {
            S[i] = (byte)(S[i] ^ M[i]);
        }

        fw(S);
        for (i = 0; i < 32; i++)
        {
            S[i] = (byte)(H[i] ^ S[i]);
        }

        for (i = 0; i < 61; i++)
        {
            fw(S);
        }

        System.arraycopy(S, 0, H, 0, H.length);
    }

    public void reset()
    {
        byteCount = 0L;
        xBufOff = 0;
        for (int i = 0; i < H.length; i++)
        {
            H[i] = 0;
        }

        for (int j = 0; j < L.length; j++)
        {
            L[j] = 0;
        }

        for (int k = 0; k < M.length; k++)
        {
            M[k] = 0;
        }

        for (int l = 0; l < C[1].length; l++)
        {
            C[1][l] = 0;
        }

        for (int i1 = 0; i1 < C[3].length; i1++)
        {
            C[3][i1] = 0;
        }

        for (int j1 = 0; j1 < Sum.length; j1++)
        {
            Sum[j1] = 0;
        }

        for (int k1 = 0; k1 < xBuf.length; k1++)
        {
            xBuf[k1] = 0;
        }

        System.arraycopy(C2, 0, C[2], 0, C2.length);
    }

    public void update(byte byte0)
    {
        byte abyte0[] = xBuf;
        int i = xBufOff;
        xBufOff = i + 1;
        abyte0[i] = byte0;
        if (xBufOff == xBuf.length)
        {
            sumByteArray(xBuf);
            processBlock(xBuf, 0);
            xBufOff = 0;
        }
        byteCount = byteCount + 1L;
    }

    public void update(byte abyte0[], int i, int j)
    {
        int k = j;
        int l = i;
        do
        {
            i = l;
            j = k;
            if (xBufOff == 0)
            {
                break;
            }
            i = l;
            j = k;
            if (k <= 0)
            {
                break;
            }
            update(abyte0[l]);
            l++;
            k--;
        } while (true);
        do
        {
            k = i;
            l = j;
            if (j <= xBuf.length)
            {
                break;
            }
            System.arraycopy(abyte0, i, xBuf, 0, xBuf.length);
            sumByteArray(xBuf);
            processBlock(xBuf, 0);
            i += xBuf.length;
            j -= xBuf.length;
            byteCount = byteCount + (long)xBuf.length;
        } while (true);
        for (; l > 0; l--)
        {
            update(abyte0[k]);
            k++;
        }

    }

}

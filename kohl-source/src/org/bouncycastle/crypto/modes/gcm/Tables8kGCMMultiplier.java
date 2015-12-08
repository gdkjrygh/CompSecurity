// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class Tables8kGCMMultiplier
    implements GCMMultiplier
{

    private final int M[][][] = (int[][][])Array.newInstance([I, new int[] {
        32, 16
    });

    public Tables8kGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        int k;
        M[0][0] = new int[4];
        M[1][0] = new int[4];
        M[1][8] = GCMUtil.asInts(abyte0);
        for (int i = 4; i >= 1; i >>= 1)
        {
            abyte0 = new int[4];
            System.arraycopy(M[1][i + i], 0, abyte0, 0, 4);
            GCMUtil.multiplyP(abyte0);
            M[1][i] = abyte0;
        }

        abyte0 = new int[4];
        System.arraycopy(M[1][1], 0, abyte0, 0, 4);
        GCMUtil.multiplyP(abyte0);
        M[0][8] = abyte0;
        for (int j = 4; j >= 1; j >>= 1)
        {
            abyte0 = new int[4];
            System.arraycopy(M[0][j + j], 0, abyte0, 0, 4);
            GCMUtil.multiplyP(abyte0);
            M[0][j] = abyte0;
        }

        k = 0;
_L2:
        int k1;
        do
        {
            for (int l = 2; l < 16; l += l)
            {
                for (int j1 = 1; j1 < l; j1++)
                {
                    abyte0 = new int[4];
                    System.arraycopy(M[k][l], 0, abyte0, 0, 4);
                    GCMUtil.xor(abyte0, M[k][j1]);
                    M[k][l + j1] = abyte0;
                }

            }

            k1 = k + 1;
            if (k1 == 32)
            {
                return;
            }
            k = k1;
        } while (k1 <= 1);
        M[k1][0] = new int[4];
        int i1 = 8;
        do
        {
            k = k1;
            if (i1 <= 0)
            {
                continue;
            }
            abyte0 = new int[4];
            System.arraycopy(M[k1 - 2][i1], 0, abyte0, 0, 4);
            GCMUtil.multiplyP8(abyte0);
            M[k1][i1] = abyte0;
            i1 >>= 1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void multiplyH(byte abyte0[])
    {
        int ai[] = new int[4];
        for (int i = 15; i >= 0; i--)
        {
            int ai1[] = M[i + i][abyte0[i] & 0xf];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            int j = ai[3];
            ai[3] = ai1[3] ^ j;
            ai1 = M[i + i + 1][(abyte0[i] & 0xf0) >>> 4];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            j = ai[3];
            ai[3] = ai1[3] ^ j;
        }

        Pack.intToBigEndian(ai, abyte0, 0);
    }
}

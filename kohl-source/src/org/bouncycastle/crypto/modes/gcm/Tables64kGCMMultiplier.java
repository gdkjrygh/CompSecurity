// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class Tables64kGCMMultiplier
    implements GCMMultiplier
{

    private final int M[][][] = (int[][][])Array.newInstance([I, new int[] {
        16, 256
    });

    public Tables64kGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        int j;
        M[0][0] = new int[4];
        M[0][128] = GCMUtil.asInts(abyte0);
        for (int i = 64; i >= 1; i >>= 1)
        {
            abyte0 = new int[4];
            System.arraycopy(M[0][i + i], 0, abyte0, 0, 4);
            GCMUtil.multiplyP(abyte0);
            M[0][i] = abyte0;
        }

        j = 0;
_L2:
        for (int k = 2; k < 256; k += k)
        {
            for (int i1 = 1; i1 < k; i1++)
            {
                abyte0 = new int[4];
                System.arraycopy(M[j][k], 0, abyte0, 0, 4);
                GCMUtil.xor(abyte0, M[j][i1]);
                M[j][k + i1] = abyte0;
            }

        }

        int j1 = j + 1;
        if (j1 == 16)
        {
            return;
        }
        M[j1][0] = new int[4];
        int l = 128;
        do
        {
            j = j1;
            if (l <= 0)
            {
                continue;
            }
            abyte0 = new int[4];
            System.arraycopy(M[j1 - 1][l], 0, abyte0, 0, 4);
            GCMUtil.multiplyP8(abyte0);
            M[j1][l] = abyte0;
            l >>= 1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void multiplyH(byte abyte0[])
    {
        int ai[] = new int[4];
        for (int i = 15; i >= 0; i--)
        {
            int ai1[] = M[i][abyte0[i] & 0xff];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            int j = ai[3];
            ai[3] = ai1[3] ^ j;
        }

        Pack.intToBigEndian(ai, abyte0, 0);
    }
}

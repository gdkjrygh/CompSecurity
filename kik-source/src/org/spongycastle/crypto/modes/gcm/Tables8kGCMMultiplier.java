// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.crypto.util.Pack;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMMultiplier, a

public class Tables8kGCMMultiplier
    implements GCMMultiplier
{

    private final int a[][][] = (int[][][])Array.newInstance([I, new int[] {
        32, 16
    });

    public Tables8kGCMMultiplier()
    {
    }

    public final void a(byte abyte0[])
    {
        int k;
        a[0][0] = new int[4];
        a[1][0] = new int[4];
        a[1][8] = org.spongycastle.crypto.modes.gcm.a.a(abyte0);
        for (int i = 4; i > 0; i >>= 1)
        {
            abyte0 = new int[4];
            System.arraycopy(a[1][i + i], 0, abyte0, 0, 4);
            org.spongycastle.crypto.modes.gcm.a.a(abyte0);
            a[1][i] = abyte0;
        }

        abyte0 = new int[4];
        System.arraycopy(a[1][1], 0, abyte0, 0, 4);
        org.spongycastle.crypto.modes.gcm.a.a(abyte0);
        a[0][8] = abyte0;
        for (int j = 4; j > 0; j >>= 1)
        {
            abyte0 = new int[4];
            System.arraycopy(a[0][j + j], 0, abyte0, 0, 4);
            org.spongycastle.crypto.modes.gcm.a.a(abyte0);
            a[0][j] = abyte0;
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
                    System.arraycopy(a[k][l], 0, abyte0, 0, 4);
                    org.spongycastle.crypto.modes.gcm.a.a(abyte0, a[k][j1]);
                    a[k][l + j1] = abyte0;
                }

            }

            k1 = k + 1;
            if (k1 == 32)
            {
                return;
            }
            k = k1;
        } while (k1 <= 1);
        a[k1][0] = new int[4];
        int i1 = 8;
        do
        {
            k = k1;
            if (i1 <= 0)
            {
                continue;
            }
            abyte0 = new int[4];
            System.arraycopy(a[k1 - 2][i1], 0, abyte0, 0, 4);
            org.spongycastle.crypto.modes.gcm.a.b(abyte0);
            a[k1][i1] = abyte0;
            i1 >>= 1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b(byte abyte0[])
    {
        int ai[] = new int[4];
        for (int i = 15; i >= 0; i--)
        {
            int ai1[] = a[i + i][abyte0[i] & 0xf];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            int j = ai[3];
            ai[3] = ai1[3] ^ j;
            ai1 = a[i + i + 1][(abyte0[i] & 0xf0) >>> 4];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            j = ai[3];
            ai[3] = ai1[3] ^ j;
        }

        Pack.a(ai, abyte0, 0);
    }
}

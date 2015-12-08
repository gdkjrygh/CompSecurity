// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            PKCS5S2ParametersGenerator

public class SCrypt
{

    public SCrypt()
    {
    }

    private static void BlockMix(int ai[], int ai1[], int ai2[], int ai3[], int i)
    {
        System.arraycopy(ai, ai.length - 16, ai1, 0, 16);
        int l = ai.length;
        int j = i * 2;
        int k = 0;
        i = 0;
        for (; j > 0; j--)
        {
            Xor(ai1, ai, i, ai2);
            Salsa20Engine.salsaCore(8, ai2, ai1);
            System.arraycopy(ai1, 0, ai3, k, 16);
            k = ((l >>> 1) + i) - k;
            i += 16;
        }

        System.arraycopy(ai3, 0, ai, 0, ai3.length);
    }

    private static void Clear(byte abyte0[])
    {
        if (abyte0 != null)
        {
            Arrays.fill(abyte0, (byte)0);
        }
    }

    private static void Clear(int ai[])
    {
        if (ai != null)
        {
            Arrays.fill(ai, 0);
        }
    }

    private static void ClearAll(int ai[][])
    {
        for (int i = 0; i < ai.length; i++)
        {
            Clear(ai[i]);
        }

    }

    private static byte[] MFcrypt(byte abyte0[], byte abyte1[], int i, int j, int k, int l)
    {
        int ai[];
        byte abyte2[];
        boolean flag;
        int i1;
        flag = false;
        i1 = j * 128;
        abyte2 = SingleIterationPBKDF2(abyte0, abyte1, k * i1);
        ai = null;
        abyte1 = ai;
        int j1 = abyte2.length >>> 2;
        abyte1 = ai;
        ai = new int[j1];
        abyte1 = ai;
        Pack.littleEndianToInt(abyte2, 0, ai);
        k = ((flag) ? 1 : 0);
_L2:
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = ai;
        SMix(ai, k, i, j);
        k += i1 >>> 2;
        if (true) goto _L2; else goto _L1
_L1:
        abyte1 = ai;
        Pack.intToLittleEndian(ai, abyte2, 0);
        abyte1 = ai;
        abyte0 = SingleIterationPBKDF2(abyte0, abyte2, l);
        Clear(abyte2);
        Clear(ai);
        return abyte0;
        abyte0;
        Clear(abyte2);
        Clear(abyte1);
        throw abyte0;
    }

    private static void SMix(int ai[], int i, int j, int k)
    {
        int ai1[];
        int ai2[];
        int ai3[];
        int ai4[];
        int ai5[][];
        int i1;
        i1 = k * 32;
        ai1 = new int[16];
        ai2 = new int[16];
        ai3 = new int[i1];
        ai4 = new int[i1];
        ai5 = new int[j][];
        System.arraycopy(ai, i, ai4, 0, i1);
        int l = 0;
_L2:
        if (l >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ai5[l] = Arrays.clone(ai4);
        BlockMix(ai4, ai1, ai2, ai3, k);
        l++;
        if (true) goto _L2; else goto _L1
_L4:
        if (l >= j)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        Xor(ai4, ai5[ai4[i1 - 16] & j - 1], 0, ai4);
        BlockMix(ai4, ai1, ai2, ai3, k);
        l++;
        continue; /* Loop/switch isn't completed */
        System.arraycopy(ai4, 0, ai, i, i1);
        ClearAll(ai5);
        ClearAll(new int[][] {
            ai4, ai1, ai2, ai3
        });
        return;
        ai;
        ClearAll(ai5);
        ClearAll(new int[][] {
            ai4, ai1, ai2, ai3
        });
        throw ai;
_L1:
        l = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] SingleIterationPBKDF2(byte abyte0[], byte abyte1[], int i)
    {
        PKCS5S2ParametersGenerator pkcs5s2parametersgenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pkcs5s2parametersgenerator.init(abyte0, abyte1, 1);
        return ((KeyParameter)pkcs5s2parametersgenerator.generateDerivedMacParameters(i * 8)).getKey();
    }

    private static void Xor(int ai[], int ai1[], int i, int ai2[])
    {
        for (int j = ai2.length - 1; j >= 0; j--)
        {
            ai2[j] = ai[j] ^ ai1[i + j];
        }

    }

    public static byte[] generate(byte abyte0[], byte abyte1[], int i, int j, int k, int l)
    {
        return MFcrypt(abyte0, abyte1, i, j, k, l);
    }
}

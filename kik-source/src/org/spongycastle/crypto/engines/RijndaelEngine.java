// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class RijndaelEngine
    implements BlockCipher
{

    static byte a[][];
    static byte b[][];
    private static final byte c[] = {
        0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 
        27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 
        52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 
        28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 
        77, -28, -90, 114, -102, -55, 9, 120, 101, 47, 
        -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 
        53, -109, -38, -114, -106, -113, -37, -67, 54, -48, 
        -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 
        102, -35, -3, 48, -65, 6, -117, 98, -77, 37, 
        -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, 
        -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 
        61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 
        78, -44, -84, -27, -13, 115, -89, 87, -81, 88, 
        -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, 
        -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 
        11, -11, 89, -53, 95, -80, -100, -87, 81, -96, 
        127, 12, -10, 111, 23, -60, 73, -20, -40, 67, 
        31, 45, -92, 118, 123, -73, -52, -69, 62, 90, 
        -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 
        41, -99, -105, -78, -121, -112, 97, -66, -36, -4, 
        -68, -107, -49, -51, 55, 63, 91, -47, 83, 57, 
        -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 
        86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 
        46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 
        103, 74, -19, -34, -59, 49, -2, 24, 13, 99, 
        -116, -128, -64, -9, 112, 7
    };
    private static final byte d[] = {
        0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 
        114, -106, -95, -8, 19, 53, 95, -31, 56, 72, 
        -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 
        102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 
        106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 
        4, 12, 20, 60, 68, -52, 79, -47, 104, -72, 
        -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 
        77, -41, 98, -90, -15, 8, 24, 40, 120, -120, 
        -125, -98, -71, -48, 107, -67, -36, 127, -127, -104, 
        -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 
        16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 
        97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 
        47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 
        58, 78, -46, 109, -73, -62, 93, -25, 50, 86, 
        -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 
        64, -64, 91, -19, 44, 116, -100, -65, -38, 117, 
        -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, 
        -68, -33, 122, -114, -119, -128, -101, -74, -63, 88, 
        -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, 
        -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 
        27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 
        74, -34, 121, -117, -122, -111, -88, -29, 62, 66, 
        -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, 
        -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 
        57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 
        108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 
        51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 
        53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 
        2, 6, 10, 30, 34, 102, -86, -27, 52, 92, 
        -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, 
        -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, 
        -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, 
        -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 
        8, 24, 40, 120, -120, -125, -98, -71, -48, 107, 
        -67, -36, 127, -127, -104, -77, -50, 73, -37, 118, 
        -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 
        29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 
        125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 
        32, 96, -96, -5, 22, 58, 78, -46, 109, -73, 
        -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 
        94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 
        116, -100, -65, -38, 117, -97, -70, -43, 100, -84, 
        -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, 
        -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 
        37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 
        99, -91, -12, 7, 9, 27, 45, 119, -103, -80, 
        -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, 
        -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 
        54, 90, -18, 41, 123, -115, -116, -113, -118, -123, 
        -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, 
        -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 
        1
    };
    private static final byte e[] = {
        99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 
        103, 43, -2, -41, -85, 118, -54, -126, -55, 125, 
        -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 
        114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 
        52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 
        35, -61, 24, -106, 5, -102, 7, 18, -128, -30, 
        -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 
        90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 
        83, -47, 0, -19, 32, -4, -79, 91, 106, -53, 
        -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 
        67, 77, 51, -123, 69, -7, 2, 127, 80, 60, 
        -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, 
        -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 
        19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 
        100, 93, 25, 115, 96, -127, 79, -36, 34, 42, 
        -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, 
        -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, 
        -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, 
        -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, 
        -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, 
        -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, 
        -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, 
        -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, 
        -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, 
        -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 
        45, 15, -80, 84, -69, 22
    };
    private static final byte f[] = {
        82, 9, 106, -43, 48, 54, -91, 56, -65, 64, 
        -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, 
        -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, 
        -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, 
        -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, 
        -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 
        109, -117, -47, 37, 114, -8, -10, 100, -122, 104, 
        -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 
        108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 
        70, 87, -89, -115, -99, -124, -112, -40, -85, 0, 
        -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 
        69, 6, -48, 44, 30, -113, -54, 63, 15, 2, 
        -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 
        17, 65, 79, 103, -36, -22, -105, -14, -49, -50, 
        -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 
        53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 
        71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 
        98, 14, -86, 24, -66, 27, -4, 86, 62, 75, 
        -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 
        90, -12, 31, -35, -88, 51, -120, 7, -57, 49, 
        -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 
        127, -87, 25, -75, 74, 13, 45, -27, 122, -97, 
        -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, 
        -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 
        23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 
        20, 99, 85, 33, 12, 125
    };
    private static final int g[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 
        108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 
        151, 53, 106, 212, 179, 125, 250, 239, 197, 145
    };
    private int h;
    private long i;
    private int j;
    private int k;
    private long l[][];
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private byte r[];
    private byte s[];

    public RijndaelEngine()
    {
        this((byte)0);
    }

    private RijndaelEngine(byte byte0)
    {
        h = 32;
        i = 0xffffffffL;
        r = a[0];
        s = b[0];
        k = 128;
    }

    private static byte a(int i1)
    {
        if (i1 != 0)
        {
            return d[(c[i1] & 0xff) + 25];
        } else
        {
            return 0;
        }
    }

    private long a(long l1, int i1)
    {
        return (l1 >>> i1 | l1 << h - i1) & i;
    }

    private long a(long l1, byte abyte0[])
    {
        long l2 = 0L;
        for (int i1 = 0; i1 < h; i1 += 8)
        {
            l2 |= (long)(abyte0[(int)(l1 >> i1 & 255L)] & 0xff) << i1;
        }

        return l2;
    }

    private void a(byte abyte0[])
    {
        n = a(n, abyte0[1]);
        o = a(o, abyte0[2]);
        p = a(p, abyte0[3]);
    }

    private void a(byte abyte0[], int i1)
    {
        int j1 = i1 + 1;
        m = abyte0[i1] & 0xff;
        i1 = j1 + 1;
        n = abyte0[j1] & 0xff;
        int k1 = i1 + 1;
        o = abyte0[i1] & 0xff;
        j1 = k1 + 1;
        p = abyte0[k1] & 0xff;
        for (i1 = 8; i1 != h; i1 += 8)
        {
            long l2 = m;
            int l1 = j1 + 1;
            m = l2 | (long)(abyte0[j1] & 0xff) << i1;
            l2 = n;
            j1 = l1 + 1;
            n = l2 | (long)(abyte0[l1] & 0xff) << i1;
            l2 = o;
            l1 = j1 + 1;
            o = l2 | (long)(abyte0[j1] & 0xff) << i1;
            l2 = p;
            j1 = l1 + 1;
            p = l2 | (long)(abyte0[l1] & 0xff) << i1;
        }

    }

    private void a(long al[])
    {
        m = m ^ al[0];
        n = n ^ al[1];
        o = o ^ al[2];
        p = p ^ al[3];
    }

    private void a(long al[][])
    {
        a(al[0]);
        for (int i1 = 1; i1 < j; i1++)
        {
            b(e);
            a(r);
            long l2 = 0L;
            int j1 = 0;
            long l3 = 0L;
            long l4 = 0L;
            long l5 = 0L;
            for (; j1 < h; j1 += 8)
            {
                int k1 = (int)(m >> j1 & 255L);
                int l1 = (int)(n >> j1 & 255L);
                int i2 = (int)(o >> j1 & 255L);
                int j2 = (int)(p >> j1 & 255L);
                l5 |= (long)((a(k1) ^ b(l1) ^ i2 ^ j2) & 0xff) << j1;
                l4 |= (long)((a(l1) ^ b(i2) ^ j2 ^ k1) & 0xff) << j1;
                l3 |= (long)((a(i2) ^ b(j2) ^ k1 ^ l1) & 0xff) << j1;
                j2 = a(j2);
                l2 |= (long)((b(k1) ^ j2 ^ l1 ^ i2) & 0xff) << j1;
            }

            m = l5;
            n = l4;
            o = l3;
            p = l2;
            a(al[i1]);
        }

        b(e);
        a(r);
        a(al[j]);
    }

    private static byte b(int i1)
    {
        if (i1 != 0)
        {
            return d[(c[i1] & 0xff) + 1];
        } else
        {
            return 0;
        }
    }

    private void b(byte abyte0[])
    {
        m = a(m, abyte0);
        n = a(n, abyte0);
        o = a(o, abyte0);
        p = a(p, abyte0);
    }

    private void b(byte abyte0[], int i1)
    {
        boolean flag = false;
        int j1 = i1;
        for (i1 = ((flag) ? 1 : 0); i1 != h; i1 += 8)
        {
            int k1 = j1 + 1;
            abyte0[j1] = (byte)(int)(m >> i1);
            j1 = k1 + 1;
            abyte0[k1] = (byte)(int)(n >> i1);
            k1 = j1 + 1;
            abyte0[j1] = (byte)(int)(o >> i1);
            j1 = k1 + 1;
            abyte0[k1] = (byte)(int)(p >> i1);
        }

    }

    private void b(long al[][])
    {
        a(al[j]);
        b(f);
        a(s);
        for (int i1 = j - 1; i1 > 0; i1--)
        {
            a(al[i1]);
            long l2 = 0L;
            int j1 = 0;
            long l3 = 0L;
            long l4 = 0L;
            long l5 = 0L;
            while (j1 < h) 
            {
                int k1 = (int)(m >> j1 & 255L);
                int l1 = (int)(n >> j1 & 255L);
                int i2 = (int)(o >> j1 & 255L);
                int j2 = (int)(p >> j1 & 255L);
                if (k1 != 0)
                {
                    k1 = c[k1 & 0xff] & 0xff;
                } else
                {
                    k1 = -1;
                }
                if (l1 != 0)
                {
                    l1 = c[l1 & 0xff] & 0xff;
                } else
                {
                    l1 = -1;
                }
                if (i2 != 0)
                {
                    i2 = c[i2 & 0xff] & 0xff;
                } else
                {
                    i2 = -1;
                }
                if (j2 != 0)
                {
                    j2 = c[j2 & 0xff] & 0xff;
                } else
                {
                    j2 = -1;
                }
                l5 |= (long)((f(k1) ^ d(l1) ^ e(i2) ^ c(j2)) & 0xff) << j1;
                l4 |= (long)((f(l1) ^ d(i2) ^ e(j2) ^ c(k1)) & 0xff) << j1;
                l3 |= (long)((f(i2) ^ d(j2) ^ e(k1) ^ c(l1)) & 0xff) << j1;
                l2 |= (long)((f(j2) ^ d(k1) ^ e(l1) ^ c(i2)) & 0xff) << j1;
                j1 += 8;
            }
            m = l5;
            n = l4;
            o = l3;
            p = l2;
            b(f);
            a(s);
        }

        a(al[0]);
    }

    private static byte c(int i1)
    {
        if (i1 >= 0)
        {
            return d[i1 + 199];
        } else
        {
            return 0;
        }
    }

    private static byte d(int i1)
    {
        if (i1 >= 0)
        {
            return d[i1 + 104];
        } else
        {
            return 0;
        }
    }

    private static byte e(int i1)
    {
        if (i1 >= 0)
        {
            return d[i1 + 238];
        } else
        {
            return 0;
        }
    }

    private static byte f(int i1)
    {
        if (i1 >= 0)
        {
            return d[i1 + 223];
        } else
        {
            return 0;
        }
    }

    public final int a(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        if (l == null)
        {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        if (h / 2 + i1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (h / 2 + j1 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (q)
        {
            a(abyte0, i1);
            a(l);
            b(abyte1, j1);
        } else
        {
            a(abyte0, i1);
            b(l);
            b(abyte1, j1);
        }
        return h / 2;
    }

    public final String a()
    {
        return "Rijndael";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter)) goto _L2; else goto _L1
_L1:
        long al[][];
        byte abyte0[];
        int i1;
        abyte0 = ((KeyParameter)cipherparameters).a();
        i1 = abyte0.length * 8;
        cipherparameters = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 64
        });
        al = (long[][])Array.newInstance(Long.TYPE, new int[] {
            15, 4
        });
        i1;
        JVM INSTR lookupswitch 5: default 120
    //                   128: 131
    //                   160: 197
    //                   192: 203
    //                   224: 210
    //                   256: 217;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_217;
_L3:
        throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
_L4:
        byte byte0 = 4;
_L9:
        if (i1 >= k)
        {
            j = byte0 + 6;
        } else
        {
            j = h / 8 + 6;
        }
        i1 = 0;
        for (int j1 = 0; j1 < abyte0.length;)
        {
            cipherparameters[j1 % 4][j1 / 4] = abyte0[i1];
            j1++;
            i1++;
        }

        break MISSING_BLOCK_LABEL_241;
_L5:
        byte0 = 5;
          goto _L9
_L6:
        byte0 = 6;
          goto _L9
_L7:
        byte0 = 7;
          goto _L9
        byte0 = 8;
          goto _L9
        int k1 = 0;
        for (i1 = 0; k1 < byte0 && i1 < (j + 1) * (h / 8); k1++)
        {
            for (int i2 = 0; i2 < 4; i2++)
            {
                long al1[] = al[i1 / (h / 8)];
                al1[i2] = al1[i2] | (long)(cipherparameters[i2][k1] & 0xff) << (i1 * 8) % h;
            }

            i1++;
        }

        break MISSING_BLOCK_LABEL_857;
_L10:
        int l1;
        l1++;
_L11:
        if (i1 < (j + 1) * (h / 8))
        {
            for (int j2 = 0; j2 < 4; j2++)
            {
                Object obj = cipherparameters[j2];
                obj[0] = (byte)(obj[0] ^ e[cipherparameters[(j2 + 1) % 4][byte0 - 1] & 0xff]);
            }

            Object obj1 = cipherparameters[0];
            int k2 = obj1[0];
            obj1[0] = (byte)(g[l1] ^ k2);
            if (byte0 <= 6)
            {
                for (k2 = 1; k2 < byte0; k2++)
                {
                    for (int l2 = 0; l2 < 4; l2++)
                    {
                        Object obj2 = cipherparameters[l2];
                        obj2[k2] = (byte)(obj2[k2] ^ cipherparameters[l2][k2 - 1]);
                    }

                }

            } else
            {
                for (k2 = 1; k2 < 4; k2++)
                {
                    for (int i3 = 0; i3 < 4; i3++)
                    {
                        Object obj3 = cipherparameters[i3];
                        obj3[k2] = (byte)(obj3[k2] ^ cipherparameters[i3][k2 - 1]);
                    }

                }

                for (k2 = 0; k2 < 4; k2++)
                {
                    Object obj4 = cipherparameters[k2];
                    obj4[4] = (byte)(obj4[4] ^ e[cipherparameters[k2][3] & 0xff]);
                }

                for (k2 = 5; k2 < byte0; k2++)
                {
                    for (int j3 = 0; j3 < 4; j3++)
                    {
                        Object obj5 = cipherparameters[j3];
                        obj5[k2] = (byte)(obj5[k2] ^ cipherparameters[j3][k2 - 1]);
                    }

                }

            }
            k2 = 0;
            while (k2 < byte0 && i1 < (j + 1) * (h / 8)) 
            {
                for (int k3 = 0; k3 < 4; k3++)
                {
                    long al2[] = al[i1 / (h / 8)];
                    al2[k3] = al2[k3] | (long)(cipherparameters[k3][k2] & 0xff) << (i1 * 8) % h;
                }

                i1++;
                k2++;
            }
        } else
        {
            l = al;
            q = flag;
            return;
        }
        if (true) goto _L10; else goto _L2
_L2:
        throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to Rijndael init - ")).append(cipherparameters.getClass().getName()).toString());
        l1 = 0;
          goto _L11
    }

    public final int b()
    {
        return h / 2;
    }

    public final void c()
    {
    }

    static 
    {
        byte abyte0[] = {
            0, 8, 16, 24
        };
        byte abyte1[] = {
            0, 8, 16, 24
        };
        byte abyte2[] = {
            0, 8, 16, 32
        };
        byte abyte3[] = {
            0, 8, 24, 32
        };
        a = (new byte[][] {
            abyte0, abyte1, new byte[] {
                0, 8, 16, 24
            }, abyte2, abyte3
        });
        abyte0 = (new byte[] {
            0, 40, 32, 24
        });
        b = (new byte[][] {
            new byte[] {
                0, 24, 16, 8
            }, new byte[] {
                0, 32, 24, 16
            }, abyte0, new byte[] {
                0, 48, 40, 24
            }, new byte[] {
                0, 56, 40, 32
            }
        });
    }
}

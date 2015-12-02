// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;


public final class MpegAudioHeader
{

    private static final String h[] = {
        "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"
    };
    private static final int i[] = {
        44100, 48000, 32000
    };
    private static final int j[] = {
        32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 
        352, 384, 416, 448
    };
    private static final int k[] = {
        32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 
        176, 192, 224, 256
    };
    private static final int l[] = {
        32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 
        224, 256, 320, 384
    };
    private static final int m[] = {
        32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
        192, 224, 256, 320
    };
    private static final int n[] = {
        8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 
        112, 128, 144, 160
    };
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public MpegAudioHeader()
    {
    }

    public static int a(int i1)
    {
        int j1;
        int k1;
        int l1;
        int j2;
        if ((i1 & 0xffe00000) == 0xffe00000)
        {
            if ((k1 = i1 >>> 19 & 3) != 1 && (l1 = i1 >>> 17 & 3) != 0 && ((j2 = i1 >>> 12 & 0xf) != 0 && j2 != 15) && (j1 = i1 >>> 10 & 3) != 3)
            {
                j1 = i[j1];
                int i2;
                if (k1 == 2)
                {
                    j1 /= 2;
                } else
                if (k1 == 0)
                {
                    j1 /= 4;
                }
                i2 = i1 >>> 9 & 1;
                if (l1 == 3)
                {
                    if (k1 == 3)
                    {
                        i1 = j[j2 - 1];
                    } else
                    {
                        i1 = k[j2 - 1];
                    }
                    return ((i1 * 12000) / j1 + i2) * 4;
                }
                if (k1 == 3)
                {
                    if (l1 == 2)
                    {
                        i1 = l[j2 - 1];
                    } else
                    {
                        i1 = m[j2 - 1];
                    }
                } else
                {
                    i1 = n[j2 - 1];
                }
                if (k1 == 3)
                {
                    return (0x23280 * i1) / j1 + i2;
                }
                if (l1 == 1)
                {
                    k1 = 0x11940;
                } else
                {
                    k1 = 0x23280;
                }
                return (k1 * i1) / j1 + i2;
            }
        }
        return -1;
    }

    private void a(int i1, String s, int j1, int k1, int l1, int i2, int j2)
    {
        a = i1;
        b = s;
        c = j1;
        d = k1;
        e = l1;
        f = i2;
        g = j2;
    }

    public static boolean a(int i1, MpegAudioHeader mpegaudioheader)
    {
        int j1;
        int k1;
        int l1;
        int i2;
        int i3;
        int j3;
        int k3;
        byte byte0 = 2;
        if ((i1 & 0xffe00000) != 0xffe00000)
        {
            return false;
        }
        i3 = i1 >>> 19 & 3;
        if (i3 == 1)
        {
            return false;
        }
        j3 = i1 >>> 17 & 3;
        if (j3 == 0)
        {
            return false;
        }
        l1 = i1 >>> 12 & 0xf;
        if (l1 == 0 || l1 == 15)
        {
            return false;
        }
        j1 = i1 >>> 10 & 3;
        if (j1 == 3)
        {
            return false;
        }
        j1 = i[j1];
        String s;
        int j2;
        if (i3 == 2)
        {
            k1 = j1 / 2;
        } else
        {
            k1 = j1;
            if (i3 == 0)
            {
                k1 = j1 / 4;
            }
        }
        k3 = i1 >>> 9 & 1;
        if (j3 != 3) goto _L2; else goto _L1
_L1:
        if (i3 == 3)
        {
            j1 = j[l1 - 1];
        } else
        {
            j1 = k[l1 - 1];
        }
        j2 = ((j1 * 12000) / k1 + k3) * 4;
        l1 = 384;
        i2 = j1;
        j1 = j2;
_L5:
        s = h[3 - j3];
        j2 = byte0;
        if ((i1 >> 6 & 3) == 3)
        {
            j2 = 1;
        }
        mpegaudioheader.a(i3, s, j1, k1, j2, i2, l1);
        return true;
_L2:
        if (i3 != 3) goto _L4; else goto _L3
_L3:
        int k2;
        if (j3 == 2)
        {
            j1 = l[l1 - 1];
        } else
        {
            j1 = m[l1 - 1];
        }
        l1 = 1152;
        i2 = j1;
_L7:
        j1 = i2;
        i2 = 0x23280;
_L8:
        k2 = (i2 * j1) / k1;
        i2 = j1;
        j1 = k2 + k3;
          goto _L5
_L4:
        int l2 = n[l1 - 1];
        if (j3 == 1)
        {
            j1 = 576;
        } else
        {
            j1 = 1152;
        }
        l1 = j1;
        i2 = l2;
        if (j3 != 1) goto _L7; else goto _L6
_L6:
        i2 = 0x11940;
        l1 = j1;
        j1 = l2;
          goto _L8
    }

}

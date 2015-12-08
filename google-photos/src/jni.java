// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jni
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

    public jni()
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
                    return (i1 * 12000) / j1 + i2 << 2;
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

    public static boolean a(int i1, jni jni1)
    {
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        int i3;
        int j3;
        byte byte0 = 2;
        if ((i1 & 0xffe00000) != 0xffe00000)
        {
            return false;
        }
        l2 = i1 >>> 19 & 3;
        if (l2 == 1)
        {
            return false;
        }
        i3 = i1 >>> 17 & 3;
        if (i3 == 0)
        {
            return false;
        }
        j1 = i1 >>> 12 & 0xf;
        if (j1 == 0 || j1 == 15)
        {
            return false;
        }
        k1 = i1 >>> 10 & 3;
        if (k1 == 3)
        {
            return false;
        }
        k1 = i[k1];
        String s;
        int j2;
        if (l2 == 2)
        {
            k1 /= 2;
        } else
        if (l2 == 0)
        {
            k1 /= 4;
        }
        j3 = i1 >>> 9 & 1;
        if (i3 != 3) goto _L2; else goto _L1
_L1:
        if (l2 == 3)
        {
            j1 = j[j1 - 1];
        } else
        {
            j1 = k[j1 - 1];
        }
        i2 = (j1 * 12000) / k1;
        l1 = 384;
        i2 = i2 + j3 << 2;
_L5:
        s = h[3 - i3];
        j2 = byte0;
        if ((i1 >> 6 & 3) == 3)
        {
            j2 = 1;
        }
        jni1.a = l2;
        jni1.b = s;
        jni1.c = i2;
        jni1.d = k1;
        jni1.e = j2;
        jni1.f = j1;
        jni1.g = l1;
        return true;
_L2:
        if (l2 != 3) goto _L4; else goto _L3
_L3:
        if (i3 == 2)
        {
            j1 = l[j1 - 1];
        } else
        {
            j1 = m[j1 - 1];
        }
        l1 = 1152;
        i2 = j1;
_L7:
        j1 = i2;
        i2 = 0x23280;
_L8:
        i2 = (i2 * j1) / k1 + j3;
          goto _L5
_L4:
        int k2 = n[j1 - 1];
        if (i3 == 1)
        {
            j1 = 576;
        } else
        {
            j1 = 1152;
        }
        l1 = j1;
        i2 = k2;
        if (i3 != 1) goto _L7; else goto _L6
_L6:
        i2 = 0x11940;
        l1 = j1;
        j1 = k2;
          goto _L8
    }

}

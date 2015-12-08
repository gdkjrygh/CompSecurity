// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.graphics.Bitmap;
import com.a.c.c;
import com.a.c.d;
import com.roidapp.amf.AMFNative;

public class a extends AMFNative
{

    public static final String a = com/a/a/a.getSimpleName();
    private int c;
    private com.a.b.a d;
    private byte e[];
    private byte f[];
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private com.a.b.a l;
    private byte m[];
    private int n;
    private double o;
    private long p;
    private long q;
    private int r;
    private int s;
    private byte t[];
    private byte u[];
    private long v;
    private boolean w;
    private int x;

    public a()
    {
        c = 0;
        d = null;
        e = null;
        f = null;
        g = 0;
        h = false;
        i = 0;
        j = 0;
        k = 0;
        l = null;
        m = null;
        n = 0;
        o = 0.0D;
        p = 0L;
        q = 0L;
        r = 2;
        s = 0;
        t = null;
        u = null;
        v = 0L;
        w = false;
        x = 0;
    }

    private int a(long l1)
    {
        int i1;
        int j1;
        int k1;
        long l2;
        long l4;
        i1 = 100;
        nativeDecodeEoF(c);
        l4 = nativeDecodeActualTimestampA(c);
        l2 = nativeEncodeGetDurationV(c);
        (new StringBuilder("fillAudioBuffer nativeEncodeGetDurationV = ")).append(l2).append(", lAudioDuration = ").append(l1);
        j1 = nativeDecodeGetAudioBufferSize(c);
        if (j1 <= 0)
        {
            j1 = r * 1024 * com.a.c.d.a(s);
        }
        if (t == null)
        {
            t = new byte[j1];
        }
        l2 = nativeEncodeGetDurationA(c);
        k1 = 0;
_L3:
        int i2;
        int k2;
        if (l2 >= l1)
        {
            return k1;
        }
        if (l2 < 0L)
        {
            com.a.c.d.a(a, (new StringBuilder("error happens for get current encoded audio duration : ")).append(l2).toString());
            return k1;
        }
        (new StringBuilder("fillAudioBuffer, lAEncodedDuration ")).append(l2).append(", mEncodeDuration = ").append(q);
        com.a.c.a a1;
        int j2;
        long l3;
        if (q > l2)
        {
            l3 = q - l2;
        } else
        {
            l3 = 0L;
        }
        j2 = i1;
        if (q >= 0x5b8d80L)
        {
            j2 = i1;
            if (l3 <= 0x2dc6c0L)
            {
                j2 = (int)(l3 / 30000L);
            }
        }
        if (!w && nativeDecodeEoF(c) == 0)
        {
            k1 = 0;
        } else
        {
            k1 = 1;
        }
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        i2 = nativeDecodeFrameA(c, l4, t, 0, j2);
        k2 = nativeDecodeGetAudioBufferSize(c);
_L4:
        i1 = i2;
        if (i2 == 0)
        {
            (new StringBuilder("fillAudioBuffer, iABufferSize  = ")).append(k2).append(", ldecodedDuration = ").append(l2);
            byte abyte0[] = t;
            if (l != null)
            {
                a1 = new com.a.c.a();
                com.a.c.a a2 = new com.a.c.a();
                a1.c = 0L;
                n = n + 1;
                a1.b = 0;
                a1.d = k2;
                a1.c = l2;
                i1 = 0;
                i2 = l.a(abyte0, a1, m, a2);
                if (a2.d != 0)
                {
                    if (a2.a == 2)
                    {
                        i1 = nativeAddExtraDataA(c, m, a2.b, a2.d);
                    } else
                    {
                        i1 = nativeAddCompressedFrameA(c, l2, m, a2.b, a2.d, a2.a);
                    }
                }
                if (i2 != 0)
                {
                    i1 = i2;
                }
            } else
            {
                i1 = nativeEncodeBufferA(c, l2, abyte0, 0, k2);
            }
        }
        if (i1 != 0)
        {
            if (k1 == 0)
            {
                if (nativeDecodeEoF(c) == 0)
                {
                    k1 = 0;
                } else
                {
                    k1 = 1;
                }
            }
            if (k1 == 0)
            {
                com.a.c.d.a(a, (new StringBuilder("Fill Audio Failed for :")).append(i1).toString());
                w = true;
            }
            i1 = 0;
        }
        l2 = nativeEncodeGetDurationA(c);
        k1 = i1;
        i1 = j2;
        if (true) goto _L3; else goto _L2
_L2:
        if (u == null)
        {
            u = new byte[j1];
            t = null;
            t = u;
        }
        i2 = 0;
        k2 = j1;
          goto _L4
    }

    private int b(Bitmap bitmap, boolean flag)
    {
        int j1;
        int k1 = 1;
        j1 = 1;
        int l1;
        long l2;
        if (0L == 0L)
        {
            l2 = (long)(((double)k / o) * 1000000D);
        } else
        {
            l2 = 0L;
        }
        k = k + 1;
        (new StringBuilder("encode Video Frame Count = ")).append(k).append(", lCurrentVideoTimeStam = ").append(l2);
        if (d == null) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 1 3: default 104
    //                   1 298
    //                   2 298
    //                   3 298;
           goto _L3 _L4 _L4 _L4
_L3:
        bitmap = new com.a.c.a();
        com.a.c.a a1 = new com.a.c.a();
        bitmap.c = l2;
        bitmap.b = 0;
        bitmap.d = g + (g >> 1);
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        bitmap.a = i1;
        k1 = d.a(e, bitmap, f, a1);
        if (k1 == -1)
        {
            com.a.c.d.a(a, "can't allocate input buffer now, try later");
        }
        if (a1.d != 0)
        {
            if (a1.a == 2)
            {
                i1 = nativeAddExtraDataV(c, f, a1.b, a1.d);
                e();
                j1 = 0;
            } else
            {
                x = x + 1;
                (new StringBuilder("add compressed Video Frame Count = ")).append(x);
                i1 = nativeAddCompressedFrameV(c, a1.c, f, a1.b, a1.d, a1.a);
            }
        } else
        {
            j1 = 0;
            i1 = 0;
        }
        if (k1 == 0)
        {
            k1 = i1;
        }
        l1 = k1;
        k1 = j1;
        j1 = l1;
_L5:
        l1 = i1;
        if (j1 == 0)
        {
            l1 = i1;
            if (k1 != 0)
            {
                l1 = a(l2);
            }
        }
        if (j1 == 0)
        {
            return l1;
        } else
        {
            return j1;
        }
_L4:
        a1 = e;
        i1 = j;
        nativeRgbaBitmapToYuv(c, bitmap, a1, i1);
          goto _L3
_L2:
        j1 = nativeEncodeFrameV(c, 0L, bitmap, false, flag);
        i1 = 0;
          goto _L5
    }

    public static boolean b()
    {
        return com.a.c.d.a();
    }

    private int e()
    {
        boolean flag1 = false;
        if (l != null) goto _L2; else goto _L1
_L1:
        int k1 = -1;
_L4:
        return k1;
_L2:
        nativeDecodeEoF(c);
        int j1 = nativeDecodeGetAudioBufferSize(c);
        if (j1 <= 0)
        {
            j1 = r * 1024 * com.a.c.d.a(s);
        }
        com.a.c.a a1;
        com.a.c.a a2;
        int i1;
        boolean flag;
        if (t == null)
        {
            t = new byte[j1];
            flag = false;
            i1 = 0;
        } else
        {
            flag = false;
            i1 = 0;
        }
        k1 = ((flag1) ? 1 : 0);
        if (!flag)
        {
            if (nativeDecodeEoF(c) == 0)
            {
                k1 = 0;
            } else
            {
                k1 = 1;
            }
            if (k1 == 0)
            {
                i1 = nativeDecodeFrameA(c, 0L, t, 0, 100);
                k1 = nativeDecodeGetAudioBufferSize(c);
            } else
            {
                if (u == null)
                {
                    u = new byte[j1];
                    t = null;
                    t = u;
                }
                k1 = j1;
            }
            if (i1 == 0)
            {
                a1 = new com.a.c.a();
                a2 = new com.a.c.a();
                n = n + 1;
                a1.b = 0;
                a1.d = k1;
                a1.c = 0L;
                k1 = l.a(t, a1, m, a2);
                if (k1 == -1)
                {
                    com.a.c.d.a(a, "can't allocate input buffer now, try later");
                }
                i1 = k1;
                if (a2.d != 0)
                {
                    i1 = k1;
                    if (a2.a == 2)
                    {
                        i1 = nativeAddExtraDataA(c, m, a2.b, a2.d);
                    }
                    flag = true;
                }
            }
            break MISSING_BLOCK_LABEL_78;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a()
    {
        if (c != 0)
        {
            return 1;
        }
        c = nativeInit();
        return c != 0 ? 0 : 9;
    }

    public final int a(int i1, int j1)
    {
        return nativeEncodeSetResolution(c, i1, j1);
    }

    public final int a(Bitmap bitmap)
    {
        return b(bitmap, false);
    }

    public final int a(Bitmap bitmap, boolean flag)
    {
        return b(bitmap, flag);
    }

    public final int a(String s1)
    {
        return nativeSetDecodeFrom(c, s1);
    }

    public final int a(String s1, String s2, long l1, int i1, int j1, double d1, int k1, long l2)
    {
        if (c == 0) goto _L2; else goto _L1
_L1:
        int i2;
        com.a.c.d.a(a, "Did you forget to END the former AMF case?");
        i2 = 1;
_L4:
        return i2;
_L2:
        if (i1 <= 0 || j1 <= 0 || i1 % 16 != 0)
        {
            com.a.c.d.a(a, "Width or Height is not available, please make sure the values are larger than 0 and width can be divided by 16.");
            return 3;
        }
        if (d1 > 100D || d1 < 0.0D)
        {
            com.a.c.d.a(a, "FPS is not available, please make sure the FPS is in range of [0 - 100].");
            return 4;
        }
        if (k1 > 100 || k1 < 0)
        {
            com.a.c.d.a(a, "Video quality is not available, please make sure the it's in range of [0 - 100].");
            return 5;
        }
        if (s1 == null)
        {
            com.a.c.d.a(a, "FILE NAME is not available, please check the name and your application permission first");
            return 6;
        }
        if (l1 < 0L)
        {
            com.a.c.d.a(a, "Cannot start before 0...");
            return 7;
        }
        if (l2 <= 0L)
        {
            return 8;
        }
        if (s2 != null && l2 < 0x30d40L)
        {
            com.a.c.d.a(a, "When recording audio at the same time, the Duration must be  larger than 200000 (0.2S).");
            return 8;
        }
        c = nativeInit();
        if (c == 0)
        {
            return 9;
        }
        int j2 = nativeSetAudioStartFrom(c, l1);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        p = l1;
        j2 = nativeEncodeSetResolution(c, i1, j1);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j2 = nativeEncodeSetFps(c, d1);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j2 = nativeEncodeSetVideoQuality(c, k1);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j2 = nativeSetEncodeDuration(c, l2);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        q = l2;
        i2 = nativeSetEncodeTo(c, s1);
        if (i2 != 0)
        {
            return 11;
        }
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = nativeSetDecodeFrom(c, s2);
        i2 = j2;
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i2 = j2;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        if (!h || !com.a.c.d.a()) goto _L6; else goto _L5
_L5:
        k1 = (int)(((((((double)i1 * (double)j1 * d1) / (double)k1) * 18D) / (double)k1) * 128D) / (double)k1);
        if (d != null) goto _L8; else goto _L7
_L7:
        s1 = new c();
        s1.d = k1;
        s1.e = (int)d1;
        s1.b = i1;
        s1.c = j1;
        s1.a = "video/avc";
        if (d != null) goto _L10; else goto _L9
_L9:
        d = new com.a.b.a();
        s2 = d.a(((c) (s1)).a);
        if (s2 != null && s2.length != 0) goto _L12; else goto _L11
_L11:
        k1 = 0;
_L14:
        s1.f = k1;
_L10:
        if (((c) (s1)).f == 0 || !d.a(s1))
        {
            d.a();
            d = null;
        } else
        {
            g = i1 * j1;
            i = ((c) (s1)).f;
            j = com.a.c.d.b(i);
            e = new byte[g + (g >> 1)];
            f = new byte[g + 32];
        }
_L8:
        if (l == null)
        {
            s1 = new c();
            s1.d = 64000;
            s1.g = 2;
            s1.h = 48000;
            s1.a = "audio/mp4a-latm";
            n = 0;
            if (l == null)
            {
                l = new com.a.b.a();
            }
            if (!l.a(s1))
            {
                l.a();
                l = null;
            } else
            {
                m = new byte[1024];
            }
        }
_L6:
        k = 0;
        o = d1;
        r = 2;
        s = 0;
        return i2;
_L12:
        k1 = 0;
        do
        {
            if (k1 >= s2.length)
            {
                k1 = 0;
            } else
            if (s2[k1] == 19)
            {
                k1 = s2[k1];
            } else
            {
label0:
                {
                    if (s2[k1] != 21)
                    {
                        break label0;
                    }
                    k1 = s2[k1];
                }
            }
            if (true)
            {
                continue;
            }
            k1++;
        } while (true);
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        if (c == 0)
        {
            return 2;
        } else
        {
            return nativeDecodeFrameV(c, 0L, abyte0, 0, i1, j1, 0);
        }
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void b(boolean flag)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (c == 0)
                    {
                        break label0;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                    if (d == null)
                    {
                        break label2;
                    }
                    com.a.c.a a1 = new com.a.c.a();
                    a1.d = 0;
                    a1.a = -1;
                    com.a.c.a a2 = new com.a.c.a();
                    do
                    {
                        d.a(null, a1, f, a2);
                        if (a2.d == 0 || a2.a == -1)
                        {
                            continue;
                        }
                        int i1;
                        if (a2.a == 2)
                        {
                            i1 = nativeAddExtraDataV(c, f, a2.b, a2.d);
                        } else
                        {
                            x = x + 1;
                            i1 = nativeAddCompressedFrameV(c, a2.c, f, a2.b, a2.d, a2.a);
                        }
                        if (i1 != 0)
                        {
                            break label2;
                        }
                    } while (a2.a != -1);
                    (new StringBuilder("outputAllBufferedVFrame in, Input Video Count = ")).append(x).append(", Output Video Count = ").append(x);
                }
                a(q);
            }
            nativeRelease(c);
            if (d != null)
            {
                d.a();
                d = null;
                e = null;
                f = null;
                k = 0;
                g = 0;
            }
            if (l != null)
            {
                l.a();
                l = null;
                n = 0;
                m = null;
            }
            c = 0;
        }
    }

    public final long c()
    {
        if (c == 0)
        {
            return 2L;
        } else
        {
            return nativeDecodeActualTimestampV(c);
        }
    }

    public final boolean d()
    {
        while (c == 0 || nativeDecodeEoF(c) != 0) 
        {
            return true;
        }
        return false;
    }

}

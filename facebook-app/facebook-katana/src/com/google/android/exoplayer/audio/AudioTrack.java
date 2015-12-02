// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;

import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.util.Log;
import com.google.android.exoplayer.util.Ac3Util;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.Util;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class AudioTrack
{

    public static boolean a = false;
    public static boolean b = false;
    private byte A[];
    private int B;
    private int C;
    private boolean D;
    private int E;
    private final ConditionVariable c = new ConditionVariable(true);
    private final long d[] = new long[10];
    private final AudioTrackUtil e;
    private android.media.AudioTrack f;
    private android.media.AudioTrack g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private boolean r;
    private long s;
    private Method t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private float z;

    public AudioTrack()
    {
        if (Util.a >= 18)
        {
            try
            {
                t = android/media/AudioTrack.getMethod("getLatency", null);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
        }
        if (Util.a >= 19)
        {
            e = new AudioTrackUtilV19();
        } else
        {
            e = new AudioTrackUtil((byte)0);
        }
        z = 1.0F;
        v = 0;
    }

    private static int a(android.media.AudioTrack audiotrack, ByteBuffer bytebuffer, int i1)
    {
        return audiotrack.write(bytebuffer, i1, 1);
    }

    private long a(long l1)
    {
        if (D)
        {
            if (E == 0)
            {
                return 0L;
            } else
            {
                return (8L * l1 * (long)h) / (long)(E * 1000);
            }
        } else
        {
            return l1 / (long)k;
        }
    }

    static ConditionVariable a(AudioTrack audiotrack)
    {
        return audiotrack.c;
    }

    private static void a(android.media.AudioTrack audiotrack, float f1)
    {
        audiotrack.setVolume(f1);
    }

    private void a(MediaFormat mediaformat, int i1)
    {
        int l1;
        boolean flag1;
        flag1 = true;
        l1 = mediaformat.getInteger("channel-count");
        l1;
        JVM INSTR tableswitch 1 8: default 60
    //                   1 85
    //                   2 159
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 165
    //                   7 60
    //                   8 172;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L4 _L1 _L5
_L5:
        break MISSING_BLOCK_LABEL_172;
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unsupported channel count: ")).append(l1).toString());
_L2:
        int j1 = 4;
_L6:
        int j2;
        int l2;
        boolean flag;
        j2 = mediaformat.getInteger("sample-rate");
        l2 = MimeTypes.e(mediaformat.getString("mime"));
        if (l2 == 5 || l2 == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a() && h == j2 && i == j1 && !D && !flag)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_185;
_L3:
        j1 = 12;
          goto _L6
_L4:
        j1 = 252;
          goto _L6
        j1 = 1020;
          goto _L6
        h();
        j = l2;
        h = j2;
        i = j1;
        D = flag;
        E = 0;
        k = l1 * 2;
        l = android.media.AudioTrack.getMinBufferSize(j2, j1, l2);
        if (l != -2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        m = i1;
        return;
_L8:
        int k1 = l * 4;
        int i2 = (int)c(0x3d090L) * k;
        int k2 = (int)Math.max(l, c(0xb71b0L) * (long)k);
        i1 = i2;
        if (k1 >= i2)
        {
            if (k1 > k2)
            {
                i1 = k2;
            } else
            {
                i1 = k1;
            }
        }
        if (true) goto _L7; else goto _L9
_L9:
    }

    private long b(long l1)
    {
        return (0xf4240L * l1) / (long)h;
    }

    private static void b(android.media.AudioTrack audiotrack, float f1)
    {
        audiotrack.setStereoVolume(f1, f1);
    }

    private long c(long l1)
    {
        return ((long)h * l1) / 0xf4240L;
    }

    private void j()
    {
        if (f == null)
        {
            return;
        } else
        {
            android.media.AudioTrack audiotrack = f;
            f = null;
            (new _cls2(audiotrack)).start();
            return;
        }
    }

    private boolean k()
    {
        return a() && v != 0;
    }

    private void l()
    {
        long l1 = e.c();
        if (l1 != 0L)
        {
            long l2 = System.nanoTime() / 1000L;
            if (l2 - q >= 30000L)
            {
                d[n] = l1 - l2;
                n = (n + 1) % 10;
                if (o < 10)
                {
                    o = o + 1;
                }
                q = l2;
                p = 0L;
                for (int i1 = 0; i1 < o; i1++)
                {
                    p = p + d[i1] / (long)o;
                }

            }
            if (!D && l2 - s >= 0x7a120L)
            {
                r = e.d();
                if (r)
                {
                    long l3 = e.e() / 1000L;
                    long l4 = e.f();
                    if (l3 < x)
                    {
                        r = false;
                    } else
                    if (Math.abs(l3 - l2) > 0x4c4b40L)
                    {
                        String s1 = (new StringBuilder("Spurious audio timestamp (system clock mismatch): ")).append(l4).append(", ").append(l3).append(", ").append(l2).append(", ").append(l1).toString();
                        if (b)
                        {
                            throw new InvalidAudioTrackTimestampException(s1);
                        }
                        Log.w("AudioTrack", s1);
                        r = false;
                    } else
                    if (Math.abs(b(l4) - l1) > 0x4c4b40L)
                    {
                        String s2 = (new StringBuilder("Spurious audio timestamp (frame position mismatch): ")).append(l4).append(", ").append(l3).append(", ").append(l2).append(", ").append(l1).toString();
                        if (b)
                        {
                            throw new InvalidAudioTrackTimestampException(s2);
                        }
                        Log.w("AudioTrack", s2);
                        r = false;
                    }
                }
                if (t != null)
                {
                    try
                    {
                        y = (long)((Integer)t.invoke(g, null)).intValue() * 1000L - b(a(m));
                        y = Math.max(y, 0L);
                        if (y > 0x4c4b40L)
                        {
                            Log.w("AudioTrack", (new StringBuilder("Ignoring impossibly large audio latency: ")).append(y).toString());
                            y = 0L;
                        }
                    }
                    catch (Exception exception)
                    {
                        t = null;
                    }
                }
                s = l2;
                return;
            }
        }
    }

    private void m()
    {
        int i1;
        i1 = g.getState();
        if (i1 == 1)
        {
            return;
        }
        g.release();
        g = null;
_L2:
        throw new InitializationException(i1, h, i, m);
        Object obj;
        obj;
        g = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        g = null;
        throw obj;
    }

    private void n()
    {
        p = 0L;
        o = 0;
        n = 0;
        q = 0L;
        r = false;
        s = 0L;
    }

    public final int a(int i1)
    {
        c.block();
        if (i1 == 0)
        {
            g = new android.media.AudioTrack(3, h, i, j, m, 1);
        } else
        {
            g = new android.media.AudioTrack(3, h, i, j, m, 1, i1);
        }
        m();
        i1 = g.getAudioSessionId();
        if (a && Util.a < 21)
        {
            if (f != null && i1 != f.getAudioSessionId())
            {
                j();
            }
            if (f == null)
            {
                f = new android.media.AudioTrack(3, 4000, 4, 2, 2, 0, i1);
            }
        }
        e.a(g, D);
        a(z);
        return i1;
    }

    public final int a(ByteBuffer bytebuffer, int i1, int j1, long l1)
    {
        if (j1 == 0)
        {
            i1 = 2;
        } else
        {
            if (Util.a <= 22 && D)
            {
                if (g.getPlayState() == 2)
                {
                    return 0;
                }
                if (g.getPlayState() == 1 && e.b() != 0L)
                {
                    return 0;
                }
            }
            boolean flag = false;
            int k1 = ((flag) ? 1 : 0);
            if (C == 0)
            {
                if (D && E == 0)
                {
                    E = Ac3Util.a(j1, h);
                }
                l1 -= b(a(j1));
                if (v == 0)
                {
                    w = Math.max(0L, l1);
                    v = 1;
                    k1 = ((flag) ? 1 : 0);
                } else
                {
                    long l2 = w + b(a(u));
                    if (v == 1 && Math.abs(l2 - l1) > 0x30d40L)
                    {
                        Log.e("AudioTrack", (new StringBuilder("Discontinuity detected [expected ")).append(l2).append(", got ").append(l1).append("]").toString());
                        v = 2;
                    }
                    k1 = ((flag) ? 1 : 0);
                    if (v == 2)
                    {
                        w = w + (l1 - l2);
                        v = 1;
                        k1 = 1;
                    }
                }
            }
            if (C == 0)
            {
                C = j1;
                bytebuffer.position(i1);
                if (Util.a < 21)
                {
                    if (A == null || A.length < j1)
                    {
                        A = new byte[j1];
                    }
                    bytebuffer.get(A, 0, j1);
                    B = 0;
                }
            }
            i1 = 0;
            if (Util.a < 21)
            {
                j1 = (int)(u - e.b() * (long)k);
                j1 = m - j1;
                if (j1 > 0)
                {
                    i1 = Math.min(C, j1);
                    j1 = g.write(A, B, i1);
                    i1 = j1;
                    if (j1 >= 0)
                    {
                        B = B + j1;
                        i1 = j1;
                    }
                }
            } else
            {
                i1 = a(g, bytebuffer, C);
            }
            if (i1 < 0)
            {
                throw new WriteException(i1);
            }
            C = C - i1;
            u = u + (long)i1;
            i1 = k1;
            if (C == 0)
            {
                return k1 | 2;
            }
        }
        return i1;
    }

    public final long a(boolean flag)
    {
        long l2;
        if (!k())
        {
            l2 = 0x8000000000000000L;
        } else
        {
            if (g.getPlayState() == 3)
            {
                l();
            }
            long l1 = System.nanoTime() / 1000L;
            if (r)
            {
                return b(c(l1 - e.e() / 1000L) + e.f()) + w;
            }
            if (o == 0)
            {
                l1 = e.c() + w;
            } else
            {
                l1 = l1 + p + w;
            }
            l2 = l1;
            if (!flag)
            {
                return l1 - y;
            }
        }
        return l2;
    }

    public final void a(float f1)
    {
label0:
        {
            z = f1;
            if (a())
            {
                if (Util.a < 21)
                {
                    break label0;
                }
                a(g, f1);
            }
            return;
        }
        b(g, f1);
    }

    public final void a(MediaFormat mediaformat)
    {
        a(mediaformat, 0);
    }

    public final boolean a()
    {
        return g != null;
    }

    public final int b()
    {
        return a(0);
    }

    public final void c()
    {
        if (a())
        {
            x = System.nanoTime() / 1000L;
            g.play();
        }
    }

    public final void d()
    {
        if (v == 1)
        {
            v = 2;
        }
    }

    public final boolean e()
    {
        return a() && (a(u) > e.b() || e.a());
    }

    public final boolean f()
    {
        return u > (long)((l * 3) / 2);
    }

    public final void g()
    {
        if (a())
        {
            n();
            g.pause();
        }
    }

    public final void h()
    {
        if (a())
        {
            u = 0L;
            C = 0;
            v = 0;
            y = 0L;
            n();
            if (g.getPlayState() == 3)
            {
                g.pause();
            }
            android.media.AudioTrack audiotrack = g;
            g = null;
            e.a(null, false);
            c.close();
            (new _cls1(audiotrack)).start();
        }
    }

    public final void i()
    {
        h();
        j();
    }


    private class AudioTrackUtilV19 extends AudioTrackUtil
    {
        private class AudioTrackUtil
        {

            protected android.media.AudioTrack a;
            private boolean b;
            private int c;
            private long d;
            private long e;
            private long f;

            public void a(android.media.AudioTrack audiotrack, boolean flag)
            {
                a = audiotrack;
                b = flag;
                d = 0L;
                e = 0L;
                f = 0L;
                if (audiotrack != null)
                {
                    c = audiotrack.getSampleRate();
                }
            }

            public final boolean a()
            {
                return Util.a <= 22 && b && a.getPlayState() == 2 && a.getPlaybackHeadPosition() == 0;
            }

            public final long b()
            {
                long l1;
                long l2;
                l2 = 0xffffffffL & (long)a.getPlaybackHeadPosition();
                l1 = l2;
                if (Util.a > 22) goto _L2; else goto _L1
_L1:
                l1 = l2;
                if (!b) goto _L2; else goto _L3
_L3:
                if (a.getPlayState() != 1) goto _L5; else goto _L4
_L4:
                d = l2;
_L7:
                l1 = l2 + f;
_L2:
                if (d > l1)
                {
                    e = e + 1L;
                }
                d = l1;
                return l1 + (e << 32);
_L5:
                if (a.getPlayState() == 2 && l2 == 0L)
                {
                    f = d;
                }
                if (true) goto _L7; else goto _L6
_L6:
            }

            public final long c()
            {
                return (b() * 0xf4240L) / (long)c;
            }

            public boolean d()
            {
                return false;
            }

            public long e()
            {
                throw new UnsupportedOperationException();
            }

            public long f()
            {
                throw new UnsupportedOperationException();
            }

            private AudioTrackUtil()
            {
            }

            AudioTrackUtil(byte byte0)
            {
                this();
            }
        }


        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public final void a(android.media.AudioTrack audiotrack, boolean flag)
        {
            super.a(audiotrack, flag);
            c = 0L;
            d = 0L;
            e = 0L;
        }

        public final boolean d()
        {
            boolean flag = a.getTimestamp(b);
            if (flag)
            {
                long l1 = b.framePosition;
                if (d > l1)
                {
                    c = c + 1L;
                }
                d = l1;
                e = l1 + (c << 32);
            }
            return flag;
        }

        public final long e()
        {
            return b.nanoTime;
        }

        public final long f()
        {
            return e;
        }

        public AudioTrackUtilV19()
        {
            super((byte)0);
        }
    }


    private class _cls2 extends Thread
    {

        final android.media.AudioTrack a;
        final AudioTrack b;

        public void run()
        {
            a.release();
        }

        _cls2(android.media.AudioTrack audiotrack1)
        {
            b = AudioTrack.this;
            a = audiotrack1;
            super();
        }
    }


    private class InvalidAudioTrackTimestampException extends RuntimeException
    {

        public InvalidAudioTrackTimestampException(String s1)
        {
            super(s1);
        }
    }


    private class InitializationException extends Exception
    {

        public final int audioTrackState;

        public InitializationException(int i1, int j1, int k1, int l1)
        {
            super((new StringBuilder("AudioTrack init failed: ")).append(i1).append(", Config(").append(j1).append(", ").append(k1).append(", ").append(l1).append(")").toString());
            audioTrackState = i1;
        }
    }


    private class WriteException extends Exception
    {

        public final int errorCode;

        public WriteException(int i1)
        {
            super((new StringBuilder("AudioTrack write failed: ")).append(i1).toString());
            errorCode = i1;
        }
    }


    private class _cls1 extends Thread
    {

        final android.media.AudioTrack a;
        final AudioTrack b;

        public void run()
        {
            a.release();
            AudioTrack.a(b).open();
            return;
            Exception exception;
            exception;
            AudioTrack.a(b).open();
            throw exception;
        }

        _cls1(android.media.AudioTrack audiotrack1)
        {
            b = AudioTrack.this;
            a = audiotrack1;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;

import android.media.MediaFormat;
import android.os.ConditionVariable;
import azr;
import azs;
import bds;
import bea;
import bej;
import java.lang.reflect.Method;

public final class AudioTrack
{

    private int A;
    private float B;
    final ConditionVariable a = new ConditionVariable(true);
    public final long b[] = new long[10];
    public final azr c;
    public android.media.AudioTrack d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public Method o;
    public long p;
    public int q;
    public long r;
    public long s;
    public long t;
    public byte u[];
    public int v;
    public int w;
    public boolean x;
    public int y;
    private int z;

    public AudioTrack()
    {
        if (bej.a >= 18)
        {
            try
            {
                o = android/media/AudioTrack.getMethod("getLatency", null);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
        }
        if (bej.a >= 19)
        {
            c = new azs();
        } else
        {
            c = new azr((byte)0);
        }
        B = 1.0F;
        q = 0;
    }

    public final int a(int i1)
    {
        a.block();
        if (i1 == 0)
        {
            d = new android.media.AudioTrack(3, e, z, A, h, 1);
        } else
        {
            d = new android.media.AudioTrack(3, e, z, A, h, 1, i1);
        }
        i1 = d.getState();
        if (i1 == 1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        d.release();
        d = null;
_L2:
        throw new InitializationException(i1, e, z, h);
        Object obj;
        obj;
        d = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        d = null;
        throw obj;
        i1 = d.getAudioSessionId();
        c.a(d, x);
        a(B);
        return i1;
    }

    public final long a(long l1)
    {
        if (x)
        {
            if (y == 0)
            {
                return 0L;
            } else
            {
                return ((l1 << 3) * (long)e) / (long)(y * 1000);
            }
        } else
        {
            return l1 / (long)f;
        }
    }

    public final void a(float f1)
    {
label0:
        {
            B = f1;
            if (a())
            {
                if (bej.a < 21)
                {
                    break label0;
                }
                d.setVolume(f1);
            }
            return;
        }
        d.setStereoVolume(f1, f1);
    }

    public final void a(MediaFormat mediaformat)
    {
        int k1;
        boolean flag1;
        flag1 = true;
        k1 = mediaformat.getInteger("channel-count");
        k1;
        JVM INSTR tableswitch 1 8: default 60
    //                   1 85
    //                   2 289
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 295
    //                   7 60
    //                   8 302;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L4 _L1 _L5
_L5:
        break MISSING_BLOCK_LABEL_302;
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unsupported channel count: ")).append(k1).toString());
_L2:
        int i1 = 4;
_L6:
        int l1 = mediaformat.getInteger("sample-rate");
        mediaformat = mediaformat.getString("mime");
        int j1;
        boolean flag;
        if ("audio/ac3".equals(mediaformat))
        {
            j1 = 5;
        } else
        if ("audio/eac3".equals(mediaformat))
        {
            j1 = 6;
        } else
        if (bea.b(mediaformat))
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (j1 == 5 || j1 == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!a() || e != l1 || z != i1 || x || flag)
        {
            d();
            A = j1;
            e = l1;
            z = i1;
            x = flag;
            y = 0;
            f = k1 * 2;
            g = android.media.AudioTrack.getMinBufferSize(l1, i1, j1);
            if (g != -2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            bds.b(flag);
            i1 = g << 2;
            j1 = (int)c(0x3d090L) * f;
            k1 = (int)Math.max(g, c(0xb71b0L) * (long)f);
            if (i1 < j1)
            {
                i1 = j1;
            } else
            if (i1 > k1)
            {
                i1 = k1;
            }
            h = i1;
        }
        return;
_L3:
        i1 = 12;
          goto _L6
_L4:
        i1 = 252;
          goto _L6
        i1 = 1020;
          goto _L6
    }

    public final boolean a()
    {
        return d != null;
    }

    public final long b(long l1)
    {
        return (0xf4240L * l1) / (long)e;
    }

    public final void b()
    {
        if (a())
        {
            s = System.nanoTime() / 1000L;
            d.play();
        }
    }

    public final long c(long l1)
    {
        return ((long)e * l1) / 0xf4240L;
    }

    public final boolean c()
    {
        return a() && (a(p) > c.b() || c.a());
    }

    public final void d()
    {
        if (a())
        {
            p = 0L;
            w = 0;
            q = 0;
            t = 0L;
            e();
            if (d.getPlayState() == 3)
            {
                d.pause();
            }
            android.media.AudioTrack audiotrack = d;
            d = null;
            c.a(null, false);
            a.close();
            (new Thread(audiotrack) {

                private android.media.AudioTrack a;
                private AudioTrack b;

                public final void run()
                {
                    a.release();
                    b.a.open();
                    return;
                    Exception exception;
                    exception;
                    b.a.open();
                    throw exception;
                }

            
            {
                b = AudioTrack.this;
                a = audiotrack1;
                super();
            }
            }).start();
        }
    }

    public final void e()
    {
        k = 0L;
        j = 0;
        i = 0;
        l = 0L;
        m = false;
        n = 0L;
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

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class jjr
{

    private static boolean w = false;
    private static boolean x = false;
    private final long A[];
    private int B;
    private long C;
    private long D;
    private Method E;
    private long F;
    public final jjq a;
    public final jju b;
    public AudioTrack c;
    public AudioTrack d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public long n;
    public int o;
    public long p;
    public long q;
    public float r;
    public byte s[];
    public int t;
    public int u;
    public int v;
    private final int y;
    private final ConditionVariable z;

    public jjr()
    {
        this(null, 3);
    }

    public jjr(jjq jjq, int i1)
    {
        a = jjq;
        y = i1;
        z = new ConditionVariable(true);
        if (jno.a >= 18)
        {
            try
            {
                E = android/media/AudioTrack.getMethod("getLatency", null);
            }
            // Misplaced declaration of an exception variable
            catch (jjq jjq) { }
        }
        if (jno.a >= 19)
        {
            b = new jjv();
        } else
        {
            b = new jju((byte)0);
        }
        A = new long[10];
        r = 1.0F;
        o = 0;
    }

    public static int a(AudioTrack audiotrack, ByteBuffer bytebuffer, int i1)
    {
        return audiotrack.write(bytebuffer, i1, 1);
    }

    public static int a(String s1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1095064472: 110
    //                   187078296: 82
    //                   1504578661: 96
    //                   1505942594: 124;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_124;
_L6:
        switch (byte0)
        {
        default:
            return 0;

        case 0: // '\0'
            return 5;

        case 1: // '\001'
            return 6;

        case 2: // '\002'
            return 7;

        case 3: // '\003'
            return 8;
        }
_L3:
        if (s1.equals("audio/ac3"))
        {
            byte0 = 0;
        }
          goto _L6
_L4:
        if (s1.equals("audio/eac3"))
        {
            byte0 = 1;
        }
          goto _L6
_L2:
        if (s1.equals("audio/vnd.dts"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s1.equals("audio/vnd.dts.hd"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    static ConditionVariable a(jjr jjr1)
    {
        return jjr1.z;
    }

    public final int a(int i1)
    {
        z.block();
        if (i1 == 0)
        {
            d = new AudioTrack(y, e, f, g, j, 1);
        } else
        {
            d = new AudioTrack(y, e, f, g, j, 1, i1);
        }
        i1 = d.getState();
        if (i1 == 1)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        d.release();
        d = null;
_L2:
        throw new jjw(i1, e, f, j);
        Object obj;
        obj;
        d = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        d = null;
        throw obj;
        i1 = d.getAudioSessionId();
        b.a(d, j());
        d();
        return i1;
    }

    public long a(long l1)
    {
        boolean flag;
        if (h() || i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (v == 0)
            {
                return 0L;
            } else
            {
                return ((l1 << 3) * (long)e) / (long)(v * 1000);
            }
        } else
        {
            return l1 / (long)h;
        }
    }

    public final boolean a()
    {
        return d != null;
    }

    public long b(long l1)
    {
        return (0xf4240L * l1) / (long)e;
    }

    public final void b()
    {
        if (a())
        {
            F = System.nanoTime() / 1000L;
            d.play();
        }
    }

    public long c(long l1)
    {
        return ((long)e * l1) / 0xf4240L;
    }

    public final boolean c()
    {
label0:
        {
            if (!a())
            {
                break label0;
            }
            if (a(n) <= b.a())
            {
                boolean flag;
                if (j() && d.getPlayState() == 2 && d.getPlaybackHeadPosition() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public void d()
    {
label0:
        {
            if (a())
            {
                if (jno.a < 21)
                {
                    break label0;
                }
                d.setVolume(r);
            }
            return;
        }
        AudioTrack audiotrack = d;
        float f1 = r;
        audiotrack.setStereoVolume(f1, f1);
    }

    public final void e()
    {
        if (a())
        {
            n = 0L;
            u = 0;
            o = 0;
            q = 0L;
            g();
            if (d.getPlayState() == 3)
            {
                d.pause();
            }
            AudioTrack audiotrack = d;
            d = null;
            b.a(null, false);
            z.close();
            (new jjs(this, audiotrack)).start();
        }
    }

    public void f()
    {
        long l2 = b.b();
        if (l2 != 0L)
        {
            long l1 = System.nanoTime() / 1000L;
            if (l1 - C >= 30000L)
            {
                A[B] = l2 - l1;
                B = (B + 1) % 10;
                if (k < 10)
                {
                    k = k + 1;
                }
                C = l1;
                l = 0L;
                for (int i1 = 0; i1 < k; i1++)
                {
                    l = l + A[i1] / (long)k;
                }

            }
            if (!j() && l1 - D >= 0x7a120L)
            {
                m = b.c();
                if (m)
                {
                    long l3 = b.d() / 1000L;
                    long l4 = b.e();
                    if (l3 < F)
                    {
                        m = false;
                    } else
                    if (Math.abs(l3 - l1) > 0x4c4b40L)
                    {
                        Log.w("AudioTrack", (new StringBuilder(136)).append("Spurious audio timestamp (system clock mismatch): ").append(l4).append(", ").append(l3).append(", ").append(l1).append(", ").append(l2).toString());
                        m = false;
                    } else
                    if (Math.abs(b(l4) - l2) > 0x4c4b40L)
                    {
                        Log.w("AudioTrack", (new StringBuilder(138)).append("Spurious audio timestamp (frame position mismatch): ").append(l4).append(", ").append(l3).append(", ").append(l1).append(", ").append(l2).toString());
                        m = false;
                    }
                }
                if (E != null)
                {
                    try
                    {
                        q = (long)((Integer)E.invoke(d, null)).intValue() * 1000L - b(a(j));
                        q = Math.max(q, 0L);
                        if (q > 0x4c4b40L)
                        {
                            l2 = q;
                            Log.w("AudioTrack", (new StringBuilder(61)).append("Ignoring impossibly large audio latency: ").append(l2).toString());
                            q = 0L;
                        }
                    }
                    catch (Exception exception)
                    {
                        E = null;
                    }
                }
                D = l1;
                return;
            }
        }
    }

    public void g()
    {
        l = 0L;
        k = 0;
        B = 0;
        C = 0L;
        m = false;
        D = 0L;
    }

    public boolean h()
    {
        return g == 5 || g == 6;
    }

    public boolean i()
    {
        return g == 7 || g == 8;
    }

    public boolean j()
    {
        return jno.a < 23 && h();
    }

}

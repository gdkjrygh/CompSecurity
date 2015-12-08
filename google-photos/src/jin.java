// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class jin extends jiq
    implements jim
{

    private final k f;
    private final jjr i;
    private MediaFormat j;
    private int k;
    private long l;
    private boolean m;

    public jin(jjl jjl)
    {
        this(jjl, null, true);
    }

    private jin(jjl jjl, k k1, boolean flag)
    {
        this(jjl, null, true, null, null);
    }

    private jin(jjl jjl, k k1, boolean flag, Handler handler, k k2)
    {
        this(jjl, k1, flag, null, null, null);
    }

    private jin(jjl jjl, k k1, boolean flag, Handler handler, k k2, jjq jjq1)
    {
        this(jjl, k1, flag, handler, k2, null, 3);
    }

    private jin(jjl jjl, k k1, boolean flag, Handler handler, k k2, jjq jjq1, int i1)
    {
        super(jjl, k1, flag, handler, k2);
        f = k2;
        k = 0;
        i = new jjr(jjq1, 3);
    }

    private boolean a(String s)
    {
        Object obj = i;
        if (((jjr) (obj)).a != null)
        {
            obj = ((jjr) (obj)).a;
            int i1 = jjr.a(s);
            boolean flag;
            if (Arrays.binarySearch(((jjq) (obj)).a, i1) >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private void d(long l1)
    {
        i.e();
        l = l1;
        m = true;
    }

    protected final jid a(String s, boolean flag)
    {
        if (a(s))
        {
            return new jid("OMX.google.raw.decoder", true);
        } else
        {
            return super.a(s, flag);
        }
    }

    protected final void a()
    {
        k = 0;
        jjr jjr1 = i;
        jjr1.e();
        if (jjr1.c != null)
        {
            AudioTrack audiotrack = jjr1.c;
            jjr1.c = null;
            (new jjt(jjr1, audiotrack)).start();
        }
        super.a();
        return;
        Exception exception;
        exception;
        super.a();
        throw exception;
    }

    protected final void a(int i1, long l1, boolean flag)
    {
        super.a(i1, l1, flag);
        d(l1);
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            jjr jjr1 = i;
            float f1 = ((Float)obj).floatValue();
            if (jjr1.r != f1)
            {
                jjr1.r = f1;
                jjr1.d();
            }
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(MediaCodec mediacodec, String s, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        String s1 = mediaformat.getString("mime");
        if ("OMX.google.raw.decoder".equals(s) && !"audio/raw".equals(s1))
        {
            mediaformat.setString("mime", "audio/raw");
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            mediaformat.setString("mime", s1);
            j = mediaformat;
            return;
        } else
        {
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            j = null;
            return;
        }
    }

    protected final void a(MediaFormat mediaformat)
    {
        jjr jjr1;
        boolean flag;
        int k1;
        boolean flag1;
        flag1 = true;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jjr1 = i;
        if (flag)
        {
            mediaformat = j;
        }
        k1 = mediaformat.getInteger("channel-count");
        k1;
        JVM INSTR tableswitch 1 8: default 84
    //                   1 120
    //                   2 302
    //                   3 84
    //                   4 84
    //                   5 84
    //                   6 308
    //                   7 84
    //                   8 315;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L4 _L1 _L5
_L5:
        break MISSING_BLOCK_LABEL_315;
_L1:
        throw new IllegalArgumentException((new StringBuilder(38)).append("Unsupported channel count: ").append(k1).toString());
_L2:
        int i1 = 4;
_L6:
        int l1 = mediaformat.getInteger("sample-rate");
        mediaformat = mediaformat.getString("mime");
        int j1;
        if (flag)
        {
            j1 = jjr.a(mediaformat);
        } else
        {
            j1 = 2;
        }
        if (!jjr1.a() || jjr1.e != l1 || jjr1.f != i1 || jjr1.g != j1)
        {
            jjr1.e();
            jjr1.g = j1;
            jjr1.e = l1;
            jjr1.f = i1;
            jjr1.v = 0;
            jjr1.h = k1 * 2;
            jjr1.i = AudioTrack.getMinBufferSize(l1, i1, j1);
            if (jjr1.i == -2)
            {
                flag1 = false;
            }
            c.b(flag1);
            i1 = jjr1.i << 2;
            j1 = (int)jjr1.c(0x3d090L) * jjr1.h;
            k1 = (int)Math.max(jjr1.i, jjr1.c(0xb71b0L) * (long)jjr1.h);
            if (i1 < j1)
            {
                i1 = j1;
            } else
            if (i1 > k1)
            {
                i1 = k1;
            }
            jjr1.j = i1;
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

    protected final boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag)
    {
        if (flag)
        {
            mediacodec.releaseOutputBuffer(i1, false);
            mediacodec = a;
            mediacodec.f = ((jib) (mediacodec)).f + 1;
            mediacodec = i;
            if (((jjr) (mediacodec)).o == 1)
            {
                mediacodec.o = 2;
            }
            return true;
        }
        if (i.a()) goto _L2; else goto _L1
_L1:
        if (k == 0) goto _L4; else goto _L3
_L3:
        i.a(k);
_L7:
        if (i() == 3)
        {
            i.b();
        }
_L2:
        jjr jjr1;
        int i2;
        int j2;
        jjr1 = i;
        i2 = bufferinfo.offset;
        j2 = bufferinfo.size;
        l1 = bufferinfo.presentationTimeUs;
        if (j2 != 0) goto _L6; else goto _L5
_L5:
        int j1 = 2;
_L8:
        if ((j1 & 1) != 0)
        {
            m = true;
        }
        int k1;
        if ((j1 & 2) != 0)
        {
            mediacodec.releaseOutputBuffer(i1, false);
            mediacodec = a;
            mediacodec.e = ((jib) (mediacodec)).e + 1;
            return true;
        } else
        {
            return false;
        }
_L4:
        try
        {
            k = i.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            if (b != null && f != null)
            {
                b.post(new jio(this, mediacodec));
            }
            throw new jie(mediacodec);
        }
          goto _L7
_L6:
        if (!jjr1.j())
        {
            break MISSING_BLOCK_LABEL_295;
        }
        if (jjr1.d.getPlayState() != 2)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        j1 = 0;
          goto _L8
        if (jjr1.d.getPlayState() != 1 || jjr1.b.a() == 0L)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        j1 = 0;
          goto _L8
        k1 = 0;
        j1 = k1;
        if (jjr1.u != 0) goto _L10; else goto _L9
_L9:
        if (jjr1.v != 0) goto _L12; else goto _L11
_L11:
        if (!jjr1.h()) goto _L14; else goto _L13
_L13:
        jjr1.v = jne.a(j2, jjr1.e);
_L12:
        l1 -= jjr1.b(jjr1.a(j2));
        if (jjr1.o != 0) goto _L16; else goto _L15
_L15:
        jjr1.p = Math.max(0L, l1);
        jjr1.o = 1;
        j1 = k1;
_L10:
        if (jjr1.u == 0)
        {
            jjr1.u = j2;
            bytebuffer.position(i2);
            if (jno.a < 21)
            {
                if (jjr1.s == null || jjr1.s.length < j2)
                {
                    jjr1.s = new byte[j2];
                }
                bytebuffer.get(jjr1.s, 0, j2);
                jjr1.t = 0;
            }
        }
        k1 = 0;
        if (jno.a >= 21)
        {
            break MISSING_BLOCK_LABEL_801;
        }
        i2 = (int)(jjr1.n - jjr1.b.a() * (long)jjr1.h);
        i2 = jjr1.j - i2;
        if (i2 <= 0)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        k1 = Math.min(jjr1.u, i2);
        i2 = jjr1.d.write(jjr1.s, jjr1.t, k1);
        k1 = i2;
        if (i2 < 0)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        jjr1.t = jjr1.t + i2;
        k1 = i2;
_L19:
        if (k1 < 0)
        {
            try
            {
                throw new jjx(k1);
            }
            // Misplaced declaration of an exception variable
            catch (MediaCodec mediacodec) { }
            if (b != null && f != null)
            {
                b.post(new jip(this, mediacodec));
            }
            throw new jie(mediacodec);
        }
        break MISSING_BLOCK_LABEL_821;
_L14:
        if (!jjr1.i()) goto _L12; else goto _L17
_L17:
        jjr1.v = ((j2 << 3) * jjr1.e + 0x3e800) / 0x7d000;
          goto _L12
_L16:
        l2 = jjr1.p + jjr1.b(jjr1.a(jjr1.n));
        if (jjr1.o == 1 && Math.abs(l2 - l1) > 0x30d40L)
        {
            Log.e("AudioTrack", (new StringBuilder(80)).append("Discontinuity detected [expected ").append(l2).append(", got ").append(l1).append("]").toString());
            jjr1.o = 2;
        }
        j1 = k1;
        if (jjr1.o != 2) goto _L10; else goto _L18
_L18:
        jjr1.p = (l1 - l2) + jjr1.p;
        jjr1.o = 1;
        j1 = 1;
          goto _L10
        k1 = jjr.a(jjr1.d, bytebuffer, jjr1.u);
          goto _L19
        jjr1.u = jjr1.u - k1;
        jjr1.n = jjr1.n + (long)k1;
        k1 = jjr1.u;
        if (k1 == 0)
        {
            j1 |= 2;
        }
          goto _L8
    }

    protected final boolean a(jjh jjh1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            jjh1 = jjh1.b;
            flag = flag1;
            if (!c.a(jjh1))
            {
                break label0;
            }
            if (!"audio/x-unknown".equals(jjh1) && !a(((String) (jjh1))))
            {
                flag = flag1;
                if (jiw.a(jjh1, false) == null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final long b()
    {
        jjr jjr1 = i;
        boolean flag1 = c();
        boolean flag;
        long l1;
        if (jjr1.a() && jjr1.o != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            l1 = 0x8000000000000000L;
        } else
        {
            if (jjr1.d.getPlayState() == 3)
            {
                jjr1.f();
            }
            l1 = System.nanoTime() / 1000L;
            if (jjr1.m)
            {
                l1 = jjr1.b(jjr1.c(l1 - jjr1.b.d() / 1000L) + jjr1.b.e()) + jjr1.p;
            } else
            {
                long l2;
                if (jjr1.k == 0)
                {
                    l2 = jjr1.b.b() + jjr1.p;
                } else
                {
                    l2 = l1 + jjr1.l + jjr1.p;
                }
                l1 = l2;
                if (!flag1)
                {
                    l1 = l2 - jjr1.q;
                }
            }
        }
        if (l1 != 0x8000000000000000L)
        {
            if (!m)
            {
                l1 = Math.max(l, l1);
            }
            l = l1;
            m = false;
        }
        return l;
    }

    protected final void b(long l1)
    {
        super.b(l1);
        d(l1);
    }

    protected final boolean c()
    {
        return super.c() && !i.c();
    }

    protected final boolean d()
    {
        return i.c() || super.d() && super.e == 2;
    }

    protected final jim h()
    {
        return this;
    }

    protected final void k()
    {
        super.k();
        i.b();
    }

    protected final void m()
    {
        Object obj = i;
        if (((jjr) (obj)).a())
        {
            ((jjr) (obj)).g();
            obj = ((jjr) (obj)).b;
            if (((jju) (obj)).b == -1L)
            {
                ((jju) (obj)).a.pause();
            }
        }
        super.m();
    }

    protected final void q()
    {
        jjr jjr1 = i;
        if (jjr1.a())
        {
            jju jju1 = jjr1.b;
            long l1 = jjr1.a(jjr1.n);
            jju1.c = jju1.a();
            jju1.b = SystemClock.elapsedRealtime() * 1000L;
            jju1.d = l1;
            jju1.a.stop();
        }
    }
}

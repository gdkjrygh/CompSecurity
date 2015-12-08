// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class jiq extends jjn
{

    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    public final jib a = new jib();
    public final Handler b;
    MediaCodec d;
    int e;
    private final k f;
    private final boolean i;
    private final jjk j = new jjk(0);
    private final jji k = new jji();
    private final List l = new ArrayList();
    private final android.media.MediaCodec.BufferInfo m = new android.media.MediaCodec.BufferInfo();
    private final jiv n;
    private jjh o;
    private jjy p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private ByteBuffer u[];
    private ByteBuffer v[];
    private long w;
    private int x;
    private int y;
    private boolean z;

    public jiq(jjl jjl1, k k1, boolean flag, Handler handler, jiv jiv)
    {
        boolean flag1 = true;
        super(new jjl[] {
            jjl1
        });
        if (jno.a < 16)
        {
            flag1 = false;
        }
        c.b(flag1);
        f = k1;
        i = flag;
        b = handler;
        n = jiv;
        B = 0;
        C = 0;
    }

    private void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (b != null && n != null)
        {
            b.post(new jis(this, cryptoexception));
        }
    }

    private void a(jiu jiu1)
    {
        if (b != null && n != null)
        {
            b.post(new jir(this, jiu1));
        }
        throw new jie(jiu1);
    }

    private boolean a(long l1, boolean flag)
    {
        if (E || C == 2)
        {
            return false;
        }
        if (x < 0)
        {
            x = d.dequeueInputBuffer(0L);
            if (x < 0)
            {
                return false;
            }
            j.b = u[x];
            j.c();
        }
        if (C == 1)
        {
            if (!r)
            {
                t = true;
                d.queueInputBuffer(x, 0, 0, 0L, 4);
                x = -1;
            }
            C = 2;
            return false;
        }
        if (!G) goto _L2; else goto _L1
_L1:
        int i1 = -3;
_L4:
        if (i1 == -2)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (B == 1)
        {
            for (i1 = 0; i1 < o.e.size(); i1++)
            {
                byte abyte0[] = (byte[])o.e.get(i1);
                j.b.put(abyte0);
            }

            B = 2;
        }
        int j1 = a(l1, k, j, false);
        i1 = j1;
        if (flag)
        {
            i1 = j1;
            if (e == 1)
            {
                i1 = j1;
                if (j1 == -2)
                {
                    e = 2;
                    i1 = j1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag2;
        if (i1 == -5)
        {
            v();
            return true;
        }
        if (i1 == -4)
        {
            if (B == 2)
            {
                j.c();
                B = 1;
            }
            a(k);
            return true;
        }
        if (i1 == -1)
        {
            if (B == 2)
            {
                j.c();
                B = 1;
            }
            E = true;
            if (!D)
            {
                w();
                return false;
            }
            try
            {
                if (!r)
                {
                    t = true;
                    d.queueInputBuffer(x, 0, 0, 0L, 4);
                    x = -1;
                }
            }
            catch (android.media.MediaCodec.CryptoException cryptoexception)
            {
                a(cryptoexception);
                throw new jie(cryptoexception);
            }
            return false;
        }
        if (H)
        {
            if (!j.b())
            {
                j.c();
                if (B == 2)
                {
                    B = 1;
                }
                return true;
            }
            H = false;
        }
        flag2 = j.a();
        if (!z) goto _L6; else goto _L5
_L5:
        i1 = f.g();
        if (i1 == 0)
        {
            throw new jie(f.j());
        }
        if (i1 == 4 || !flag2 && i) goto _L6; else goto _L7
_L7:
        flag = true;
_L9:
        G = flag;
        if (G)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        int k1;
        int i2;
        k1 = j.b.position();
        i2 = k1 - j.c;
        l1 = j.e;
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        int ai[];
        boolean flag1;
        if ((j.d & 0x8000000) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            try
            {
                l.add(Long.valueOf(l1));
            }
            catch (android.media.MediaCodec.CryptoException cryptoexception1)
            {
                a(cryptoexception1);
                throw new jie(cryptoexception1);
            }
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_723;
        }
        cryptoinfo = j.a.g;
        if (i2 != 0) goto _L11; else goto _L10
_L10:
        d.queueSecureInputBuffer(x, 0, cryptoinfo, l1, 0);
_L12:
        x = -1;
        D = true;
        B = 0;
        return true;
_L11:
        if (cryptoinfo.numBytesOfClearData == null)
        {
            cryptoinfo.numBytesOfClearData = new int[1];
        }
        ai = cryptoinfo.numBytesOfClearData;
        ai[0] = i2 + ai[0];
          goto _L10
        d.queueInputBuffer(x, 0, k1, l1, 0);
          goto _L12
    }

    private void u()
    {
        e = 0;
        E = false;
        F = false;
    }

    private void v()
    {
        w = -1L;
        x = -1;
        y = -1;
        H = true;
        G = false;
        l.clear();
        if (jno.a < 18 || s && t)
        {
            t();
            r();
        } else
        if (C != 0)
        {
            t();
            r();
        } else
        {
            d.flush();
            D = false;
        }
        if (A && o != null)
        {
            B = 1;
        }
    }

    private void w()
    {
        if (C == 2)
        {
            t();
            r();
            return;
        } else
        {
            F = true;
            q();
            return;
        }
    }

    protected jid a(String s1, boolean flag)
    {
        return jiw.a(s1, flag);
    }

    public void a()
    {
        o = null;
        p = null;
        t();
        if (z)
        {
            z = false;
        }
        super.a();
        return;
        Exception exception;
        exception;
        super.a();
        throw exception;
        exception;
        if (z)
        {
            z = false;
        }
        super.a();
        throw exception;
        exception;
        super.a();
        throw exception;
    }

    protected void a(int i1, long l1, boolean flag)
    {
        super.a(i1, l1, flag);
        u();
    }

    protected final void a(long l1, long l2)
    {
        int i1;
        jib jib1;
        if (super.g.b(super.h, l1))
        {
            if (e == 0)
            {
                i1 = 1;
            } else
            {
                i1 = e;
            }
        } else
        {
            i1 = 0;
        }
        e = i1;
        if (d != null && a(l1, k, j, true) == -5)
        {
            v();
        }
        if (o == null && a(l1, k, j, false) == -4)
        {
            a(k);
        }
        if (d == null && s())
        {
            r();
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        p.a("drainAndFeed");
_L6:
        if (F) goto _L4; else goto _L3
_L3:
        if (y < 0)
        {
            y = d.dequeueOutputBuffer(m, 0L);
        }
        if (y == -2)
        {
            a(d.getOutputFormat());
            jib1 = a;
            jib1.c = jib1.c + 1;
            i1 = 1;
        } else
        if (y == -3)
        {
            v = d.getOutputBuffers();
            jib jib2 = a;
            jib2.d = jib2.d + 1;
            i1 = 1;
        } else
        {
label0:
            {
                if (y >= 0)
                {
                    break label0;
                }
                if (r && (E || C == 2))
                {
                    w();
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
            }
        }
_L9:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        if (a(l1, true))
        {
            while (a(l1, false)) ;
        }
        p.b();
_L2:
        a.a();
        return;
        if ((m.flags & 4) == 0) goto _L8; else goto _L7
_L7:
        w();
_L4:
        i1 = 0;
          goto _L9
_L8:
        int j1;
        long l3;
        l3 = m.presentationTimeUs;
        j1 = l.size();
        i1 = 0;
_L13:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        if (((Long)l.get(i1)).longValue() != l3) goto _L11; else goto _L10
_L10:
        MediaCodec mediacodec = d;
        ByteBuffer bytebuffer = v[y];
        android.media.MediaCodec.BufferInfo bufferinfo = m;
        int k1 = y;
        boolean flag;
        if (i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!a(l1, l2, mediacodec, bytebuffer, bufferinfo, k1, flag)) goto _L4; else goto _L12
_L12:
        if (i1 != -1)
        {
            l.remove(i1);
        }
        y = -1;
        i1 = 1;
          goto _L9
_L11:
        i1++;
          goto _L13
        i1 = -1;
          goto _L10
    }

    public void a(MediaCodec mediacodec, String s1, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, null, mediacrypto, 0);
    }

    protected void a(MediaFormat mediaformat)
    {
    }

    protected void a(jji jji1)
    {
        jjh jjh1 = o;
        o = jji1.a;
        p = jji1.b;
        if (d != null && a(q, jjh1, o))
        {
            A = true;
            B = 1;
            return;
        }
        if (D)
        {
            C = 1;
            return;
        } else
        {
            t();
            r();
            return;
        }
    }

    public abstract boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag);

    protected boolean a(boolean flag, jjh jjh1, jjh jjh2)
    {
        return false;
    }

    protected void b(long l1)
    {
        super.b(l1);
        u();
    }

    protected boolean c()
    {
        return F;
    }

    protected boolean d()
    {
label0:
        {
            if (o == null || G)
            {
                break label0;
            }
            if (e == 0 && y < 0)
            {
                boolean flag;
                if (SystemClock.elapsedRealtime() < w + 1000L)
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

    protected void k()
    {
    }

    public void m()
    {
    }

    protected void q()
    {
    }

    protected final void r()
    {
        boolean flag1 = false;
        if (s()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = o.b;
        if (p == null) goto _L4; else goto _L3
_L3:
        int i1;
        if (f == null)
        {
            throw new jie("Media requires a DrmSessionManager");
        }
        if (!z)
        {
            z = true;
        }
        i1 = f.g();
        if (i1 == 0)
        {
            throw new jie(f.j());
        }
        if (i1 != 3 && i1 != 4) goto _L1; else goto _L5
_L5:
        Object obj;
        boolean flag;
        obj = f.h();
        flag = f.i();
_L7:
        String s1;
        long l2;
        try
        {
            obj1 = a(((String) (obj1)), flag);
        }
        catch (jiy jiy1)
        {
            a(new jiu(o, jiy1, -49998));
            jiy1 = null;
        }
        if (obj1 == null)
        {
            a(new jiu(o, null, -49999));
        }
        s1 = ((jid) (obj1)).a;
        q = ((jid) (obj1)).b;
        if (jno.a <= 17 && "OMX.rk.video_decoder.avc".equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        flag = flag1;
        if (jno.a <= 23)
        {
            flag = flag1;
            if ("OMX.google.vorbis.decoder".equals(s1))
            {
                flag = true;
            }
        }
        s = flag;
        try
        {
            long l1 = SystemClock.elapsedRealtime();
            p.a((new StringBuilder(String.valueOf(s1).length() + 19)).append("createByCodecName(").append(s1).append(")").toString());
            d = MediaCodec.createByCodecName(s1);
            p.b();
            p.a("configureCodec");
            a(d, s1, q, o.a(), ((MediaCrypto) (obj)));
            p.b();
            p.a("codec.start()");
            d.start();
            p.b();
            long l3 = SystemClock.elapsedRealtime();
            if (b != null && n != null)
            {
                b.post(new jit(this, s1, l3, l3 - l1));
            }
            u = d.getInputBuffers();
            v = d.getOutputBuffers();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(new jiu(o, ((Throwable) (obj)), s1));
        }
        if (i() == 3)
        {
            l2 = SystemClock.elapsedRealtime();
        } else
        {
            l2 = -1L;
        }
        w = l2;
        x = -1;
        y = -1;
        H = true;
        obj = a;
        obj.a = ((jib) (obj)).a + 1;
        return;
_L4:
        flag = false;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean s()
    {
        return d == null && o != null;
    }

    protected final void t()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        w = -1L;
        x = -1;
        y = -1;
        G = false;
        l.clear();
        u = null;
        v = null;
        A = false;
        D = false;
        q = false;
        r = false;
        s = false;
        t = false;
        B = 0;
        C = 0;
        jib jib1 = a;
        jib1.b = jib1.b + 1;
        d.stop();
        d.release();
        d = null;
        return;
        Exception exception;
        exception;
        d = null;
        throw exception;
        exception;
        d.release();
        d = null;
        throw exception;
        exception;
        d = null;
        throw exception;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import java.nio.ByteBuffer;

public class jjc extends jiq
{

    private int A;
    private float B;
    final jjg f;
    private final jjp i;
    private final long j;
    private final int k;
    private final int l;
    private Surface m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private int r;
    private int s;
    private float t;
    private int u;
    private int v;
    private int w;
    private float x;
    private int y;
    private int z;

    public jjc(Context context, jjl jjl, int i1, long l1)
    {
        this(context, jjl, 1, 100L, null, null, -1);
    }

    public jjc(Context context, jjl jjl, int i1, long l1, Handler handler, jjg jjg, 
            int j1)
    {
        this(context, jjl, i1, l1, null, false, handler, jjg, j1);
    }

    private jjc(Context context, jjl jjl, int i1, long l1, k k1, boolean flag, 
            Handler handler, jjg jjg, int j1)
    {
        super(jjl, null, false, handler, jjg);
        i = new jjp(context);
        k = i1;
        j = 1000L * l1;
        f = jjg;
        l = j1;
        p = -1L;
        u = -1;
        v = -1;
        x = -1F;
        t = -1F;
        y = -1;
        z = -1;
        B = -1F;
    }

    private void a(MediaCodec mediacodec, int i1)
    {
        u();
        p.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, true);
        p.b();
        mediacodec = a;
        mediacodec.e = ((jib) (mediacodec)).e + 1;
        o = true;
        v();
    }

    private void a(MediaCodec mediacodec, int i1, long l1)
    {
        u();
        p.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, l1);
        p.b();
        mediacodec = a;
        mediacodec.e = ((jib) (mediacodec)).e + 1;
        o = true;
        v();
    }

    private void u()
    {
        if (b == null || f == null || y == u && z == v && A == w && B == x)
        {
            return;
        } else
        {
            int i1 = u;
            int j1 = v;
            int k1 = w;
            float f1 = x;
            b.post(new jjd(this, i1, j1, k1, f1));
            y = i1;
            z = j1;
            A = k1;
            B = f1;
            return;
        }
    }

    private void v()
    {
        if (b == null || f == null || n)
        {
            return;
        } else
        {
            Surface surface = m;
            b.post(new jje(this, surface));
            n = true;
            return;
        }
    }

    private void w()
    {
        if (b == null || f == null || r == 0)
        {
            return;
        } else
        {
            long l1 = SystemClock.elapsedRealtime();
            int i1 = r;
            long l2 = q;
            b.post(new jjf(this, i1, l1 - l2));
            r = 0;
            q = l1;
            return;
        }
    }

    public void a()
    {
        u = -1;
        v = -1;
        x = -1F;
        t = -1F;
        y = -1;
        z = -1;
        B = -1F;
        jjp jjp1 = i;
        if (jjp1.a)
        {
            jjp1.d.removeFrameCallback(jjp1);
            jjp1.d = null;
        }
        super.a();
    }

    protected final void a(int i1, long l1, boolean flag)
    {
        super.a(i1, l1, flag);
        o = false;
        if (flag && j > 0L)
        {
            p = SystemClock.elapsedRealtime() * 1000L + j;
        }
        jjp jjp1 = i;
        jjp1.i = false;
        if (jjp1.a)
        {
            jjp1.e = 0L;
            jjp1.d = Choreographer.getInstance();
            jjp1.d.postFrameCallback(jjp1);
        }
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            obj = (Surface)obj;
            if (m != obj)
            {
                m = ((Surface) (obj));
                n = false;
                i1 = i();
                if (i1 == 2 || i1 == 3)
                {
                    t();
                    r();
                }
            }
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    public void a(MediaCodec mediacodec, String s1, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        if ("video/avc".equals(mediaformat.getString("mime")) && !mediaformat.containsKey("max-input-size") && !"BRAVIA 4K 2015".equals(jno.d))
        {
            int j1 = mediaformat.getInteger("height");
            int i1 = j1;
            if (flag)
            {
                i1 = j1;
                if (mediaformat.containsKey("max-height"))
                {
                    i1 = Math.max(j1, mediaformat.getInteger("max-height"));
                }
            }
            int k1 = mediaformat.getInteger("width");
            j1 = k1;
            if (flag)
            {
                j1 = k1;
                if (mediaformat.containsKey("max-width"))
                {
                    j1 = Math.max(i1, mediaformat.getInteger("max-width"));
                }
            }
            j1 = (j1 + 15) / 16;
            mediaformat.setInteger("max-input-size", ((i1 + 15) / 16) * j1 * 192);
        }
        mediacodec.configure(mediaformat, m, mediacrypto, 0);
        mediacodec.setVideoScalingMode(k);
    }

    protected final void a(MediaFormat mediaformat)
    {
        int i1;
        int j1;
        if (mediaformat.containsKey("crop-right") && mediaformat.containsKey("crop-left") && mediaformat.containsKey("crop-bottom") && mediaformat.containsKey("crop-top"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            j1 = (mediaformat.getInteger("crop-right") - mediaformat.getInteger("crop-left")) + 1;
        } else
        {
            j1 = mediaformat.getInteger("width");
        }
        u = j1;
        if (i1 != 0)
        {
            i1 = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
        } else
        {
            i1 = mediaformat.getInteger("height");
        }
        v = i1;
        x = t;
        if (jno.a >= 21)
        {
            if (s == 90 || s == 270)
            {
                i1 = u;
                u = v;
                v = i1;
                x = 1.0F / x;
            }
            return;
        } else
        {
            w = s;
            return;
        }
    }

    protected final void a(jji jji1)
    {
        super.a(jji1);
        float f1;
        int i1;
        if (jji1.a.l == -1F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = jji1.a.l;
        }
        t = f1;
        if (jji1.a.k == -1)
        {
            i1 = 0;
        } else
        {
            i1 = jji1.a.k;
        }
        s = i1;
    }

    protected final boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag)
    {
        long l3;
        long l4;
        long l5;
        long l6;
        if (flag)
        {
            p.a("skipVideoBuffer");
            mediacodec.releaseOutputBuffer(i1, false);
            p.b();
            mediacodec = a;
            mediacodec.f = ((jib) (mediacodec)).f + 1;
            return true;
        }
        if (!o)
        {
            if (jno.a >= 21)
            {
                a(mediacodec, i1, System.nanoTime());
            } else
            {
                a(mediacodec, i1);
            }
            return true;
        }
        if (i() != 3)
        {
            return false;
        }
        l3 = SystemClock.elapsedRealtime();
        l4 = bufferinfo.presentationTimeUs;
        l5 = System.nanoTime();
        l3 = l5 + (l4 - l1 - (l3 * 1000L - l2)) * 1000L;
        bytebuffer = i;
        l6 = bufferinfo.presentationTimeUs;
        l4 = l6 * 1000L;
        if (!((jjp) (bytebuffer)).i)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        if (l6 != ((jjp) (bytebuffer)).f)
        {
            bytebuffer.l = ((jjp) (bytebuffer)).l + 1L;
            bytebuffer.g = ((jjp) (bytebuffer)).h;
        }
        if (((jjp) (bytebuffer)).l < 6L) goto _L2; else goto _L1
_L1:
        l1 = (l4 - ((jjp) (bytebuffer)).k) / ((jjp) (bytebuffer)).l;
        l2 = ((jjp) (bytebuffer)).g + l1;
        if (bytebuffer.a(l2, l3))
        {
            bytebuffer.i = false;
            l1 = l3;
            l2 = l4;
        } else
        {
            l1 = (((jjp) (bytebuffer)).j + l2) - ((jjp) (bytebuffer)).k;
        }
_L3:
        if (!((jjp) (bytebuffer)).i)
        {
            bytebuffer.k = l4;
            bytebuffer.j = l3;
            bytebuffer.l = 0L;
            bytebuffer.i = true;
        }
        bytebuffer.f = l6;
        bytebuffer.h = l2;
        if (((jjp) (bytebuffer)).e != 0L)
        {
            l1 = jjp.a(l1, ((jjp) (bytebuffer)).e, ((jjp) (bytebuffer)).b) - ((jjp) (bytebuffer)).c;
        }
        l2 = (l1 - l5) / 1000L;
        if (l2 < -30000L)
        {
            p.a("dropVideoBuffer");
            mediacodec.releaseOutputBuffer(i1, false);
            p.b();
            mediacodec = a;
            mediacodec.g = ((jib) (mediacodec)).g + 1;
            r = r + 1;
            if (r == l)
            {
                w();
            }
            return true;
        }
        break MISSING_BLOCK_LABEL_454;
_L2:
        if (bytebuffer.a(l4, l3))
        {
            bytebuffer.i = false;
        }
        l1 = l3;
        l2 = l4;
          goto _L3
        if (jno.a >= 21)
        {
            if (l2 < 50000L)
            {
                a(mediacodec, i1, l1);
                return true;
            }
        } else
        if (l2 < 30000L)
        {
            if (l2 > 11000L)
            {
                try
                {
                    Thread.sleep((l2 - 10000L) / 1000L);
                }
                // Misplaced declaration of an exception variable
                catch (ByteBuffer bytebuffer)
                {
                    Thread.currentThread().interrupt();
                }
            }
            a(mediacodec, i1);
            return true;
        }
        return false;
    }

    protected final boolean a(jjh jjh1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            jjh1 = jjh1.b;
            flag = flag1;
            if (!c.b(jjh1))
            {
                break label0;
            }
            if (!"video/x-unknown".equals(jjh1))
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

    protected final boolean a(boolean flag, jjh jjh1, jjh jjh2)
    {
        return jjh2.b.equals(jjh1.b) && (flag || jjh1.g == jjh2.g && jjh1.h == jjh2.h);
    }

    protected final void b(long l1)
    {
        super.b(l1);
        o = false;
        p = -1L;
    }

    protected final boolean d()
    {
        if (!super.d()) goto _L2; else goto _L1
_L1:
        if (o) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (super.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && super.e != 2) goto _L2; else goto _L4
_L4:
        p = -1L;
_L6:
        return true;
_L2:
        if (p == -1L)
        {
            return false;
        }
        if (SystemClock.elapsedRealtime() * 1000L >= p)
        {
            p = -1L;
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void k()
    {
        super.k();
        r = 0;
        q = SystemClock.elapsedRealtime();
    }

    protected final void m()
    {
        p = -1L;
        w();
        super.m();
    }

    protected final boolean s()
    {
        return super.s() && m != null && m.isValid();
    }
}

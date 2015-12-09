// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaCodecTrackRenderer;
import java.nio.ByteBuffer;

public class azg extends MediaCodecTrackRenderer
{

    final azh f;
    private Surface h;
    private boolean i;
    private boolean j;
    private long k;
    private int l;
    private int m;
    private int n;
    private float o;
    private float p;
    private int q;
    private int r;
    private float s;

    public azg(azl azl, bbm bbm, Handler handler, azh azh)
    {
        super(azl, bbm, handler, azh);
        f = azh;
        k = -1L;
        m = -1;
        n = -1;
        o = -1F;
        p = -1F;
        q = -1;
        r = -1;
        s = -1F;
    }

    private void a(MediaCodec mediacodec, int i1)
    {
        r();
        beh.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, true);
        beh.a();
        mediacodec = a;
        mediacodec.e = ((ayl) (mediacodec)).e + 1;
        j = true;
        s();
    }

    private void a(MediaCodec mediacodec, int i1, long l1)
    {
        r();
        beh.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, l1);
        beh.a();
        mediacodec = a;
        mediacodec.e = ((ayl) (mediacodec)).e + 1;
        j = true;
        s();
    }

    private void r()
    {
        if (c == null || f == null || q == m && r == n && s == o)
        {
            return;
        } else
        {
            int i1 = m;
            int j1 = n;
            float f1 = o;
            c.post(new Runnable(i1, j1, f1) {

                private int a;
                private int b;
                private float c;
                private azg d;

                public final void run()
                {
                    d.f.a(a, b, c);
                }

            
            {
                d = azg.this;
                a = i1;
                b = j1;
                c = f1;
                super();
            }
            });
            q = i1;
            r = j1;
            s = f1;
            return;
        }
    }

    private void s()
    {
        if (c == null || f == null || i)
        {
            return;
        } else
        {
            c.post(new Runnable() {

                private azg a;

                public final void run()
                {
                    a.f.a();
                }

            
            {
                a = azg.this;
                super();
            }
            });
            i = true;
            return;
        }
    }

    private void t()
    {
        if (c == null || f == null || l == 0)
        {
            return;
        } else
        {
            SystemClock.elapsedRealtime();
            c.post(new Runnable() {

                public final void run()
                {
                }

            });
            l = 0;
            return;
        }
    }

    public void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            obj = (Surface)obj;
            if (h != obj)
            {
                h = ((Surface) (obj));
                i = false;
                i1 = super.g;
                if (i1 == 2 || i1 == 3)
                {
                    m();
                    k();
                }
            }
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(long l1)
    {
        super.a(l1);
        j = false;
        k = -1L;
    }

    protected final void a(long l1, boolean flag)
    {
        super.a(l1, flag);
        j = false;
        if (flag && 0L > 0L)
        {
            k = SystemClock.elapsedRealtime() * 1000L;
        }
    }

    protected final void a(MediaCodec mediacodec, String s1, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, h, mediacrypto, 0);
        mediacodec.setVideoScalingMode(1);
    }

    protected final void a(azi azi1, MediaFormat mediaformat)
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
        m = j1;
        if (i1 != 0)
        {
            i1 = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
        } else
        {
            i1 = mediaformat.getInteger("height");
        }
        n = i1;
        o = p;
    }

    protected final void a(azj azj1)
    {
        super.a(azj1);
        float f1;
        if (azj1.a.d == -1F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = azj1.a.d;
        }
        p = f1;
    }

    protected final boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag)
    {
        if (flag)
        {
            beh.a("skipVideoBuffer");
            mediacodec.releaseOutputBuffer(i1, false);
            beh.a();
            mediacodec = a;
            mediacodec.f = ((ayl) (mediacodec)).f + 1;
            return true;
        }
        long l3 = SystemClock.elapsedRealtime();
        l1 = bufferinfo.presentationTimeUs - l1 - (l3 * 1000L - l2);
        l2 = System.nanoTime();
        if (l1 < -30000L)
        {
            beh.a("dropVideoBuffer");
            mediacodec.releaseOutputBuffer(i1, false);
            beh.a();
            mediacodec = a;
            mediacodec.g = ((ayl) (mediacodec)).g + 1;
            l = l + 1;
            if (l == 50)
            {
                t();
            }
            return true;
        }
        if (!j)
        {
            if (bej.a >= 21)
            {
                a(mediacodec, i1, System.nanoTime());
            } else
            {
                a(mediacodec, i1);
            }
            return true;
        }
        if (super.g != 3)
        {
            return false;
        }
        if (bej.a >= 21)
        {
            if (l1 < 50000L)
            {
                a(mediacodec, i1, l2 + 1000L * l1);
                return true;
            }
        } else
        if (l1 < 30000L)
        {
            if (l1 > 11000L)
            {
                try
                {
                    Thread.sleep((l1 - 10000L) / 1000L);
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

    protected final boolean a(String s1)
    {
        return bea.c(s1) && super.a(s1);
    }

    protected final boolean a(boolean flag, azi azi1, azi azi2)
    {
        return azi2.a.equals(azi1.a) && (flag || azi1.b == azi2.b && azi1.c == azi2.c);
    }

    protected final boolean c()
    {
        if (!super.c()) goto _L2; else goto _L1
_L1:
        if (j) goto _L4; else goto _L3
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
        k = -1L;
_L6:
        return true;
_L2:
        if (k == -1L)
        {
            return false;
        }
        if (SystemClock.elapsedRealtime() * 1000L >= k)
        {
            k = -1L;
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void h()
    {
        super.h();
        l = 0;
        SystemClock.elapsedRealtime();
    }

    protected final void i()
    {
        k = -1L;
        t();
        super.i();
    }

    public final void j()
    {
        m = -1;
        n = -1;
        o = -1F;
        p = -1F;
        q = -1;
        r = -1;
        s = -1F;
        super.j();
    }

    protected final boolean l()
    {
        return super.l() && h != null && h.isValid();
    }
}

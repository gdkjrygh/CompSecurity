// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.MediaCodecTrackRenderer;
import com.google.android.exoplayer.audio.AudioTrack;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class ayz extends MediaCodecTrackRenderer
    implements ayy
{

    private final AudioTrack f;
    private int h;
    private long i;
    private boolean j;

    public ayz(azl azl, bbm bbm)
    {
        this(azl, bbm, (byte)0);
    }

    private ayz(azl azl, bbm bbm, byte byte0)
    {
        super(azl, bbm, null, null);
        h = 0;
        f = new AudioTrack();
    }

    private void b(long l)
    {
        f.d();
        i = l;
        j = true;
    }

    protected final ayn a(String s, boolean flag)
    {
        if (bea.d(s))
        {
            return new ayn("OMX.google.raw.decoder", true);
        } else
        {
            return super.a(s, flag);
        }
    }

    public final void a(int k, Object obj)
    {
        if (k == 1)
        {
            f.a(((Float)obj).floatValue());
            return;
        } else
        {
            super.a(k, obj);
            return;
        }
    }

    protected final void a(long l)
    {
        super.a(l);
        b(l);
    }

    protected final void a(long l, boolean flag)
    {
        super.a(l, flag);
        b(l);
    }

    protected final void a(MediaCodec mediacodec, String s, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        if ("OMX.google.raw.decoder".equals(s))
        {
            s = mediaformat.getString("mime");
            mediaformat.setString("mime", "audio/raw");
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            mediaformat.setString("mime", s);
            return;
        } else
        {
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            return;
        }
    }

    protected final void a(azi azi1, MediaFormat mediaformat)
    {
        if (bea.d(azi1.a))
        {
            f.a(azi1.a());
            return;
        } else
        {
            f.a(mediaformat);
            return;
        }
    }

    protected final boolean a(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int k, boolean flag)
    {
        if (flag)
        {
            mediacodec.releaseOutputBuffer(k, false);
            mediacodec = a;
            mediacodec.f = ((ayl) (mediacodec)).f + 1;
            mediacodec = f;
            if (((AudioTrack) (mediacodec)).q == 1)
            {
                mediacodec.q = 2;
            }
            return true;
        }
        if (f.a()) goto _L2; else goto _L1
_L1:
        if (h == 0) goto _L4; else goto _L3
_L3:
        f.a(h);
_L7:
        if (super.g == 3)
        {
            f.b();
        }
_L2:
        AudioTrack audiotrack;
        int i1;
        int k1;
        int i2;
        try
        {
            audiotrack = f;
            k1 = bufferinfo.offset;
            i2 = bufferinfo.size;
            l = bufferinfo.presentationTimeUs;
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            throw new ExoPlaybackException(mediacodec);
        }
        if (i2 != 0) goto _L6; else goto _L5
_L5:
        i1 = 2;
_L8:
        if ((i1 & 1) != 0)
        {
            j = true;
        }
        int j1;
        if ((i1 & 2) != 0)
        {
            mediacodec.releaseOutputBuffer(k, false);
            mediacodec = a;
            mediacodec.e = ((ayl) (mediacodec)).e + 1;
            return true;
        } else
        {
            return false;
        }
_L4:
        try
        {
            h = f.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            throw new ExoPlaybackException(mediacodec);
        }
          goto _L7
_L6:
        if (bej.a > 22 || !audiotrack.x)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        if (audiotrack.d.getPlayState() != 2)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        i1 = 0;
          goto _L8
        if (audiotrack.d.getPlayState() != 1 || audiotrack.c.b() == 0L)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        i1 = 0;
          goto _L8
        j1 = 0;
        i1 = j1;
        if (audiotrack.w != 0) goto _L10; else goto _L9
_L9:
        if (audiotrack.x && audiotrack.y == 0)
        {
            audiotrack.y = bdr.a(i2, audiotrack.e);
        }
        l -= audiotrack.b(audiotrack.a(i2));
        if (audiotrack.q != 0) goto _L12; else goto _L11
_L11:
        audiotrack.r = Math.max(0L, l);
        audiotrack.q = 1;
        i1 = j1;
_L10:
        if (audiotrack.w == 0)
        {
            audiotrack.w = i2;
            bytebuffer.position(k1);
            if (bej.a < 21)
            {
                if (audiotrack.u == null || audiotrack.u.length < i2)
                {
                    audiotrack.u = new byte[i2];
                }
                bytebuffer.get(audiotrack.u, 0, i2);
                audiotrack.v = 0;
            }
        }
        j1 = 0;
        if (bej.a >= 21)
        {
            break MISSING_BLOCK_LABEL_706;
        }
        k1 = (int)(audiotrack.p - audiotrack.c.b() * (long)audiotrack.f);
        k1 = audiotrack.h - k1;
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        j1 = Math.min(audiotrack.w, k1);
        k1 = audiotrack.d.write(audiotrack.u, audiotrack.v, j1);
        j1 = k1;
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        audiotrack.v = audiotrack.v + k1;
        j1 = k1;
_L14:
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_727;
        }
        throw new com.google.android.exoplayer.audio.AudioTrack.WriteException(j1);
_L12:
        l1 = audiotrack.r + audiotrack.b(audiotrack.a(audiotrack.p));
        if (audiotrack.q == 1 && Math.abs(l1 - l) > 0x30d40L)
        {
            Log.e("AudioTrack", (new StringBuilder("Discontinuity detected [expected ")).append(l1).append(", got ").append(l).append("]").toString());
            audiotrack.q = 2;
        }
        i1 = j1;
        if (audiotrack.q != 2) goto _L10; else goto _L13
_L13:
        audiotrack.r = (l - l1) + audiotrack.r;
        audiotrack.q = 1;
        i1 = 1;
          goto _L10
        j1 = audiotrack.d.write(bytebuffer, audiotrack.w, 1);
          goto _L14
        audiotrack.w = audiotrack.w - j1;
        audiotrack.p = audiotrack.p + (long)j1;
        j1 = audiotrack.w;
        if (j1 == 0)
        {
            i1 |= 2;
        }
          goto _L8
    }

    protected final boolean a(String s)
    {
        return bea.b(s) && super.a(s);
    }

    protected final boolean b()
    {
label0:
        {
            if (!super.b())
            {
                break label0;
            }
            if (f.c())
            {
                AudioTrack audiotrack = f;
                boolean flag;
                if (audiotrack.p > (long)((audiotrack.g * 3) / 2))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    protected final boolean c()
    {
        return f.c() || super.c() && super.e == 2;
    }

    public final long d_()
    {
        AudioTrack audiotrack = f;
        boolean flag1 = b();
        boolean flag;
        long l;
        if (audiotrack.a() && audiotrack.q != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            l = 0x8000000000000000L;
        } else
        {
            if (audiotrack.d.getPlayState() == 3)
            {
                l = audiotrack.c.c();
                if (l != 0L)
                {
                    long l1 = System.nanoTime() / 1000L;
                    if (l1 - audiotrack.l >= 30000L)
                    {
                        audiotrack.b[audiotrack.i] = l - l1;
                        audiotrack.i = (audiotrack.i + 1) % 10;
                        if (audiotrack.j < 10)
                        {
                            audiotrack.j = audiotrack.j + 1;
                        }
                        audiotrack.l = l1;
                        audiotrack.k = 0L;
                        for (int k = 0; k < audiotrack.j; k++)
                        {
                            audiotrack.k = audiotrack.k + audiotrack.b[k] / (long)audiotrack.j;
                        }

                    }
                    if (!audiotrack.x && l1 - audiotrack.n >= 0x7a120L)
                    {
                        audiotrack.m = audiotrack.c.d();
                        if (audiotrack.m)
                        {
                            long l3 = audiotrack.c.e() / 1000L;
                            long l4 = audiotrack.c.f();
                            if (l3 < audiotrack.s)
                            {
                                audiotrack.m = false;
                            } else
                            if (Math.abs(l3 - l1) > 0x4c4b40L)
                            {
                                Log.w("AudioTrack", (new StringBuilder("Spurious audio timestamp (system clock mismatch): ")).append(l4).append(", ").append(l3).append(", ").append(l1).append(", ").append(l).toString());
                                audiotrack.m = false;
                            } else
                            if (Math.abs(audiotrack.b(l4) - l) > 0x4c4b40L)
                            {
                                Log.w("AudioTrack", (new StringBuilder("Spurious audio timestamp (frame position mismatch): ")).append(l4).append(", ").append(l3).append(", ").append(l1).append(", ").append(l).toString());
                                audiotrack.m = false;
                            }
                        }
                        if (audiotrack.o != null)
                        {
                            try
                            {
                                audiotrack.t = (long)((Integer)audiotrack.o.invoke(audiotrack.d, null)).intValue() * 1000L - audiotrack.b(audiotrack.a(audiotrack.h));
                                audiotrack.t = Math.max(audiotrack.t, 0L);
                                if (audiotrack.t > 0x4c4b40L)
                                {
                                    Log.w("AudioTrack", (new StringBuilder("Ignoring impossibly large audio latency: ")).append(audiotrack.t).toString());
                                    audiotrack.t = 0L;
                                }
                            }
                            catch (Exception exception)
                            {
                                audiotrack.o = null;
                            }
                        }
                        audiotrack.n = l1;
                    }
                }
            }
            l = System.nanoTime() / 1000L;
            if (audiotrack.m)
            {
                l = audiotrack.b(audiotrack.c(l - audiotrack.c.e() / 1000L) + audiotrack.c.f()) + audiotrack.r;
            } else
            {
                long l2;
                if (audiotrack.j == 0)
                {
                    l2 = audiotrack.c.c() + audiotrack.r;
                } else
                {
                    l2 = l + audiotrack.k + audiotrack.r;
                }
                l = l2;
                if (!flag1)
                {
                    l = l2 - audiotrack.t;
                }
            }
        }
        if (l != 0x8000000000000000L)
        {
            if (!j)
            {
                l = Math.max(i, l);
            }
            i = l;
            j = false;
        }
        return i;
    }

    protected final ayy g()
    {
        return this;
    }

    protected final void h()
    {
        super.h();
        f.b();
    }

    protected final void i()
    {
        AudioTrack audiotrack = f;
        if (audiotrack.a())
        {
            audiotrack.e();
            audiotrack.d.pause();
        }
        super.i();
    }

    protected final void j()
    {
        h = 0;
        f.d();
        super.j();
        return;
        Exception exception;
        exception;
        super.j();
        throw exception;
    }
}

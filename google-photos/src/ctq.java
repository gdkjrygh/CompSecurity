// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctq
    implements cua, dei
{

    private static final String h = ctq.getSimpleName();
    final cvg a;
    final ctp b;
    cnp c;
    cjk d;
    boolean e;
    boolean f;
    long g;
    private final deo i;
    private cjq j;
    private cjn k;
    private int l;
    private int m;

    public ctq(cvg cvg1, ctp ctp1)
    {
        a = (cvg)b.a(cvg1, "listener", null);
        b = (ctp)b.a(ctp1, "audioSink", null);
        i = new deo(h);
    }

    void a()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        i.a("Poll audio samples");
        k = d.c();
        i.a(false);
        if (k != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        c.a(k.c, "mPendingMixerOutput.bytesPerSample", 2, null);
        c.a(k.d, "mPendingMixerOutput.sampleRate", 44100, null);
        c.a(k.e, "mPendingMixerOutput.channelCount", 2, null);
        cjq cjq1 = j;
        cjn cjn1 = k;
        long l2 = b.b(cjn1.h, cjn1.c, cjn1.e, cjn1.d);
        long l4 = cjn1.a;
        l4 = cjq1.a - (l4 - l2);
        if (l4 < cjq1.b)
        {
            double d1 = Math.max((double)l4 / (double)cjq1.b, 0.0D);
            double d2 = Math.max((double)Math.max(0L, l4 - l2) / (double)cjq1.b, 0.0D);
            int i2 = cjn1.c;
            int i1 = cjn1.e;
            byte abyte0[] = cjn1.f;
            int j2 = cjn1.h;
            boolean flag;
            if (i2 == 1 || i2 == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "only supports 8-bit or 16-bit PCM samples");
            if (i1 <= 0)
            {
                b.a((new StringBuilder()).append("channelCount").append(" must be positive: ").append(i1), null);
            }
            b.a(abyte0, "samples", null);
            if (j2 != 0)
            {
                b.a(0, "offset", 0, abyte0.length - 1, null);
                b.a(j2, "length", null);
                int k2;
                if (0 + j2 <= abyte0.length)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "offset + length must be less than or equal to samples.length");
                k2 = i2 * i1;
                if (0 % k2 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "offset must be a multiple of frame size (bytesPerSample * channelCount)");
                if (j2 % k2 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "length must be a multiple of frame size (bytesPerSample * channelCount)");
                if (d1 < 0.0D)
                {
                    b.a((new StringBuilder()).append("volumeStart").append(" must be zero or positive: ").append(d1), null);
                }
                if (d2 < 0.0D)
                {
                    b.a((new StringBuilder()).append("volumeEnd").append(" must be zero or positive: ").append(d2), null);
                }
                for (int j1 = 0; j1 < 0 + j2; j1 += k2)
                {
                    double d3 = ((d2 - d1) * (double)(j1 - 0)) / (double)j2;
                    int l1 = j1;
                    while (l1 < j1 + k2) 
                    {
                        long l3 = (long)((double)b.a(abyte0, l1, i2) * (d1 + d3));
                        if (i2 == 1)
                        {
                            abyte0[l1] = (byte)(int)ddl.a(l3, -128L, 127L);
                        } else
                        {
                            l3 = ddl.a(l3, -32768L, 32767L);
                            abyte0[l1] = (byte)(int)(255L & l3);
                            abyte0[l1 + 1] = (byte)(int)(l3 >> 8 & 255L);
                        }
                        l1 += i2;
                    }
                }

            }
        }
        l = 0;
        m = k.h;
_L2:
        i.a("Write to audio sink");
        int k1 = b.a(k.f, l, m);
        l = l + k1;
        m = m - k1;
        i.a(false);
        if (m == 0)
        {
            boolean flag1 = k.b;
            d.a(k);
            k = null;
            if (flag1)
            {
                e = true;
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void a(cnp cnp1)
    {
        c.a(d, "mMixer", "initialize must be called before replaceTimeline");
        b.a(cnp1, "timeline", null);
        if (c != null)
        {
            b.a(cnp1.a(), "timeline.getAudioClipSequences()", c.a());
        }
        c = cnp1;
        j = new cjq(cnp1.c(), 0x1e8480L);
    }

    public final boolean a(long l1)
    {
        if (k != null)
        {
            d.a(k);
            k = null;
        }
        l = 0;
        m = 0;
        e = false;
        b.a(l1);
        if (!d.a(l1))
        {
            return false;
        }
        i.a("Pre-fill audio sink buffer");
        for (; !b.g() && !e; a())
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException("interrupted while seeking audio timeline");
            }
        }

        i.a(false);
        return b.g();
    }

    public final void b()
    {
        if (k != null)
        {
            d.a(k);
            k = null;
        }
        dee.a(d);
        d = null;
        c = null;
        j = null;
        i.a();
    }

    public final long c()
    {
        return b.d();
    }

    public final void d()
    {
        b.b();
    }

    public final void e()
    {
        b.c();
    }

}

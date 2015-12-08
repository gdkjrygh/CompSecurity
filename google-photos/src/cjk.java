// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.media.audio.AudioResampler;
import java.util.Iterator;
import java.util.List;

public class cjk
    implements cje, cjf, ded
{

    private final cjl a[];
    private final cjn b = new cjn();
    private final cjm c = new cjm();
    private final int d = 2;
    private final int e = b.a(44100, "targetSampleRateHz");
    private final float f;
    private boolean g;
    private long h;
    private int i;

    public cjk(List list, int j, int k)
    {
        b.a(list, "mixerSources");
        k = list.size();
        a = new cjl[k];
        for (j = 0; j < k; j++)
        {
            a[j] = new cjl((cjo)list.get(j));
        }

        b.a(true, "Only mono and stereo are supported");
        b.e = 2;
        b.d = 44100;
        g = true;
        f = (float)Math.sqrt(1.0D / (double)k);
        a(0L);
    }

    public final void a()
    {
        for (int j = 0; j < a.length; j++)
        {
            dee.a(a[j].a);
            dee.a(a[j].c);
            for (Iterator iterator = a[j].b.iterator(); iterator.hasNext(); dee.a((AudioResampler)iterator.next())) { }
        }

    }

    public final void a(cjn cjn1)
    {
        b.a(cjn1, "polled", b);
        c.a(g, "mOwnsAudioSamples", false);
        g = true;
    }

    public final volatile void a(Object obj)
    {
        a((cjn)obj);
    }

    public final boolean a(long l)
    {
        cjl acjl[];
        int k;
        int j1;
        acjl = a;
        j1 = acjl.length;
        k = 0;
_L9:
        cjl cjl1;
        ciu ciu1;
        int j;
        int k1;
        long l1;
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        cjl1 = acjl[k];
        if (cjl1.e != null)
        {
            cjl1.a.a(cjl1.e);
            cjl1.e = null;
        }
        cjl1.i = false;
        ciu1 = cjl1.c;
        k1 = ciu1.a.a();
        l1 = 0L;
        j = 0;
_L2:
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        cnq cnq1 = ciu1.a.a(j);
        if (l <= ciu1.a.b(j) + cnq1.f.a())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = cnq1.f.a() + l1;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (l <= ciu1.a.b(j))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        l1 = (l - ciu1.a.b(j)) + l1;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        j = 0;
        for (int i1 = 0; i1 < k1; i1++)
        {
            long l3 = ciu1.a.a(i1).f.b;
            long l4 = ciu1.a.c(i1);
            ckg ckg = ciu1.b[i1];
            if (ckg != null)
            {
                j = ckg.a(Math.max(0L, l1 - (l4 - l3))) | j;
            }
        }

        for (Iterator iterator = ciu1.c.iterator(); iterator.hasNext(); ((ded)iterator.next()).a()) { }
        if (!j)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        j = 0;
_L7:
        cnq cnq2;
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        cnq2 = ciu1.a.a(j);
        if (l - ciu1.a.b(j) >= cnq2.f.a()) goto _L6; else goto _L5
_L5:
        if (l >= cjl1.d.b())
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_422;
_L6:
        j++;
          goto _L7
        j = ciu1.a.a();
          goto _L5
        cjl1.h = j;
        cjg cjg1 = cjl1.a;
        if (j == cjg1.a.size())
        {
            cjg1.b = -1;
        } else
        {
            cjg1.b = b.a(j, "sourceIndex", cjg1.a);
        }
        if (j == cjl1.d.a() || l < cjl1.d.b(j))
        {
            cjl1.j = true;
            long l2;
            if (j == cjl1.d.a())
            {
                l2 = cjl1.d.b() - l;
            } else
            {
                l2 = cjl1.d.b(j) - l;
            }
            cjl1.k = b.a(l2, 2, d, e);
        } else
        {
            cjl1.j = false;
            cjl1.k = -1;
        }
        k++;
        if (true) goto _L9; else goto _L8
_L8:
        h = l;
        return true;
    }

    public final Object b()
    {
        return c();
    }

    public final cjn c()
    {
        Object obj;
        int j;
        if (!g)
        {
            return null;
        }
        obj = c;
        obj.a = -1;
        obj.b = -1;
        j = 0;
_L2:
        if (j >= a.length)
        {
            break; /* Loop/switch isn't completed */
        }
        cjl cjl1 = a[j];
        if (cjl1.j)
        {
            if (((cjm) (obj)).a == -1 || ((cjm) (obj)).a > cjl1.k)
            {
                int l;
                if (b.f == null)
                {
                    l = d * 2048;
                } else
                {
                    l = b.f.length;
                }
                obj.a = Math.min(l, cjl1.k);
                obj.b = j;
            }
        } else
        {
            Object obj1;
            int i1;
            if (cjl1.e == null)
            {
                obj1 = (cix)cjl1.a.c();
                if (obj1 == null)
                {
                    j = 0;
                    break MISSING_BLOCK_LABEL_159;
                }
                cjl1.e = ((cix) (obj1));
                cjl1.f = ((cix) (obj1)).g;
                cjl1.g = b.a(((cix) (obj1)).h, "polledSamples.size", null);
                boolean flag;
                if (((cix) (obj1)).b || ((cix) (obj1)).h > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                c.a(flag, "polled samples may only have size zero at the end of the stream");
                if (!cjl1.i)
                {
                    ((AudioResampler)cjl1.b.get(cjl1.h)).a(((cix) (obj1)).d);
                    cjl1.i = true;
                }
            }
            obj1 = (AudioResampler)cjl1.b.get(cjl1.h);
            i1 = cjl1.g;
            if (i1 == 0)
            {
                i1 = 0;
            } else
            {
                c.b(((AudioResampler) (obj1)).e, "mSourceSampleRateHz", -1, "source sample rate must be set before calling getResampledByteCount()");
                i1 = ((AudioResampler) (obj1)).d(((AudioResampler) (obj1)).c(((AudioResampler) (obj1)).b(i1)));
            }
            if (((cjm) (obj)).a == -1 || ((cjm) (obj)).a > i1)
            {
                obj.a = i1;
                obj.b = j;
            }
        }
_L13:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        j = 1;
        Object obj2;
        int j1;
        int k1;
        int l1;
        int i2;
        long l2;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        boolean flag5;
        {
            if (j == 0)
            {
                return null;
            }
            k1 = c.a;
            j = c.b;
            cjl acjl[];
            if (a[j].j)
            {
                h = h + b.b(k1, 2, d, e);
            } else
            {
                h = a[j].e.a;
            }
            obj = b;
            acjl = a;
            obj2 = c;
            l2 = h;
            l1 = ((cjm) (obj2)).a;
            i2 = ((cjm) (obj2)).b;
            if (((cjn) (obj)).f == null || ((cjn) (obj)).f.length < l1)
            {
                obj.f = new byte[l1];
                i = l1;
            }
            flag4 = false;
            j1 = 0;
            flag1 = false;
        }
        if (j1 >= acjl.length)
        {
            break MISSING_BLOCK_LABEL_1130;
        }
        obj2 = acjl[j1];
        if (!((cjl) (obj2)).j) goto _L4; else goto _L3
_L3:
        obj2.k = ((cjl) (obj2)).k - l1;
        flag2 = flag4;
        flag5 = flag1;
        if (((cjl) (obj2)).k != 0) goto _L6; else goto _L5
_L5:
        obj2.j = false;
        obj2.k = -1;
        flag2 = flag4;
        flag5 = flag1;
        if (((cjl) (obj2)).h != ((cjl) (obj2)).d.a()) goto _L6; else goto _L7
_L7:
        flag1 = true;
        flag2 = flag4;
_L11:
        j1++;
        flag4 = flag2;
        break MISSING_BLOCK_LABEL_503;
_L4:
        AudioResampler audioresampler = (AudioResampler)((cjl) (obj2)).b.get(((cjl) (obj2)).h);
        long l3;
        if (j1 == i2)
        {
            j = ((cjl) (obj2)).g;
        } else
        if (l1 == 0)
        {
            j = 0;
        } else
        {
            c.b(audioresampler.e, "mSourceSampleRateHz", -1, "source sample rate must be set before calling getSourceByteCount()");
            int j2 = audioresampler.a;
            if (audioresampler.d)
            {
                j = 2;
            } else
            {
                j = audioresampler.b;
            }
            j = (int)Math.ceil(((double)(l1 / (j * j2)) * (double)audioresampler.e) / (double)audioresampler.c) * audioresampler.a * audioresampler.b;
        }
        if (((cjl) (obj2)).e.h > 0)
        {
            float f1 = ((cjl) (obj2)).d.a(h) * f;
            audioresampler.a(f1, f1);
        }
        audioresampler.a(((cjn) (obj)).f, ((cjl) (obj2)).e.f, ((cjl) (obj2)).f, j, flag4);
        flag4 = true;
        i = 0;
        obj2.f = ((cjl) (obj2)).f + j;
        obj2.g = ((cjl) (obj2)).g - j;
        flag2 = flag4;
        flag5 = flag1;
        if (((cjl) (obj2)).g > 0) goto _L6; else goto _L8
_L8:
        flag5 = flag1;
        if (!((cjl) (obj2)).e.b) goto _L10; else goto _L9
_L9:
        obj2.h = ((cjl) (obj2)).h + 1;
        obj2.i = false;
        if (((cjl) (obj2)).h < ((cjl) (obj2)).d.a())
        {
            l3 = ((cjl) (obj2)).d.b(((cjl) (obj2)).h);
            if (l3 > l2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj2.j = flag2;
            if (((cjl) (obj2)).j)
            {
                obj2.k = b.a(l3 - l2, 2, d, e);
            }
        } else
        {
label0:
            {
                long l4 = ((cjl) (obj2)).d.b();
                boolean flag3;
                if (l4 > l2)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                obj2.j = flag3;
                if (!((cjl) (obj2)).j)
                {
                    break label0;
                }
                obj2.k = b.a(l4 - l2, 2, d, e);
            }
        }
        j = 1;
_L12:
        if (j == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag5 = flag1 | j;
_L10:
        ((cjl) (obj2)).a.a(((cjl) (obj2)).e);
        obj2.e = null;
        flag2 = flag4;
_L6:
        flag1 = flag5;
          goto _L11
        j = 0;
          goto _L12
        if (!flag4 && l1 > i)
        {
            for (int k = i; k < l1; k++)
            {
                ((cjn) (obj)).f[k] = 0;
            }

            i = l1;
        }
        b.g = 0;
        b.h = k1;
        b.c = 2;
        b.b = flag1;
        b.a = h;
        g = false;
        return b;
          goto _L13
    }

    static 
    {
        cjk.getSimpleName();
    }
}

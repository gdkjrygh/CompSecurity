// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.common.network.FbDataConnectionManager;
import com.facebook.device.DeviceConditionHelper;
import com.facebook.exoplayer.ipc.VideoPlayerMediaChunk;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import com.google.android.exoplayer.chunk.MediaChunk;
import com.google.android.exoplayer.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.video.view.exo:
//            PlaybackPreferences

public final class DashCustomEvaluator
    implements FormatEvaluator
{

    private static final String a = com/facebook/video/view/exo/DashCustomEvaluator.getSimpleName();
    private final boolean b = false;
    private final BandwidthMeter c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final float h;
    private final boolean i;
    private final PlaybackPreferences j;
    private final com.facebook.video.abtest.VideoDashExperiment.Config k;
    private final DeviceConditionHelper l;
    private final FbDataConnectionManager m;
    private com.facebook.video.analytics.VideoAnalytics.PlayerType n;

    public DashCustomEvaluator(BandwidthMeter bandwidthmeter, boolean flag, PlaybackPreferences playbackpreferences, com.facebook.video.abtest.VideoDashExperiment.Config config, DeviceConditionHelper deviceconditionhelper, FbDataConnectionManager fbdataconnectionmanager)
    {
        c = bandwidthmeter;
        d = config.r;
        e = (long)config.s * 1000L;
        f = (long)config.t * 1000L;
        g = (long)config.u * 1000L;
        h = config.v;
        i = flag;
        j = playbackpreferences;
        k = config;
        l = deviceconditionhelper;
        m = fbdataconnectionmanager;
        n = playbackpreferences.b();
    }

    private int a(Format format)
    {
        if (k.I)
        {
            return Math.max(format.d, format.e);
        } else
        {
            return format.d;
        }
    }

    private long a(boolean flag)
    {
        long l1 = -1L;
        if (flag)
        {
            double d1 = m.f();
            if (d1 > 0.0D)
            {
                l1 = (long)(1000D * d1);
            }
            return l1;
        } else
        {
            return c.a();
        }
    }

    private Format a(Format aformat[], Format format, long l1, boolean flag, long l2)
    {
        Format format1;
        long l3;
        if (l1 == -1L)
        {
            l3 = d;
        } else
        {
            l3 = (long)((float)l1 * h);
        }
        format1 = j.c();
        if (!flag && (k.E && n != j.b() || format == null) && format1 != null)
        {
            for (int i1 = 0; i1 < aformat.length; i1++)
            {
                if (aformat[i1].a.equals(format1.a) && aformat[i1].c == format1.c)
                {
                    return aformat[i1];
                }
            }

        }
        if (flag || l1 == -1L)
        {
            int i2 = k.b(l);
            for (int j1 = 0; j1 < aformat.length; j1++)
            {
                Format format2 = aformat[j1];
                if (i2 > 0)
                {
                    if (a(format2) <= i2)
                    {
                        return format2;
                    }
                    continue;
                }
                if (format2.a.endsWith("vd") || format2.a.endsWith("ad"))
                {
                    return format2;
                }
            }

        }
        for (int k1 = 0; k1 < aformat.length; k1++)
        {
            Format format3 = aformat[k1];
            if ((long)format3.c <= l3 && a(format3, format, l2))
            {
                return format3;
            }
        }

        return aformat[aformat.length - 1];
    }

    private boolean a(Format format, Format format1, long l1)
    {
        boolean flag = false;
        int i1 = 0x7fffffff;
        boolean flag1 = l.c();
        int k1;
        if (!flag1)
        {
            i1 = k.q;
        } else
        if (j.b() != com.facebook.video.analytics.VideoAnalytics.PlayerType.FULL_SCREEN_PLAYER)
        {
            if (format1 == null)
            {
                i1 = 0;
            } else
            {
                i1 = a(format1);
            }
            i1 = Math.max(i1, k.p);
        }
        k1 = i1;
        if (l1 == 0L)
        {
            k1 = i1;
            if (j.b() == com.facebook.video.analytics.VideoAnalytics.PlayerType.FULL_SCREEN_PLAYER)
            {
                int j1;
                if (flag1)
                {
                    j1 = k.C;
                } else
                {
                    j1 = k.D;
                }
                k1 = i1;
                if (j1 > 0)
                {
                    k1 = i1;
                    if (j.d())
                    {
                        k1 = Math.min(j1, i1);
                    }
                }
            }
        }
        if (a(format) <= k1)
        {
            flag = true;
        }
        return flag;
    }

    public final void a()
    {
    }

    public final void a(List list, long l1, Format aformat[], com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new VideoPlayerMediaChunk((MediaChunk)list.next()))) { }
        b(arraylist, l1, aformat, evaluation);
    }

    public final void b()
    {
    }

    public final void b(List list, long l1, Format aformat[], com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation)
    {
        Format format;
        boolean flag;
        long l2;
        String s;
        int i1;
        int k1;
        long l3;
        boolean flag1;
        if (list.isEmpty())
        {
            l2 = 0L;
        } else
        {
            l2 = ((VideoPlayerMediaChunk)list.get(list.size() - 1)).d - l1;
        }
        if (i && l1 == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        format = evaluation.c;
        aformat = a(aformat, format, a(k.w), flag1, l2);
        if (aformat != null && format != null && ((Format) (aformat)).c > format.c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (aformat != null && format != null && ((Format) (aformat)).c < format.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aformat == null)
        {
            k1 = -1;
        } else
        {
            k1 = ((Format) (aformat)).c / 1000;
        }
        if (aformat == null)
        {
            k1 = -1;
        } else
        {
            k1 = ((Format) (aformat)).d;
        }
        if (format == null)
        {
            k1 = -1;
        } else
        {
            k1 = format.c / 1000;
        }
        l3 = l2 / 1000L;
        s = j.b().value;
        l3 = l1 / 1000L;
        l3 = a(false) / 1000L;
        l3 = a(true) / 1000L;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (l2 >= e) goto _L4; else goto _L3
_L3:
        list = format;
_L7:
        if (format != null && list != format)
        {
            evaluation.b = 3;
        }
        evaluation.c = list;
        i1 = evaluation.b;
        VideoPlayerMediaChunk videoplayermediachunk;
        int j1;
        if (evaluation.c == null)
        {
            i1 = -1;
        } else
        {
            j1 = evaluation.c.c / 1000;
        }
        n = j.b();
        return;
_L4:
        if (l2 >= g)
        {
            j1 = 1;
            do
            {
                if (j1 >= list.size())
                {
                    break;
                }
                videoplayermediachunk = (VideoPlayerMediaChunk)list.get(j1);
                if (videoplayermediachunk.c - l1 >= g && videoplayermediachunk.b.c < ((Format) (aformat)).c && videoplayermediachunk.b.e < ((Format) (aformat)).e && videoplayermediachunk.b.e < 720 && videoplayermediachunk.b.d < 1280)
                {
                    evaluation.a = j1;
                    list = aformat;
                    continue; /* Loop/switch isn't completed */
                }
                j1++;
            } while (true);
            list = aformat;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (flag && format != null && l2 >= f)
        {
            list = format;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        list = aformat;
        if (true) goto _L7; else goto _L6
_L6:
    }

}

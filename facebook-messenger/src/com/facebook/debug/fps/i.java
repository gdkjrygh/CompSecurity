// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.l.a;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.debug.e.b;
import com.facebook.debug.log.g;
import com.facebook.e.a.e;
import com.facebook.inject.t;
import com.google.common.a.hq;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class i extends View
{

    private static final Class a = com/facebook/debug/fps/i;
    private static final String b[] = {
        "mpf_8_or_less", "mpf_between_8_and_16", "mpf_between_16_and_24", "mpf_between_24_and_32", "mpf_between_32_and_64", "mpf_more_than_64"
    };
    private static final String c[] = {
        "fps_55_or_more", "fps_between_55_and_50", "fps_between_50_and_45", "fps_between_45_and_40", "fps_between_40_and_35", "fps_between_35_and_30", "fps_between_30_and_20", "fps_between_20_and_10", "fps_10_or_less"
    };
    private static final int d[] = {
        8, 16, 24, 32, 64
    };
    private static final int e[] = {
        55, 50, 45, 40, 35, 30, 20, 10
    };
    private static final double f[] = {
        57.5D, 52.5D, 47.5D, 42.5D, 37.5D, 32.5D, 25D, 15D, 5D
    };
    private float A;
    private final com.facebook.debug.e.a B;
    private long g;
    private long h;
    private long i;
    private long j;
    private int k;
    private int l;
    private boolean m;
    private final String n;
    private int o[];
    private int p[];
    private int q;
    private boolean r;
    private boolean s;
    private List t;
    private final Paint u = new Paint();
    private final av v;
    private final com.facebook.analytics.e.i w;
    private final e x;
    private String y;
    private float z;

    public i(Context context)
    {
        super(context);
        g = -1L;
        h = -1L;
        i = -1L;
        j = -1L;
        l = -1;
        m = false;
        q = 0;
        r = false;
        s = true;
        t t1 = com.facebook.inject.t.a(context);
        v = (av)t1.a(com/facebook/analytics/av);
        w = (com.facebook.analytics.e.i)t1.a(com/facebook/analytics/e/i);
        n = ((a)t1.a(com/facebook/common/l/a)).a;
        x = (e)t1.a(com/facebook/e/a/e);
        B = new com.facebook.debug.e.a(context, (com.facebook.common.time.a)t1.a(com/facebook/common/time/a));
        u.setColor(0xffff0000);
        u.setAntiAlias(true);
        u.setTextSize(22F);
        t = hq.a();
        o = new int[b.length];
        p = new int[c.length];
        Arrays.fill(o, 0);
        Arrays.fill(p, 0);
        b();
    }

    private static int a(float f1)
    {
        if (f1 > 4F)
        {
            return 0xff00ff00;
        }
        return f1 <= 2.0F ? 0xffff0000 : -256;
    }

    private void a(int i1)
    {
        if (!m)
        {
            return;
        }
        for (int j1 = 0; j1 < e.length; j1++)
        {
            if (i1 >= e[j1])
            {
                int ai[] = p;
                ai[j1] = ai[j1] + 1;
                return;
            }
        }

        int ai1[] = p;
        i1 = p.length - 1;
        ai1[i1] = ai1[i1] + 1;
    }

    private void a(long l1)
    {
        if (!m)
        {
            return;
        }
        for (int i1 = 0; i1 < d.length; i1++)
        {
            if (l1 <= (long)d[i1])
            {
                int ai[] = o;
                ai[i1] = ai[i1] + 1;
                return;
            }
        }

        int ai1[] = o;
        int j1 = o.length - 1;
        ai1[j1] = ai1[j1] + 1;
    }

    private static int b(int i1)
    {
        if (i1 >= 45)
        {
            return 0xff00ff00;
        }
        return i1 < 30 ? 0xffff0000 : -256;
    }

    private void b()
    {
        com.facebook.common.c.i i1 = x.b();
        z = (float)i1.a / 1048576F;
        A = (float)i1.a() / 1048576F;
    }

    public void a()
    {
        t.clear();
        g = -1L;
        Arrays.fill(o, 0);
        Arrays.fill(p, 0);
        q = 0;
    }

    public void a(String s1)
    {
        Object obj = (Activity)getContext();
        if (obj != null)
        {
            m = false;
            double ad[] = new double[o.length];
            ad[0] = (double)d[0] / 2D;
            for (int i1 = 1; i1 < d.length; i1++)
            {
                ad[i1] = (double)(d[i1 - 1] + d[i1]) / 2D;
            }

            ad[o.length - 1] = (double)(d[d.length - 1] + q) / 2D;
            int j1 = 0;
            double d1 = 0.0D;
            for (int k1 = 0; k1 < o.length; k1++)
            {
                j1 += o[k1];
                d1 += (double)o[k1] * ad[k1];
            }

            int l1 = 0;
            double d2 = 0.0D;
            for (int i2 = 0; i2 < p.length; i2++)
            {
                l1 += p[i2];
                d2 += (double)p[i2] * f[i2];
            }

            if (j1 != 0 && l1 != 0)
            {
                obj = obj.getClass().getSimpleName();
                cb cb1 = new cb("frames_per_second");
                cb1.b("current_activity", ((String) (obj)));
                if (s1 != null)
                {
                    cb1.b("scenario", s1);
                }
                for (int j2 = 0; j2 < b.length; j2++)
                {
                    cb1.a(b[j2], o[j2]);
                    cb1.a((new StringBuilder()).append(b[j2]).append("_pct").toString(), ((double)o[j2] / (double)j1) * 100D);
                }

                for (int k2 = 0; k2 < c.length; k2++)
                {
                    cb1.a(c[k2], p[k2]);
                    cb1.a((new StringBuilder()).append(c[k2]).append("_pct").toString(), ((double)p[k2] / (double)l1) * 100D);
                }

                if (n != null && n.length() > 0)
                {
                    cb1.b("githash", n);
                }
                cb1.a("fps_average", d2 / (double)l1);
                cb1.a("mpf_average", d1 / (double)j1);
                cb1.a("mpf_max", q);
                v.a(cb1);
                s1 = com.facebook.common.w.n.a("%s:%s", new Object[] {
                    "FPS", obj
                });
                obj = com.facebook.common.w.n.a("%s:%s", new Object[] {
                    "MPF", obj
                });
                w.a(s1);
                w.a(s1, ((double)p[0] / (double)l1) * 100D);
                w.b(s1);
                w.a(((String) (obj)));
                w.a(((String) (obj)), ((double)o[0] / (double)j1) * 100D);
                w.b(((String) (obj)));
                m = true;
                a();
                return;
            }
        }
    }

    public boolean getEnableFrameCounter()
    {
        return s;
    }

    public boolean getEnableOutputToLogcat()
    {
        return r;
    }

    public boolean getEnableRecordingData()
    {
        return m;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        long l1 = SystemClock.elapsedRealtime();
        if (h == -1L)
        {
            h = l1;
            i = l1;
            k = 0;
        }
        if (g == -1L)
        {
            g = SystemClock.elapsedRealtime();
        }
        setBackgroundDrawable(new ColorDrawable(0));
        long l2 = l1 - h;
        long l3 = l1 - i;
        if (l2 > 1000L)
        {
            b();
            h = l1;
            l = k;
            k = 0;
            a(l);
        }
        a(l3);
        if ((long)q < l3)
        {
            q = (int)l3;
        }
        t.add(Long.valueOf(l3));
        if (g > 5000L && l2 > 1000L)
        {
            int i1 = t.size();
            if (i1 > 2)
            {
                t = hq.a(t.subList(i1 / 2, i1 - 1));
                j = ((Long)Collections.max(t)).longValue();
            }
        }
        if (s)
        {
            String s1 = (new StringBuilder()).append(l).append(" fps ").append(String.valueOf(l3)).append(" ms/f ").append(j).append(" max;").toString();
            u.setColor(b(l));
            canvas.drawText(s1, 0.0F, 93F, u);
            Object obj = new Rect();
            u.getTextBounds(s1, 0, s1.length(), ((Rect) (obj)));
            int j1 = ((Rect) (obj)).right + 11;
            String s2 = com.facebook.common.w.m.a("mem %.1fM (%.1fM free)", new Object[] {
                Double.valueOf((double)z + 0.050000000000000003D), Double.valueOf((double)A + 0.050000000000000003D)
            });
            u.setColor(a(A));
            canvas.drawText(s2, j1, 93F, u);
            u.getTextBounds(s2, 0, s2.length(), ((Rect) (obj)));
            int k1 = ((Rect) (obj)).right;
            obj = B.a();
            u.setColor(((b) (obj)).b());
            canvas.drawText(((b) (obj)).a(), k1 + 11 + j1, 93F, u);
            y = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(((b) (obj)).a()).toString();
        }
        if (r)
        {
            Log.v(com.facebook.debug.log.g.a(a), y);
        }
        i = l1;
        k = k + 1;
    }

    public void setEnableFrameCounter(boolean flag)
    {
        s = flag;
    }

    public void setEnableOutputToLogcat(boolean flag)
    {
        r = flag;
    }

    public void setEnableRecordingData(boolean flag)
    {
        if (m != flag)
        {
            m = flag;
            if (m)
            {
                a();
                return;
            }
        }
    }

}

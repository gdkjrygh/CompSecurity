// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.DSnapPanel;
import com.squareup.otto.Bus;

public final class uN extends DR
{

    private final DiscoverUsageAnalytics d;
    private final Bus e;
    private final vA f;
    private final ChannelPage g;
    private final DSnapPage h;
    private final DSnapPanel i;
    private final uz j;

    private uN(DiscoverUsageAnalytics discoverusageanalytics, DS ds, vA va, Bus bus, ChannelPage channelpage, DSnapPage dsnappage, DSnapPanel dsnappanel, 
            uz uz1)
    {
        super("", System.currentTimeMillis(), -1L);
        f = va;
        d = discoverusageanalytics;
        e = bus;
        g = channelpage;
        i = dsnappanel;
        h = dsnappage;
        ds.a(this);
        j = uz1;
    }

    public uN(ChannelPage channelpage, DSnapPage dsnappage, DSnapPanel dsnappanel, uz uz1)
    {
        DiscoverUsageAnalytics discoverusageanalytics = new DiscoverUsageAnalytics();
        DS ds = DS.a();
        vA va = vA.a();
        new PB();
        Bus bus = Mf.a();
        Bt.a();
        this(discoverusageanalytics, ds, va, bus, channelpage, dsnappage, dsnappanel, uz1);
    }

    public final String a()
    {
        return null;
    }

    public final void a(long l)
    {
        if (g == null)
        {
            Timber.d("DiscoverScreenshotDetectionSession", "Could not report screenshot, context is not valid", new Object[0]);
            return;
        }
        String s;
        if (h == null || i == null)
        {
            s = "splash";
            DiscoverUsageAnalytics discoverusageanalytics = d;
            String s1 = g.a;
            String s4 = g.d;
            String s7 = g.d();
            int j1 = f.d(g.d);
            jQ jq = j.c.getSourceType();
            hk hk1 = new hk();
            hk1.publisherId = s1;
            hk1.editionId = s4;
            hk1.splashId = s7;
            hk1.source = jq;
            boolean flag;
            if (j1 < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                hk1.snapIndexCount = Long.valueOf(j1);
                hk1.snapIndexPos = Long.valueOf(0L);
            }
            discoverusageanalytics.a.a(hk1);
        } else
        if (h.e() == i)
        {
            s = "longform";
            DiscoverUsageAnalytics discoverusageanalytics1 = d;
            String s2 = g.a;
            String s5 = h.i;
            String s8 = h.a;
            Object obj = h.d;
            int k = h.m.intValue();
            com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = i.g;
            int k1 = h.h.intValue();
            int i2 = f.d(h.i);
            int k2 = h.g;
            int i3 = f.e(h.i);
            jQ jq1 = j.c.getSourceType();
            if (k == 0)
            {
                obj = new gX();
                obj.publisherId = s2;
                obj.editionId = s5;
                obj.dsnapId = s8;
                obj.longformType = DiscoverUsageAnalytics.b(mediatype);
                obj.source = jq1;
                boolean flag1;
                if (i2 < 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag1)
                {
                    obj.snapIndexCount = Long.valueOf(i2);
                    obj.snapIndexPos = Long.valueOf(k1 + 1);
                }
                discoverusageanalytics1.a.a(((kl) (obj)));
            } else
            {
                gE ge = new gE();
                ge.publisherId = s2;
                ge.editionId = s5;
                ge.adsnapId = ((String) (obj));
                ge.longformType = DiscoverUsageAnalytics.b(mediatype);
                ge.source = jq1;
                boolean flag2;
                if (i2 < 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (!flag2)
                {
                    ge.snapIndexCount = Long.valueOf(i2);
                    ge.snapIndexPos = Long.valueOf(k1 + 1);
                    ge.adIndexPos = Long.valueOf(k2);
                    ge.adIndexCount = Long.valueOf(i3);
                }
                discoverusageanalytics1.a.a(ge);
            }
        } else
        {
            s = "top snap";
            DiscoverUsageAnalytics discoverusageanalytics2 = d;
            String s3 = g.a;
            String s6 = h.i;
            String s9 = h.a;
            Object obj1 = h.d;
            int i1 = h.m.intValue();
            int l1 = h.h.intValue();
            int j2 = f.d(h.i);
            int l2 = h.g;
            int j3 = f.e(h.i);
            com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype1 = i.g;
            jQ jq2 = j.c.getSourceType();
            if (i1 == 0)
            {
                obj1 = new hd();
                obj1.publisherId = s3;
                obj1.editionId = s6;
                obj1.dsnapId = s9;
                obj1.mediaType = DiscoverUsageAnalytics.a(mediatype1);
                obj1.source = jq2;
                boolean flag3;
                if (j2 < 0)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3)
                {
                    obj1.snapIndexCount = Long.valueOf(j2);
                    obj1.snapIndexPos = Long.valueOf(l1 + 1);
                }
                discoverusageanalytics2.a.a(((kl) (obj1)));
            } else
            {
                gK gk = new gK();
                gk.publisherId = s3;
                gk.editionId = s6;
                gk.adsnapId = ((String) (obj1));
                gk.mediaType = DiscoverUsageAnalytics.a(mediatype1);
                gk.source = jq2;
                boolean flag4;
                if (j2 < 0)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                if (!flag4)
                {
                    gk.snapIndexCount = Long.valueOf(j2);
                    gk.snapIndexPos = Long.valueOf(l1 + 1);
                    gk.adIndexPos = Long.valueOf(l2);
                    gk.adIndexCount = Long.valueOf(j3);
                }
                discoverusageanalytics2.a.a(gk);
            }
        }
        if (!Bt.ba() && h != null && h.r)
        {
            e.a(new Mz());
        }
        Timber.c("DiscoverScreenshotDetectionSession", "Detected %s screenshot!", new Object[] {
            s
        });
    }
}

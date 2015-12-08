// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ChatPerformanceAnalytics;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.model.chat.ChatVideoItemProxy;

public final class xg extends xh
    implements BJ, com.snapchat.android.model.chat.ChatVideoItemProxy.a
{

    private final BI o;
    private boolean p;
    private Long q;

    public xg(xo xo1, xu xu1, vN vn)
    {
        super(xo1, xu1, vn);
        p = false;
        new ux();
        o = new ChatVideoItemProxy(xo1, xo1.a, this);
        o.a(this);
    }

    public xg(xu xu1, vN vn)
    {
        super(xu1, vn);
        p = false;
        new ux();
        o = new ChatVideoItemProxy(xu1, (ChatMedia)xu1.C, this);
        o.a(this);
    }

    private void m()
    {
        c.setText(0x7f08009d);
        d.setText(0x7f0802d6);
    }

    public final void a()
    {
        if (!super.k)
        {
            n.a(a, l);
            super.a();
            o.b();
            if (!o.a())
            {
                o.c();
                return;
            }
        }
    }

    public final void b()
    {
        TU tu;
        Double double1;
        Double double2;
        if (q == null)
        {
            n.a(a, l, p);
        }
        if (i == null)
        {
            tu = null;
        } else
        {
            tu = i.mLinkStatus;
        }
        if (q == null)
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(Jk.a(SystemClock.elapsedRealtime() - q.longValue(), 1));
        }
        if (o.e() == -1L)
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(Jk.a(o.e(), 1));
        }
        if (j != 1 || TextUtils.isEmpty(a.mAdId)) goto _L2; else goto _L1
_L1:
        m.b(a, j(), double1, tu, double2);
_L4:
        q = null;
        super.b();
        o.d();
        return;
_L2:
        if (!TextUtils.isEmpty(a.mDSnapId))
        {
            m.a(a, j(), double1, tu, double2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c()
    {
        Timber.e("ChatDiscoverVideoViewingSession", (new StringBuilder("Could not play video for ChatShareDSnap\n")).append(a).toString(), new Object[0]);
        n.a(a, l, true);
        p = true;
        float f1;
        float f2;
        Object obj;
        String s;
        if (j())
        {
            obj = i.mLinkStatus;
        } else
        {
            obj = null;
        }
        if (obj == TU.LINKABLE_ARCHIVED || obj == TU.LINKABLE_LIVE)
        {
            m();
        }
        obj = a.mPublisherName;
        s = a.mDSnapId;
        f1 = a.mVideoWidth;
        f2 = a.mVideoHeight;
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.c("DISCOVER_SHARED_VIDEO_PLAYBACK_ERROR").a("publisher_name", obj).a("dsnap_id", s).a("video_width", Float.valueOf(f1)).a("video_height", Float.valueOf(f2)).b(false);
        q = null;
    }

    protected final void d()
    {
        if (p)
        {
            m();
            return;
        } else
        {
            super.d();
            return;
        }
    }

    protected final void e()
    {
        if (p)
        {
            m();
            return;
        } else
        {
            super.e();
            return;
        }
    }

    public final void f()
    {
        n.a(a, l, false);
        q = Long.valueOf(SystemClock.elapsedRealtime());
    }
}

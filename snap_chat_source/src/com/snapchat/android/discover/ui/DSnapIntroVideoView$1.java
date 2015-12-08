// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import android.view.View;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.discover.model.ChannelPage;
import wy;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DSnapIntroVideoView

final class a
    implements wy
{

    private DSnapIntroVideoView a;

    public final void C_()
    {
        if (DSnapIntroVideoView.a(a) != null)
        {
            DSnapIntroVideoView.a(a, com.snapchat.android.discover.analytics..ViewStatus.COMPLETED);
            DSnapIntroVideoView.b(a).a(true);
        }
    }

    public final void a(String s)
    {
        Timber.d("DSnapIntroVideoView", "Skipping intro video for %s because the media failed to load (%s).", new Object[] {
            DSnapIntroVideoView.e(a), s
        });
        String s1 = DSnapIntroVideoView.e(a).a;
        String s2 = DSnapIntroVideoView.e(a).d();
        com.snapchat.android.analytics.framework.actory.b("DISCOVER_INTRO_MEDIA_PLAYBACK_ERROR").a("publisher_name", s1).a("url", s2).a("description", s).b(false);
        C_();
        DSnapIntroVideoView.a(a, com.snapchat.android.discover.analytics..ViewStatus.ERROR);
    }

    public final void b()
    {
        DSnapIntroVideoView.c(a);
        DSnapIntroVideoView.d(a).setVisibility(8);
    }

    yMetricFactory(DSnapIntroVideoView dsnapintrovideoview)
    {
        a = dsnapintrovideoview;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageButton;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.ui.media.DiscoverMediaController;

final class lang.Object
    implements wy
{

    private vY a;

    public final void C_()
    {
        a.k = com.snapchat.android.discover.analytics.verUsageAnalytics.ViewStatus.COMPLETED;
        Object obj = a.a;
        Timber.c("DiscoverMediaController", "onMediaEnd called", new Object[0]);
        ((DiscoverMediaController) (obj)).f.setSelected(true);
        obj = a.p;
        if (obj != null)
        {
            ((wy) (obj)).C_();
        }
    }

    public final void a(String s)
    {
        a.k = com.snapchat.android.discover.analytics.verUsageAnalytics.ViewStatus.ERROR;
        wy wy1 = a.p;
        if (wy1 != null)
        {
            wy1.a(s);
        }
    }

    public final void b()
    {
        wy wy1 = a.p;
        if (wy1 != null)
        {
            wy1.b();
        }
    }

    >(vY vy)
    {
        a = vy;
        super();
    }
}

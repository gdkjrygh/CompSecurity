// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.snapchat.android.Timber;

final class lang.Object
    implements wy
{

    private wy a;
    private wb b;

    public final void C_()
    {
        b.f = com.snapchat.android.discover.analytics.verUsageAnalytics.ViewStatus.COMPLETED;
        a.C_();
    }

    public final void a(String s)
    {
        b.f = com.snapchat.android.discover.analytics.verUsageAnalytics.ViewStatus.ERROR;
        a.a(s);
    }

    public final void b()
    {
        Timber.a("DSnapItemTextureVideoViewAdapter", "[%s] onMediaDisplayed called for media player.", new Object[] {
            b.e
        });
        b.f = com.snapchat.android.discover.analytics.verUsageAnalytics.ViewStatus.INCOMPLETE;
        wb.a(b);
        if (b.a != null)
        {
            b.a.setVisibility(8);
        }
    }

    >(wb wb1, wy wy1)
    {
        b = wb1;
        a = wy1;
        super();
    }
}

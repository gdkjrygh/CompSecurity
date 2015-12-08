// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import PI;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import ws;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DiscoverLoadingStatePresenter, ChannelGroupView

final class a
    implements Runnable
{

    private adingState a;
    private DiscoverLoadingStatePresenter b;

    public final void run()
    {
        DiscoverLoadingStatePresenter discoverloadingstatepresenter;
        adingState adingstate;
        discoverloadingstatepresenter = b;
        adingstate = a;
        Timber.c("DiscoverLoadingStatePresenter", "Setting loading state %s (compatibility is %s)", new Object[] {
            adingstate, discoverloadingstatepresenter.i
        });
        if (discoverloadingstatepresenter.i == com.snapchat.android.discover.util.network.ility.UNKNOWN || discoverloadingstatepresenter.i == com.snapchat.android.discover.util.network.ility.SUPPORTED) goto _L2; else goto _L1
_L1:
        b[discoverloadingstatepresenter.i.ordinal()];
        JVM INSTR tableswitch 1 1: default 80
    //                   1 87;
           goto _L3 _L4
_L3:
        discoverloadingstatepresenter.a(0x7f080117);
_L6:
        return;
_L4:
        discoverloadingstatepresenter.a(0x7f080118);
        return;
_L2:
        if (discoverloadingstatepresenter.h == null) goto _L6; else goto _L5
_L5:
        if (discoverloadingstatepresenter.h.b() != 0) goto _L8; else goto _L7
_L7:
        a[adingstate.ordinal()];
        JVM INSTR tableswitch 1 5: default 152
    //                   1 157
    //                   2 162
    //                   3 167
    //                   4 214
    //                   5 262;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        discoverloadingstatepresenter.c();
        return;
_L9:
        discoverloadingstatepresenter.c();
        return;
_L10:
        discoverloadingstatepresenter.b();
        return;
_L11:
        discoverloadingstatepresenter.f.setVisibility(8);
        discoverloadingstatepresenter.a.a(0);
        discoverloadingstatepresenter.c.setVisibility(0);
        discoverloadingstatepresenter.b.setVisibility(0);
        discoverloadingstatepresenter.b.setText(0x7f080108);
        discoverloadingstatepresenter.a();
        return;
_L12:
        discoverloadingstatepresenter.f.setVisibility(8);
        discoverloadingstatepresenter.a.a(0);
        discoverloadingstatepresenter.c.setVisibility(8);
        discoverloadingstatepresenter.b.setVisibility(0);
        discoverloadingstatepresenter.b.setText(0x7f08010a);
        discoverloadingstatepresenter.a();
        return;
_L13:
        discoverloadingstatepresenter.a(0x7f080117);
        return;
    }

    adingState(DiscoverLoadingStatePresenter discoverloadingstatepresenter, adingState adingstate)
    {
        b = discoverloadingstatepresenter;
        a = adingstate;
        super();
    }
}

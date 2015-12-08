// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.ui.ChannelView;
import wL;
import wo;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class b
    implements Runnable
{

    private ChannelView a;
    private wL b;
    private DiscoverFragment c;

    public final void run()
    {
        DiscoverFragment.e(c).a(a, DiscoverFragment.d(c), MediaOpenOrigin.CHAT, b.a, b.b, b.c, b.d);
    }

    (DiscoverFragment discoverfragment, ChannelView channelview, wL wl)
    {
        c = discoverfragment;
        a = channelview;
        b = wl;
        super();
    }
}

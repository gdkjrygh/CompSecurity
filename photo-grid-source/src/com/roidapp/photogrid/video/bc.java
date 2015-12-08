// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            ac, TrackSelector, q

final class bc
    implements ac
{

    final TrackSelector a;

    bc(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void a()
    {
        if (a.a != null)
        {
            TrackSelector.a(a, a.a.e(TrackSelector.e(a)));
        }
        TrackSelector.s(a);
        TrackSelector.t(a);
        TrackSelector.j(a).setVisibility(8);
        TrackSelector.u(a);
        TrackSelector.b(a, false);
        TrackSelector.m(a).setVisibility(8);
    }

    public final void a(int i)
    {
        if (TrackSelector.w(a) != null)
        {
            TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(8196, i, 0));
        }
        TrackSelector.k(a).setVisibility(8);
        TrackSelector.b(a, false);
        (new StringBuilder("update ")).append(i).append(", current:").append(TrackSelector.e(a));
    }

    public final void a(int i, int j)
    {
        if (i != 4097) goto _L2; else goto _L1
_L1:
        TrackSelector.b(a, true);
        TrackSelector.v(a);
_L4:
        TrackSelector.j(a).setVisibility(8);
        return;
_L2:
        TrackSelector.b(a, false);
        if (j == 8194 || j == 8193)
        {
            TrackSelector.v(a);
        } else
        if (j == 8195)
        {
            TrackSelector.v(a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

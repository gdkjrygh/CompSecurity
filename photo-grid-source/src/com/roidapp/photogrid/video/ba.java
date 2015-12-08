// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ba
    implements android.view.View.OnClickListener
{

    final TrackSelector a;

    ba(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(View view)
    {
        TrackSelector.b(a, false);
        TrackSelector.j(a).setVisibility(0);
        TrackSelector.m(a).setVisibility(8);
        TrackSelector.a(a, 20481, false);
    }
}

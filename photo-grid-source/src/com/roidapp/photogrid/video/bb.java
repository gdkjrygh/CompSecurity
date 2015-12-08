// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class bb
    implements android.view.View.OnClickListener
{

    final TrackSelector a;

    bb(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(View view)
    {
        TrackSelector.q(a).setVisibility(0);
        TrackSelector.r(a).setVisibility(8);
        TrackSelector.a(a, 20482, false);
    }
}

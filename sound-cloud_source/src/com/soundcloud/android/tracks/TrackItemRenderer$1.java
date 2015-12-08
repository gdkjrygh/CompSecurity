// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.View;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemRenderer, TrackItem

class val.position
    implements owListener
{

    final TrackItemRenderer this$0;
    final int val$position;
    final TrackItem val$track;

    public void onOverflow(View view)
    {
        showTrackItemMenu(view, val$track, val$position);
    }

    owListener()
    {
        this$0 = final_trackitemrenderer;
        val$track = trackitem;
        val$position = I.this;
        super();
    }
}

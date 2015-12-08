// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.tracks.TrackItemMenuPresenter;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamTrackItemRenderer

class val.position
    implements lowListener
{

    final StreamTrackItemRenderer this$0;
    final int val$position;
    final TrackItem val$track;

    public void onOverflow(View view)
    {
        StreamTrackItemRenderer.access$100(StreamTrackItemRenderer.this).show((FragmentActivity)view.getContext(), view, val$track, val$position, StreamTrackItemRenderer.access$000(StreamTrackItemRenderer.this));
    }

    lowListener()
    {
        this$0 = final_streamtrackitemrenderer;
        val$track = trackitem;
        val$position = I.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.VideoView;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;
import com.mopub.network.TrackingRequest;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class ax
    implements android.media.MediaPlayer.OnCompletionListener
{

    final Context a;
    final VideoView b;
    final VastVideoViewController c;

    ax(VastVideoViewController vastvideoviewcontroller, Context context, VideoView videoview)
    {
        c = vastvideoviewcontroller;
        a = context;
        b = videoview;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        VastVideoViewController.n(c);
        VastVideoViewController.i(c);
        c.a(false);
        VastVideoViewController.o(c);
        if (!VastVideoViewController.p(c) && VastVideoViewController.q(c) == 0 && !VastVideoViewController.r(c))
        {
            TrackingRequest.makeTrackingHttpRequest(VastVideoViewController.b(c).getCompleteTrackers(), a);
            VastVideoViewController.s(c);
        }
        b.setVisibility(8);
        if (VastVideoViewController.t(c).getDrawable() != null)
        {
            VastVideoViewController.t(c).setVisibility(0);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;
import com.mopub.network.TrackingRequest;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class av
    implements android.view.View.OnTouchListener
{

    final Context a;
    final VastVideoViewController b;

    av(VastVideoViewController vastvideoviewcontroller, Context context)
    {
        b = vastvideoviewcontroller;
        a = context;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            TrackingRequest.makeTrackingHttpRequest(VastVideoViewController.b(b).getCloseTrackers(), a);
            TrackingRequest.makeTrackingHttpRequest(VastVideoViewController.b(b).getSkipTrackers(), a);
            b.f().onFinish();
        }
        return true;
    }
}
